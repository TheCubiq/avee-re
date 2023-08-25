package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class ko7 implements pp7 {

    /* renamed from: d */
    public static final ThreadLocal f16602d = new jo7();

    /* renamed from: a */
    public final SecretKeySpec f16603a;

    /* renamed from: b */
    public final int f16604b;

    /* renamed from: c */
    public final int f16605c;

    public ko7(byte[] bArr, int i) {
        if (!xb7.m5296a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        xp7.m4826a(bArr.length);
        this.f16603a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f16602d.get()).getBlockSize();
        this.f16605c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f16604b = i;
    }

    @Override // com.daaw.pp7
    /* renamed from: a */
    public final byte[] mo13232a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f16604b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f16604b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            m17568c(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.pp7
    /* renamed from: b */
    public final byte[] mo13231b(byte[] bArr) {
        int length = bArr.length;
        int i = this.f16604b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[i + length];
            byte[] m6942a = vp7.m6942a(i);
            System.arraycopy(m6942a, 0, bArr2, 0, this.f16604b);
            m17568c(bArr, 0, length, bArr2, this.f16604b, m6942a, true);
            return bArr2;
        }
        int i2 = this.f16604b;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i2));
    }

    /* renamed from: c */
    public final void m17568c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) f16602d.get();
        byte[] bArr4 = new byte[this.f16605c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f16604b);
        cipher.init(z ? 1 : 2, this.f16603a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
