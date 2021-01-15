package maow.esdf.api.model;

import maow.esdf.internal.model.AnnotationImpl;

public interface Annotation {
    String getName();

    static Annotation create(String name) {
        return new AnnotationImpl(name);
    }
}
