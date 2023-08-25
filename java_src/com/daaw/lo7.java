package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class lo7 extends ThreadLocal {
    /* renamed from: a */
    public static final Cipher m16703a() {
        try {
            return (Cipher) ep7.f8658e.m23314a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m16703a();
    }
}
