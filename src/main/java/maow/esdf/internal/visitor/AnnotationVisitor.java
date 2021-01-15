package maow.esdf.internal.visitor;

import maow.esdf.api.model.Annotation;
import maow.esdf.internal.ESDFBaseVisitor;
import maow.esdf.internal.ESDFParser;
import maow.esdf.internal.model.AnnotationImpl;

public final class AnnotationVisitor extends ESDFBaseVisitor<Annotation> {
    @Override
    public Annotation visitAnnotation(ESDFParser.AnnotationContext ctx) {
        final String id = ctx.ID().getText();
        return new AnnotationImpl(id);
    }
}
