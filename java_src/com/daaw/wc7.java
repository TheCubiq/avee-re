package com.daaw;

import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public final class wc7 implements yc7 {
    @Override // com.daaw.yc7
    /* renamed from: a */
    public final byte[] mo3861a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new qb7(bArr).m11444d(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.daaw.yc7
    public final int zza() {
        return 32;
    }

    @Override // com.daaw.yc7
    public final byte[] zzb() {
        return ld7.f17302k;
    }
}
