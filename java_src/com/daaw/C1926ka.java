package com.daaw;

import android.util.Base64;
/* renamed from: com.daaw.ka */
/* loaded from: classes.dex */
public final class C1926ka {
    /* renamed from: a */
    public static String m17934a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m17933b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
