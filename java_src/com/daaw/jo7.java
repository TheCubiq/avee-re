package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class jo7 extends ThreadLocal {
    public static final Cipher a() {
        try {
            return (Cipher) ep7.e.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
