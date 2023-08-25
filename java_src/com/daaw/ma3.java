package com.daaw;
/* loaded from: classes.dex */
public class ma3 {

    /* renamed from: a */
    public final String f18693a;

    /* renamed from: b */
    public final Object f18694b;

    /* renamed from: c */
    public final int f18695c;

    public ma3(String str, Object obj, int i) {
        this.f18693a = str;
        this.f18694b = obj;
        this.f18695c = i;
    }

    /* renamed from: a */
    public static ma3 m16141a(String str, double d) {
        return new ma3(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static ma3 m16140b(String str, long j) {
        return new ma3(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static ma3 m16139c(String str, String str2) {
        return new ma3(str, str2, 4);
    }

    /* renamed from: d */
    public static ma3 m16138d(String str, boolean z) {
        return new ma3(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final Object m16137e() {
        ub3 m6207a = wb3.m6207a();
        if (m6207a != null) {
            int i = this.f18695c - 1;
            return i != 0 ? i != 1 ? i != 2 ? m6207a.mo8352a(this.f18693a, (String) this.f18694b) : m6207a.mo8351b(this.f18693a, ((Double) this.f18694b).doubleValue()) : m6207a.mo8350c(this.f18693a, ((Long) this.f18694b).longValue()) : m6207a.mo8349d(this.f18693a, ((Boolean) this.f18694b).booleanValue());
        }
        if (wb3.m6206b() != null) {
            wb3.m6206b().zza();
        }
        return this.f18694b;
    }
}
