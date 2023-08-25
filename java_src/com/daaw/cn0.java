package com.daaw;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class cn0 {

    /* renamed from: com.daaw.cn0$a */
    /* loaded from: classes.dex */
    public static class C0971a {
        /* renamed from: a */
        public static int m25223a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        public static int m25222b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        public static int m25221c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        public static boolean m25220d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        public static void m25219e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        public static void m25218f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        public static void m25217g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        public static void m25216h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m25227a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0971a.m25222b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m25226b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C0971a.m25221c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m25225c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C0971a.m25217g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m25224d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C0971a.m25216h(marginLayoutParams, i);
    }
}
