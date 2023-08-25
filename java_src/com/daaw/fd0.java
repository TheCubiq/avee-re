package com.daaw;
/* loaded from: classes2.dex */
public class fd0 extends id0 {
    public fd0(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.id0
    /* renamed from: e */
    public void mo17786e(byte[] bArr, int i) {
        int i2 = i + 4;
        this.f13503b = C3419wc.m6191m(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
    }

    @Override // com.daaw.id0
    public boolean equals(Object obj) {
        if (obj instanceof fd0) {
            return super.equals(obj);
        }
        return false;
    }
}
