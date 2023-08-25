package com.daaw;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ld7 {

    /* renamed from: a */
    public static final byte[] f17292a = m17037c(1, 0);

    /* renamed from: b */
    public static final byte[] f17293b = m17037c(2, 32);

    /* renamed from: c */
    public static final byte[] f17294c = m17037c(2, 16);

    /* renamed from: d */
    public static final byte[] f17295d = m17037c(2, 17);

    /* renamed from: e */
    public static final byte[] f17296e = m17037c(2, 18);

    /* renamed from: f */
    public static final byte[] f17297f = m17037c(2, 1);

    /* renamed from: g */
    public static final byte[] f17298g = m17037c(2, 2);

    /* renamed from: h */
    public static final byte[] f17299h = m17037c(2, 3);

    /* renamed from: i */
    public static final byte[] f17300i = m17037c(2, 1);

    /* renamed from: j */
    public static final byte[] f17301j = m17037c(2, 2);

    /* renamed from: k */
    public static final byte[] f17302k = m17037c(2, 3);

    /* renamed from: l */
    public static final byte[] f17303l = new byte[0];

    /* renamed from: m */
    public static final byte[] f17304m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    public static final byte[] f17305n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    public static final byte[] f17306o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    public static void m17039a(cm7 cm7Var) {
        if (cm7Var.m25235Q() == 2 || cm7Var.m25235Q() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(wl7.m6011a(cm7Var.m25235Q())));
        }
        String str = "UNRECOGNIZED";
        if (cm7Var.m25236P() == 2 || cm7Var.m25236P() == 1) {
            int m25236P = cm7Var.m25236P();
            if (m25236P == 2) {
                str = "KDF_UNKNOWN";
            } else if (m25236P == 3) {
                str = "HKDF_SHA256";
            } else if (m25236P == 4) {
                str = "HKDF_SHA384";
            } else if (m25236P == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (cm7Var.m25237O() == 2 || cm7Var.m25237O() == 1) {
            int m25237O = cm7Var.m25237O();
            if (m25237O == 2) {
                str = "AEAD_UNKNOWN";
            } else if (m25237O == 3) {
                str = "AES_128_GCM";
            } else if (m25237O == 4) {
                str = "AES_256_GCM";
            } else if (m25237O == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    public static byte[] m17038b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return qo7.m12307b(f17305n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m17037c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m17036d(byte[] bArr) {
        return qo7.m12307b(f17304m, bArr);
    }

    /* renamed from: e */
    public static byte[] m17035e(String str, byte[] bArr, byte[] bArr2) {
        return qo7.m12307b(f17306o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    public static byte[] m17034f(String str, byte[] bArr, byte[] bArr2, int i) {
        return qo7.m12307b(m17037c(2, i), f17306o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: g */
    public static int m17033g(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
            return 2;
        }
        return 1;
    }
}
