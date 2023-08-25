package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class ba7 implements a87 {

    /* renamed from: a */
    public final s97 f4587a;

    /* renamed from: b */
    public final ph7 f4588b;

    /* renamed from: c */
    public final ph7 f4589c;

    public /* synthetic */ ba7(s97 s97Var, aa7 aa7Var) {
        ph7 ph7Var;
        this.f4587a = s97Var;
        if (s97Var.m10485f()) {
            qh7 m13419b = pe7.m13420a().m13419b();
            vh7 m16048a = me7.m16048a(s97Var);
            this.f4588b = m13419b.mo12515a(m16048a, "aead", "encrypt");
            ph7Var = m13419b.mo12515a(m16048a, "aead", "decrypt");
        } else {
            ph7Var = me7.f18845a;
            this.f4588b = ph7Var;
        }
        this.f4589c = ph7Var;
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (o97 o97Var : this.f4587a.m10486e(copyOf)) {
                try {
                    byte[] mo1998a = ((a87) o97Var.m14437e()).mo1998a(copyOfRange, bArr2);
                    o97Var.m14441a();
                    int length2 = copyOfRange.length;
                    return mo1998a;
                } catch (GeneralSecurityException e) {
                    logger = ca7.f5681a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (o97 o97Var2 : this.f4587a.m10486e(i87.f13356a)) {
            try {
                byte[] mo1998a2 = ((a87) o97Var2.m14437e()).mo1998a(bArr, bArr2);
                o97Var2.m14441a();
                return mo1998a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        try {
            byte[] m12307b = qo7.m12307b(this.f4587a.m10490a().m14436f(), ((a87) this.f4587a.m10490a().m14437e()).mo1997b(bArr, bArr2));
            this.f4587a.m10490a().m14441a();
            int length = bArr.length;
            return m12307b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
