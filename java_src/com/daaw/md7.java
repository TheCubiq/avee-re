package com.daaw;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes.dex */
public final class md7 implements cd7 {

    /* renamed from: a */
    public final xc7 f18824a;

    /* renamed from: b */
    public final int f18825b;

    public md7(xc7 xc7Var, int i) {
        this.f18824a = xc7Var;
        this.f18825b = i;
    }

    /* renamed from: b */
    public static md7 m16075b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new md7(new xc7("HmacSha512"), 3) : new md7(new xc7("HmacSha384"), 2) : new md7(new xc7("HmacSha256"), 1);
    }

    @Override // com.daaw.cd7
    /* renamed from: a */
    public final dd7 mo14328a(byte[] bArr) {
        KeyPair m25140c = cp7.m25140c(cp7.m25132k(this.f18825b));
        byte[] m25136g = cp7.m25136g((ECPrivateKey) m25140c.getPrivate(), cp7.m25133j(cp7.m25132k(this.f18825b), 1, bArr));
        byte[] m25131l = cp7.m25131l(this.f18825b, 1, ((ECPublicKey) m25140c.getPublic()).getW());
        byte[] m12307b = qo7.m12307b(m25131l, bArr);
        byte[] m17036d = ld7.m17036d(zzb());
        xc7 xc7Var = this.f18824a;
        return new dd7(xc7Var.m5237b(null, m25136g, "eae_prk", m12307b, "shared_secret", m17036d, xc7Var.m5238a()), m25131l);
    }

    @Override // com.daaw.cd7
    public final byte[] zzb() {
        int i = this.f18825b - 1;
        return i != 0 ? i != 1 ? ld7.f17296e : ld7.f17295d : ld7.f17294c;
    }
}
