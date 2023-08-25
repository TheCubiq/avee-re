package com.daaw;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class vp7 {
    public static final ThreadLocal a = new up7();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
