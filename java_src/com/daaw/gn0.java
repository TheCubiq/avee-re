package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes2.dex */
public class gn0 {

    /* renamed from: t */
    public static final boolean f11450t;

    /* renamed from: a */
    public final MaterialButton f11451a;

    /* renamed from: b */
    public gc1 f11452b;

    /* renamed from: c */
    public int f11453c;

    /* renamed from: d */
    public int f11454d;

    /* renamed from: e */
    public int f11455e;

    /* renamed from: f */
    public int f11456f;

    /* renamed from: g */
    public int f11457g;

    /* renamed from: h */
    public int f11458h;

    /* renamed from: i */
    public PorterDuff.Mode f11459i;

    /* renamed from: j */
    public ColorStateList f11460j;

    /* renamed from: k */
    public ColorStateList f11461k;

    /* renamed from: l */
    public ColorStateList f11462l;

    /* renamed from: m */
    public Drawable f11463m;

    /* renamed from: n */
    public boolean f11464n = false;

    /* renamed from: o */
    public boolean f11465o = false;

    /* renamed from: p */
    public boolean f11466p = false;

    /* renamed from: q */
    public boolean f11467q;

    /* renamed from: r */
    public LayerDrawable f11468r;

    /* renamed from: s */
    public int f11469s;

    static {
        f11450t = Build.VERSION.SDK_INT >= 21;
    }

    public gn0(MaterialButton materialButton, gc1 gc1Var) {
        this.f11451a = materialButton;
        this.f11452b = gc1Var;
    }

    /* renamed from: A */
    public void m21483A(ColorStateList colorStateList) {
        if (this.f11461k != colorStateList) {
            this.f11461k = colorStateList;
            m21475I();
        }
    }

    /* renamed from: B */
    public void m21482B(int i) {
        if (this.f11458h != i) {
            this.f11458h = i;
            m21475I();
        }
    }

    /* renamed from: C */
    public void m21481C(ColorStateList colorStateList) {
        if (this.f11460j != colorStateList) {
            this.f11460j = colorStateList;
            if (m21468f() != null) {
                C2366nu.m14812o(m21468f(), this.f11460j);
            }
        }
    }

    /* renamed from: D */
    public void m21480D(PorterDuff.Mode mode) {
        if (this.f11459i != mode) {
            this.f11459i = mode;
            if (m21468f() == null || this.f11459i == null) {
                return;
            }
            C2366nu.m14811p(m21468f(), this.f11459i);
        }
    }

