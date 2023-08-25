package com.daaw;
/* loaded from: classes.dex */
public final class ha2 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final f92 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final ia2[] k;

    public ha2(int i, int i2, long j, long j2, long j3, f92 f92Var, int i3, ia2[] ia2VarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = f92Var;
        this.g = i3;
        this.k = ia2VarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final ia2 a(int i) {
        ia2[] ia2VarArr = this.k;
        if (ia2VarArr == null) {
            return null;
        }
        return ia2VarArr[i];
    }
}
