package com.daaw;

import java.security.KeyFactory;
import java.security.Provider;
/* loaded from: classes.dex */
public final class hp7 implements mp7 {
    @Override // com.daaw.mp7
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
