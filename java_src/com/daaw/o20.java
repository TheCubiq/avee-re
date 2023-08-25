package com.daaw;
/* loaded from: classes.dex */
public final class o20 {

    /* renamed from: a */
    public final int f20939a;

    /* renamed from: b */
    public final int f20940b;

    /* renamed from: c */
    public final int f20941c;

    /* renamed from: d */
    public final int f20942d;

    /* renamed from: e */
    public final int f20943e;

    /* renamed from: f */
    public final int f20944f;

    /* renamed from: g */
    public final int f20945g;

    /* renamed from: h */
    public final long f20946h;

    public o20(byte[] bArr, int i) {
        qv0 qv0Var = new qv0(bArr);
        qv0Var.m12120m(i * 8);
        this.f20939a = qv0Var.m12125h(16);
        this.f20940b = qv0Var.m12125h(16);
        this.f20941c = qv0Var.m12125h(24);
        this.f20942d = qv0Var.m12125h(24);
        this.f20943e = qv0Var.m12125h(20);
        this.f20944f = qv0Var.m12125h(3) + 1;
        this.f20945g = qv0Var.m12125h(5) + 1;
        this.f20946h = ((qv0Var.m12125h(4) & 15) << 32) | (qv0Var.m12125h(32) & 4294967295L);
    }

    /* renamed from: a */
    public int m14603a() {
        return this.f20945g * this.f20943e;
    }

    /* renamed from: b */
    public long m14602b() {
        return (this.f20946h * 1000000) / this.f20943e;
    }
}
