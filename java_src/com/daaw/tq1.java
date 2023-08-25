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
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    public static final char[] c = new char[40];

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a() {
        if (!i()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    public static void b() {
        if (!j()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static String c(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> d(int i) {
        return new ArrayDeque(i);
    }

    public static int e(int i, int i2, Bitmap.Config config) {
        return i * i2 * g(config);
    }

    @TargetApi(19)
    public static int f(Bitmap bitmap) {
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int g(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 4;
        }
        return 1;
    }

    public static <T> List<T> h(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static boolean i() {
        return !j();
    }

    public static boolean j() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean k(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean l(int i, int i2) {
        return k(i) && k(i2);
    }

    public static String m(byte[] bArr) {
        String c2;
        char[] cArr = b;
        synchronized (cArr) {
            c2 = c(bArr, cArr);
        }
        return c2;
    }
}
