package com.daaw;
/* loaded from: classes.dex */
public final class rq7 extends uq7 {

    /* renamed from: u */
    public final int f25523u;

    /* renamed from: v */
    public final int f25524v;

    public rq7(byte[] bArr, int i, int i2) {
        super(bArr);
        yq7.m3429A(i, i + i2, bArr.length);
        this.f25523u = i;
        this.f25524v = i2;
    }

    @Override // com.daaw.uq7
    /* renamed from: L */
    public final int mo7799L() {
        return this.f25523u;
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    /* renamed from: k */
    public final byte mo3414k(int i) {
        yq7.m3418e(i, this.f25524v);
        return this.f29455t[this.f25523u + i];
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    /* renamed from: m */
    public final byte mo3413m(int i) {
        return this.f29455t[this.f25523u + i];
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    /* renamed from: o */
    public final int mo3411o() {
        return this.f25524v;
    }

    @Override // com.daaw.uq7, com.daaw.yq7
    /* renamed from: p */
    public final void mo3410p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29455t, this.f25523u + i, bArr, i2, i3);
    }
}
