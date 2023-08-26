package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.internal.runners.model.ReflectiveCallable;
/* loaded from: classes2.dex */
public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {
    private final Method method;

    public FrameworkMethod(Method method) {
        if (method == null) {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
        this.method = method;
        if (isPublic()) {
            try {
                method.setAccessible(true);
            } catch (SecurityException unused) {
            }
        }
    }

    public Method getMethod() {
        return this.method;
    }

    public Object invokeExplosively(final Object obj, final Object... objArr) throws Throwable {
        return new ReflectiveCallable() { // from class: org.junit.runners.model.FrameworkMethod.1
            @Override // org.junit.internal.runners.model.ReflectiveCallable
            protected Object runReflectiveCall() throws Throwable {
                return FrameworkMethod.this.method.invoke(obj, objArr);
            }
        }.run();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return this.method.getName();
    }

    public void validatePublicVoidNoArg(boolean z, List<Throwable> list) {
        validatePublicVoid(z, list);
        if (this.method.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.method.getName() + " should have no parameters"));
        }
    }

    public void validatePublicVoid(boolean z, List<Throwable> list) {
        if (isStatic() != z) {
            String str = z ? "should" : "should not";
            list.add(new Exception("Method " + this.method.getName() + "() " + str + " be static"));
        }
        if (!isPublic()) {
            list.add(new Exception("Method " + this.method.getName() + "() should be public"));
        }
        if (this.method.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.method.getName() + "() should be void"));
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    protected int getModifiers() {
        return this.method.getModifiers();
    }

    public Class<?> getReturnType() {
        return this.method.getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.method.getDeclaringClass();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> list) {
        new NoGenericTypeParametersValidator(this.method).validate(list);
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkMethod frameworkMethod) {
        if (frameworkMethod.getName().equals(getName()) && frameworkMethod.getParameterTypes().length == getParameterTypes().length) {
            for (int i = 0; i < frameworkMethod.getParameterTypes().length; i++) {
                if (!frameworkMethod.getParameterTypes()[i].equals(getParameterTypes()[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.junit.runners.model.FrameworkMember
    boolean isBridgeMethod() {
        return this.method.isBridge();
    }

    public boolean equals(Object obj) {
        if (FrameworkMethod.class.isInstance(obj)) {
            return ((FrameworkMethod) obj).method.equals(this.method);
        }
        return false;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @Deprecated
    public boolean producesType(Type type) {
        return getParameterTypes().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.method.getReturnType());
    }

    private Class<?>[] getParameterTypes() {
        return this.method.getParameterTypes();
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.method.getAnnotations();
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.method.getAnnotation(cls);
    }

    public String toString() {
        return this.method.toString();
    }
}
