package maow.esdf.internal.model;

import maow.esdf.api.model.Attribute;

public final class AttributeImpl implements Attribute {
    private final String name;
    private String value;

    public AttributeImpl(String name, String value) {
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
    public void setValue(String value) {
        this.value = value;
    }
}
