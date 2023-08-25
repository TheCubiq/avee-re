package com.daaw;

import java.util.Locale;
/* renamed from: com.daaw.lv */
/* loaded from: classes.dex */
public class C2120lv {

    /* renamed from: c */
    public static final C2120lv f17807c = new C2120lv("Unnamed", 0);

    /* renamed from: a */
    public final String f17808a;

    /* renamed from: b */
    public C2121a[] f17809b;

    /* renamed from: com.daaw.lv$a */
    /* loaded from: classes.dex */
    public static class C2121a {

        /* renamed from: a */
        public float f17810a;

        /* renamed from: b */
        public float f17811b;

        public C2121a(float f, float f2) {
            this.f17810a = f;
            this.f17811b = f2;
        }

        /* renamed from: a */
        public static C2121a m16493a(String str) {
            C2121a c2121a = new C2121a(0.0f, 0.0f);
            int indexOf = str.indexOf(":");
            if (indexOf < 0) {
                return c2121a;
            }
            c2121a.f17810a = br1.m25888u(str.substring(0, indexOf));
            c2121a.f17811b = br1.m25888u(str.substring(indexOf + 1));
            return c2121a;
        }

        public String toString() {
            return String.format(Locale.US, "%.3f:%.3f", Float.valueOf(this.f17810a), Float.valueOf(this.f17811b));
        }
    }

    public C2120lv(String str, int i) {
        this.f17808a = str;
        this.f17809b = new C2121a[i];
    }

    /* renamed from: a */
    public static C2120lv m16498a(C2120lv c2120lv) {
        C2120lv c2120lv2 = new C2120lv(c2120lv.f17808a, c2120lv.f17809b.length);
        int i = 0;
        while (true) {
            C2121a[] c2121aArr = c2120lv.f17809b;
            if (i >= c2121aArr.length) {
                return c2120lv2;
            }
            c2120lv2.f17809b[i] = new C2121a(c2121aArr[i].f17810a, c2121aArr[i].f17811b);
            i++;
        }
    }

    /* renamed from: b */
    public static C2120lv m16497b(String str) {
        String[] m23252a = er1.m23252a(";", str);
        C2120lv c2120lv = new C2120lv("Default", m23252a.length);
        for (int i = 0; i < m23252a.length; i++) {
            c2120lv.f17809b[i] = C2121a.m16493a(m23252a[i]);
        }
        return c2120lv;
    }

    /* renamed from: e */
    public static String m16494e(C2120lv c2120lv) {
        return er1.m23249d(";", c2120lv.f17809b);
    }

    /* renamed from: c */
    public void m16496c(float f) {
        for (C2121a c2121a : this.f17809b) {
            c2121a.f17811b /= f;
        }
    }

    /* renamed from: d */
    public void m16495d(int i) {
        this.f17809b = new C2121a[i];
    }
}
