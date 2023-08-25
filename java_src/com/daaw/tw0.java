package com.daaw;
/* loaded from: classes2.dex */
public final class tw0 {

    /* renamed from: a */
    public static final sw0 f28178a;

    static {
        sw0 sw0Var;
        Object newInstance;
        Object newInstance2;
        int m8757a = m8757a();
        if (m8757a >= 65544 || m8757a < 65536) {
            try {
                newInstance = lh0.class.newInstance();
                ug0.m8269e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = sw0.class.getClassLoader();
                        if (ug0.m8273a(classLoader, classLoader2)) {
                            throw e;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                ug0.m8269e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    sw0Var = (sw0) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = sw0.class.getClassLoader();
                    if (ug0.m8273a(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            sw0Var = (sw0) newInstance;
            f28178a = sw0Var;
        }
        if (m8757a >= 65543 || m8757a < 65536) {
            try {
                try {
                    newInstance2 = kh0.class.newInstance();
                    ug0.m8269e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = sw0.class.getClassLoader();
                        if (ug0.m8273a(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    ug0.m8269e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        sw0Var = (sw0) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = sw0.class.getClassLoader();
                        if (ug0.m8273a(classLoader7, classLoader8)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            sw0Var = (sw0) newInstance2;
            f28178a = sw0Var;
        }
        sw0Var = new sw0();
        f28178a = sw0Var;
    }

    /* renamed from: a */
    public static final int m8757a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int m14292m = oh1.m14292m(property, '.', 0, false, 6, null);
        if (m14292m < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = m14292m + 1;
        int m14292m2 = oh1.m14292m(property, '.', i, false, 4, null);
        if (m14292m2 < 0) {
            m14292m2 = property.length();
        }
        String substring = property.substring(0, m14292m);
        ug0.m8269e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i, m14292m2);
        ug0.m8269e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
