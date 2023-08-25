package com.daaw;

import java.security.Provider;
import javax.crypto.KeyAgreement;
/* loaded from: classes.dex */
public final class gp7 implements mp7 {
    @Override // com.daaw.mp7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15861a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
