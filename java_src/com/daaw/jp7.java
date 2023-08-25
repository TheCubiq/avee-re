package com.daaw;

import java.security.Provider;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class jp7 implements mp7 {
    @Override // com.daaw.mp7
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
