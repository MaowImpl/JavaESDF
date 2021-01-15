package maow.esdf.internal.visitor;

import maow.esdf.api.model.Element;
import maow.esdf.internal.ESDFBaseVisitor;
import maow.esdf.internal.ESDFParser;
import maow.esdf.internal.model.ElementImpl;

public final class ElementVisitor extends ESDFBaseVisitor<Element> {
    @Override
    public Element visitElement(ESDFParser.ElementContext ctx) {
        final String name = ctx.ID().getText();
        String value = "";
        if (ctx.STRING() != null) value = ctx.STRING().getText();
        return new ElementImpl(name, value);
    }
}
