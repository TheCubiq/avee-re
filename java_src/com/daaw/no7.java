package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class no7 implements a87 {

    /* renamed from: e */
    public static final ThreadLocal f20537e = new lo7();

    /* renamed from: f */
    public static final ThreadLocal f20538f = new mo7();

    /* renamed from: a */
    public final byte[] f20539a;

    /* renamed from: b */
    public final byte[] f20540b;

    /* renamed from: c */
    public final SecretKeySpec f20541c;

    /* renamed from: d */
    public final int f20542d;

    public no7(byte[] bArr, int i) {
        if (!xb7.m5296a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f20542d = i;
        xp7.m4826a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f20541c = secretKeySpec;
        Cipher cipher = (Cipher) f20537e.get();
        cipher.init(1, secretKeySpec);
        byte[] m14902c = m14902c(cipher.doFinal(new byte[16]));
        this.f20539a = m14902c;
        this.f20540b = m14902c(m14902c);
    }

    /* renamed from: c */
    public static byte[] m14902c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m14900e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.f20542d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f20537e.get();
            cipher.init(1, this.f20541c);
            byte[] m14901d = m14901d(cipher, 0, bArr, 0, this.f20542d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] m14901d2 = m14901d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] m14901d3 = m14901d(cipher, 2, bArr, this.f20542d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ m14901d2[i3]) ^ m14901d[i3]) ^ m14901d3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f20538f.get();
                cipher2.init(1, this.f20541c, new IvParameterSpec(m14901d));
                return cipher2.doFinal(bArr, this.f20542d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f20542d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[i + length + 16];
            byte[] m6942a = vp7.m6942a(i);
            System.arraycopy(m6942a, 0, bArr3, 0, this.f20542d);
            Cipher cipher = (Cipher) f20537e.get();
            cipher.init(1, this.f20541c);
            byte[] m14901d = m14901d(cipher, 0, m6942a, 0, m6942a.length);
            byte[] m14901d2 = m14901d(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = (Cipher) f20538f.get();
            cipher2.init(1, this.f20541c, new IvParameterSpec(m14901d));
            cipher2.doFinal(bArr, 0, length, bArr3, this.f20542d);
            byte[] m14901d3 = m14901d(cipher, 2, bArr3, this.f20542d, length);
            int i2 = length + this.f20542d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((m14901d2[i3] ^ m14901d[i3]) ^ m14901d3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: d */
    public final byte[] m14901d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m14900e(bArr3, this.f20539a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m14900e(copyOfRange, this.f20539a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f20540b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m14900e(doFinal, bArr2));
    }
}
