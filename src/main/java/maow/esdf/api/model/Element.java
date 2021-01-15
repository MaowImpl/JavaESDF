package maow.esdf.api.model;

import maow.esdf.internal.model.ElementImpl;

import java.util.*;

public interface Element {
    String getName();

    String getValue();
    void setValue(String value);

    Set<Annotation> getAnnotations();
    void addAnnotation(Annotation annotation);

    Map<String, Attribute> getAttributes();
    Attribute getAttribute(String name);
    void addAttribute(Attribute attribute);

    Map<String, List<Element>> getChildren();
    List<Element> getChildren(String name);
    Element getChild(int index, String name);
    Element getChild(String name);
    void addChild(Element element);

    class Builder {
        private final ElementImpl element;

        public Builder(String name) {
            this.element = new ElementImpl(name, "");
        }

        public Builder setValue(String value) {
            element.setValue(value);
            return this;
        }

        public Builder addAnnotation(Annotation annotation) {
            element.addAnnotation(annotation);
            return this;
        }

        public Builder addAttribute(Attribute attribute) {
            element.addAttribute(attribute);
            return this;
        }

        public Builder addChild(Element child) {
            element.addChild(child);
            return this;
        }

        public Element build() {
            return element;
        }
    }
}