package com.daaw;
/* loaded from: classes.dex */
public final class fd7 {
    /* renamed from: a */
    public static yc7 m22769a(cm7 cm7Var) {
        if (cm7Var.m25237O() == 3) {
            return new vc7(16);
        }
        if (cm7Var.m25237O() == 4) {
            return new vc7(32);
        }
        if (cm7Var.m25237O() == 5) {
            return new wc7();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    public static cd7 m22768b(cm7 cm7Var) {
        if (cm7Var.m25235Q() == 3) {
            return new od7(new xc7("HmacSha256"));
        }
        if (cm7Var.m25235Q() == 4) {
            return md7.m16075b(1);
        }
        if (cm7Var.m25235Q() == 5) {
            return md7.m16075b(2);
        }
        if (cm7Var.m25235Q() == 6) {
            return md7.m16075b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    public static xc7 m22767c(cm7 cm7Var) {
        if (cm7Var.m25236P() == 3) {
            return new xc7("HmacSha256");
        }
        if (cm7Var.m25236P() == 4) {
            return new xc7("HmacSha384");
        }
        if (cm7Var.m25236P() == 5) {
            return new xc7("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
