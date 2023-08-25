package com.daaw;

import java.security.Provider;
import java.security.Signature;
/* loaded from: classes.dex */
public final class lp7 implements mp7 {
    @Override // com.daaw.mp7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15861a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
