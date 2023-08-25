package com.daaw;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class up7 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
