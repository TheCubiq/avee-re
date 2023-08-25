package com.daaw;
/* loaded from: classes.dex */
public final class qd7 {
    public final a87 a;
    public final j87 b;

    public qd7(a87 a87Var) {
        this.a = a87Var;
        this.b = null;
    }

    public qd7(j87 j87Var) {
        this.a = null;
        this.b = j87Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        a87 a87Var = this.a;
        return a87Var != null ? a87Var.b(bArr, bArr2) : this.b.a(bArr, bArr2);
    }
}
