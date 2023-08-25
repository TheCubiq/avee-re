package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class qp7 implements wh7 {

    /* renamed from: a */
    public final SecretKey f24235a;

    /* renamed from: b */
    public final byte[] f24236b;

    /* renamed from: c */
    public final byte[] f24237c;

    public qp7(byte[] bArr) {
        xp7.m4826a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f24235a = secretKeySpec;
        Cipher m12301b = m12301b();
        m12301b.init(1, secretKeySpec);
        byte[] m16946b = lh7.m16946b(m12301b.doFinal(new byte[16]));
        this.f24236b = m16946b;
        this.f24237c = lh7.m16946b(m16946b);
    }

    /* renamed from: b */
    public static Cipher m12301b() {
        if (xb7.m5296a(1)) {
            return (Cipher) ep7.f8658e.m23314a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.daaw.wh7
    /* renamed from: a */
    public final byte[] mo6062a(byte[] bArr, int i) {
        if (i <= 16) {
            Cipher m12301b = m12301b();
            m12301b.init(1, this.f24235a);
            int length = bArr.length;
            double d = length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            byte[] m12305d = max * 16 == length ? qo7.m12305d(bArr, (max - 1) * 16, this.f24236b, 0, 16) : qo7.m12306c(lh7.m16947a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f24237c);
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = m12301b.doFinal(qo7.m12305d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(m12301b.doFinal(qo7.m12306c(m12305d, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
