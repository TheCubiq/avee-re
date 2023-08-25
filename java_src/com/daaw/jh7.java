package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class jh7 implements g97 {
    public final s97 a;
    public final ph7 b;
    public final ph7 c;

    public /* synthetic */ jh7(s97 s97Var, ih7 ih7Var) {
        ph7 ph7Var;
        this.a = s97Var;
        if (s97Var.f()) {
            qh7 b = pe7.a().b();
            vh7 a = me7.a(s97Var);
            this.b = b.a(a, "mac", "compute");
            ph7Var = b.a(a, "mac", "verify");
        } else {
            ph7Var = me7.a;
            this.b = ph7Var;
        }
        this.c = ph7Var;
    }

    @Override // com.daaw.g97
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (o97 o97Var : this.a.e(copyOf)) {
            if (o97Var.d().equals(zn7.LEGACY)) {
                bArr4 = kh7.b;
                bArr3 = qo7.b(bArr2, bArr4);
            } else {
                bArr3 = bArr2;
            }
            try {
                ((g97) o97Var.e()).a(copyOfRange, bArr3);
                o97Var.a();
                return;
            } catch (GeneralSecurityException e) {
                logger = kh7.a;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (o97 o97Var2 : this.a.e(i87.a)) {
            try {
                ((g97) o97Var2.e()).a(bArr, bArr2);
                o97Var2.a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.daaw.g97
    public final byte[] b(byte[] bArr) {
        byte[] bArr2;
        if (this.a.a().d().equals(zn7.LEGACY)) {
            bArr2 = kh7.b;
            bArr = qo7.b(bArr, bArr2);
        }
        try {
            byte[] b = qo7.b(this.a.a().f(), ((g97) this.a.a().e()).b(bArr));
            this.a.a().a();
            return b;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
