package maow.esdf.internal.model;

import maow.esdf.api.model.Annotation;
import maow.esdf.api.model.Attribute;
import maow.esdf.api.model.Element;

import java.util.*;

public final class ElementImpl implements Element {
    private final String name;
    private String value;
    private final Set<Annotation> annotations = new LinkedHashSet<>();
    private final Map<String, Attribute> attributes = new LinkedHashMap<>();
    private final Map<String, List<Element>> children = new LinkedHashMap<>();

    public ElementImpl(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Set<Annotation> getAnnotations() {
        return annotations;
    }

    @Override
    public Map<String, Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public Attribute getAttribute(String name) {
        return attributes.get(name);
    }

    @Override
    public Map<String, List<Element>> getChildren() {
        return children;
    }

    @Override
    public List<Element> getChildren(String name) {
        return children.get(name);
    }

    @Override
    public Element getChild(int index, String name) {
        return children.get(name).get(index);
    }

    @Override
    public Element getChild(String name) {
        return getChild(0, name);
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void addAnnotation(Annotation annotation) {
        annotations.add(annotation);
    }

    @Override
    public void addAttribute(Attribute attribute) {
        attributes.put(attribute.getName(), attribute);
    }

    @Override
    public void addChild(Element element) {
        children
                .computeIfAbsent(
                        element.getName(),
                        s -> new ArrayList<>()
                ).add(element);
    }
}
