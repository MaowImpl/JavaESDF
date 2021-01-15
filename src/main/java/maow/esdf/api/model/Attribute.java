package maow.esdf.api.model;

import maow.esdf.internal.model.AttributeImpl;

public interface Attribute {
    String getName();

    String getValue();
    void setValue(String value);

    static Attribute create(String name, String value) {
        return new AttributeImpl(name, value);
    }

    static Attribute create(String name) {
        return create(name, "");
    }
}