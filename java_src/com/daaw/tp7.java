package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class tp7 implements g97 {
    public final wh7 a;
    public final int b;

    public tp7(wh7 wh7Var, int i) {
        this.a = wh7Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        wh7Var.a(new byte[0], i);
    }

    @Override // com.daaw.g97
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.daaw.g97
    public final byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
