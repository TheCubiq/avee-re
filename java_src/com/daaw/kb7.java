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

    /* renamed from: c */
    public static final ThreadLocal f16128c = new jb7();

    /* renamed from: a */
    public final SecretKey f16129a;

    /* renamed from: b */
    public final boolean f16130b;

    public kb7(byte[] bArr, boolean z) {
        if (!xb7.m5296a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        xp7.m4826a(bArr.length);
        this.f16129a = new SecretKeySpec(bArr, "AES");
        this.f16130b = z;
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m17833c(byte[] bArr, int i, int i2) {
        return (!wp7.m5869a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    /* renamed from: a */
    public final byte[] m17835a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z = this.f16130b;
            int i = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length >= i) {
                if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec m17833c = m17833c(bArr, 0, 12);
                    ThreadLocal threadLocal = f16128c;
                    ((Cipher) threadLocal.get()).init(2, this.f16129a, m17833c);
                    if (bArr3 != null && bArr3.length != 0) {
                        ((Cipher) threadLocal.get()).updateAAD(bArr3);
                    }
                    boolean z2 = this.f16130b;
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

    /* renamed from: b */
    public final byte[] m17834b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.f16130b;
                byte[] bArr4 = new byte[z ? length + 28 : length + 16];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec m17833c = m17833c(bArr, 0, 12);
                ThreadLocal threadLocal = f16128c;
                ((Cipher) threadLocal.get()).init(1, this.f16129a, m17833c);
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.f16130b ? 0 : 12);
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
