package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class r3 {
    public final View a;
    public sl1 d;
    public sl1 e;
    public sl1 f;
    public int c = -1;
    public final d4 b = d4.b();

    public r3(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new sl1();
        }
        sl1 sl1Var = this.f;
        sl1Var.a();
        ColorStateList u = xs1.u(this.a);
        if (u != null) {
            sl1Var.d = true;
            sl1Var.a = u;
        }
        PorterDuff.Mode v = xs1.v(this.a);
        if (v != null) {
            sl1Var.c = true;
            sl1Var.b = v;
        }
        if (sl1Var.d || sl1Var.c) {
            d4.i(drawable, sl1Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            sl1 sl1Var = this.e;
            if (sl1Var != null) {
                d4.i(background, sl1Var, this.a.getDrawableState());
                return;
            }
            sl1 sl1Var2 = this.d;
            if (sl1Var2 != null) {
                d4.i(background, sl1Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        sl1 sl1Var = this.e;
        if (sl1Var != null) {
            return sl1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        sl1 sl1Var = this.e;
        if (sl1Var != null) {
            return sl1Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = x21.M3;
        ul1 v = ul1.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        xs1.p0(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            int i2 = x21.N3;
            if (v.s(i2)) {
                this.c = v.n(i2, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            int i3 = x21.O3;
            if (v.s(i3)) {
                xs1.w0(this.a, v.c(i3));
            }
            int i4 = x21.P3;
            if (v.s(i4)) {
                xs1.x0(this.a, vu.e(v.k(i4, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        d4 d4Var = this.b;
        h(d4Var != null ? d4Var.f(this.a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new sl1();
            }
            sl1 sl1Var = this.d;
            sl1Var.a = colorStateList;
            sl1Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new sl1();
        }
        sl1 sl1Var = this.e;
        sl1Var.a = colorStateList;
        sl1Var.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new sl1();
        }
        sl1 sl1Var = this.e;
        sl1Var.b = mode;
        sl1Var.c = true;
        b();
    }

    public final boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }
}
