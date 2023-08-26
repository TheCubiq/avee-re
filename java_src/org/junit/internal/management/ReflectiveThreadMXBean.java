package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.internal.Classes;
/* loaded from: classes2.dex */
final class ReflectiveThreadMXBean implements ThreadMXBean {
    private final Object threadMxBean;

    /* loaded from: classes2.dex */
    private static final class Holder {
        private static final String FAILURE_MESSAGE = "Unable to access ThreadMXBean";
        static final Method getThreadCpuTimeMethod;
        static final Method isThreadCpuTimeSupportedMethod;

        private Holder() {
        }

        static {
            Method method;
            Method method2 = null;
            try {
                Class<?> cls = Classes.getClass("java.lang.management.ThreadMXBean");
                method = cls.getMethod("getThreadCpuTime", Long.TYPE);
                try {
                    method2 = cls.getMethod("isThreadCpuTimeSupported", new Class[0]);
                } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused2) {
                method = null;
            }
            getThreadCpuTimeMethod = method;
            isThreadCpuTimeSupportedMethod = method2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveThreadMXBean(Object obj) {
        this.threadMxBean = obj;
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public long getThreadCpuTime(long j) {
        if (Holder.getThreadCpuTimeMethod != null) {
            try {
                return ((Long) Holder.getThreadCpuTimeMethod.invoke(this.threadMxBean, Long.valueOf(j))).longValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new UnsupportedOperationException("Unable to access ThreadMXBean", e);
            }
        }
        throw new UnsupportedOperationException("Unable to access ThreadMXBean");
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public boolean isThreadCpuTimeSupported() {
        if (Holder.isThreadCpuTimeSupportedMethod != null) {
            try {
                return ((Boolean) Holder.isThreadCpuTimeSupportedMethod.invoke(this.threadMxBean, new Object[0])).booleanValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return false;
    }
}