    /* renamed from: E */
    public final void m21479E(int i, int i2) {
        int m4758J = xs1.m4758J(this.f11451a);
        int paddingTop = this.f11451a.getPaddingTop();
        int m4760I = xs1.m4760I(this.f11451a);
        int paddingBottom = this.f11451a.getPaddingBottom();
        int i3 = this.f11455e;
        int i4 = this.f11456f;
        this.f11456f = i2;
        this.f11455e = i;
        if (!this.f11465o) {
            m21478F();
        }
        xs1.m4767E0(this.f11451a, m4758J, (paddingTop + i) - i3, m4760I, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    public final void m21478F() {
        this.f11451a.setInternalBackground(m21473a());
        nn0 m21468f = m21468f();
        if (m21468f != null) {
            m21468f.m14998V(this.f11469s);
        }
    }

    /* renamed from: G */
    public final void m21477G(gc1 gc1Var) {
        if (m21468f() != null) {
            m21468f().setShapeAppearanceModel(gc1Var);
        }
        if (m21460n() != null) {
            m21460n().setShapeAppearanceModel(gc1Var);
        }
        if (m21469e() != null) {
            m21469e().setShapeAppearanceModel(gc1Var);
        }
    }

    /* renamed from: H */
    public void m21476H(int i, int i2) {
        Drawable drawable = this.f11463m;
        if (drawable != null) {
            drawable.setBounds(this.f11453c, this.f11455e, i2 - this.f11454d, i - this.f11456f);
        }
    }

    /* renamed from: I */
    public final void m21475I() {
        nn0 m21468f = m21468f();
        nn0 m21460n = m21460n();
        if (m21468f != null) {
            m21468f.m14989c0(this.f11458h, this.f11461k);
            if (m21460n != null) {
                m21460n.m14991b0(this.f11458h, this.f11464n ? jn0.m18396c(this.f11451a, w01.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    public final InsetDrawable m21474J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f11453c, this.f11455e, this.f11454d, this.f11456f);
    }

    /* renamed from: a */
    public final Drawable m21473a() {
        nn0 nn0Var = new nn0(this.f11452b);
        nn0Var.m15007M(this.f11451a.getContext());
        C2366nu.m14812o(nn0Var, this.f11460j);
        PorterDuff.Mode mode = this.f11459i;
        if (mode != null) {
            C2366nu.m14811p(nn0Var, mode);
        }
        nn0Var.m14989c0(this.f11458h, this.f11461k);
        nn0 nn0Var2 = new nn0(this.f11452b);
        nn0Var2.setTint(0);
        nn0Var2.m14991b0(this.f11458h, this.f11464n ? jn0.m18396c(this.f11451a, w01.colorSurface) : 0);
        if (f11450t) {
            nn0 nn0Var3 = new nn0(this.f11452b);
            this.f11463m = nn0Var3;
            C2366nu.m14813n(nn0Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(z51.m2812a(this.f11462l), m21474J(new LayerDrawable(new Drawable[]{nn0Var2, nn0Var})), this.f11463m);
            this.f11468r = rippleDrawable;
            return rippleDrawable;
        }
        y51 y51Var = new y51(this.f11452b);
        this.f11463m = y51Var;
        C2366nu.m14812o(y51Var, z51.m2812a(this.f11462l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{nn0Var2, nn0Var, this.f11463m});
        this.f11468r = layerDrawable;
        return m21474J(layerDrawable);
    }

    /* renamed from: b */
    public int m21472b() {
        return this.f11457g;
    }

    /* renamed from: c */
    public int m21471c() {
        return this.f11456f;
    }

    /* renamed from: d */
    public int m21470d() {
        return this.f11455e;
    }

    /* renamed from: e */
    public jc1 m21469e() {
        LayerDrawable layerDrawable = this.f11468r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (jc1) (this.f11468r.getNumberOfLayers() > 2 ? this.f11468r.getDrawable(2) : this.f11468r.getDrawable(1));
    }

    /* renamed from: f */
    public nn0 m21468f() {
        return m21467g(false);
    }

    /* renamed from: g */
    public final nn0 m21467g(boolean z) {
        LayerDrawable layerDrawable = this.f11468r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (nn0) (f11450t ? (LayerDrawable) ((InsetDrawable) this.f11468r.getDrawable(0)).getDrawable() : this.f11468r).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: h */
    public ColorStateList m21466h() {
        return this.f11462l;
    }

    /* renamed from: i */
    public gc1 m21465i() {
        return this.f11452b;
    }

    /* renamed from: j */
    public ColorStateList m21464j() {
        return this.f11461k;
    }

    /* renamed from: k */
    public int m21463k() {
        return this.f11458h;
    }

    /* renamed from: l */
    public ColorStateList m21462l() {
        return this.f11460j;
    }

    /* renamed from: m */
    public PorterDuff.Mode m21461m() {
        return this.f11459i;
    }

    /* renamed from: n */
    public final nn0 m21460n() {
        return m21467g(true);
    }

    /* renamed from: o */
    public boolean m21459o() {
        return this.f11465o;
    }

    /* renamed from: p */
    public boolean m21458p() {
        return this.f11467q;
    }

    /* renamed from: q */
    public void m21457q(TypedArray typedArray) {
        this.f11453c = typedArray.getDimensionPixelOffset(m21.f18114P1, 0);
        this.f11454d = typedArray.getDimensionPixelOffset(m21.f18121Q1, 0);
        this.f11455e = typedArray.getDimensionPixelOffset(m21.f18128R1, 0);
        this.f11456f = typedArray.getDimensionPixelOffset(m21.f18135S1, 0);
        int i = m21.f18163W1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f11457g = dimensionPixelSize;
            m21449y(this.f11452b.m21790w(dimensionPixelSize));
            this.f11466p = true;
        }
        this.f11458h = typedArray.getDimensionPixelSize(m21.f18240g2, 0);
        this.f11459i = fu1.m22258e(typedArray.getInt(m21.f18156V1, -1), PorterDuff.Mode.SRC_IN);
        this.f11460j = mn0.m15930a(this.f11451a.getContext(), typedArray, m21.f18149U1);
        this.f11461k = mn0.m15930a(this.f11451a.getContext(), typedArray, m21.f18232f2);
        this.f11462l = mn0.m15930a(this.f11451a.getContext(), typedArray, m21.f18224e2);
        this.f11467q = typedArray.getBoolean(m21.f18142T1, false);
        this.f11469s = typedArray.getDimensionPixelSize(m21.f18170X1, 0);
        int m4758J = xs1.m4758J(this.f11451a);
        int paddingTop = this.f11451a.getPaddingTop();
        int m4760I = xs1.m4760I(this.f11451a);
        int paddingBottom = this.f11451a.getPaddingBottom();
        if (typedArray.hasValue(m21.f18107O1)) {
            m21455s();
        } else {
            m21478F();
        }
        xs1.m4767E0(this.f11451a, m4758J + this.f11453c, paddingTop + this.f11455e, m4760I + this.f11454d, paddingBottom + this.f11456f);
    }

    /* renamed from: r */
    public void m21456r(int i) {
        if (m21468f() != null) {
            m21468f().setTint(i);
        }
    }

    /* renamed from: s */
    public void m21455s() {
        this.f11465o = true;
        this.f11451a.setSupportBackgroundTintList(this.f11460j);
        this.f11451a.setSupportBackgroundTintMode(this.f11459i);
    }

    /* renamed from: t */
    public void m21454t(boolean z) {
        this.f11467q = z;
    }

    /* renamed from: u */
    public void m21453u(int i) {
        if (this.f11466p && this.f11457g == i) {
            return;
        }
        this.f11457g = i;
        this.f11466p = true;
        m21449y(this.f11452b.m21790w(i));
    }

    /* renamed from: v */
    public void m21452v(int i) {
        m21479E(this.f11455e, i);
    }

    /* renamed from: w */
    public void m21451w(int i) {
        m21479E(i, this.f11456f);
    }

    /* renamed from: x */
    public void m21450x(ColorStateList colorStateList) {
        if (this.f11462l != colorStateList) {
            this.f11462l = colorStateList;
            boolean z = f11450t;
            if (z && (this.f11451a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f11451a.getBackground()).setColor(z51.m2812a(colorStateList));
            } else if (z || !(this.f11451a.getBackground() instanceof y51)) {
            } else {
                ((y51) this.f11451a.getBackground()).setTintList(z51.m2812a(colorStateList));
            }
        }
    }

    /* renamed from: y */
    public void m21449y(gc1 gc1Var) {
        this.f11452b = gc1Var;
        m21477G(gc1Var);
    }

    /* renamed from: z */
    public void m21448z(boolean z) {
        this.f11464n = z;
        m21475I();
    }
}
