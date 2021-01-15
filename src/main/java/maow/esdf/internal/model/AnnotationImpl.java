package maow.esdf.internal.model;

import maow.esdf.api.model.Annotation;

public final class AnnotationImpl implements Annotation {
    private final String name;

    public AnnotationImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}