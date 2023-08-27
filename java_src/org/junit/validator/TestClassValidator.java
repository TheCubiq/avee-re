package org.junit.validator;

import java.util.List;
import org.junit.runners.model.TestClass;
/* loaded from: classes2.dex */
public interface TestClassValidator {
    List<Exception> validateTestClass(TestClass testClass);
}
