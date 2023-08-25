package org.conscrypt;

import java.security.SecureRandomSpi;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class OpenSSLRandom extends SecureRandomSpi {
    private static final long serialVersionUID = 8506210602917522861L;

    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        NativeCrypto.RAND_bytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(byte[] bArr) {
        NativeCrypto.RAND_bytes(bArr);
    }

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
        Objects.requireNonNull(bArr, "seed == null");
    }
}
