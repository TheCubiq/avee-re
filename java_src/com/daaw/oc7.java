package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class oc7 implements l87 {
    public final s97 a;
    public final ph7 b;

    public oc7(s97 s97Var) {
        this.a = s97Var;
        this.b = s97Var.f() ? pe7.a().b().a(me7.a(s97Var), "hybrid_encrypt", "encrypt") : me7.a;
    }

    @Override // com.daaw.l87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        s97 s97Var = this.a;
        if (s97Var.a() != null) {
            try {
                byte[] b = qo7.b(s97Var.a().f(), ((l87) this.a.a().e()).a(bArr, bArr2));
                this.a.a().a();
                int length = bArr.length;
                return b;
            } catch (GeneralSecurityException e) {
                throw e;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
