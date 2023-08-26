package org.junit.internal.builders;

import junit.runner.BaseTestRunner;
import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;
/* loaded from: classes2.dex */
public class SuiteMethodBuilder extends RunnerBuilder {
    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> cls) throws Throwable {
        if (hasSuiteMethod(cls)) {
            return new SuiteMethod(cls);
        }
        return null;
    }

    public boolean hasSuiteMethod(Class<?> cls) {
        try {
            cls.getMethod(BaseTestRunner.SUITE_METHODNAME, new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
