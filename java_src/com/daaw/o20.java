package com.daaw;
/* loaded from: classes.dex */
public final class o20 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public o20(byte[] bArr, int i) {
        qv0 qv0Var = new qv0(bArr);
        qv0Var.m(i * 8);
        this.a = qv0Var.h(16);
        this.b = qv0Var.h(16);
        this.c = qv0Var.h(24);
        this.d = qv0Var.h(24);
        this.e = qv0Var.h(20);
        this.f = qv0Var.h(3) + 1;
        this.g = qv0Var.h(5) + 1;
        this.h = ((qv0Var.h(4) & 15) << 32) | (qv0Var.h(32) & 4294967295L);
    }

    public int a() {
        return this.g * this.e;
    }

    public long b() {
        return (this.h * 1000000) / this.e;
    }
}
