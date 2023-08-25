package com.daaw;

import java.security.Provider;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class fp7 implements mp7 {
    @Override // com.daaw.mp7
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
