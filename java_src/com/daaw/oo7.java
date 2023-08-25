package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class oo7 implements a87 {
    public final kb7 a;

    public oo7(byte[] bArr) {
        if (!xb7.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new kb7(bArr, true);
    }

    @Override // com.daaw.a87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.daaw.a87
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.a.b(vp7.a(12), bArr, bArr2);
    }
}
