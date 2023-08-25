package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vs7 {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");
    public static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final jr7 f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        int i = jr7.e;
        f = jr7.h(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d2 = d(length, bArr, 0, length);
        if (d2 == 0) {
            return 1;
        }
        return d2;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String g(byte[] bArr) {
        return new String(bArr, b);
    }

    public static boolean h(byte[] bArr) {
        return lw7.i(bArr);
    }
}
