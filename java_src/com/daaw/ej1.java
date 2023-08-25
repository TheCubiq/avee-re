package com.daaw;
/* loaded from: classes2.dex */
public final /* synthetic */ class ej1 {

    /* renamed from: a */
    public static final int f8512a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m23445a() {
        return f8512a;
    }

    /* renamed from: b */
    public static final String m23444b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
