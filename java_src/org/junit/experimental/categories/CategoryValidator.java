package org.junit.experimental.categories;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.model.FrameworkMethod;
import org.junit.validator.AnnotationValidator;
/* loaded from: classes.dex */
public final class CategoryValidator extends AnnotationValidator {
    private static final Set<Class<? extends Annotation>> INCOMPATIBLE_ANNOTATIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(BeforeClass.class, AfterClass.class, Before.class, After.class)));

    @Override // org.junit.validator.AnnotationValidator
    public List<Exception> validateAnnotatedMethod(FrameworkMethod frameworkMethod) {
        Annotation[] annotations;
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : frameworkMethod.getAnnotations()) {
            for (Class<? extends Annotation> cls : INCOMPATIBLE_ANNOTATIONS) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    addErrorMessage(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private void addErrorMessage(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", cls.getSimpleName())));
    }
}
