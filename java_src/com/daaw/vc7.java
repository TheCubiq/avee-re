package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public final class vc7 implements yc7 {

    /* renamed from: a */
    public final int f30153a;

    public vc7(int i) {
        if (i == 16 || i == 32) {
            this.f30153a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    @Override // com.daaw.yc7
    /* renamed from: a */
    public final byte[] mo3861a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f30153a) {
            return new kb7(bArr, false).m17834b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // com.daaw.yc7
    public final int zza() {
        return this.f30153a;
    }

    @Override // com.daaw.yc7
    public final byte[] zzb() {
        int i = this.f30153a;
        if (i != 16) {
            if (i == 32) {
                return ld7.f17301j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return ld7.f17300i;
    }
}
