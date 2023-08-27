package org.junit.internal.runners.model;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public abstract class ReflectiveCallable {
    protected abstract Object runReflectiveCall() throws Throwable;

    public Object run() throws Throwable {
        try {
            return runReflectiveCall();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
