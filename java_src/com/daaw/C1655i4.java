package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: com.daaw.i4 */
/* loaded from: classes.dex */
public class C1655i4 {

    /* renamed from: a */
    public final ImageView f13226a;

    /* renamed from: b */
    public sl1 f13227b;

    /* renamed from: c */
    public sl1 f13228c;

    /* renamed from: d */
    public sl1 f13229d;

    /* renamed from: e */
    public int f13230e = 0;

    public C1655i4(ImageView imageView) {
        this.f13226a = imageView;
    }

    /* renamed from: a */
    public final boolean m20157a(Drawable drawable) {
        if (this.f13229d == null) {
            this.f13229d = new sl1();
        }
        sl1 sl1Var = this.f13229d;
        sl1Var.m10205a();
        ColorStateList m16979a = lf0.m16979a(this.f13226a);
        if (m16979a != null) {
            sl1Var.f26352d = true;
            sl1Var.f26349a = m16979a;
        }
        PorterDuff.Mode m16978b = lf0.m16978b(this.f13226a);
        if (m16978b != null) {
            sl1Var.f26351c = true;
            sl1Var.f26350b = m16978b;
        }
        if (sl1Var.f26352d || sl1Var.f26351c) {
            C1046d4.m24706i(drawable, sl1Var, this.f13226a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m20156b() {
        if (this.f13226a.getDrawable() != null) {
            this.f13226a.getDrawable().setLevel(this.f13230e);
        }
    }

    /* renamed from: c */
    public void m20155c() {
        Drawable drawable = this.f13226a.getDrawable();
        if (drawable != null) {
            C3373vu.m6788b(drawable);
        }
        if (drawable != null) {
            if (m20146l() && m20157a(drawable)) {
                return;
            }
            sl1 sl1Var = this.f13228c;
            if (sl1Var != null) {
                C1046d4.m24706i(drawable, sl1Var, this.f13226a.getDrawableState());
                return;
            }
            sl1 sl1Var2 = this.f13227b;
            if (sl1Var2 != null) {
                C1046d4.m24706i(drawable, sl1Var2, this.f13226a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m20154d() {
        sl1 sl1Var = this.f13228c;
        if (sl1Var != null) {
            return sl1Var.f26349a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m20153e() {
        sl1 sl1Var = this.f13228c;
        if (sl1Var != null) {
            return sl1Var.f26350b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m20152f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f13226a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void m20151g(AttributeSet attributeSet, int i) {
        int m8045n;
        Context context = this.f13226a.getContext();
        int[] iArr = x21.f31833P;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f13226a;
        xs1.m4706p0(imageView, imageView.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        try {
            Drawable drawable = this.f13226a.getDrawable();
            if (drawable == null && (m8045n = m8037v.m8045n(x21.f31838Q, -1)) != -1 && (drawable = C2818r4.m11783b(this.f13226a.getContext(), m8045n)) != null) {
                this.f13226a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C3373vu.m6788b(drawable);
            }
            int i2 = x21.f31843R;
            if (m8037v.m8040s(i2)) {
                lf0.m16977c(this.f13226a, m8037v.m8056c(i2));
            }
            int i3 = x21.f31848S;
            if (m8037v.m8040s(i3)) {
                lf0.m16976d(this.f13226a, C3373vu.m6785e(m8037v.m8048k(i3, -1), null));
            }
        } finally {
            m8037v.m8036w();
        }
    }

    /* renamed from: h */
    public void m20150h(Drawable drawable) {
        this.f13230e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m20149i(int i) {
        if (i != 0) {
            Drawable m11783b = C2818r4.m11783b(this.f13226a.getContext(), i);
            if (m11783b != null) {
                C3373vu.m6788b(m11783b);
            }
            this.f13226a.setImageDrawable(m11783b);
        } else {
            this.f13226a.setImageDrawable(null);
        }
        m20155c();
    }

    /* renamed from: j */
    public void m20148j(ColorStateList colorStateList) {
        if (this.f13228c == null) {
            this.f13228c = new sl1();
        }
        sl1 sl1Var = this.f13228c;
        sl1Var.f26349a = colorStateList;
        sl1Var.f26352d = true;
        m20155c();
    }

    /* renamed from: k */
    public void m20147k(PorterDuff.Mode mode) {
        if (this.f13228c == null) {
            this.f13228c = new sl1();
        }
        sl1 sl1Var = this.f13228c;
        sl1Var.f26350b = mode;
        sl1Var.f26351c = true;
        m20155c();
    }

    /* renamed from: l */
    public final boolean m20146l() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f13227b != null : i == 21;
    }
}
