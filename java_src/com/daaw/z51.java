package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
/* loaded from: classes2.dex */
public class z51 {

    /* renamed from: a */
    public static final boolean f34455a;

    /* renamed from: b */
    public static final int[] f34456b;

    /* renamed from: c */
    public static final int[] f34457c;

    /* renamed from: d */
    public static final int[] f34458d;

    /* renamed from: e */
    public static final int[] f34459e;

    /* renamed from: f */
    public static final int[] f34460f;

    /* renamed from: g */
    public static final int[] f34461g;

    /* renamed from: h */
    public static final int[] f34462h;

    /* renamed from: i */
    public static final int[] f34463i;

    /* renamed from: j */
    public static final int[] f34464j;

    /* renamed from: k */
    public static final int[] f34465k;

    /* renamed from: l */
    public static final String f34466l;

    static {
        f34455a = Build.VERSION.SDK_INT >= 21;
        f34456b = new int[]{16842919};
        f34457c = new int[]{16843623, 16842908};
        f34458d = new int[]{16842908};
        f34459e = new int[]{16843623};
        f34460f = new int[]{16842913, 16842919};
        f34461g = new int[]{16842913, 16843623, 16842908};
        f34462h = new int[]{16842913, 16842908};
        f34463i = new int[]{16842913, 16843623};
        f34464j = new int[]{16842913};
        f34465k = new int[]{16842910, 16842919};
        f34466l = z51.class.getSimpleName();
    }

    /* renamed from: a */
    public static ColorStateList m2812a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f34465k, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: b */
    public static boolean m2811b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
