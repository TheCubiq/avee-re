package com.daaw;

import android.os.Looper;
/* loaded from: classes.dex */
public final class sx2 {

    /* renamed from: a */
    public static volatile ClassLoader f26739a;

    /* renamed from: b */
    public static volatile Thread f26740b;

    /* renamed from: a */
    public static synchronized ClassLoader m9787a() {
        ClassLoader classLoader;
        synchronized (sx2.class) {
            if (f26739a == null) {
                f26739a = m9786b();
            }
            classLoader = f26739a;
        }
        return classLoader;
    }

    /* renamed from: b */
    public static synchronized ClassLoader m9786b() {
        synchronized (sx2.class) {
            ClassLoader classLoader = null;
            if (f26740b == null) {
                f26740b = m9785c();
                if (f26740b == null) {
                    return null;
                }
            }
            synchronized (f26740b) {
                try {
                    classLoader = f26740b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    public static synchronized Thread m9785c() {
        SecurityException e;
        o32 o32Var;
        o32 o32Var2;
        ThreadGroup threadGroup;
        synchronized (sx2.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            o32Var2 = null;
                            break;
                        }
                        o32Var2 = threadArr[i];
                        if ("GmsDynamite".equals(o32Var2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    o32Var = null;
                }
                if (o32Var2 == null) {
                    try {
                        o32Var = new o32(threadGroup, "GmsDynamite");
                        try {
                            o32Var.setContextClassLoader(null);
                            o32Var.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to enumerate thread/threadgroup ");
                            sb.append(message);
                            o32Var2 = o32Var;
                            return o32Var2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        o32Var = o32Var2;
                    }
                    o32Var2 = o32Var;
                }
            }
            return o32Var2;
        }
    }
}
