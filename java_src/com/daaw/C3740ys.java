package com.daaw;
/* renamed from: com.daaw.ys */
/* loaded from: classes2.dex */
public final class C3740ys {

    /* renamed from: a */
    public final i01<?> f33994a;

    /* renamed from: b */
    public final int f33995b;

    /* renamed from: c */
    public final int f33996c;

    public C3740ys(i01<?> i01Var, int i, int i2) {
        this.f33994a = (i01) sy0.m9733c(i01Var, "Null dependency anInterface.");
        this.f33995b = i;
        this.f33996c = i2;
    }

    public C3740ys(Class<?> cls, int i, int i2) {
        this(i01.m20271b(cls), i, i2);
    }

    /* renamed from: a */
    public static C3740ys m3358a(Class<?> cls) {
        return new C3740ys(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m3357b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    /* renamed from: h */
    public static C3740ys m3351h(Class<?> cls) {
        return new C3740ys(cls, 0, 1);
    }

    /* renamed from: i */
    public static C3740ys m3350i(i01<?> i01Var) {
        return new C3740ys(i01Var, 1, 0);
    }

    /* renamed from: j */
    public static C3740ys m3349j(Class<?> cls) {
        return new C3740ys(cls, 1, 0);
    }

    /* renamed from: k */
    public static C3740ys m3348k(Class<?> cls) {
        return new C3740ys(cls, 1, 1);
    }

    /* renamed from: l */
    public static C3740ys m3347l(Class<?> cls) {
        return new C3740ys(cls, 2, 0);
    }

    /* renamed from: c */
    public i01<?> m3356c() {
        return this.f33994a;
    }

    /* renamed from: d */
    public boolean m3355d() {
        return this.f33996c == 2;
    }

    /* renamed from: e */
    public boolean m3354e() {
        return this.f33996c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3740ys) {
            C3740ys c3740ys = (C3740ys) obj;
            return this.f33994a.equals(c3740ys.f33994a) && this.f33995b == c3740ys.f33995b && this.f33996c == c3740ys.f33996c;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3353f() {
        return this.f33995b == 1;
    }

    /* renamed from: g */
    public boolean m3352g() {
        return this.f33995b == 2;
    }

    public int hashCode() {
        return ((((this.f33994a.hashCode() ^ 1000003) * 1000003) ^ this.f33995b) * 1000003) ^ this.f33996c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f33994a);
        sb.append(", type=");
        int i = this.f33995b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m3357b(this.f33996c));
        sb.append("}");
        return sb.toString();
    }
}
