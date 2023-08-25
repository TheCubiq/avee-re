package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class gb8 {

    /* renamed from: a */
    public static final Charset f11016a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f11017b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f11018c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f11019d;

    /* renamed from: e */
    public static final ByteBuffer f11020e;

    /* renamed from: f */
    public static final k78 f11021f;

    static {
        byte[] bArr = new byte[0];
        f11019d = bArr;
        f11020e = ByteBuffer.wrap(bArr);
        int i = k78.f15751a;
        e78 e78Var = new e78(bArr, 0, 0, false, null);
        try {
            e78Var.m23671c(0);
            f11021f = e78Var;
        } catch (mb8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m21820a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m21819b(byte[] bArr) {
        int length = bArr.length;
        int m21817d = m21817d(length, bArr, 0, length);
        if (m21817d == 0) {
            return 1;
        }
        return m21817d;
    }

    /* renamed from: c */
    public static int m21818c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m21817d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m21816e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    public static Object m21815f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m21814g(byte[] bArr) {
        return new String(bArr, f11017b);
    }

    /* renamed from: h */
    public static boolean m21813h(byte[] bArr) {
        return ei8.m23447e(bArr);
    }
}
