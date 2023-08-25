package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public final class vc7 implements yc7 {
    public final int a;

    public vc7(int i) {
        if (i == 16 || i == 32) {
            this.a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    @Override // com.daaw.yc7
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            return new kb7(bArr, false).b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // com.daaw.yc7
    public final int zza() {
        return this.a;
    }

    @Override // com.daaw.yc7
    public final byte[] zzb() {
        int i = this.a;
        if (i != 16) {
            if (i == 32) {
                return ld7.j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return ld7.i;
    }
}
