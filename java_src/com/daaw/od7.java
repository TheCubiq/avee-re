package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class od7 implements cd7 {

    /* renamed from: a */
    public final xc7 f21509a;

    public od7(xc7 xc7Var) {
        this.f21509a = xc7Var;
    }

    @Override // com.daaw.cd7
    /* renamed from: a */
    public final dd7 mo14328a(byte[] bArr) {
        byte[] m3455b = yp7.m3455b();
        byte[] m3456a = yp7.m3456a(m3455b, bArr);
        byte[] m3454c = yp7.m3454c(m3455b);
        byte[] m12307b = qo7.m12307b(m3454c, bArr);
        byte[] m17036d = ld7.m17036d(ld7.f17293b);
        xc7 xc7Var = this.f21509a;
        return new dd7(xc7Var.m5237b(null, m3456a, "eae_prk", m12307b, "shared_secret", m17036d, xc7Var.m5238a()), m3454c);
    }

    @Override // com.daaw.cd7
    public final byte[] zzb() {
        if (Arrays.equals(this.f21509a.m5236c(), ld7.f17297f)) {
            return ld7.f17293b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
