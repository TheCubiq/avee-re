package com.daaw;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes.dex */
public final class ua7 extends ee7 {
    public ua7() {
        super(sj7.class, new sa7(a87.class));
    }

    /* renamed from: k */
    public static void m8361k(boolean z) {
        if (m8359m()) {
            w97.m6285n(new ua7(), true);
        }
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ ce7 m8360l(int i, int i2) {
        uj7 m7112M = vj7.m7112M();
        m7112M.m8099s(i);
        return new ce7((vj7) m7112M.m22315n(), i2);
    }

    /* renamed from: m */
    public static boolean m8359m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new ta7(this, vj7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return sj7.m10278O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        sj7 sj7Var = (sj7) xt7Var;
        xp7.m4825b(sj7Var.m10281L(), 0);
        xp7.m4826a(sj7Var.m10277P().mo3411o());
    }
}
