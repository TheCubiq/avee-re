package org.junit.runners.model;

import java.lang.annotation.Annotation;
/* loaded from: classes2.dex */
public interface Annotatable {
    <T extends Annotation> T getAnnotation(Class<T> cls);

    Annotation[] getAnnotations();
}
