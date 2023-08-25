package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ad7 implements k87 {
    public final ed7 a;
    public final cd7 b;
    public final yc7 c;
    public final xc7 d;

    public ad7(ed7 ed7Var, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, int i, byte[] bArr) {
        this.a = ed7Var;
        this.b = cd7Var;
        this.d = xc7Var;
        this.c = yc7Var;
    }

    public static ad7 a(fm7 fm7Var) {
        int i;
        ed7 a;
        if (fm7Var.U()) {
            if (fm7Var.P().V()) {
                if (fm7Var.Q().h()) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                cm7 M = fm7Var.P().M();
                cd7 b = fd7.b(M);
                xc7 c = fd7.c(M);
                yc7 a2 = fd7.a(M);
                int Q = M.Q();
                int i2 = Q - 2;
                if (i2 == 1) {
                    i = 32;
                } else if (i2 == 2) {
                    i = 65;
                } else if (i2 == 3) {
                    i = 97;
                } else if (i2 != 4) {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(wl7.a(Q)));
                } else {
                    i = 133;
                }
                int Q2 = fm7Var.P().M().Q() - 2;
                if (Q2 == 1) {
                    a = pd7.a(fm7Var.Q().j());
                } else if (Q2 != 2 && Q2 != 3 && Q2 != 4) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                } else {
                    a = nd7.a(fm7Var.Q().j(), fm7Var.P().R().j(), ld7.g(fm7Var.P().M().Q()));
                }
                return new ad7(a, b, c, a2, i, null);
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
