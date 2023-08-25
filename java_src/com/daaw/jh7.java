package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class jh7 implements g97 {

    /* renamed from: a */
    public final s97 f15114a;

    /* renamed from: b */
    public final ph7 f15115b;

    /* renamed from: c */
    public final ph7 f15116c;

    public /* synthetic */ jh7(s97 s97Var, ih7 ih7Var) {
        ph7 ph7Var;
        this.f15114a = s97Var;
        if (s97Var.m10485f()) {
            qh7 m13419b = pe7.m13420a().m13419b();
            vh7 m16048a = me7.m16048a(s97Var);
            this.f15115b = m13419b.mo12515a(m16048a, "mac", "compute");
            ph7Var = m13419b.mo12515a(m16048a, "mac", "verify");
        } else {
            ph7Var = me7.f18845a;
            this.f15115b = ph7Var;
        }
        this.f15116c = ph7Var;
    }

    @Override // com.daaw.g97
    /* renamed from: a */
    public final void mo8888a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (o97 o97Var : this.f15114a.m10486e(copyOf)) {
            if (o97Var.m14438d().equals(zn7.LEGACY)) {
                bArr4 = kh7.f16388b;
                bArr3 = qo7.m12307b(bArr2, bArr4);
            } else {
                bArr3 = bArr2;
            }
            try {
                ((g97) o97Var.m14437e()).mo8888a(copyOfRange, bArr3);
                o97Var.m14441a();
                return;
            } catch (GeneralSecurityException e) {
                logger = kh7.f16387a;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (o97 o97Var2 : this.f15114a.m10486e(i87.f13356a)) {
            try {
                ((g97) o97Var2.m14437e()).mo8888a(bArr, bArr2);
                o97Var2.m14441a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.daaw.g97
    /* renamed from: b */
    public final byte[] mo8887b(byte[] bArr) {
        byte[] bArr2;
        if (this.f15114a.m10490a().m14438d().equals(zn7.LEGACY)) {
            bArr2 = kh7.f16388b;
            bArr = qo7.m12307b(bArr, bArr2);
        }
        try {
            byte[] m12307b = qo7.m12307b(this.f15114a.m10490a().m14436f(), ((g97) this.f15114a.m10490a().m14437e()).mo8887b(bArr));
            this.f15114a.m10490a().m14441a();
            return m12307b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
