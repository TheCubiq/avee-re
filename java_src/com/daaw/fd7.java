package com.daaw;
/* loaded from: classes.dex */
public final class fd7 {
    public static yc7 a(cm7 cm7Var) {
        if (cm7Var.O() == 3) {
            return new vc7(16);
        }
        if (cm7Var.O() == 4) {
            return new vc7(32);
        }
        if (cm7Var.O() == 5) {
            return new wc7();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static cd7 b(cm7 cm7Var) {
        if (cm7Var.Q() == 3) {
            return new od7(new xc7("HmacSha256"));
        }
        if (cm7Var.Q() == 4) {
            return md7.b(1);
        }
        if (cm7Var.Q() == 5) {
            return md7.b(2);
        }
        if (cm7Var.Q() == 6) {
            return md7.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static xc7 c(cm7 cm7Var) {
        if (cm7Var.P() == 3) {
            return new xc7("HmacSha256");
        }
        if (cm7Var.P() == 4) {
            return new xc7("HmacSha384");
        }
        if (cm7Var.P() == 5) {
            return new xc7("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
