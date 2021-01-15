package maow.esdf.internal.visitor;

import maow.esdf.api.model.Annotation;
import maow.esdf.api.model.Attribute;
import maow.esdf.api.model.Document;
import maow.esdf.api.model.Element;
import maow.esdf.internal.ESDFBaseVisitor;
import maow.esdf.internal.ESDFParser;
import maow.esdf.internal.model.DocumentImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DocumentVisitor extends ESDFBaseVisitor<Document> {
    private final List<Annotation> annotationBuffer = new ArrayList<>();
    private Element activeElement;
    private final List<Element> nestedTree = new ArrayList<>();
    private int nestedLevel = 0;

    private final Map<String, List<Element>> headerElements = new LinkedHashMap<>();
    private final Map<String, List<Element>> elements = new LinkedHashMap<>();

    @Override
    public Document visitDoc(ESDFParser.DocContext ctx) {
        ctx.children.forEach(this::visit);
        return new DocumentImpl(headerElements, elements);
    }

    @Override
    public Document visitElement(ESDFParser.ElementContext ctx) {
        final ElementVisitor ev = new ElementVisitor();
        final Element element = ev.visitElement(ctx);
        if (ctx.getParent() instanceof ESDFParser.StatementContext) {
            nestedTree.clear();
            elements
                    .computeIfAbsent(
                            element.getName(),
                            s -> new ArrayList<>()
                    ).add(element);
            activeElement = element;
        } else if (ctx.getParent() instanceof ESDFParser.HeaderElementContext) {
            nestedTree.clear();
            headerElements
                    .computeIfAbsent(
                            element.getName(),
                            s -> new ArrayList<>()
                    ).add(element);
            activeElement = element;
        }
        if (activeElement != null) {
            annotationBuffer.forEach(activeElement::addAnnotation);
            annotationBuffer.clear();
        }
        return super.visitElement(ctx);
    }

    @Override
    public Document visitAttribute(ESDFParser.AttributeContext ctx) {
        if (activeElement != null) {
            final AttributeVisitor av = new AttributeVisitor();
            final Attribute attribute = av.visitAttribute(ctx);
            if (nestedTree.isEmpty()) {
                activeElement.addAttribute(attribute);
            } else {
                nestedTree.get(nestedLevel).addAttribute(attribute);
            }
        }
        return super.visitAttribute(ctx);
    }

    @Override
    public Document visitAnnotation(ESDFParser.AnnotationContext ctx) {
        final AnnotationVisitor av = new AnnotationVisitor();
        annotationBuffer.add(av.visitAnnotation(ctx));
        return super.visitAnnotation(ctx);
    }

    @Override
    public Document visitNestedElement(ESDFParser.NestedElementContext ctx) {
        final ElementVisitor ev = new ElementVisitor();
        final Element element = ev.visitElement(ctx.element());
        nestedLevel = ctx.NESTED().size();
        if (nestedTree.isEmpty()) nestedTree.add(activeElement);
        if (nestedTree.size() <= nestedLevel) {
            nestedTree.add(element);
        } else {
            nestedTree.set(nestedLevel, element);
        }
        nestedTree.get(nestedLevel - 1).addChild(element);
        annotationBuffer.forEach(element::addAnnotation);
        annotationBuffer.clear();
        return super.visitNestedElement(ctx);
    }
}
