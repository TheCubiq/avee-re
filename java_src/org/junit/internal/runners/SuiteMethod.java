package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import junit.framework.Test;
import junit.runner.BaseTestRunner;
/* loaded from: classes2.dex */
public class SuiteMethod extends JUnit38ClassRunner {
    public SuiteMethod(Class<?> cls) throws Throwable {
        super(testFromSuiteMethod(cls));
    }

    public static Test testFromSuiteMethod(Class<?> cls) throws Throwable {
        try {
            Method method = cls.getMethod(BaseTestRunner.SUITE_METHODNAME, new Class[0]);
            if (!Modifier.isStatic(method.getModifiers())) {
                throw new Exception(cls.getName() + ".suite() must be static");
            }
            return (Test) method.invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
