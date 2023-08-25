package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import com.daaw.C2366nu;
import com.daaw.C2533pb;
import com.daaw.C2818r4;
import com.daaw.C3466wu;
import com.daaw.C3690yd;
import com.daaw.C3838zg;
import com.daaw.fu1;
import com.daaw.ik1;
import com.daaw.jn0;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.nk1;
import com.daaw.nn0;
import com.daaw.rq0;
import com.daaw.xk1;
import com.daaw.z51;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes2.dex */
public class C4052a extends nn0 implements Drawable.Callback, nk1.InterfaceC2306b {

    /* renamed from: X0 */
    public static final int[] f37356X0 = {16842910};

    /* renamed from: Y0 */
    public static final ShapeDrawable f37357Y0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    public final Path f37358A0;

    /* renamed from: B0 */
    public final nk1 f37359B0;

    /* renamed from: C0 */
    public int f37360C0;

    /* renamed from: D0 */
    public int f37361D0;

    /* renamed from: E0 */
    public int f37362E0;

    /* renamed from: F0 */
    public int f37363F0;

    /* renamed from: G0 */
    public int f37364G0;

    /* renamed from: H0 */
    public int f37365H0;

    /* renamed from: I0 */
    public boolean f37366I0;

    /* renamed from: J0 */
    public int f37367J0;

    /* renamed from: K0 */
    public int f37368K0;

    /* renamed from: L0 */
    public ColorFilter f37369L0;

    /* renamed from: M0 */
    public PorterDuffColorFilter f37370M0;

    /* renamed from: N */
    public ColorStateList f37371N;

    /* renamed from: N0 */
    public ColorStateList f37372N0;

    /* renamed from: O */
    public ColorStateList f37373O;

    /* renamed from: O0 */
    public PorterDuff.Mode f37374O0;

    /* renamed from: P */
    public float f37375P;

    /* renamed from: P0 */
    public int[] f37376P0;

    /* renamed from: Q */
    public float f37377Q;

    /* renamed from: Q0 */
    public boolean f37378Q0;

    /* renamed from: R */
    public ColorStateList f37379R;

    /* renamed from: R0 */
    public ColorStateList f37380R0;

    /* renamed from: S */
    public float f37381S;

    /* renamed from: S0 */
    public WeakReference<InterfaceC4053a> f37382S0;

    /* renamed from: T */
    public ColorStateList f37383T;

    /* renamed from: T0 */
    public TextUtils.TruncateAt f37384T0;

    /* renamed from: U */
    public CharSequence f37385U;

    /* renamed from: U0 */
    public boolean f37386U0;

    /* renamed from: V */
    public boolean f37387V;

    /* renamed from: V0 */
    public int f37388V0;

    /* renamed from: W */
    public Drawable f37389W;

    /* renamed from: W0 */
    public boolean f37390W0;

    /* renamed from: X */
    public ColorStateList f37391X;

    /* renamed from: Y */
    public float f37392Y;

    /* renamed from: Z */
    public boolean f37393Z;

    /* renamed from: a0 */
    public boolean f37394a0;

    /* renamed from: b0 */
    public Drawable f37395b0;

    /* renamed from: c0 */
    public Drawable f37396c0;

    /* renamed from: d0 */
    public ColorStateList f37397d0;

    /* renamed from: e0 */
    public float f37398e0;

    /* renamed from: f0 */
    public CharSequence f37399f0;

    /* renamed from: g0 */
    public boolean f37400g0;

    /* renamed from: h0 */
    public boolean f37401h0;

    /* renamed from: i0 */
    public Drawable f37402i0;

    /* renamed from: j0 */
    public ColorStateList f37403j0;

    /* renamed from: k0 */
    public rq0 f37404k0;

    /* renamed from: l0 */
    public rq0 f37405l0;

    /* renamed from: m0 */
    public float f37406m0;

    /* renamed from: n0 */
    public float f37407n0;

    /* renamed from: o0 */
    public float f37408o0;

    /* renamed from: p0 */
    public float f37409p0;

    /* renamed from: q0 */
    public float f37410q0;

    /* renamed from: r0 */
    public float f37411r0;

    /* renamed from: s0 */
    public float f37412s0;

    /* renamed from: t0 */
    public float f37413t0;

    /* renamed from: u0 */
    public final Context f37414u0;

    /* renamed from: v0 */
    public final Paint f37415v0;

    /* renamed from: w0 */
    public final Paint f37416w0;

    /* renamed from: x0 */
    public final Paint.FontMetrics f37417x0;

    /* renamed from: y0 */
    public final RectF f37418y0;

    /* renamed from: z0 */
    public final PointF f37419z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4053a {
        /* renamed from: a */
        void mo620a();
    }

