package com.daaw;
/* loaded from: classes2.dex */
public class kd0 extends id0 {
    public kd0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.id0
    public int c() {
        return this.b + 6;
    }

    @Override // com.daaw.id0
    public void e(byte[] bArr, int i) {
        int i2 = i + 3;
        this.b = wc.l((byte) 0, bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
    }

    @Override // com.daaw.id0
    public int h(byte[] bArr, int i) {
        this.a = wc.c(bArr, i + 0, 3);
        e(bArr, i);
        return i + 6;
    }
}
