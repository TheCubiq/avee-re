package com.daaw;

import java.security.KeyPairGenerator;
import java.security.Provider;
/* loaded from: classes.dex */
public final class ip7 implements mp7 {
    @Override // com.daaw.mp7
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
