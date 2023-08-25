package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class dc7 implements j87 {
    public final s97 a;
    public final ph7 b;
    public final ph7 c;

    public dc7(s97 s97Var) {
        ph7 ph7Var;
        this.a = s97Var;
        if (s97Var.f()) {
            qh7 b = pe7.a().b();
            vh7 a = me7.a(s97Var);
            this.b = b.a(a, "daead", "encrypt");
            ph7Var = b.a(a, "daead", "decrypt");
        } else {
            ph7Var = me7.a;
            this.b = ph7Var;
        }
        this.c = ph7Var;
    }

    @Override // com.daaw.j87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] b = qo7.b(this.a.a().f(), ((j87) this.a.a().e()).a(bArr, bArr2));
            this.a.a().a();
            int length = bArr.length;
            return b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
