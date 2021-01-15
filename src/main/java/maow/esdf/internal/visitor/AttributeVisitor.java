package maow.esdf.internal.visitor;

import maow.esdf.api.model.Attribute;
import maow.esdf.internal.ESDFBaseVisitor;
import maow.esdf.internal.ESDFParser;
import maow.esdf.internal.model.AttributeImpl;

public final class AttributeVisitor extends ESDFBaseVisitor<Attribute> {
    @Override
    public Attribute visitAttribute(ESDFParser.AttributeContext ctx) {
        final ESDFParser.ElementContext elementCtx = ctx.element();
        final String name = elementCtx.ID().getText();
        final String value = elementCtx.STRING().getText();
        return new AttributeImpl(name, value);
    }
}
