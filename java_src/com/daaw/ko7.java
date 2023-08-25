package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class ko7 implements pp7 {
    public static final ThreadLocal d = new jo7();
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public ko7(byte[] bArr, int i) {
        if (!xb7.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        xp7.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // com.daaw.pp7
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            c(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.pp7
    public final byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[i + length];
            byte[] a = vp7.a(i);
            System.arraycopy(a, 0, bArr2, 0, this.b);
            c(bArr, 0, length, bArr2, this.b, a, true);
            return bArr2;
        }
        int i2 = this.b;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i2));
    }

    public final void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        cipher.init(z ? 1 : 2, this.a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
