package com.daaw;
/* loaded from: classes.dex */
public final class d34 {

    /* renamed from: h */
    public static final th8 f6447h = new th8() { // from class: com.daaw.a24
    };

    /* renamed from: a */
    public Object f6448a;

    /* renamed from: b */
    public Object f6449b;

    /* renamed from: c */
    public int f6450c;

    /* renamed from: d */
    public long f6451d;

    /* renamed from: e */
    public long f6452e;

    /* renamed from: f */
    public boolean f6453f;

    /* renamed from: g */
    public fl4 f6454g = fl4.f9664d;

    /* renamed from: a */
    public final int m24728a(int i) {
        return this.f6454g.m22505a(i).f11705b;
    }

    /* renamed from: b */
    public final int m24727b() {
        int i = this.f6454g.f9667a;
        return 0;
    }

    /* renamed from: c */
    public final int m24726c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int m24725d(long j) {
        return -1;
    }

    /* renamed from: e */
    public final int m24724e(int i) {
        return this.f6454g.m22505a(i).m21254a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d34.class.equals(obj.getClass())) {
            d34 d34Var = (d34) obj;
            if (it5.m19376t(this.f6448a, d34Var.f6448a) && it5.m19376t(this.f6449b, d34Var.f6449b) && this.f6450c == d34Var.f6450c && this.f6451d == d34Var.f6451d && this.f6453f == d34Var.f6453f && it5.m19376t(this.f6454g, d34Var.f6454g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m24723f(int i, int i2) {
        return this.f6454g.m22505a(i).m21254a(i2);
    }

    /* renamed from: g */
    public final long m24722g(int i, int i2) {
        gs3 m22505a = this.f6454g.m22505a(i);
        if (m22505a.f11705b != -1) {
            return m22505a.f11708e[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long m24721h(int i) {
        long j = this.f6454g.m22505a(i).f11704a;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f6448a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f6449b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.f6450c;
        long j = this.f6451d;
        return ((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f6453f ? 1 : 0)) * 31) + this.f6454g.hashCode();
    }

    /* renamed from: i */
    public final long m24720i() {
        long j = this.f6454g.f9668b;
        return 0L;
    }

    /* renamed from: j */
    public final long m24719j(int i) {
        long j = this.f6454g.m22505a(i).f11709f;
        return 0L;
    }

    /* renamed from: k */
    public final d34 m24718k(Object obj, Object obj2, int i, long j, long j2, fl4 fl4Var, boolean z) {
        this.f6448a = obj;
        this.f6449b = obj2;
        this.f6450c = 0;
        this.f6451d = j;
        this.f6452e = 0L;
        this.f6454g = fl4Var;
        this.f6453f = z;
        return this;
    }

    /* renamed from: l */
    public final boolean m24717l(int i) {
        boolean z = this.f6454g.m22505a(i).f11710g;
        return false;
    }
}
