package com.daaw;

import com.daaw.da1;
/* loaded from: classes.dex */
public final class fw1 implements da1 {

    /* renamed from: a */
    public final int f10018a;

    /* renamed from: b */
    public final int f10019b;

    /* renamed from: c */
    public final int f10020c;

    /* renamed from: d */
    public final int f10021d;

    /* renamed from: e */
    public final int f10022e;

    /* renamed from: f */
    public final int f10023f;

    /* renamed from: g */
    public long f10024g;

    /* renamed from: h */
    public long f10025h;

    public fw1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f10018a = i;
        this.f10019b = i2;
        this.f10020c = i3;
        this.f10021d = i4;
        this.f10022e = i5;
        this.f10023f = i6;
    }

    /* renamed from: a */
    public int m22221a() {
        return this.f10019b * this.f10022e * this.f10018a;
    }

    /* renamed from: b */
    public long m22220b(long j) {
        return (Math.max(0L, j - this.f10024g) * 1000000) / this.f10020c;
    }

    /* renamed from: c */
    public int m22219c() {
        return this.f10021d;
    }

    /* renamed from: d */
    public int m22218d() {
        return this.f10023f;
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return true;
    }

    /* renamed from: f */
    public int m22217f() {
        return this.f10018a;
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        int i = this.f10021d;
        long m10003m = sq1.m10003m((((this.f10020c * j) / 1000000) / i) * i, 0L, this.f10025h - i);
        long j2 = this.f10024g + m10003m;
        long m22220b = m22220b(j2);
        fa1 fa1Var = new fa1(m22220b, j2);
        if (m22220b < j) {
            long j3 = this.f10025h;
            int i2 = this.f10021d;
            if (m10003m != j3 - i2) {
                long j4 = j2 + i2;
                return new da1.C1068a(fa1Var, new fa1(m22220b(j4), j4));
            }
        }
        return new da1.C1068a(fa1Var);
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return ((this.f10025h / this.f10021d) * 1000000) / this.f10019b;
    }

    /* renamed from: i */
    public int m22216i() {
        return this.f10019b;
    }

    /* renamed from: j */
    public boolean m22215j() {
        return (this.f10024g == 0 || this.f10025h == 0) ? false : true;
    }

    /* renamed from: k */
    public void m22214k(long j, long j2) {
        this.f10024g = j;
        this.f10025h = j2;
    }
}
