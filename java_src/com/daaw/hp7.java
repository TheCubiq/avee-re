package com.daaw;

import java.security.KeyFactory;
import java.security.Provider;
/* loaded from: classes.dex */
public final class hp7 implements mp7 {
    @Override // com.daaw.mp7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15861a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
