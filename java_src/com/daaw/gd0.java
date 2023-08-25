package com.daaw;
/* loaded from: classes2.dex */
public class gd0 extends l {
    public gd0(byte[] bArr) {
        super(bArr);
    }

    @Override // com.daaw.l
    public id0 c(byte[] bArr, int i) {
        return new fd0(bArr, i);
    }

    @Override // com.daaw.l
    public void g(byte[] bArr) {
        this.a = wc.d(bArr[5], 7);
        this.b = wc.d(bArr[5], 6);
        this.c = wc.d(bArr[5], 5);
        this.d = wc.d(bArr[5], 4);
    }

    @Override // com.daaw.l
    public boolean l() {
        return this.a;
    }
}
