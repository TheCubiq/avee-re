package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class dc7 implements j87 {

    /* renamed from: a */
    public final s97 f6938a;

    /* renamed from: b */
    public final ph7 f6939b;

    /* renamed from: c */
    public final ph7 f6940c;

    public dc7(s97 s97Var) {
        ph7 ph7Var;
        this.f6938a = s97Var;
        if (s97Var.m10485f()) {
            qh7 m13419b = pe7.m13420a().m13419b();
            vh7 m16048a = me7.m16048a(s97Var);
            this.f6939b = m13419b.mo12515a(m16048a, "daead", "encrypt");
            ph7Var = m13419b.mo12515a(m16048a, "daead", "decrypt");
        } else {
            ph7Var = me7.f18845a;
            this.f6939b = ph7Var;
        }
        this.f6940c = ph7Var;
    }

    @Override // com.daaw.j87
    /* renamed from: a */
    public final byte[] mo13251a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] m12307b = qo7.m12307b(this.f6938a.m10490a().m14436f(), ((j87) this.f6938a.m10490a().m14437e()).mo13251a(bArr, bArr2));
            this.f6938a.m10490a().m14441a();
            int length = bArr.length;
            return m12307b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
