package com.daaw;
/* loaded from: classes2.dex */
public final class z58 extends p68 {
    public final int u;

    public z58(byte[] bArr, int i, int i2) {
        super(bArr);
        y68.o(0, i2, bArr.length);
        this.u = i2;
    }

    @Override // com.daaw.p68, com.daaw.y68
    public final byte d(int i) {
        int i2 = this.u;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.t[i];
    }

    @Override // com.daaw.p68, com.daaw.y68
    public final byte e(int i) {
        return this.t[i];
    }

    @Override // com.daaw.p68, com.daaw.y68
    public final int f() {
        return this.u;
    }

    @Override // com.daaw.p68
    public final int t() {
        return 0;
    }
}