    public C4052a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37377Q = -1.0f;
        this.f37415v0 = new Paint(1);
        this.f37417x0 = new Paint.FontMetrics();
        this.f37418y0 = new RectF();
        this.f37419z0 = new PointF();
        this.f37358A0 = new Path();
        this.f37368K0 = 255;
        this.f37374O0 = PorterDuff.Mode.SRC_IN;
        this.f37382S0 = new WeakReference<>(null);
        m15007M(context);
        this.f37414u0 = context;
        nk1 nk1Var = new nk1(this);
        this.f37359B0 = nk1Var;
        this.f37385U = "";
        nk1Var.m15122e().density = context.getResources().getDisplayMetrics().density;
        this.f37416w0 = null;
        int[] iArr = f37356X0;
        setState(iArr);
        m669j2(iArr);
        this.f37386U0 = true;
        if (z51.f34455a) {
            f37357Y0.setTint(-1);
        }
    }

    /* renamed from: l1 */
    public static boolean m664l1(int[] iArr, int i) {
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

    /* renamed from: p1 */
    public static boolean m652p1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: q1 */
    public static boolean m649q1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: r1 */
    public static boolean m646r1(ik1 ik1Var) {
        ColorStateList colorStateList;
        return (ik1Var == null || (colorStateList = ik1Var.f13693a) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: t0 */
    public static C4052a m641t0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4052a c4052a = new C4052a(context, attributeSet, i, i2);
        c4052a.m643s1(attributeSet, i, i2);
        return c4052a;
    }

    /* renamed from: A0 */
    public final void m759A0(Canvas canvas, Rect rect) {
        this.f37415v0.setColor(this.f37364G0);
        this.f37415v0.setStyle(Paint.Style.FILL);
        this.f37418y0.set(rect);
        if (!this.f37390W0) {
            canvas.drawRoundRect(this.f37418y0, m741G0(), m741G0(), this.f37415v0);
            return;
        }
        m14980h(new RectF(rect), this.f37358A0);
        super.m14971p(canvas, this.f37415v0, this.f37358A0, m14966u());
    }

    /* renamed from: A1 */
    public void m758A1(int i) {
        m622z1(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: A2 */
    public void m757A2(int i) {
        m621z2(rq0.m11069c(this.f37414u0, i));
    }

    /* renamed from: B0 */
    public final void m756B0(Canvas canvas, Rect rect) {
        Paint paint = this.f37416w0;
        if (paint != null) {
            paint.setColor(C3838zg.m2344j(-16777216, 127));
            canvas.drawRect(rect, this.f37416w0);
            if (m724L2() || m727K2()) {
                m671j0(rect, this.f37418y0);
                canvas.drawRect(this.f37418y0, this.f37416w0);
            }
            if (this.f37385U != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f37416w0);
            }
            if (m721M2()) {
                m662m0(rect, this.f37418y0);
                canvas.drawRect(this.f37418y0, this.f37416w0);
            }
            this.f37416w0.setColor(C3838zg.m2344j(-65536, 127));
            m665l0(rect, this.f37418y0);
            canvas.drawRect(this.f37418y0, this.f37416w0);
            this.f37416w0.setColor(C3838zg.m2344j(-16711936, 127));
            m659n0(rect, this.f37418y0);
            canvas.drawRect(this.f37418y0, this.f37416w0);
        }
    }

    /* renamed from: B1 */
    public void m755B1(int i) {
        m752C1(this.f37414u0.getResources().getBoolean(i));
    }

    /* renamed from: B2 */
    public void m754B2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f37385U, charSequence)) {
            return;
        }
        this.f37385U = charSequence;
        this.f37359B0.m15118i(true);
        invalidateSelf();
        m640t1();
    }

    /* renamed from: C0 */
    public final void m753C0(Canvas canvas, Rect rect) {
        if (this.f37385U != null) {
            Paint.Align m647r0 = m647r0(rect, this.f37419z0);
            m653p0(rect, this.f37418y0);
            if (this.f37359B0.m15123d() != null) {
                this.f37359B0.m15122e().drawableState = getState();
                this.f37359B0.m15117j(this.f37414u0);
            }
            this.f37359B0.m15122e().setTextAlign(m647r0);
            int i = 0;
            boolean z = Math.round(this.f37359B0.m15121f(m680f1().toString())) > Math.round(this.f37418y0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f37418y0);
            }
            CharSequence charSequence = this.f37385U;
            if (z && this.f37384T0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f37359B0.m15122e(), this.f37418y0.width(), this.f37384T0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f37419z0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f37359B0.m15122e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: C1 */
    public void m752C1(boolean z) {
        if (this.f37401h0 != z) {
            boolean m727K2 = m727K2();
            this.f37401h0 = z;
            boolean m727K22 = m727K2();
            if (m727K2 != m727K22) {
                if (m727K22) {
                    m674i0(this.f37402i0);
                } else {
                    m718N2(this.f37402i0);
                }
                invalidateSelf();
                m640t1();
            }
        }
    }

    /* renamed from: C2 */
    public void m751C2(ik1 ik1Var) {
        this.f37359B0.m15119h(ik1Var, this.f37414u0);
    }

    /* renamed from: D0 */
    public Drawable m750D0() {
        return this.f37402i0;
    }

    /* renamed from: D1 */
    public void m749D1(ColorStateList colorStateList) {
        if (this.f37373O != colorStateList) {
            this.f37373O = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: D2 */
    public void m748D2(int i) {
        m751C2(new ik1(this.f37414u0, i));
    }

    /* renamed from: E0 */
    public ColorStateList m747E0() {
        return this.f37403j0;
    }

    /* renamed from: E1 */
    public void m746E1(int i) {
        m749D1(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: E2 */
    public void m745E2(float f) {
        if (this.f37410q0 != f) {
            this.f37410q0 = f;
            invalidateSelf();
            m640t1();
        }
    }

    /* renamed from: F0 */
    public ColorStateList m744F0() {
        return this.f37373O;
    }

    @Deprecated
    /* renamed from: F1 */
    public void m743F1(float f) {
        if (this.f37377Q != f) {
            this.f37377Q = f;
            setShapeAppearanceModel(m15017C().m21790w(f));
        }
    }

    /* renamed from: F2 */
    public void m742F2(int i) {
        m745E2(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: G0 */
    public float m741G0() {
        return this.f37390W0 ? m15014F() : this.f37377Q;
    }

    @Deprecated
    /* renamed from: G1 */
    public void m740G1(int i) {
        m743F1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: G2 */
    public void m739G2(float f) {
        if (this.f37409p0 != f) {
            this.f37409p0 = f;
            invalidateSelf();
            m640t1();
        }
    }

    /* renamed from: H0 */
    public float m738H0() {
        return this.f37413t0;
    }

    /* renamed from: H1 */
    public void m737H1(float f) {
        if (this.f37413t0 != f) {
            this.f37413t0 = f;
            invalidateSelf();
            m640t1();
        }
    }

    /* renamed from: H2 */
    public void m736H2(int i) {
        m739G2(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: I0 */
    public Drawable m735I0() {
        Drawable drawable = this.f37389W;
        if (drawable != null) {
            return C2366nu.m14810q(drawable);
        }
        return null;
    }

    /* renamed from: I1 */
    public void m734I1(int i) {
        m737H1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: I2 */
    public void m733I2(boolean z) {
        if (this.f37378Q0 != z) {
            this.f37378Q0 = z;
            m715O2();
            onStateChange(getState());
        }
    }

    /* renamed from: J0 */
    public float m732J0() {
        return this.f37392Y;
    }

    /* renamed from: J1 */
    public void m731J1(Drawable drawable) {
        Drawable m735I0 = m735I0();
        if (m735I0 != drawable) {
            float m668k0 = m668k0();
            this.f37389W = drawable != null ? C2366nu.m14809r(drawable).mutate() : null;
            float m668k02 = m668k0();
            m718N2(m735I0);
            if (m724L2()) {
                m674i0(this.f37389W);
            }
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: J2 */
    public boolean m730J2() {
        return this.f37386U0;
    }

    /* renamed from: K0 */
    public ColorStateList m729K0() {
        return this.f37391X;
    }

    /* renamed from: K1 */
    public void m728K1(int i) {
        m731J1(C2818r4.m11783b(this.f37414u0, i));
    }

    /* renamed from: K2 */
    public final boolean m727K2() {
        return this.f37401h0 && this.f37402i0 != null && this.f37366I0;
    }

    /* renamed from: L0 */
    public float m726L0() {
        return this.f37375P;
    }

    /* renamed from: L1 */
    public void m725L1(float f) {
        if (this.f37392Y != f) {
            float m668k0 = m668k0();
            this.f37392Y = f;
            float m668k02 = m668k0();
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: L2 */
    public final boolean m724L2() {
        return this.f37387V && this.f37389W != null;
    }

    /* renamed from: M0 */
    public float m723M0() {
        return this.f37406m0;
    }

    /* renamed from: M1 */
    public void m722M1(int i) {
        m725L1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: M2 */
    public final boolean m721M2() {
        return this.f37394a0 && this.f37395b0 != null;
    }

    /* renamed from: N0 */
    public ColorStateList m720N0() {
        return this.f37379R;
    }

    /* renamed from: N1 */
    public void m719N1(ColorStateList colorStateList) {
        this.f37393Z = true;
        if (this.f37391X != colorStateList) {
            this.f37391X = colorStateList;
            if (m724L2()) {
                C2366nu.m14812o(this.f37389W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: N2 */
    public final void m718N2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: O0 */
    public float m717O0() {
        return this.f37381S;
    }

    /* renamed from: O1 */
    public void m716O1(int i) {
        m719N1(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: O2 */
    public final void m715O2() {
        this.f37380R0 = this.f37378Q0 ? z51.m2812a(this.f37383T) : null;
    }

    /* renamed from: P0 */
    public Drawable m714P0() {
        Drawable drawable = this.f37395b0;
        if (drawable != null) {
            return C2366nu.m14810q(drawable);
        }
        return null;
    }

    /* renamed from: P1 */
    public void m713P1(int i) {
        m710Q1(this.f37414u0.getResources().getBoolean(i));
    }

    @TargetApi(21)
    /* renamed from: P2 */
    public final void m712P2() {
        this.f37396c0 = new RippleDrawable(z51.m2812a(m684d1()), this.f37395b0, f37357Y0);
    }

    /* renamed from: Q0 */
    public CharSequence m711Q0() {
        return this.f37399f0;
    }

    /* renamed from: Q1 */
    public void m710Q1(boolean z) {
        if (this.f37387V != z) {
            boolean m724L2 = m724L2();
            this.f37387V = z;
            boolean m724L22 = m724L2();
            if (m724L2 != m724L22) {
                if (m724L22) {
                    m674i0(this.f37389W);
                } else {
                    m718N2(this.f37389W);
                }
                invalidateSelf();
                m640t1();
            }
        }
    }

    /* renamed from: R0 */
    public float m709R0() {
        return this.f37412s0;
    }

    /* renamed from: R1 */
    public void m708R1(float f) {
        if (this.f37375P != f) {
            this.f37375P = f;
            invalidateSelf();
            m640t1();
        }
    }

    /* renamed from: S0 */
    public float m707S0() {
        return this.f37398e0;
    }

    /* renamed from: S1 */
    public void m706S1(int i) {
        m708R1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: T0 */
    public float m705T0() {
        return this.f37411r0;
    }

    /* renamed from: T1 */
    public void m704T1(float f) {
        if (this.f37406m0 != f) {
            this.f37406m0 = f;
            invalidateSelf();
            m640t1();
        }
    }

    /* renamed from: U0 */
    public int[] m703U0() {
        return this.f37376P0;
    }

    /* renamed from: U1 */
    public void m702U1(int i) {
        m704T1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: V0 */
    public ColorStateList m701V0() {
        return this.f37397d0;
    }

    /* renamed from: V1 */
    public void m700V1(ColorStateList colorStateList) {
        if (this.f37379R != colorStateList) {
            this.f37379R = colorStateList;
            if (this.f37390W0) {
                m14987d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: W0 */
    public void m699W0(RectF rectF) {
        m659n0(getBounds(), rectF);
    }

    /* renamed from: W1 */
    public void m698W1(int i) {
        m700V1(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: X0 */
    public final float m697X0() {
        Drawable drawable = this.f37366I0 ? this.f37402i0 : this.f37389W;
        float f = this.f37392Y;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(fu1.m22261b(this.f37414u0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: X1 */
    public void m696X1(float f) {
        if (this.f37381S != f) {
            this.f37381S = f;
            this.f37415v0.setStrokeWidth(f);
            if (this.f37390W0) {
                super.m14985e0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Y0 */
    public final float m695Y0() {
        Drawable drawable = this.f37366I0 ? this.f37402i0 : this.f37389W;
        float f = this.f37392Y;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    /* renamed from: Y1 */
    public void m694Y1(int i) {
        m696X1(this.f37414u0.getResources().getDimension(i));
    }

    /* renamed from: Z0 */
    public TextUtils.TruncateAt m693Z0() {
        return this.f37384T0;
    }

    /* renamed from: Z1 */
    public final void m692Z1(ColorStateList colorStateList) {
        if (this.f37371N != colorStateList) {
            this.f37371N = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.daaw.nk1.InterfaceC2306b
    /* renamed from: a */
    public void mo691a() {
        m640t1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public rq0 m690a1() {
        return this.f37405l0;
    }

    /* renamed from: a2 */
    public void m689a2(Drawable drawable) {
        Drawable m714P0 = m714P0();
        if (m714P0 != drawable) {
            float m656o0 = m656o0();
            this.f37395b0 = drawable != null ? C2366nu.m14809r(drawable).mutate() : null;
            if (z51.f34455a) {
                m712P2();
            }
            float m656o02 = m656o0();
            m718N2(m714P0);
            if (m721M2()) {
                m674i0(this.f37395b0);
            }
            invalidateSelf();
            if (m656o0 != m656o02) {
                m640t1();
            }
        }
    }

    /* renamed from: b1 */
    public float m688b1() {
        return this.f37408o0;
    }

    /* renamed from: b2 */
    public void m687b2(CharSequence charSequence) {
        if (this.f37399f0 != charSequence) {
            this.f37399f0 = C2533pb.m13528c().m13523h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: c1 */
    public float m686c1() {
        return this.f37407n0;
    }

    /* renamed from: c2 */
    public void m685c2(float f) {
        if (this.f37412s0 != f) {
            this.f37412s0 = f;
            invalidateSelf();
            if (m721M2()) {
                m640t1();
            }
        }
    }

    /* renamed from: d1 */
    public ColorStateList m684d1() {
        return this.f37383T;
    }

    /* renamed from: d2 */
    public void m683d2(int i) {
        m685c2(this.f37414u0.getResources().getDimension(i));
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f37368K0;
        int m3858a = i < 255 ? C3690yd.m3858a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        m626y0(canvas, bounds);
        m635v0(canvas, bounds);
        if (this.f37390W0) {
            super.draw(canvas);
        }
        m629x0(canvas, bounds);
        m759A0(canvas, bounds);
        m632w0(canvas, bounds);
        m638u0(canvas, bounds);
        if (this.f37386U0) {
            m753C0(canvas, bounds);
        }
        m623z0(canvas, bounds);
        m756B0(canvas, bounds);
        if (this.f37368K0 < 255) {
            canvas.restoreToCount(m3858a);
        }
    }

    /* renamed from: e1 */
    public rq0 m682e1() {
        return this.f37404k0;
    }

    /* renamed from: e2 */
    public void m681e2(int i) {
        m689a2(C2818r4.m11783b(this.f37414u0, i));
    }

    /* renamed from: f1 */
    public CharSequence m680f1() {
        return this.f37385U;
    }

    /* renamed from: f2 */
    public void m679f2(float f) {
        if (this.f37398e0 != f) {
            this.f37398e0 = f;
            invalidateSelf();
            if (m721M2()) {
                m640t1();
            }
        }
    }

    /* renamed from: g1 */
    public ik1 m678g1() {
        return this.f37359B0.m15123d();
    }

    /* renamed from: g2 */
    public void m677g2(int i) {
        m679f2(this.f37414u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37368K0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37369L0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f37375P;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f37406m0 + m668k0() + this.f37409p0 + this.f37359B0.m15121f(m680f1().toString()) + this.f37410q0 + m656o0() + this.f37413t0), this.f37388V0);
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f37390W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f37377Q);
        } else {
            outline.setRoundRect(bounds, this.f37377Q);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public float m676h1() {
        return this.f37410q0;
    }

    /* renamed from: h2 */
    public void m675h2(float f) {
        if (this.f37411r0 != f) {
            this.f37411r0 = f;
            invalidateSelf();
            if (m721M2()) {
                m640t1();
            }
        }
    }

    /* renamed from: i0 */
    public final void m674i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C2366nu.m14814m(drawable, C2366nu.m14821f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f37395b0) {
            if (drawable.isStateful()) {
                drawable.setState(m703U0());
            }
            C2366nu.m14812o(drawable, this.f37397d0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f37389W;
        if (drawable == drawable2 && this.f37393Z) {
            C2366nu.m14812o(drawable2, this.f37391X);
        }
    }

    /* renamed from: i1 */
    public float m673i1() {
        return this.f37409p0;
    }

    /* renamed from: i2 */
    public void m672i2(int i) {
        m675h2(this.f37414u0.getResources().getDimension(i));
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
        return m652p1(this.f37371N) || m652p1(this.f37373O) || m652p1(this.f37379R) || (this.f37378Q0 && m652p1(this.f37380R0)) || m646r1(this.f37359B0.m15123d()) || m644s0() || m649q1(this.f37389W) || m649q1(this.f37402i0) || m652p1(this.f37372N0);
    }

    /* renamed from: j0 */
    public final void m671j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m724L2() || m727K2()) {
            float f = this.f37406m0 + this.f37407n0;
            float m695Y0 = m695Y0();
            if (C2366nu.m14821f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m695Y0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m695Y0;
            }
            float m697X0 = m697X0();
            float exactCenterY = rect.exactCenterY() - (m697X0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m697X0;
        }
    }

    /* renamed from: j1 */
    public final ColorFilter m670j1() {
        ColorFilter colorFilter = this.f37369L0;
        return colorFilter != null ? colorFilter : this.f37370M0;
    }

    /* renamed from: j2 */
    public boolean m669j2(int[] iArr) {
        if (Arrays.equals(this.f37376P0, iArr)) {
            return false;
        }
        this.f37376P0 = iArr;
        if (m721M2()) {
            return m637u1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: k0 */
    public float m668k0() {
        if (m724L2() || m727K2()) {
            return this.f37407n0 + m695Y0() + this.f37408o0;
        }
        return 0.0f;
    }

    /* renamed from: k1 */
    public boolean m667k1() {
        return this.f37378Q0;
    }

    /* renamed from: k2 */
    public void m666k2(ColorStateList colorStateList) {
        if (this.f37397d0 != colorStateList) {
            this.f37397d0 = colorStateList;
            if (m721M2()) {
                C2366nu.m14812o(this.f37395b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: l0 */
    public final void m665l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m721M2()) {
            float f = this.f37413t0 + this.f37412s0 + this.f37398e0 + this.f37411r0 + this.f37410q0;
            if (C2366nu.m14821f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: l2 */
    public void m663l2(int i) {
        m666k2(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: m0 */
    public final void m662m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m721M2()) {
            float f = this.f37413t0 + this.f37412s0;
            if (C2366nu.m14821f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f37398e0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f37398e0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f37398e0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: m1 */
    public boolean m661m1() {
        return this.f37400g0;
    }

    /* renamed from: m2 */
    public void m660m2(boolean z) {
        if (this.f37394a0 != z) {
            boolean m721M2 = m721M2();
            this.f37394a0 = z;
            boolean m721M22 = m721M2();
            if (m721M2 != m721M22) {
                if (m721M22) {
                    m674i0(this.f37395b0);
                } else {
                    m718N2(this.f37395b0);
                }
                invalidateSelf();
                m640t1();
            }
        }
    }

    /* renamed from: n0 */
    public final void m659n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m721M2()) {
            float f = this.f37413t0 + this.f37412s0 + this.f37398e0 + this.f37411r0 + this.f37410q0;
            if (C2366nu.m14821f(this) == 0) {
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

    /* renamed from: n1 */
    public boolean m658n1() {
        return m649q1(this.f37395b0);
    }

    /* renamed from: n2 */
    public void m657n2(InterfaceC4053a interfaceC4053a) {
        this.f37382S0 = new WeakReference<>(interfaceC4053a);
    }

    /* renamed from: o0 */
    public float m656o0() {
        if (m721M2()) {
            return this.f37411r0 + this.f37398e0 + this.f37412s0;
        }
        return 0.0f;
    }

    /* renamed from: o1 */
    public boolean m655o1() {
        return this.f37394a0;
    }

    /* renamed from: o2 */
    public void m654o2(TextUtils.TruncateAt truncateAt) {
        this.f37384T0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m724L2()) {
            onLayoutDirectionChanged |= C2366nu.m14814m(this.f37389W, i);
        }
        if (m727K2()) {
            onLayoutDirectionChanged |= C2366nu.m14814m(this.f37402i0, i);
        }
        if (m721M2()) {
            onLayoutDirectionChanged |= C2366nu.m14814m(this.f37395b0, i);
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
        if (m724L2()) {
            onLevelChange |= this.f37389W.setLevel(i);
        }
        if (m727K2()) {
            onLevelChange |= this.f37402i0.setLevel(i);
        }
        if (m721M2()) {
            onLevelChange |= this.f37395b0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f37390W0) {
            super.onStateChange(iArr);
        }
        return m637u1(iArr, m703U0());
    }

    /* renamed from: p0 */
    public final void m653p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f37385U != null) {
            float m668k0 = this.f37406m0 + m668k0() + this.f37409p0;
            float m656o0 = this.f37413t0 + m656o0() + this.f37410q0;
            if (C2366nu.m14821f(this) == 0) {
                rectF.left = rect.left + m668k0;
                rectF.right = rect.right - m656o0;
            } else {
                rectF.left = rect.left + m656o0;
                rectF.right = rect.right - m668k0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: p2 */
    public void m651p2(rq0 rq0Var) {
        this.f37405l0 = rq0Var;
    }

    /* renamed from: q0 */
    public final float m650q0() {
        this.f37359B0.m15122e().getFontMetrics(this.f37417x0);
        Paint.FontMetrics fontMetrics = this.f37417x0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: q2 */
    public void m648q2(int i) {
        m651p2(rq0.m11069c(this.f37414u0, i));
    }

    /* renamed from: r0 */
    public Paint.Align m647r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f37385U != null) {
            float m668k0 = this.f37406m0 + m668k0() + this.f37409p0;
            if (C2366nu.m14821f(this) == 0) {
                pointF.x = rect.left + m668k0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m668k0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m650q0();
        }
        return align;
    }

    /* renamed from: r2 */
    public void m645r2(float f) {
        if (this.f37408o0 != f) {
            float m668k0 = m668k0();
            this.f37408o0 = f;
            float m668k02 = m668k0();
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: s0 */
    public final boolean m644s0() {
        return this.f37401h0 && this.f37402i0 != null && this.f37400g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m643s1(AttributeSet attributeSet, int i, int i2) {
        TextUtils.TruncateAt truncateAt;
        int i3;
        int i4;
        TypedArray m5026h = xk1.m5026h(this.f37414u0, attributeSet, m21.f18098N, i, i2, new int[0]);
        this.f37390W0 = m5026h.hasValue(m21.f18378z0);
        m692Z1(mn0.m15930a(this.f37414u0, m5026h, m21.f18286m0));
        m749D1(mn0.m15930a(this.f37414u0, m5026h, m21.f18182Z));
        m708R1(m5026h.getDimension(m21.f18246h0, 0.0f));
        int i5 = m21.f18190a0;
        if (m5026h.hasValue(i5)) {
            m743F1(m5026h.getDimension(i5, 0.0f));
        }
        m700V1(mn0.m15930a(this.f37414u0, m5026h, m21.f18270k0));
        m696X1(m5026h.getDimension(m21.f18278l0, 0.0f));
        m630w2(mn0.m15930a(this.f37414u0, m5026h, m21.f18371y0));
        m754B2(m5026h.getText(m21.f18140T));
        ik1 m15925f = mn0.m15925f(this.f37414u0, m5026h, m21.f18105O);
        m15925f.f13706n = m5026h.getDimension(m21.f18112P, m15925f.f13706n);
        m751C2(m15925f);
        int i6 = m5026h.getInt(m21.f18126R, 0);
        if (i6 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i6 != 2) {
            if (i6 == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            m710Q1(m5026h.getBoolean(m21.f18238g0, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                m710Q1(m5026h.getBoolean(m21.f18214d0, false));
            }
            m731J1(mn0.m15927d(this.f37414u0, m5026h, m21.f18206c0));
            i3 = m21.f18230f0;
            if (m5026h.hasValue(i3)) {
                m719N1(mn0.m15930a(this.f37414u0, m5026h, i3));
            }
            m725L1(m5026h.getDimension(m21.f18222e0, -1.0f));
            m660m2(m5026h.getBoolean(m21.f18336t0, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                m660m2(m5026h.getBoolean(m21.f18301o0, false));
            }
            m689a2(mn0.m15927d(this.f37414u0, m5026h, m21.f18294n0));
            m666k2(mn0.m15930a(this.f37414u0, m5026h, m21.f18329s0));
            m679f2(m5026h.getDimension(m21.f18315q0, 0.0f));
            m634v1(m5026h.getBoolean(m21.f18147U, false));
            m752C1(m5026h.getBoolean(m21.f18175Y, false));
            if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                m752C1(m5026h.getBoolean(m21.f18161W, false));
            }
            m628x1(mn0.m15927d(this.f37414u0, m5026h, m21.f18154V));
            i4 = m21.f18168X;
            if (m5026h.hasValue(i4)) {
                m622z1(mn0.m15930a(this.f37414u0, m5026h, i4));
            }
            m621z2(rq0.m11070b(this.f37414u0, m5026h, m21.f18008A0));
            m651p2(rq0.m11070b(this.f37414u0, m5026h, m21.f18350v0));
            m704T1(m5026h.getDimension(m21.f18262j0, 0.0f));
            m639t2(m5026h.getDimension(m21.f18364x0, 0.0f));
            m645r2(m5026h.getDimension(m21.f18357w0, 0.0f));
            m739G2(m5026h.getDimension(m21.f18022C0, 0.0f));
            m745E2(m5026h.getDimension(m21.f18015B0, 0.0f));
            m675h2(m5026h.getDimension(m21.f18322r0, 0.0f));
            m685c2(m5026h.getDimension(m21.f18308p0, 0.0f));
            m737H1(m5026h.getDimension(m21.f18198b0, 0.0f));
            m633v2(m5026h.getDimensionPixelSize(m21.f18133S, Integer.MAX_VALUE));
            m5026h.recycle();
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        m654o2(truncateAt);
        m710Q1(m5026h.getBoolean(m21.f18238g0, false));
        if (attributeSet != null) {
            m710Q1(m5026h.getBoolean(m21.f18214d0, false));
        }
        m731J1(mn0.m15927d(this.f37414u0, m5026h, m21.f18206c0));
        i3 = m21.f18230f0;
        if (m5026h.hasValue(i3)) {
        }
        m725L1(m5026h.getDimension(m21.f18222e0, -1.0f));
        m660m2(m5026h.getBoolean(m21.f18336t0, false));
        if (attributeSet != null) {
            m660m2(m5026h.getBoolean(m21.f18301o0, false));
        }
        m689a2(mn0.m15927d(this.f37414u0, m5026h, m21.f18294n0));
        m666k2(mn0.m15930a(this.f37414u0, m5026h, m21.f18329s0));
        m679f2(m5026h.getDimension(m21.f18315q0, 0.0f));
        m634v1(m5026h.getBoolean(m21.f18147U, false));
        m752C1(m5026h.getBoolean(m21.f18175Y, false));
        if (attributeSet != null) {
            m752C1(m5026h.getBoolean(m21.f18161W, false));
        }
        m628x1(mn0.m15927d(this.f37414u0, m5026h, m21.f18154V));
        i4 = m21.f18168X;
        if (m5026h.hasValue(i4)) {
        }
        m621z2(rq0.m11070b(this.f37414u0, m5026h, m21.f18008A0));
        m651p2(rq0.m11070b(this.f37414u0, m5026h, m21.f18350v0));
        m704T1(m5026h.getDimension(m21.f18262j0, 0.0f));
        m639t2(m5026h.getDimension(m21.f18364x0, 0.0f));
        m645r2(m5026h.getDimension(m21.f18357w0, 0.0f));
        m739G2(m5026h.getDimension(m21.f18022C0, 0.0f));
        m745E2(m5026h.getDimension(m21.f18015B0, 0.0f));
        m675h2(m5026h.getDimension(m21.f18322r0, 0.0f));
        m685c2(m5026h.getDimension(m21.f18308p0, 0.0f));
        m737H1(m5026h.getDimension(m21.f18198b0, 0.0f));
        m633v2(m5026h.getDimensionPixelSize(m21.f18133S, Integer.MAX_VALUE));
        m5026h.recycle();
    }

    /* renamed from: s2 */
    public void m642s2(int i) {
        m645r2(this.f37414u0.getResources().getDimension(i));
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
        if (this.f37368K0 != i) {
            this.f37368K0 = i;
            invalidateSelf();
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f37369L0 != colorFilter) {
            this.f37369L0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        if (this.f37372N0 != colorStateList) {
            this.f37372N0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f37374O0 != mode) {
            this.f37374O0 = mode;
            this.f37370M0 = C3466wu.m5794a(this, this.f37372N0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m724L2()) {
            visible |= this.f37389W.setVisible(z, z2);
        }
        if (m727K2()) {
            visible |= this.f37402i0.setVisible(z, z2);
        }
        if (m721M2()) {
            visible |= this.f37395b0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void m640t1() {
        InterfaceC4053a interfaceC4053a = this.f37382S0.get();
        if (interfaceC4053a != null) {
            interfaceC4053a.mo620a();
        }
    }

    /* renamed from: t2 */
    public void m639t2(float f) {
        if (this.f37407n0 != f) {
            float m668k0 = m668k0();
            this.f37407n0 = f;
            float m668k02 = m668k0();
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: u0 */
    public final void m638u0(Canvas canvas, Rect rect) {
        if (m727K2()) {
            m671j0(rect, this.f37418y0);
            RectF rectF = this.f37418y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f37402i0.setBounds(0, 0, (int) this.f37418y0.width(), (int) this.f37418y0.height());
            this.f37402i0.draw(canvas);
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
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m637u1(int[] iArr, int[] iArr2) {
        boolean z;
        int colorForState;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f37371N;
        int m14975l = m14975l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f37360C0) : 0);
        boolean z2 = true;
        if (this.f37360C0 != m14975l) {
            this.f37360C0 = m14975l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f37373O;
        int m14975l2 = m14975l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f37361D0) : 0);
        if (this.f37361D0 != m14975l2) {
            this.f37361D0 = m14975l2;
            onStateChange = true;
        }
        int m18394e = jn0.m18394e(m14975l, m14975l2);
        if ((this.f37362E0 != m18394e) | (m14963x() == null)) {
            this.f37362E0 = m18394e;
            m14997W(ColorStateList.valueOf(m18394e));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f37379R;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f37363F0) : 0;
        if (this.f37363F0 != colorForState2) {
            this.f37363F0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f37380R0 == null || !z51.m2811b(iArr)) ? 0 : this.f37380R0.getColorForState(iArr, this.f37364G0);
        if (this.f37364G0 != colorForState3) {
            this.f37364G0 = colorForState3;
            if (this.f37378Q0) {
                onStateChange = true;
            }
        }
        int colorForState4 = (this.f37359B0.m15123d() == null || this.f37359B0.m15123d().f13693a == null) ? 0 : this.f37359B0.m15123d().f13693a.getColorForState(iArr, this.f37365H0);
        if (this.f37365H0 != colorForState4) {
            this.f37365H0 = colorForState4;
            onStateChange = true;
        }
        boolean z3 = m664l1(getState(), 16842912) && this.f37400g0;
        if (this.f37366I0 != z3 && this.f37402i0 != null) {
            float m668k0 = m668k0();
            this.f37366I0 = z3;
            if (m668k0 != m668k0()) {
                onStateChange = true;
                z = true;
                ColorStateList colorStateList4 = this.f37372N0;
                colorForState = colorStateList4 == null ? colorStateList4.getColorForState(iArr, this.f37367J0) : 0;
                if (this.f37367J0 == colorForState) {
                    this.f37367J0 = colorForState;
                    this.f37370M0 = C3466wu.m5794a(this, this.f37372N0, this.f37374O0);
                } else {
                    z2 = onStateChange;
                }
                if (m649q1(this.f37389W)) {
                    z2 |= this.f37389W.setState(iArr);
                }
                if (m649q1(this.f37402i0)) {
                    z2 |= this.f37402i0.setState(iArr);
                }
                if (m649q1(this.f37395b0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z2 |= this.f37395b0.setState(iArr3);
                }
                if (z51.f34455a && m649q1(this.f37396c0)) {
                    z2 |= this.f37396c0.setState(iArr2);
                }
                if (z2) {
                    invalidateSelf();
                }
                if (z) {
                    m640t1();
                }
                return z2;
            }
            onStateChange = true;
        }
        z = false;
        ColorStateList colorStateList42 = this.f37372N0;
        if (colorStateList42 == null) {
        }
        if (this.f37367J0 == colorForState) {
        }
        if (m649q1(this.f37389W)) {
        }
        if (m649q1(this.f37402i0)) {
        }
        if (m649q1(this.f37395b0)) {
        }
        if (z51.f34455a) {
            z2 |= this.f37396c0.setState(iArr2);
        }
        if (z2) {
        }
        if (z) {
        }
        return z2;
    }

    /* renamed from: u2 */
    public void m636u2(int i) {
        m639t2(this.f37414u0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v0 */
    public final void m635v0(Canvas canvas, Rect rect) {
        if (this.f37390W0) {
            return;
        }
        this.f37415v0.setColor(this.f37361D0);
        this.f37415v0.setStyle(Paint.Style.FILL);
        this.f37415v0.setColorFilter(m670j1());
        this.f37418y0.set(rect);
        canvas.drawRoundRect(this.f37418y0, m741G0(), m741G0(), this.f37415v0);
    }

    /* renamed from: v1 */
    public void m634v1(boolean z) {
        if (this.f37400g0 != z) {
            this.f37400g0 = z;
            float m668k0 = m668k0();
            if (!z && this.f37366I0) {
                this.f37366I0 = false;
            }
            float m668k02 = m668k0();
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: v2 */
    public void m633v2(int i) {
        this.f37388V0 = i;
    }

    /* renamed from: w0 */
    public final void m632w0(Canvas canvas, Rect rect) {
        if (m724L2()) {
            m671j0(rect, this.f37418y0);
            RectF rectF = this.f37418y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f37389W.setBounds(0, 0, (int) this.f37418y0.width(), (int) this.f37418y0.height());
            this.f37389W.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: w1 */
    public void m631w1(int i) {
        m634v1(this.f37414u0.getResources().getBoolean(i));
    }

    /* renamed from: w2 */
    public void m630w2(ColorStateList colorStateList) {
        if (this.f37383T != colorStateList) {
            this.f37383T = colorStateList;
            m715O2();
            onStateChange(getState());
        }
    }

    /* renamed from: x0 */
    public final void m629x0(Canvas canvas, Rect rect) {
        if (this.f37381S <= 0.0f || this.f37390W0) {
            return;
        }
        this.f37415v0.setColor(this.f37363F0);
        this.f37415v0.setStyle(Paint.Style.STROKE);
        if (!this.f37390W0) {
            this.f37415v0.setColorFilter(m670j1());
        }
        RectF rectF = this.f37418y0;
        float f = this.f37381S;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.f37377Q - (this.f37381S / 2.0f);
        canvas.drawRoundRect(this.f37418y0, f2, f2, this.f37415v0);
    }

    /* renamed from: x1 */
    public void m628x1(Drawable drawable) {
        if (this.f37402i0 != drawable) {
            float m668k0 = m668k0();
            this.f37402i0 = drawable;
            float m668k02 = m668k0();
            m718N2(this.f37402i0);
            m674i0(this.f37402i0);
            invalidateSelf();
            if (m668k0 != m668k02) {
                m640t1();
            }
        }
    }

    /* renamed from: x2 */
    public void m627x2(int i) {
        m630w2(C2818r4.m11784a(this.f37414u0, i));
    }

    /* renamed from: y0 */
    public final void m626y0(Canvas canvas, Rect rect) {
        if (this.f37390W0) {
            return;
        }
        this.f37415v0.setColor(this.f37360C0);
        this.f37415v0.setStyle(Paint.Style.FILL);
        this.f37418y0.set(rect);
        canvas.drawRoundRect(this.f37418y0, m741G0(), m741G0(), this.f37415v0);
    }

    /* renamed from: y1 */
    public void m625y1(int i) {
        m628x1(C2818r4.m11783b(this.f37414u0, i));
    }

    /* renamed from: y2 */
    public void m624y2(boolean z) {
        this.f37386U0 = z;
    }

    /* renamed from: z0 */
    public final void m623z0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m721M2()) {
            m662m0(rect, this.f37418y0);
            RectF rectF = this.f37418y0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f37395b0.setBounds(0, 0, (int) this.f37418y0.width(), (int) this.f37418y0.height());
            if (z51.f34455a) {
                this.f37396c0.setBounds(this.f37395b0.getBounds());
                this.f37396c0.jumpToCurrentState();
                drawable = this.f37396c0;
            } else {
                drawable = this.f37395b0;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z1 */
    public void m622z1(ColorStateList colorStateList) {
        if (this.f37403j0 != colorStateList) {
            this.f37403j0 = colorStateList;
            if (m644s0()) {
                C2366nu.m14812o(this.f37402i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z2 */
    public void m621z2(rq0 rq0Var) {
        this.f37404k0 = rq0Var;
    }
}
