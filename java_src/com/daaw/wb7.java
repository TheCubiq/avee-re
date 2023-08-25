package com.daaw;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class wb7 implements a87 {

    /* renamed from: b */
    public static final ThreadLocal f31151b = new vb7();

    /* renamed from: a */
    public final SecretKey f31152a;

    public wb7(byte[] bArr) {
        xp7.m4826a(bArr.length);
        this.f31152a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m6204c(byte[] bArr, int i, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (wp7.m5869a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec m6204c = m6204c(bArr, 0, 12);
            ThreadLocal threadLocal = f31151b;
            ((Cipher) threadLocal.get()).init(2, this.f31152a, m6204c);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) threadLocal.get()).updateAAD(bArr2);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] m6942a = vp7.m6942a(12);
            System.arraycopy(m6942a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec m6204c = m6204c(m6942a, 0, m6942a.length);
            ThreadLocal threadLocal = f31151b;
            ((Cipher) threadLocal.get()).init(1, this.f31152a, m6204c);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
