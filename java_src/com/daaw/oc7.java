package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class oc7 implements l87 {

    /* renamed from: a */
    public final s97 f21273a;

    /* renamed from: b */
    public final ph7 f21274b;

    public oc7(s97 s97Var) {
        this.f21273a = s97Var;
        this.f21274b = s97Var.m10485f() ? pe7.m13420a().m13419b().mo12515a(me7.m16048a(s97Var), "hybrid_encrypt", "encrypt") : me7.f18845a;
    }

    @Override // com.daaw.l87
    /* renamed from: a */
    public final byte[] mo6966a(byte[] bArr, byte[] bArr2) {
        s97 s97Var = this.f21273a;
        if (s97Var.m10490a() != null) {
            try {
                byte[] m12307b = qo7.m12307b(s97Var.m10490a().m14436f(), ((l87) this.f21273a.m10490a().m14437e()).mo6966a(bArr, bArr2));
                this.f21273a.m10490a().m14441a();
                int length = bArr.length;
                return m12307b;
            } catch (GeneralSecurityException e) {
                throw e;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
