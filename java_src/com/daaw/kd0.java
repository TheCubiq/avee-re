package com.daaw;
/* loaded from: classes2.dex */
public class kd0 extends id0 {
    public kd0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.id0
    /* renamed from: c */
    public int mo17787c() {
        return this.f13503b + 6;
    }

    @Override // com.daaw.id0
    /* renamed from: e */
    public void mo17786e(byte[] bArr, int i) {
        int i2 = i + 3;
        this.f13503b = C3419wc.m6192l((byte) 0, bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
    }

    @Override // com.daaw.id0
    /* renamed from: h */
    public int mo17785h(byte[] bArr, int i) {
        this.f13502a = C3419wc.m6201c(bArr, i + 0, 3);
        mo17786e(bArr, i);
        return i + 6;
    }
}
