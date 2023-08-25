package com.daaw;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes.dex */
public final class ua7 extends ee7 {
    public ua7() {
        super(sj7.class, new sa7(a87.class));
    }

    public static void k(boolean z) {
        if (m()) {
            w97.n(new ua7(), true);
        }
    }

    public static /* bridge */ /* synthetic */ ce7 l(int i, int i2) {
        uj7 M = vj7.M();
        M.s(i);
        return new ce7((vj7) M.n(), i2);
    }

    public static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new ta7(this, vj7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return sj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        sj7 sj7Var = (sj7) xt7Var;
        xp7.b(sj7Var.L(), 0);
        xp7.a(sj7Var.P().o());
    }
}
