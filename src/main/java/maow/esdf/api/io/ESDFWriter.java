package maow.esdf.api.io;

import maow.esdf.api.model.Annotation;
import maow.esdf.api.model.Attribute;
import maow.esdf.api.model.Document;
import maow.esdf.api.model.Element;

import java.io.*;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ESDFWriter implements Flushable, AutoCloseable {
    private final BufferedWriter writer;

    public ESDFWriter(OutputStream os) {
        this.writer = new BufferedWriter(new OutputStreamWriter(os));
    }

    public ESDFWriter(File file) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(file));
    }

    public ESDFWriter(Path path) throws IOException {
        this(path.toFile());
    }

    public ESDFWriter(String filename) throws IOException {
        this(new File(filename));
    }

    public void writeDocument(Document document) throws IOException {
        writeHeader(document.getHeaderElements().values());
        writeElements(document.getElements().values());
    }

    private void writeHeader(Collection<List<Element>> headerElements) throws IOException {
        for (List<Element> headerElement : headerElements) writeHeaderElements(headerElement);
        writeHeaderBreak();
    }

    private void writeHeaderElements(List<Element> headerElements) throws IOException {
        for (Element headerElement : headerElements) {
            writeElement("^", headerElement, 0);
        }
    }

    private void writeHeaderBreak() throws IOException {
        writer.write("-");
        writer.newLine();
    }

    private void writeElements(Collection<List<Element>> elements) throws IOException {
        for (List<Element> elementList : elements) {
            for (Element element : elementList) writeElement("", element, 0);
        }
    }

    private void writeElement(String prefix, Element element, int nestedLevel) throws IOException {
        writeAnnotations(element.getAnnotations());
        writer.write(prefix);
        writer.write(element.getName());
        if (!element.getValue().equals("")) {
            writer.write(" : ");
            writer.write(element.getValue());
        }
        writer.newLine();
        writeAttributes(element.getAttributes().values());
        writeNestedElements(element.getChildren().values(), nestedLevel);
    }

    private void writeNestedElements(Collection<List<Element>> elements, int level) throws IOException {
        for (List<Element> elementList : elements) {
            for (Element element : elementList) {
                level++;
                writeElement(repeat(level, ">"), element, level);
            }
        }
    }

    private void writeAttributes(Collection<Attribute> attributes) throws IOException {
        for (Attribute attribute : attributes) writeAttribute(attribute);
    }

    private void writeAttribute(Attribute attribute) throws IOException {
        writer.write('.');
        writer.write(attribute.getName());
        if (!attribute.getValue().equals("")) {
            writer.write(" : ");
            writer.write(attribute.getValue());
        }
        writer.newLine();
    }

    private void writeAnnotations(Set<Annotation> annotations) throws IOException {
        for (Annotation annotation : annotations) {
            writeAnnotation(annotation);
        }
    }

    private void writeAnnotation(Annotation annotation) throws IOException {
        writer.write("@");
        writer.write(annotation.getName());
        writer.newLine();
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

    private String repeat(int times, String repeat) {
        return new String(new char[times]).replace("\0", repeat);
    }
}