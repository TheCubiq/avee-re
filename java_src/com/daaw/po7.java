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

    /* renamed from: c */
    public static final Collection f23111c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f23112d = new byte[16];

    /* renamed from: a */
    public final qp7 f23113a;

    /* renamed from: b */
    public final byte[] f23114b;

    public po7(byte[] bArr) {
        if (!xb7.m5296a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f23111c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.f23114b = Arrays.copyOfRange(bArr, i, length);
            this.f23113a = new qp7(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.daaw.j87
    /* renamed from: a */
    public final byte[] mo13251a(byte[] bArr, byte[] bArr2) {
        byte[] m12306c;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) ep7.f8658e.m23314a("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] mo6062a = this.f23113a.mo6062a(f23112d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr4 = bArr3[i];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                mo6062a = qo7.m12306c(lh7.m16946b(mo6062a), this.f23113a.mo6062a(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = mo6062a.length;
                if (length < length2) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                int i2 = length - length2;
                m12306c = Arrays.copyOf(bArr5, length);
                for (int i3 = 0; i3 < mo6062a.length; i3++) {
                    int i4 = i2 + i3;
                    m12306c[i4] = (byte) (m12306c[i4] ^ mo6062a[i3]);
                }
            } else {
                m12306c = qo7.m12306c(lh7.m16947a(bArr5), lh7.m16946b(mo6062a));
            }
            byte[] mo6062a2 = this.f23113a.mo6062a(m12306c, 16);
            byte[] bArr6 = (byte[]) mo6062a2.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f23114b, "AES"), new IvParameterSpec(bArr6));
            return qo7.m12307b(mo6062a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
