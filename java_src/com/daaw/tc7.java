package com.daaw;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public final class tc7 {
    /* renamed from: a */
    public static void m9305a(vk7 vk7Var) {
        cp7.m25132k(m9303c(vk7Var.m7071P().m23385Q()));
        m9304b(vk7Var.m7071P().m23384R());
        if (vk7Var.m7068S() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        w97.m6296c(vk7Var.m7075L().m13317O());
    }

    /* renamed from: b */
    public static String m9304b(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(il7.m19657a(i))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    /* renamed from: c */
    public static int m9303c(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(gl7.m21491a(i))));
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    public static int m9302d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(jk7.m18444a(i))));
            }
        }
        return i3;
    }
}
