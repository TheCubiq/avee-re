package com.daaw;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public final class tc7 {
    public static void a(vk7 vk7Var) {
        cp7.k(c(vk7Var.P().Q()));
        b(vk7Var.P().R());
        if (vk7Var.S() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        w97.c(vk7Var.L().O());
    }

    public static String b(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(il7.a(i))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int c(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(gl7.a(i))));
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(jk7.a(i))));
            }
        }
        return i3;
    }
}
