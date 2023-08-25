package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class ba7 implements a87 {
    public final s97 a;
    public final ph7 b;
    public final ph7 c;

    public /* synthetic */ ba7(s97 s97Var, aa7 aa7Var) {
        ph7 ph7Var;
        this.a = s97Var;
        if (s97Var.f()) {
            qh7 b = pe7.a().b();
            vh7 a = me7.a(s97Var);
            this.b = b.a(a, "aead", "encrypt");
            ph7Var = b.a(a, "aead", "decrypt");
        } else {
            ph7Var = me7.a;
            this.b = ph7Var;
        }
        this.c = ph7Var;
    }

    @Override // com.daaw.a87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (o97 o97Var : this.a.e(copyOf)) {
                try {
                    byte[] a = ((a87) o97Var.e()).a(copyOfRange, bArr2);
                    o97Var.a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    logger = ca7.a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (o97 o97Var2 : this.a.e(i87.a)) {
            try {
                byte[] a2 = ((a87) o97Var2.e()).a(bArr, bArr2);
                o97Var2.a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.daaw.a87
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            byte[] b = qo7.b(this.a.a().f(), ((a87) this.a.a().e()).b(bArr, bArr2));
            this.a.a().a();
            int length = bArr.length;
            return b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
