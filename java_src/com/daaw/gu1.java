package com.daaw;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public class gu1 {
    public static final nu1 a;
    public static final Property<View, Float> b;
    public static final Property<View, Rect> c;

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(gu1.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            gu1.g(view, f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return xs1.w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            xs1.y0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new mu1() : i >= 23 ? new lu1() : i >= 22 ? new ku1() : i >= 21 ? new ju1() : new iu1();
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        a.a(view);
    }

    public static rt1 b(View view) {
        return new qt1(view);
    }

    public static float c(View view) {
        return a.c(view);
    }

    public static ox1 d(View view) {
        return new nx1(view);
    }

    public static void e(View view) {
        a.d(view);
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        a.f(view, f);
    }

    public static void h(View view, int i) {
        a.g(view, i);
    }

    public static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
