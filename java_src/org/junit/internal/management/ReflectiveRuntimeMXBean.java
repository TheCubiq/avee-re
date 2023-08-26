package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Classes;
/* loaded from: classes2.dex */
final class ReflectiveRuntimeMXBean implements RuntimeMXBean {
    private final Object runtimeMxBean;

    /* loaded from: classes2.dex */
    private static final class Holder {
        private static final Method getInputArgumentsMethod;

        private Holder() {
        }

        static {
            Method method;
            try {
                method = Classes.getClass("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            getInputArgumentsMethod = method;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveRuntimeMXBean(Object obj) {
        this.runtimeMxBean = obj;
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public List<String> getInputArguments() {
        if (Holder.getInputArgumentsMethod != null) {
            try {
                return (List) Holder.getInputArgumentsMethod.invoke(this.runtimeMxBean, new Object[0]);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.emptyList();
    }
}
