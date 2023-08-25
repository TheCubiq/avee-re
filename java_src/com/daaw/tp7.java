package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class tp7 implements g97 {

    /* renamed from: a */
    public final wh7 f27949a;

    /* renamed from: b */
    public final int f27950b;

    public tp7(wh7 wh7Var, int i) {
        this.f27949a = wh7Var;
        this.f27950b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        wh7Var.mo6062a(new byte[0], i);
    }

    @Override // com.daaw.g97
    /* renamed from: a */
    public final void mo8888a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(mo8887b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.daaw.g97
    /* renamed from: b */
    public final byte[] mo8887b(byte[] bArr) {
        return this.f27949a.mo6062a(bArr, this.f27950b);
    }
}
