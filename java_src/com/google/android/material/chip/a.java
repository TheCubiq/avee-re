package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.daaw.fu1;
import com.daaw.ik1;
import com.daaw.nk1;
import com.daaw.nn0;
import com.daaw.nu;
import com.daaw.pb;
import com.daaw.r4;
import com.daaw.rq0;
import com.daaw.wu;
import com.daaw.yd;
import com.daaw.z51;
import com.daaw.zg;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class a extends nn0 implements Drawable.Callback, nk1.b {
    public static final int[] X0 = {16842910};
    public static final ShapeDrawable Y0 = new ShapeDrawable(new OvalShape());
    public final Path A0;
    public final nk1 B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public int J0;
    public int K0;
    public ColorFilter L0;
    public PorterDuffColorFilter M0;
    public ColorStateList N;
    public ColorStateList N0;
    public ColorStateList O;
    public PorterDuff.Mode O0;
    public float P;
    public int[] P0;
    public float Q;
    public boolean Q0;
    public ColorStateList R;
    public ColorStateList R0;
    public float S;
    public WeakReference<InterfaceC0098a> S0;
    public ColorStateList T;
    public TextUtils.TruncateAt T0;
    public CharSequence U;
    public boolean U0;
    public boolean V;
    public int V0;
    public Drawable W;
    public boolean W0;
    public ColorStateList X;
    public float Y;
    public boolean Z;
    public boolean a0;
    public Drawable b0;
    public Drawable c0;
    public ColorStateList d0;
    public float e0;
    public CharSequence f0;
    public boolean g0;
    public boolean h0;
    public Drawable i0;
    public ColorStateList j0;
    public rq0 k0;
    public rq0 l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public final Context u0;
    public final Paint v0;
    public final Paint w0;
    public final Paint.FontMetrics x0;
    public final RectF y0;
    public final PointF z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0098a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = -1.0f;
        this.v0 = new Paint(1);
        this.x0 = new Paint.FontMetrics();
        this.y0 = new RectF();
        this.z0 = new PointF();
        this.A0 = new Path();
        this.K0 = 255;
        this.O0 = PorterDuff.Mode.SRC_IN;
        this.S0 = new WeakReference<>(null);
        M(context);
        this.u0 = context;
        nk1 nk1Var = new nk1(this);
        this.B0 = nk1Var;
        this.U = "";
        nk1Var.e().density = context.getResources().getDisplayMetrics().density;
        this.w0 = null;
        int[] iArr = X0;
        setState(iArr);
        j2(iArr);
        this.U0 = true;
        if (z51.a) {
            Y0.setTint(-1);
        }
    }

    public static boolean l1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean p1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean q1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean r1(ik1 ik1Var) {
        ColorStateList colorStateList;
        return (ik1Var == null || (colorStateList = ik1Var.a) == null || !colorStateList.isStateful()) ? false : true;
    }

    public static a t0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.s1(attributeSet, i, i2);
        return aVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        this.v0.setColor(this.G0);
        this.v0.setStyle(Paint.Style.FILL);
        this.y0.set(rect);
        if (!this.W0) {
            canvas.drawRoundRect(this.y0, G0(), G0(), this.v0);
            return;
        }
        h(new RectF(rect), this.A0);
        super.p(canvas, this.v0, this.A0, u());
    }

    public void A1(int i) {
        z1(r4.a(this.u0, i));
    }

    public void A2(int i) {
        z2(rq0.c(this.u0, i));
    }

    public final void B0(Canvas canvas, Rect rect) {
        Paint paint = this.w0;
        if (paint != null) {
            paint.setColor(zg.j(-16777216, 127));
            canvas.drawRect(rect, this.w0);
            if (L2() || K2()) {
                j0(rect, this.y0);
                canvas.drawRect(this.y0, this.w0);
            }
            if (this.U != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.w0);
            }
            if (M2()) {
                m0(rect, this.y0);
                canvas.drawRect(this.y0, this.w0);
            }
            this.w0.setColor(zg.j(-65536, 127));
            l0(rect, this.y0);
            canvas.drawRect(this.y0, this.w0);
            this.w0.setColor(zg.j(-16711936, 127));
            n0(rect, this.y0);
            canvas.drawRect(this.y0, this.w0);
        }
    }

    public void B1(int i) {
        C1(this.u0.getResources().getBoolean(i));
    }

    public void B2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.U, charSequence)) {
            return;
        }
        this.U = charSequence;
        this.B0.i(true);
        invalidateSelf();
        t1();
    }

    public final void C0(Canvas canvas, Rect rect) {
        if (this.U != null) {
            Paint.Align r0 = r0(rect, this.z0);
            p0(rect, this.y0);
            if (this.B0.d() != null) {
                this.B0.e().drawableState = getState();
                this.B0.j(this.u0);
            }
            this.B0.e().setTextAlign(r0);
            int i = 0;
            boolean z = Math.round(this.B0.f(f1().toString())) > Math.round(this.y0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.y0);
            }
            CharSequence charSequence = this.U;
            if (z && this.T0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.B0.e(), this.y0.width(), this.T0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.z0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.B0.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void C1(boolean z) {
        if (this.h0 != z) {
            boolean K2 = K2();
            this.h0 = z;
            boolean K22 = K2();
            if (K2 != K22) {
                if (K22) {
                    i0(this.i0);
                } else {
                    N2(this.i0);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public void C2(ik1 ik1Var) {
        this.B0.h(ik1Var, this.u0);
    }

    public Drawable D0() {
        return this.i0;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            onStateChange(getState());
        }
    }

    public void D2(int i) {
        C2(new ik1(this.u0, i));
    }

    public ColorStateList E0() {
        return this.j0;
    }

    public void E1(int i) {
        D1(r4.a(this.u0, i));
    }

    public void E2(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            t1();
        }
    }

    public ColorStateList F0() {
        return this.O;
    }

    @Deprecated
    public void F1(float f) {
        if (this.Q != f) {
            this.Q = f;
            setShapeAppearanceModel(C().w(f));
        }
    }

    public void F2(int i) {
        E2(this.u0.getResources().getDimension(i));
    }

    public float G0() {
        return this.W0 ? F() : this.Q;
    }

    @Deprecated
    public void G1(int i) {
        F1(this.u0.getResources().getDimension(i));
    }

    public void G2(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            t1();
        }
    }

    public float H0() {
        return this.t0;
    }

    public void H1(float f) {
        if (this.t0 != f) {
            this.t0 = f;
            invalidateSelf();
            t1();
        }
    }

    public void H2(int i) {
        G2(this.u0.getResources().getDimension(i));
    }

    public Drawable I0() {
        Drawable drawable = this.W;
        if (drawable != null) {
            return nu.q(drawable);
        }
        return null;
    }

    public void I1(int i) {
        H1(this.u0.getResources().getDimension(i));
    }

    public void I2(boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            O2();
            onStateChange(getState());
        }
    }

    public float J0() {
        return this.Y;
    }

    public void J1(Drawable drawable) {
        Drawable I0 = I0();
        if (I0 != drawable) {
            float k0 = k0();
            this.W = drawable != null ? nu.r(drawable).mutate() : null;
            float k02 = k0();
            N2(I0);
            if (L2()) {
                i0(this.W);
            }
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public boolean J2() {
        return this.U0;
    }

    public ColorStateList K0() {
        return this.X;
    }

    public void K1(int i) {
        J1(r4.b(this.u0, i));
    }

    public final boolean K2() {
        return this.h0 && this.i0 != null && this.I0;
    }

    public float L0() {
        return this.P;
    }

    public void L1(float f) {
        if (this.Y != f) {
            float k0 = k0();
            this.Y = f;
            float k02 = k0();
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public final boolean L2() {
        return this.V && this.W != null;
    }

    public float M0() {
        return this.m0;
    }

    public void M1(int i) {
        L1(this.u0.getResources().getDimension(i));
    }

    public final boolean M2() {
        return this.a0 && this.b0 != null;
    }

    public ColorStateList N0() {
        return this.R;
    }

    public void N1(ColorStateList colorStateList) {
        this.Z = true;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (L2()) {
                nu.o(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float O0() {
        return this.S;
    }

    public void O1(int i) {
        N1(r4.a(this.u0, i));
    }

    public final void O2() {
        this.R0 = this.Q0 ? z51.a(this.T) : null;
    }

    public Drawable P0() {
        Drawable drawable = this.b0;
        if (drawable != null) {
            return nu.q(drawable);
        }
        return null;
    }

    public void P1(int i) {
        Q1(this.u0.getResources().getBoolean(i));
    }

    @TargetApi(21)
    public final void P2() {
        this.c0 = new RippleDrawable(z51.a(d1()), this.b0, Y0);
    }

    public CharSequence Q0() {
        return this.f0;
    }

    public void Q1(boolean z) {
        if (this.V != z) {
            boolean L2 = L2();
            this.V = z;
            boolean L22 = L2();
            if (L2 != L22) {
                if (L22) {
                    i0(this.W);
                } else {
                    N2(this.W);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public float R0() {
        return this.s0;
    }

    public void R1(float f) {
        if (this.P != f) {
            this.P = f;
            invalidateSelf();
            t1();
        }
    }

    public float S0() {
        return this.e0;
    }

    public void S1(int i) {
        R1(this.u0.getResources().getDimension(i));
    }

    public float T0() {
        return this.r0;
    }

    public void T1(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            t1();
        }
    }

    public int[] U0() {
        return this.P0;
    }

    public void U1(int i) {
        T1(this.u0.getResources().getDimension(i));
    }

    public ColorStateList V0() {
        return this.d0;
    }

    public void V1(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (this.W0) {
                d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void W0(RectF rectF) {
        n0(getBounds(), rectF);
    }

    public void W1(int i) {
        V1(r4.a(this.u0, i));
    }

    public final float X0() {
        Drawable drawable = this.I0 ? this.i0 : this.W;
        float f = this.Y;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(fu1.b(this.u0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    public void X1(float f) {
        if (this.S != f) {
            this.S = f;
            this.v0.setStrokeWidth(f);
            if (this.W0) {
                super.e0(f);
            }
            invalidateSelf();
        }
    }

    public final float Y0() {
        Drawable drawable = this.I0 ? this.i0 : this.W;
        float f = this.Y;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void Y1(int i) {
        X1(this.u0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt Z0() {
        return this.T0;
    }

    public final void Z1(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.daaw.nk1.b
    public void a() {
        t1();
        invalidateSelf();
    }

    public rq0 a1() {
        return this.l0;
    }

    public void a2(Drawable drawable) {
        Drawable P0 = P0();
        if (P0 != drawable) {
            float o0 = o0();
            this.b0 = drawable != null ? nu.r(drawable).mutate() : null;
            if (z51.a) {
                P2();
            }
            float o02 = o0();
            N2(P0);
            if (M2()) {
                i0(this.b0);
            }
            invalidateSelf();
            if (o0 != o02) {
                t1();
            }
        }
    }

    public float b1() {
        return this.o0;
    }

    public void b2(CharSequence charSequence) {
        if (this.f0 != charSequence) {
            this.f0 = pb.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float c1() {
        return this.n0;
    }

    public void c2(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public ColorStateList d1() {
        return this.T;
    }

    public void d2(int i) {
        c2(this.u0.getResources().getDimension(i));
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.K0;
        int a = i < 255 ? yd.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        y0(canvas, bounds);
        v0(canvas, bounds);
        if (this.W0) {
            super.draw(canvas);
        }
        x0(canvas, bounds);
        A0(canvas, bounds);
        w0(canvas, bounds);
        u0(canvas, bounds);
        if (this.U0) {
            C0(canvas, bounds);
        }
        z0(canvas, bounds);
        B0(canvas, bounds);
        if (this.K0 < 255) {
            canvas.restoreToCount(a);
        }
    }

    public rq0 e1() {
        return this.k0;
    }

    public void e2(int i) {
        a2(r4.b(this.u0, i));
    }

    public CharSequence f1() {
        return this.U;
    }

    public void f2(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public ik1 g1() {
        return this.B0.d();
    }

    public void g2(int i) {
        f2(this.u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.P;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.m0 + k0() + this.p0 + this.B0.f(f1().toString()) + this.q0 + o0() + this.t0), this.V0);
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.Q);
        } else {
            outline.setRoundRect(bounds, this.Q);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.q0;
    }

    public void h2(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public final void i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        nu.m(drawable, nu.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.b0) {
            if (drawable.isStateful()) {
                drawable.setState(U0());
            }
            nu.o(drawable, this.d0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.W;
        if (drawable == drawable2 && this.Z) {
            nu.o(drawable2, this.X);
        }
    }

    public float i1() {
        return this.p0;
    }

    public void i2(int i) {
        h2(this.u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return p1(this.N) || p1(this.O) || p1(this.R) || (this.Q0 && p1(this.R0)) || r1(this.B0.d()) || s0() || q1(this.W) || q1(this.i0) || p1(this.N0);
    }

    public final void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2() || K2()) {
            float f = this.m0 + this.n0;
            float Y02 = Y0();
            if (nu.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + Y02;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - Y02;
            }
            float X02 = X0();
            float exactCenterY = rect.exactCenterY() - (X02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + X02;
        }
    }

    public final ColorFilter j1() {
        ColorFilter colorFilter = this.L0;
        return colorFilter != null ? colorFilter : this.M0;
    }

    public boolean j2(int[] iArr) {
        if (Arrays.equals(this.P0, iArr)) {
            return false;
        }
        this.P0 = iArr;
        if (M2()) {
            return u1(getState(), iArr);
        }
        return false;
    }

    public float k0() {
        if (L2() || K2()) {
            return this.n0 + Y0() + this.o0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.Q0;
    }

    public void k2(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (M2()) {
                nu.o(this.b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (M2()) {
            float f = this.t0 + this.s0 + this.e0 + this.r0 + this.q0;
            if (nu.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void l2(int i) {
        k2(r4.a(this.u0, i));
    }

    public final void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f = this.t0 + this.s0;
            if (nu.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.e0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.e0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.e0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean m1() {
        return this.g0;
    }

    public void m2(boolean z) {
        if (this.a0 != z) {
            boolean M2 = M2();
            this.a0 = z;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    i0(this.b0);
                } else {
                    N2(this.b0);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f = this.t0 + this.s0 + this.e0 + this.r0 + this.q0;
            if (nu.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean n1() {
        return q1(this.b0);
    }

    public void n2(InterfaceC0098a interfaceC0098a) {
        this.S0 = new WeakReference<>(interfaceC0098a);
    }

    public float o0() {
        if (M2()) {
            return this.r0 + this.e0 + this.s0;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.a0;
    }

    public void o2(TextUtils.TruncateAt truncateAt) {
        this.T0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (L2()) {
            onLayoutDirectionChanged |= nu.m(this.W, i);
        }
        if (K2()) {
            onLayoutDirectionChanged |= nu.m(this.i0, i);
        }
        if (M2()) {
            onLayoutDirectionChanged |= nu.m(this.b0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (L2()) {
            onLevelChange |= this.W.setLevel(i);
        }
        if (K2()) {
            onLevelChange |= this.i0.setLevel(i);
        }
        if (M2()) {
            onLevelChange |= this.b0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.W0) {
            super.onStateChange(iArr);
        }
        return u1(iArr, U0());
    }

    public final void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.U != null) {
            float k0 = this.m0 + k0() + this.p0;
            float o0 = this.t0 + o0() + this.q0;
            if (nu.f(this) == 0) {
                rectF.left = rect.left + k0;
                rectF.right = rect.right - o0;
            } else {
                rectF.left = rect.left + o0;
                rectF.right = rect.right - k0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void p2(rq0 rq0Var) {
        this.l0 = rq0Var;
    }

    public final float q0() {
        this.B0.e().getFontMetrics(this.x0);
        Paint.FontMetrics fontMetrics = this.x0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void q2(int i) {
        p2(rq0.c(this.u0, i));
    }

    public Paint.Align r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.U != null) {
            float k0 = this.m0 + k0() + this.p0;
            if (nu.f(this) == 0) {
                pointF.x = rect.left + k0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - k0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - q0();
        }
        return align;
    }

    public void r2(float f) {
        if (this.o0 != f) {
            float k0 = k0();
            this.o0 = f;
            float k02 = k0();
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public final boolean s0() {
        return this.h0 && this.i0 != null && this.g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.s1(android.util.AttributeSet, int, int):void");
    }

    public void s2(int i) {
        r2(this.u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            invalidateSelf();
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.L0 != colorFilter) {
            this.L0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.O0 != mode) {
            this.O0 = mode;
            this.M0 = wu.a(this, this.N0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (L2()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (K2()) {
            visible |= this.i0.setVisible(z, z2);
        }
        if (M2()) {
            visible |= this.b0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1() {
        InterfaceC0098a interfaceC0098a = this.S0.get();
        if (interfaceC0098a != null) {
            interfaceC0098a.a();
        }
    }

    public void t2(float f) {
        if (this.n0 != f) {
            float k0 = k0();
            this.n0 = f;
            float k02 = k0();
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (K2()) {
            j0(rect, this.y0);
            RectF rectF = this.y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.i0.setBounds(0, 0, (int) this.y0.width(), (int) this.y0.height());
            this.i0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.u1(int[], int[]):boolean");
    }

    public void u2(int i) {
        t2(this.u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (this.W0) {
            return;
        }
        this.v0.setColor(this.D0);
        this.v0.setStyle(Paint.Style.FILL);
        this.v0.setColorFilter(j1());
        this.y0.set(rect);
        canvas.drawRoundRect(this.y0, G0(), G0(), this.v0);
    }

    public void v1(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            float k0 = k0();
            if (!z && this.I0) {
                this.I0 = false;
            }
            float k02 = k0();
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public void v2(int i) {
        this.V0 = i;
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (L2()) {
            j0(rect, this.y0);
            RectF rectF = this.y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.W.setBounds(0, 0, (int) this.y0.width(), (int) this.y0.height());
            this.W.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void w1(int i) {
        v1(this.u0.getResources().getBoolean(i));
    }

    public void w2(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            O2();
            onStateChange(getState());
        }
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (this.S <= 0.0f || this.W0) {
            return;
        }
        this.v0.setColor(this.F0);
        this.v0.setStyle(Paint.Style.STROKE);
        if (!this.W0) {
            this.v0.setColorFilter(j1());
        }
        RectF rectF = this.y0;
        float f = this.S;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.Q - (this.S / 2.0f);
        canvas.drawRoundRect(this.y0, f2, f2, this.v0);
    }

    public void x1(Drawable drawable) {
        if (this.i0 != drawable) {
            float k0 = k0();
            this.i0 = drawable;
            float k02 = k0();
            N2(this.i0);
            i0(this.i0);
            invalidateSelf();
            if (k0 != k02) {
                t1();
            }
        }
    }

    public void x2(int i) {
        w2(r4.a(this.u0, i));
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (this.W0) {
            return;
        }
        this.v0.setColor(this.C0);
        this.v0.setStyle(Paint.Style.FILL);
        this.y0.set(rect);
        canvas.drawRoundRect(this.y0, G0(), G0(), this.v0);
    }

    public void y1(int i) {
        x1(r4.b(this.u0, i));
    }

    public void y2(boolean z) {
        this.U0 = z;
    }

    public final void z0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (M2()) {
            m0(rect, this.y0);
            RectF rectF = this.y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.b0.setBounds(0, 0, (int) this.y0.width(), (int) this.y0.height());
            if (z51.a) {
                this.c0.setBounds(this.b0.getBounds());
                this.c0.jumpToCurrentState();
                drawable = this.c0;
            } else {
                drawable = this.b0;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void z1(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            if (s0()) {
                nu.o(this.i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void z2(rq0 rq0Var) {
        this.k0 = rq0Var;
    }
}
