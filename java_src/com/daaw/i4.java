package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class i4 {
    public final ImageView a;
    public sl1 b;
    public sl1 c;
    public sl1 d;
    public int e = 0;

    public i4(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new sl1();
        }
        sl1 sl1Var = this.d;
        sl1Var.a();
        ColorStateList a = lf0.a(this.a);
        if (a != null) {
            sl1Var.d = true;
            sl1Var.a = a;
        }
        PorterDuff.Mode b = lf0.b(this.a);
        if (b != null) {
            sl1Var.c = true;
            sl1Var.b = b;
        }
        if (sl1Var.d || sl1Var.c) {
            d4.i(drawable, sl1Var, this.a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            vu.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            sl1 sl1Var = this.c;
            if (sl1Var != null) {
                d4.i(drawable, sl1Var, this.a.getDrawableState());
                return;
            }
            sl1 sl1Var2 = this.b;
            if (sl1Var2 != null) {
                d4.i(drawable, sl1Var2, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        sl1 sl1Var = this.c;
        if (sl1Var != null) {
            return sl1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        sl1 sl1Var = this.c;
        if (sl1Var != null) {
            return sl1Var.b;
        }
        return null;
    }

    public boolean f() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.a.getContext();
        int[] iArr = x21.P;
        ul1 v = ul1.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        xs1.p0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (n = v.n(x21.Q, -1)) != -1 && (drawable = r4.b(this.a.getContext(), n)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vu.b(drawable);
            }
            int i2 = x21.R;
            if (v.s(i2)) {
                lf0.c(this.a, v.c(i2));
            }
            int i3 = x21.S;
            if (v.s(i3)) {
                lf0.d(this.a, vu.e(v.k(i3, -1), null));
            }
        } finally {
            v.w();
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = r4.b(this.a.getContext(), i);
            if (b != null) {
                vu.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new sl1();
        }
        sl1 sl1Var = this.c;
        sl1Var.a = colorStateList;
        sl1Var.d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new sl1();
        }
        sl1 sl1Var = this.c;
        sl1Var.b = mode;
        sl1Var.c = true;
        c();
    }

    public final boolean l() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }
}
