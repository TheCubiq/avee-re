package org.junit.runner;

import java.util.Collections;
import java.util.List;
import org.junit.FixMethodOrder;
import org.junit.runners.model.TestClass;
import org.junit.validator.AnnotationValidator;
/* loaded from: classes.dex */
public final class OrderWithValidator extends AnnotationValidator {
    @Override // org.junit.validator.AnnotationValidator
    public List<Exception> validateAnnotatedClass(TestClass testClass) {
        if (testClass.getAnnotation(FixMethodOrder.class) != null) {
            return Collections.singletonList(new Exception("@FixMethodOrder cannot be combined with @OrderWith"));
        }
        return Collections.emptyList();
    }
}
