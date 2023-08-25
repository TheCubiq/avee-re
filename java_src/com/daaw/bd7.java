package com.daaw;
/* loaded from: classes.dex */
public final class bd7 implements l87 {
    public static final byte[] e = new byte[0];
    public final im7 a;
    public final cd7 b;
    public final yc7 c;
    public final xc7 d;

    public bd7(im7 im7Var, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, byte[] bArr) {
        this.a = im7Var;
        this.b = cd7Var;
        this.d = xc7Var;
        this.c = yc7Var;
    }

    public static bd7 b(im7 im7Var) {
        if (im7Var.R().h()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        cm7 M = im7Var.M();
        return new bd7(im7Var, fd7.b(M), fd7.c(M), fd7.a(M), null);
    }

    @Override // com.daaw.l87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        im7 im7Var = this.a;
        cd7 cd7Var = this.b;
        xc7 xc7Var = this.d;
        yc7 yc7Var = this.c;
        dd7 a = cd7Var.a(im7Var.R().j());
        zc7 c = zc7.c(a.a(), a.b(), cd7Var, xc7Var, yc7Var, bArr3);
        return qo7.b(c.a(), c.b(bArr, e));
    }
}
