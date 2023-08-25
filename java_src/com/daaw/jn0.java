package com.daaw;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes2.dex */
public class jn0 {
    /* renamed from: a */
    public static int m18398a(Context context, int i, int i2) {
        TypedValue m23358a = en0.m23358a(context, i);
        return m23358a != null ? m23358a.data : i2;
    }

    /* renamed from: b */
    public static int m18397b(Context context, int i, String str) {
        return en0.m23356c(context, i, str);
    }

    /* renamed from: c */
    public static int m18396c(View view, int i) {
        return en0.m23355d(view, i);
    }

    /* renamed from: d */
    public static int m18395d(View view, int i, int i2) {
        return m18398a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m18394e(int i, int i2) {
        return C3838zg.m2348f(i2, i);
    }

    /* renamed from: f */
    public static int m18393f(int i, int i2, float f) {
        return m18394e(i, C3838zg.m2344j(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: g */
    public static int m18392g(View view, int i, int i2, float f) {
        return m18393f(m18396c(view, i), m18396c(view, i2), f);
    }
}
