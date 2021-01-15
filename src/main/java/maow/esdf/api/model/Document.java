package maow.esdf.api.model;

import maow.esdf.internal.model.DocumentImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface Document {
    Map<String, List<Element>> getHeaderElements();
    List<Element> getHeaderElements(String name);
    Element getHeaderElement(int index, String name);
    Element getHeaderElement(String name);

    Map<String, List<Element>> getElements();
    List<Element> getElements(String name);
    Element getElement(int index, String name);
    Element getElement(String name);

    void addHeaderElement(Element headerElement);
    void addElement(Element element);

    class Builder {
        private final Map<String, List<Element>> headerElements = new LinkedHashMap<>();
        private final Map<String, List<Element>> elements = new LinkedHashMap<>();

        public Builder addHeaderElement(Element headerElement) {
            headerElements
                    .computeIfAbsent(
                            headerElement.getName(),
                            s -> new ArrayList<>()
                    ).add(headerElement);
            return this;
        }

        public Builder addElement(Element element) {
            elements
                    .computeIfAbsent(
                            element.getName(),
                            s -> new ArrayList<>()
                    ).add(element);
            return this;
        }

        public Document build() {
            return new DocumentImpl(headerElements, elements);
        }
    }
}
