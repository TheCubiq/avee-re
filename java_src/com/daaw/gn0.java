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
    public static final boolean t;
    public final MaterialButton a;
    public gc1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    static {
        t = Build.VERSION.SDK_INT >= 21;
    }

    public gn0(MaterialButton materialButton, gc1 gc1Var) {
        this.a = materialButton;
        this.b = gc1Var;
    }

    public void A(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            I();
        }
    }

    public void B(int i) {
        if (this.h != i) {
            this.h = i;
            I();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                nu.o(f(), this.j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            nu.p(f(), this.i);
        }
    }

    public final void E(int i, int i2) {
        int J = xs1.J(this.a);
        int paddingTop = this.a.getPaddingTop();
        int I = xs1.I(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            F();
        }
        xs1.E0(this.a, J, (paddingTop + i) - i3, I, (paddingBottom + i2) - i4);
    }

    public final void F() {
        this.a.setInternalBackground(a());
        nn0 f = f();
        if (f != null) {
            f.V(this.s);
        }
    }

    public final void G(gc1 gc1Var) {
        if (f() != null) {
            f().setShapeAppearanceModel(gc1Var);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(gc1Var);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(gc1Var);
        }
    }

    public void H(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i2 - this.d, i - this.f);
        }
    }

    public final void I() {
        nn0 f = f();
        nn0 n = n();
        if (f != null) {
            f.c0(this.h, this.k);
            if (n != null) {
                n.b0(this.h, this.n ? jn0.c(this.a, w01.colorSurface) : 0);
            }
        }
    }

    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        nn0 nn0Var = new nn0(this.b);
        nn0Var.M(this.a.getContext());
        nu.o(nn0Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            nu.p(nn0Var, mode);
        }
        nn0Var.c0(this.h, this.k);
        nn0 nn0Var2 = new nn0(this.b);
        nn0Var2.setTint(0);
        nn0Var2.b0(this.h, this.n ? jn0.c(this.a, w01.colorSurface) : 0);
        if (t) {
            nn0 nn0Var3 = new nn0(this.b);
            this.m = nn0Var3;
            nu.n(nn0Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(z51.a(this.l), J(new LayerDrawable(new Drawable[]{nn0Var2, nn0Var})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        y51 y51Var = new y51(this.b);
        this.m = y51Var;
        nu.o(y51Var, z51.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{nn0Var2, nn0Var, this.m});
        this.r = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public jc1 e() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (jc1) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public nn0 f() {
        return g(false);
    }

    public final nn0 g(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (nn0) (t ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public gc1 i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final nn0 n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public void q(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(m21.P1, 0);
        this.d = typedArray.getDimensionPixelOffset(m21.Q1, 0);
        this.e = typedArray.getDimensionPixelOffset(m21.R1, 0);
        this.f = typedArray.getDimensionPixelOffset(m21.S1, 0);
        int i = m21.W1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.g = dimensionPixelSize;
            y(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(m21.g2, 0);
        this.i = fu1.e(typedArray.getInt(m21.V1, -1), PorterDuff.Mode.SRC_IN);
        this.j = mn0.a(this.a.getContext(), typedArray, m21.U1);
        this.k = mn0.a(this.a.getContext(), typedArray, m21.f2);
        this.l = mn0.a(this.a.getContext(), typedArray, m21.e2);
        this.q = typedArray.getBoolean(m21.T1, false);
        this.s = typedArray.getDimensionPixelSize(m21.X1, 0);
        int J = xs1.J(this.a);
        int paddingTop = this.a.getPaddingTop();
        int I = xs1.I(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(m21.O1)) {
            s();
        } else {
            F();
        }
        xs1.E0(this.a, J + this.c, paddingTop + this.e, I + this.d, paddingBottom + this.f);
    }

    public void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void s() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void t(boolean z) {
        this.q = z;
    }

    public void u(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        y(this.b.w(i));
    }

    public void v(int i) {
        E(this.e, i);
    }

    public void w(int i) {
        E(i, this.f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = t;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(z51.a(colorStateList));
            } else if (z || !(this.a.getBackground() instanceof y51)) {
            } else {
                ((y51) this.a.getBackground()).setTintList(z51.a(colorStateList));
            }
        }
    }

    public void y(gc1 gc1Var) {
        this.b = gc1Var;
        G(gc1Var);
    }

    public void z(boolean z) {
        this.n = z;
        I();
    }
}
