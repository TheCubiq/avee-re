package com.daaw;
/* loaded from: classes.dex */
public final class lb7 extends mb7 {
    public lb7(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.mb7
    /* renamed from: a */
    public final int mo10469a() {
        return 12;
    }

    @Override // com.daaw.mb7
    /* renamed from: b */
    public final int[] mo10468b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            ib7.m19984b(iArr2, this.f18772a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
