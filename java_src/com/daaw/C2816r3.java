package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* renamed from: com.daaw.r3 */
/* loaded from: classes.dex */
public class C2816r3 {

    /* renamed from: a */
    public final View f24798a;

    /* renamed from: d */
    public sl1 f24801d;

    /* renamed from: e */
    public sl1 f24802e;

    /* renamed from: f */
    public sl1 f24803f;

    /* renamed from: c */
    public int f24800c = -1;

    /* renamed from: b */
    public final C1046d4 f24799b = C1046d4.m24713b();

    public C2816r3(View view) {
        this.f24798a = view;
    }

    /* renamed from: a */
    public final boolean m11822a(Drawable drawable) {
        if (this.f24803f == null) {
            this.f24803f = new sl1();
        }
        sl1 sl1Var = this.f24803f;
        sl1Var.m10205a();
        ColorStateList m4697u = xs1.m4697u(this.f24798a);
        if (m4697u != null) {
            sl1Var.f26352d = true;
            sl1Var.f26349a = m4697u;
        }
        PorterDuff.Mode m4695v = xs1.m4695v(this.f24798a);
        if (m4695v != null) {
            sl1Var.f26351c = true;
            sl1Var.f26350b = m4695v;
        }
        if (sl1Var.f26352d || sl1Var.f26351c) {
            C1046d4.m24706i(drawable, sl1Var, this.f24798a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m11821b() {
        Drawable background = this.f24798a.getBackground();
        if (background != null) {
            if (m11812k() && m11822a(background)) {
                return;
            }
            sl1 sl1Var = this.f24802e;
            if (sl1Var != null) {
                C1046d4.m24706i(background, sl1Var, this.f24798a.getDrawableState());
                return;
            }
            sl1 sl1Var2 = this.f24801d;
            if (sl1Var2 != null) {
                C1046d4.m24706i(background, sl1Var2, this.f24798a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m11820c() {
        sl1 sl1Var = this.f24802e;
        if (sl1Var != null) {
            return sl1Var.f26349a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m11819d() {
        sl1 sl1Var = this.f24802e;
        if (sl1Var != null) {
            return sl1Var.f26350b;
        }
        return null;
    }

    /* renamed from: e */
    public void m11818e(AttributeSet attributeSet, int i) {
        Context context = this.f24798a.getContext();
        int[] iArr = x21.f31822M3;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        View view = this.f24798a;
        xs1.m4706p0(view, view.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        try {
            int i2 = x21.f31827N3;
            if (m8037v.m8040s(i2)) {
                this.f24800c = m8037v.m8045n(i2, -1);
                ColorStateList m24709f = this.f24799b.m24709f(this.f24798a.getContext(), this.f24800c);
                if (m24709f != null) {
                    m11815h(m24709f);
                }
            }
            int i3 = x21.f31832O3;
            if (m8037v.m8040s(i3)) {
                xs1.m4692w0(this.f24798a, m8037v.m8056c(i3));
            }
            int i4 = x21.f31837P3;
            if (m8037v.m8040s(i4)) {
                xs1.m4690x0(this.f24798a, C3373vu.m6785e(m8037v.m8048k(i4, -1), null));
            }
        } finally {
            m8037v.m8036w();
        }
    }

    /* renamed from: f */
    public void m11817f(Drawable drawable) {
        this.f24800c = -1;
        m11815h(null);
        m11821b();
    }

    /* renamed from: g */
    public void m11816g(int i) {
        this.f24800c = i;
        C1046d4 c1046d4 = this.f24799b;
        m11815h(c1046d4 != null ? c1046d4.m24709f(this.f24798a.getContext(), i) : null);
        m11821b();
    }

    /* renamed from: h */
    public void m11815h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f24801d == null) {
                this.f24801d = new sl1();
            }
            sl1 sl1Var = this.f24801d;
            sl1Var.f26349a = colorStateList;
            sl1Var.f26352d = true;
        } else {
            this.f24801d = null;
        }
        m11821b();
    }

    /* renamed from: i */
    public void m11814i(ColorStateList colorStateList) {
        if (this.f24802e == null) {
            this.f24802e = new sl1();
        }
        sl1 sl1Var = this.f24802e;
        sl1Var.f26349a = colorStateList;
        sl1Var.f26352d = true;
        m11821b();
    }

    /* renamed from: j */
    public void m11813j(PorterDuff.Mode mode) {
        if (this.f24802e == null) {
            this.f24802e = new sl1();
        }
        sl1 sl1Var = this.f24802e;
        sl1Var.f26350b = mode;
        sl1Var.f26351c = true;
        m11821b();
    }

    /* renamed from: k */
    public final boolean m11812k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f24801d != null : i == 21;
    }
}
