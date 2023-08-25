package com.daaw;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes.dex */
public final class md7 implements cd7 {
    public final xc7 a;
    public final int b;

    public md7(xc7 xc7Var, int i) {
        this.a = xc7Var;
        this.b = i;
    }

    public static md7 b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new md7(new xc7("HmacSha512"), 3) : new md7(new xc7("HmacSha384"), 2) : new md7(new xc7("HmacSha256"), 1);
    }

    @Override // com.daaw.cd7
    public final dd7 a(byte[] bArr) {
        KeyPair c = cp7.c(cp7.k(this.b));
        byte[] g = cp7.g((ECPrivateKey) c.getPrivate(), cp7.j(cp7.k(this.b), 1, bArr));
        byte[] l = cp7.l(this.b, 1, ((ECPublicKey) c.getPublic()).getW());
        byte[] b = qo7.b(l, bArr);
        byte[] d = ld7.d(zzb());
        xc7 xc7Var = this.a;
        return new dd7(xc7Var.b(null, g, "eae_prk", b, "shared_secret", d, xc7Var.a()), l);
    }

    @Override // com.daaw.cd7
    public final byte[] zzb() {
        int i = this.b - 1;
        return i != 0 ? i != 1 ? ld7.e : ld7.d : ld7.c;
    }
}
