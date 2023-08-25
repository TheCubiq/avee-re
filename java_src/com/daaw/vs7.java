package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class vs7 {

    /* renamed from: a */
    public static final Charset f30557a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f30558b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f30559c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f30560d;

    /* renamed from: e */
    public static final ByteBuffer f30561e;

    /* renamed from: f */
    public static final jr7 f30562f;

    static {
        byte[] bArr = new byte[0];
        f30560d = bArr;
        f30561e = ByteBuffer.wrap(bArr);
        int i = jr7.f15355e;
        f30562f = jr7.m18298h(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m6820a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m6819b(byte[] bArr) {
        int length = bArr.length;
        int m6817d = m6817d(length, bArr, 0, length);
        if (m6817d == 0) {
            return 1;
        }
        return m6817d;
    }

    /* renamed from: c */
    public static int m6818c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m6817d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m6816e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    public static Object m6815f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m6814g(byte[] bArr) {
        return new String(bArr, f30558b);
    }

    /* renamed from: h */
    public static boolean m6813h(byte[] bArr) {
        return lw7.m16412i(bArr);
    }
}
