package maow.esdf.internal.model;

import maow.esdf.api.model.Document;
import maow.esdf.api.model.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DocumentImpl implements Document {
    private final Map<String, List<Element>> headerElements;
    private final Map<String, List<Element>> elements;

    public DocumentImpl(Map<String, List<Element>> headerElements, Map<String, List<Element>> elements) {
        this.headerElements = headerElements;
        this.elements = elements;
    }

    @Override
    public Map<String, List<Element>> getHeaderElements() {
        return headerElements;
    }

    @Override
    public List<Element> getHeaderElements(String name) {
        return headerElements.get(name);
    }

    @Override
    public Element getHeaderElement(int index, String name) {
        return headerElements.get(name).get(index);
    }

    @Override
    public Element getHeaderElement(String name) {
        return getHeaderElement(0, name);
    }

    @Override
    public Map<String, List<Element>> getElements() {
        return elements;
    }

    @Override
    public List<Element> getElements(String name) {
        return elements.get(name);
    }

    @Override
    public Element getElement(int index, String name) {
        return elements.get(name).get(index);
    }

    @Override
    public Element getElement(String name) {
        return getElement(0, name);
    }

    @Override
    public void addHeaderElement(Element headerElement) {
        headerElements
                .computeIfAbsent(
                        headerElement.getName(),
                        s -> new ArrayList<>()
                ).add(headerElement);
    }

    @Override
    public void addElement(Element element) {
        elements
                .computeIfAbsent(
                        element.getName(),
                        s -> new ArrayList<>()
                ).add(element);
    }
}
