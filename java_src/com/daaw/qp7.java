package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class qp7 implements wh7 {
    public final SecretKey a;
    public final byte[] b;
    public final byte[] c;

    public qp7(byte[] bArr) {
        xp7.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] b2 = lh7.b(b.doFinal(new byte[16]));
        this.b = b2;
        this.c = lh7.b(b2);
    }

    public static Cipher b() {
        if (xb7.a(1)) {
            return (Cipher) ep7.e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.daaw.wh7
    public final byte[] a(byte[] bArr, int i) {
        if (i <= 16) {
            Cipher b = b();
            b.init(1, this.a);
            int length = bArr.length;
            double d = length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            byte[] d2 = max * 16 == length ? qo7.d(bArr, (max - 1) * 16, this.b, 0, 16) : qo7.c(lh7.a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.c);
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = b.doFinal(qo7.d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(qo7.c(d2, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
