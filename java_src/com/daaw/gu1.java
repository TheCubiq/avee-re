package com.daaw;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* loaded from: classes.dex */
public class gu1 {

    /* renamed from: a */
    public static final nu1 f11731a;

    /* renamed from: b */
    public static final Property<View, Float> f11732b;

    /* renamed from: c */
    public static final Property<View, Rect> f11733c;

    /* renamed from: com.daaw.gu1$a */
    /* loaded from: classes.dex */
    public static class C1471a extends Property<View, Float> {
        public C1471a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(gu1.m21227c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            gu1.m21223g(view, f.floatValue());
        }
    }

    /* renamed from: com.daaw.gu1$b */
    /* loaded from: classes.dex */
    public static class C1472b extends Property<View, Rect> {
        public C1472b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return xs1.m4693w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            xs1.m4688y0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f11731a = i >= 29 ? new mu1() : i >= 23 ? new lu1() : i >= 22 ? new ku1() : i >= 21 ? new ju1() : new iu1();
        f11732b = new C1471a(Float.class, "translationAlpha");
        f11733c = new C1472b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m21229a(View view) {
        f11731a.mo14790a(view);
    }

    /* renamed from: b */
    public static rt1 m21228b(View view) {
        return new qt1(view);
    }

    /* renamed from: c */
    public static float m21227c(View view) {
        return f11731a.mo14788c(view);
    }

    /* renamed from: d */
    public static ox1 m21226d(View view) {
        return new nx1(view);
    }

    /* renamed from: e */
    public static void m21225e(View view) {
        f11731a.mo14787d(view);
    }

    /* renamed from: f */
    public static void m21224f(View view, int i, int i2, int i3, int i4) {
        f11731a.mo14786e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    public static void m21223g(View view, float f) {
        f11731a.mo14785f(view, f);
    }

    /* renamed from: h */
    public static void m21222h(View view, int i) {
        f11731a.mo14784g(view, i);
    }

    /* renamed from: i */
    public static void m21221i(View view, Matrix matrix) {
        f11731a.mo14783h(view, matrix);
    }

    /* renamed from: j */
    public static void m21220j(View view, Matrix matrix) {
        f11731a.mo14782i(view, matrix);
    }
}
