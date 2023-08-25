package com.daaw;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class kb7 {
    public static final ThreadLocal c = new jb7();
    public final SecretKey a;
    public final boolean b;

    public kb7(byte[] bArr, boolean z) {
        if (!xb7.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        xp7.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = z;
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i, int i2) {
        return (!wp7.a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z = this.b;
            int i = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length >= i) {
                if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec c2 = c(bArr, 0, 12);
                    ThreadLocal threadLocal = c;
                    ((Cipher) threadLocal.get()).init(2, this.a, c2);
                    if (bArr3 != null && bArr3.length != 0) {
                        ((Cipher) threadLocal.get()).updateAAD(bArr3);
                    }
                    boolean z2 = this.b;
                    int i2 = true != z2 ? 0 : 12;
                    if (z2) {
                        length -= 12;
                    }
                    return ((Cipher) threadLocal.get()).doFinal(bArr2, i2, length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.b;
                byte[] bArr4 = new byte[z ? length + 28 : length + 16];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec c2 = c(bArr, 0, 12);
                ThreadLocal threadLocal = c;
                ((Cipher) threadLocal.get()).init(1, this.a, c2);
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.b ? 0 : 12);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
