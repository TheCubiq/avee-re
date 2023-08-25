package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class od7 implements cd7 {
    public final xc7 a;

    public od7(xc7 xc7Var) {
        this.a = xc7Var;
    }

    @Override // com.daaw.cd7
    public final dd7 a(byte[] bArr) {
        byte[] b = yp7.b();
        byte[] a = yp7.a(b, bArr);
        byte[] c = yp7.c(b);
        byte[] b2 = qo7.b(c, bArr);
        byte[] d = ld7.d(ld7.b);
        xc7 xc7Var = this.a;
        return new dd7(xc7Var.b(null, a, "eae_prk", b2, "shared_secret", d, xc7Var.a()), c);
    }

    @Override // com.daaw.cd7
    public final byte[] zzb() {
        if (Arrays.equals(this.a.c(), ld7.f)) {
            return ld7.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
