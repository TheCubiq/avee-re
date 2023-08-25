package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ad7 implements k87 {

    /* renamed from: a */
    public final ed7 f3103a;

    /* renamed from: b */
    public final cd7 f3104b;

    /* renamed from: c */
    public final yc7 f3105c;

    /* renamed from: d */
    public final xc7 f3106d;

    public ad7(ed7 ed7Var, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, int i, byte[] bArr) {
        this.f3103a = ed7Var;
        this.f3104b = cd7Var;
        this.f3106d = xc7Var;
        this.f3105c = yc7Var;
    }

    /* renamed from: a */
    public static ad7 m27517a(fm7 fm7Var) {
        int i;
        ed7 m13434a;
        if (fm7Var.m22484U()) {
            if (fm7Var.m22489P().m19629V()) {
                if (fm7Var.m22488Q().m3416h()) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                cm7 m19638M = fm7Var.m22489P().m19638M();
                cd7 m22768b = fd7.m22768b(m19638M);
                xc7 m22767c = fd7.m22767c(m19638M);
                yc7 m22769a = fd7.m22769a(m19638M);
                int m25235Q = m19638M.m25235Q();
                int i2 = m25235Q - 2;
                if (i2 == 1) {
                    i = 32;
                } else if (i2 == 2) {
                    i = 65;
                } else if (i2 == 3) {
                    i = 97;
                } else if (i2 != 4) {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(wl7.m6011a(m25235Q)));
                } else {
                    i = 133;
                }
                int m25235Q2 = fm7Var.m22489P().m19638M().m25235Q() - 2;
                if (m25235Q2 == 1) {
                    m13434a = pd7.m13434a(fm7Var.m22488Q().m3415j());
                } else if (m25235Q2 != 2 && m25235Q2 != 3 && m25235Q2 != 4) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                } else {
                    m13434a = nd7.m15218a(fm7Var.m22488Q().m3415j(), fm7Var.m22489P().m19633R().m3415j(), ld7.m17033g(fm7Var.m22489P().m19638M().m25235Q()));
                }
                return new ad7(m13434a, m22768b, m22767c, m22769a, i, null);
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
