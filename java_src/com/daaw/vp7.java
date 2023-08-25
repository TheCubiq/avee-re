package com.daaw;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class vp7 {

    /* renamed from: a */
    public static final ThreadLocal f30427a = new up7();

    /* renamed from: a */
    public static byte[] m6942a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f30427a.get()).nextBytes(bArr);
        return bArr;
    }
}
