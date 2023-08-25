package com.daaw;
/* loaded from: classes2.dex */
public final class z58 extends p68 {

    /* renamed from: u */
    public final int f34482u;

    public z58(byte[] bArr, int i, int i2) {
        super(bArr);
        y68.m4065o(0, i2, bArr.length);
        this.f34482u = i2;
    }

    @Override // com.daaw.p68, com.daaw.y68
    /* renamed from: d */
    public final byte mo2807d(int i) {
        int i2 = this.f34482u;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.f22647t[i];
    }

    @Override // com.daaw.p68, com.daaw.y68
    /* renamed from: e */
    public final byte mo2806e(int i) {
        return this.f22647t[i];
    }

    @Override // com.daaw.p68, com.daaw.y68
    /* renamed from: f */
    public final int mo2805f() {
        return this.f34482u;
    }

    @Override // com.daaw.p68
    /* renamed from: t */
    public final int mo2804t() {
        return 0;
    }
}
