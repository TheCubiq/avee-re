package com.daaw;
/* loaded from: classes.dex */
public class ma3 {
    public final String a;
    public final Object b;
    public final int c;

    public ma3(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static ma3 a(String str, double d) {
        return new ma3(str, Double.valueOf(d), 3);
    }

    public static ma3 b(String str, long j) {
        return new ma3(str, Long.valueOf(j), 2);
    }

    public static ma3 c(String str, String str2) {
        return new ma3(str, str2, 4);
    }

    public static ma3 d(String str, boolean z) {
        return new ma3(str, Boolean.valueOf(z), 1);
    }

    public final Object e() {
        ub3 a = wb3.a();
        if (a != null) {
            int i = this.c - 1;
            return i != 0 ? i != 1 ? i != 2 ? a.a(this.a, (String) this.b) : a.b(this.a, ((Double) this.b).doubleValue()) : a.c(this.a, ((Long) this.b).longValue()) : a.d(this.a, ((Boolean) this.b).booleanValue());
        }
        if (wb3.b() != null) {
            wb3.b().zza();
        }
        return this.b;
    }
}
