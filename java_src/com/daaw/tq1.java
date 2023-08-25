package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* loaded from: classes.dex */
public final class tq1 {

    /* renamed from: a */
    public static final char[] f27979a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f27980b = new char[64];

    /* renamed from: c */
    public static final char[] f27981c = new char[40];

    /* renamed from: com.daaw.tq1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3112a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27982a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f27982a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27982a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27982a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27982a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m8870a() {
        if (!m8862i()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m8869b() {
        if (!m8861j()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static String m8868c(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f27979a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static <T> Queue<T> m8867d(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: e */
    public static int m8866e(int i, int i2, Bitmap.Config config) {
        return i * i2 * m8864g(config);
    }

    @TargetApi(19)
    /* renamed from: f */
    public static int m8865f(Bitmap bitmap) {
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: g */
    public static int m8864g(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C3112a.f27982a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 4;
        }
        return 1;
    }

    /* renamed from: h */
    public static <T> List<T> m8863h(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static boolean m8862i() {
        return !m8861j();
    }

    /* renamed from: j */
    public static boolean m8861j() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: k */
    public static boolean m8860k(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: l */
    public static boolean m8859l(int i, int i2) {
        return m8860k(i) && m8860k(i2);
    }

    /* renamed from: m */
    public static String m8858m(byte[] bArr) {
        String m8868c;
        char[] cArr = f27980b;
        synchronized (cArr) {
            m8868c = m8868c(bArr, cArr);
        }
        return m8868c;
    }
}
