package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public class lv {
    public static final lv c = new lv("Unnamed", 0);
    public final String a;
    public a[] b;

    /* loaded from: classes.dex */
    public static class a {
        public float a;
        public float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public static a a(String str) {
            a aVar = new a(0.0f, 0.0f);
            int indexOf = str.indexOf(":");
            if (indexOf < 0) {
                return aVar;
            }
            aVar.a = br1.u(str.substring(0, indexOf));
            aVar.b = br1.u(str.substring(indexOf + 1));
            return aVar;
        }

        public String toString() {
            return String.format(Locale.US, "%.3f:%.3f", Float.valueOf(this.a), Float.valueOf(this.b));
        }
    }

    public lv(String str, int i) {
        this.a = str;
        this.b = new a[i];
    }

    public static lv a(lv lvVar) {
        lv lvVar2 = new lv(lvVar.a, lvVar.b.length);
        int i = 0;
        while (true) {
            a[] aVarArr = lvVar.b;
            if (i >= aVarArr.length) {
                return lvVar2;
            }
            lvVar2.b[i] = new a(aVarArr[i].a, aVarArr[i].b);
            i++;
        }
    }

    public static lv b(String str) {
        String[] a2 = er1.a(";", str);
        lv lvVar = new lv("Default", a2.length);
        for (int i = 0; i < a2.length; i++) {
            lvVar.b[i] = a.a(a2[i]);
        }
        return lvVar;
    }

    public static String e(lv lvVar) {
        return er1.d(";", lvVar.b);
    }

    public void c(float f) {
        for (a aVar : this.b) {
            aVar.b /= f;
        }
    }

    public void d(int i) {
        this.b = new a[i];
    }
}
