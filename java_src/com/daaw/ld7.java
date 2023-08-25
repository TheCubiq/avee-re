package com.daaw;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ld7 {
    public static final byte[] a = c(1, 0);
    public static final byte[] b = c(2, 32);
    public static final byte[] c = c(2, 16);
    public static final byte[] d = c(2, 17);
    public static final byte[] e = c(2, 18);
    public static final byte[] f = c(2, 1);
    public static final byte[] g = c(2, 2);
    public static final byte[] h = c(2, 3);
    public static final byte[] i = c(2, 1);
    public static final byte[] j = c(2, 2);
    public static final byte[] k = c(2, 3);
    public static final byte[] l = new byte[0];
    public static final byte[] m = "KEM".getBytes(StandardCharsets.UTF_8);
    public static final byte[] n = "HPKE".getBytes(StandardCharsets.UTF_8);
    public static final byte[] o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void a(cm7 cm7Var) {
        if (cm7Var.Q() == 2 || cm7Var.Q() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(wl7.a(cm7Var.Q())));
        }
        String str = "UNRECOGNIZED";
        if (cm7Var.P() == 2 || cm7Var.P() == 1) {
            int P = cm7Var.P();
            if (P == 2) {
                str = "KDF_UNKNOWN";
            } else if (P == 3) {
                str = "HKDF_SHA256";
            } else if (P == 4) {
                str = "HKDF_SHA384";
            } else if (P == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (cm7Var.O() == 2 || cm7Var.O() == 1) {
            int O = cm7Var.O();
            if (O == 2) {
                str = "AEAD_UNKNOWN";
            } else if (O == 3) {
                str = "AES_128_GCM";
            } else if (O == 4) {
                str = "AES_256_GCM";
            } else if (O == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return qo7.b(n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] d(byte[] bArr) {
        return qo7.b(m, bArr);
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2) {
        return qo7.b(o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] f(String str, byte[] bArr, byte[] bArr2, int i2) {
        return qo7.b(c(2, i2), o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static int g(int i2) {
        int i3 = i2 - 2;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
            return 2;
        }
        return 1;
    }
}
