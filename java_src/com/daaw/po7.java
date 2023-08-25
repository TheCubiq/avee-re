package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class po7 implements j87 {
    public static final Collection c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public final qp7 a;
    public final byte[] b;

    public po7(byte[] bArr) {
        if (!xb7.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.b = Arrays.copyOfRange(bArr, i, length);
            this.a = new qp7(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.daaw.j87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] c2;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) ep7.e.a("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] a = this.a.a(d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr4 = bArr3[i];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                a = qo7.c(lh7.b(a), this.a.a(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = a.length;
                if (length < length2) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                int i2 = length - length2;
                c2 = Arrays.copyOf(bArr5, length);
                for (int i3 = 0; i3 < a.length; i3++) {
                    int i4 = i2 + i3;
                    c2[i4] = (byte) (c2[i4] ^ a[i3]);
                }
            } else {
                c2 = qo7.c(lh7.a(bArr5), lh7.b(a));
            }
            byte[] a2 = this.a.a(c2, 16);
            byte[] bArr6 = (byte[]) a2.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr6));
            return qo7.b(a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
