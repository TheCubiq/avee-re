package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.MethodSorter;
@Deprecated
/* loaded from: classes2.dex */
public class TestClass {
    private final Class<?> klass;

    public TestClass(Class<?> cls) {
        this.klass = cls;
    }

    public List<Method> getTestMethods() {
        return getAnnotatedMethods(Test.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> getBefores() {
        return getAnnotatedMethods(BeforeClass.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> getAfters() {
        return getAnnotatedMethods(AfterClass.class);
    }

    public List<Method> getAnnotatedMethods(Class<? extends Annotation> cls) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : getSuperClasses(this.klass)) {
            for (Method method : MethodSorter.getDeclaredMethods(cls2)) {
                if (method.getAnnotation(cls) != null && !isShadowed(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (runsTopToBottom(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    private boolean runsTopToBottom(Class<? extends Annotation> cls) {
        return cls.equals(Before.class) || cls.equals(BeforeClass.class);
    }

    private boolean isShadowed(Method method, List<Method> list) {
        for (Method method2 : list) {
            if (isShadowed(method, method2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isShadowed(Method method, Method method2) {
        if (method2.getName().equals(method.getName()) && method2.getParameterTypes().length == method.getParameterTypes().length) {
            for (int i = 0; i < method2.getParameterTypes().length; i++) {
                if (!method2.getParameterTypes()[i].equals(method.getParameterTypes()[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private List<Class<?>> getSuperClasses(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public Constructor<?> getConstructor() throws SecurityException, NoSuchMethodException {
        return this.klass.getConstructor(new Class[0]);
    }

    public Class<?> getJavaClass() {
        return this.klass;
    }

    public String getName() {
        return this.klass.getName();
    }
}
