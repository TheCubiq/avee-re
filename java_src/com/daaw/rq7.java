package com.daaw;
/* loaded from: classes.dex */
public final class rq7 extends uq7 {
    public final int u;
    public final int v;

    public rq7(byte[] bArr, int i, int i2) {
        super(bArr);
        yq7.A(i, i + i2, bArr.length);
        this.u = i;
        this.v = i2;
    }

    @Override // com.daaw.uq7
    public final int L() {
        return this.u;
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    public final byte k(int i) {
        yq7.e(i, this.v);
        return this.t[this.u + i];
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    public final byte m(int i) {
        return this.t[this.u + i];
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    public final int o() {
        return this.v;
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    public final void p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.t, this.u + i, bArr, i2, i3);
    }
}
