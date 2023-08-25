package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0232b;
import com.daaw.C1248f4;
import com.daaw.C1780j2;
import com.daaw.C2366nu;
import com.daaw.C2818r4;
import com.daaw.C3282v4;
import com.daaw.C3373vu;
import com.daaw.hu1;
import com.daaw.i21;
import com.daaw.sk1;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import com.daaw.yk1;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: j0 */
    public static final Property<SwitchCompat, Float> f701j0 = new C0151a(Float.class, "thumbPos");

    /* renamed from: k0 */
    public static final int[] f702k0 = {16842912};

    /* renamed from: A */
    public int f703A;

    /* renamed from: B */
    public int f704B;

    /* renamed from: C */
    public boolean f705C;

    /* renamed from: D */
    public CharSequence f706D;

    /* renamed from: E */
    public CharSequence f707E;

    /* renamed from: F */
    public CharSequence f708F;

    /* renamed from: G */
    public CharSequence f709G;

    /* renamed from: H */
    public boolean f710H;

    /* renamed from: I */
    public int f711I;

    /* renamed from: J */
    public int f712J;

    /* renamed from: K */
    public float f713K;

    /* renamed from: L */
    public float f714L;

    /* renamed from: M */
    public VelocityTracker f715M;

    /* renamed from: N */
    public int f716N;

    /* renamed from: O */
    public float f717O;

    /* renamed from: P */
    public int f718P;

    /* renamed from: Q */
    public int f719Q;

    /* renamed from: R */
    public int f720R;

    /* renamed from: S */
    public int f721S;

    /* renamed from: T */
    public int f722T;

    /* renamed from: U */
    public int f723U;

    /* renamed from: V */
    public int f724V;

    /* renamed from: W */
    public final TextPaint f725W;

    /* renamed from: a0 */
    public ColorStateList f726a0;

    /* renamed from: b0 */
    public Layout f727b0;

    /* renamed from: c0 */
    public Layout f728c0;

    /* renamed from: d0 */
    public TransformationMethod f729d0;

    /* renamed from: e0 */
    public ObjectAnimator f730e0;

    /* renamed from: f0 */
    public final C3282v4 f731f0;

    /* renamed from: g0 */
    public C1248f4 f732g0;

    /* renamed from: h0 */
    public C0153c f733h0;

    /* renamed from: i0 */
    public final Rect f734i0;

    /* renamed from: p */
    public Drawable f735p;

    /* renamed from: q */
    public ColorStateList f736q;

    /* renamed from: r */
    public PorterDuff.Mode f737r;

    /* renamed from: s */
    public boolean f738s;

    /* renamed from: t */
    public boolean f739t;

    /* renamed from: u */
    public Drawable f740u;

    /* renamed from: v */
    public ColorStateList f741v;

    /* renamed from: w */
    public PorterDuff.Mode f742w;

    /* renamed from: x */
    public boolean f743x;

    /* renamed from: y */
    public boolean f744y;

    /* renamed from: z */
    public int f745z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C0151a extends Property<SwitchCompat, Float> {
        public C0151a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f717O);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: classes.dex */
    public static class C0152b {
        /* renamed from: a */
        public static void m29989a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    /* loaded from: classes.dex */
    public static class C0153c extends C0232b.AbstractC0238e {

        /* renamed from: a */
        public final Reference<SwitchCompat> f746a;

        public C0153c(SwitchCompat switchCompat) {
            this.f746a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C0232b.AbstractC0238e
        /* renamed from: a */
        public void mo29549a(Throwable th) {
            SwitchCompat switchCompat = this.f746a.get();
            if (switchCompat != null) {
                switchCompat.m29999j();
            }
        }

        @Override // androidx.emoji2.text.C0232b.AbstractC0238e
        /* renamed from: b */
        public void mo19311b() {
            SwitchCompat switchCompat = this.f746a.get();
            if (switchCompat != null) {
                switchCompat.m29999j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f736q = null;
        this.f737r = null;
        this.f738s = false;
        this.f739t = false;
        this.f741v = null;
        this.f742w = null;
        this.f743x = false;
        this.f744y = false;
        this.f715M = VelocityTracker.obtain();
        this.f734i0 = new Rect();
        yk1.m3617a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f725W = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = x21.f31776D2;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        xs1.m4706p0(this, context, iArr, attributeSet, m8037v.m8041r(), i, 0);
        Drawable m8052g = m8037v.m8052g(x21.f31791G2);
        this.f735p = m8052g;
        if (m8052g != null) {
            m8052g.setCallback(this);
        }
        Drawable m8052g2 = m8037v.m8052g(x21.f31836P2);
        this.f740u = m8052g2;
        if (m8052g2 != null) {
            m8052g2.setCallback(this);
        }
        setTextOnInternal(m8037v.m8043p(x21.f31781E2));
        setTextOffInternal(m8037v.m8043p(x21.f31786F2));
        this.f710H = m8037v.m8058a(x21.f31796H2, true);
        this.f745z = m8037v.m8053f(x21.f31821M2, 0);
        this.f703A = m8037v.m8053f(x21.f31806J2, 0);
        this.f704B = m8037v.m8053f(x21.f31811K2, 0);
        this.f705C = m8037v.m8058a(x21.f31801I2, false);
        ColorStateList m8056c = m8037v.m8056c(x21.f31826N2);
        if (m8056c != null) {
            this.f736q = m8056c;
            this.f738s = true;
        }
        PorterDuff.Mode m6785e = C3373vu.m6785e(m8037v.m8048k(x21.f31831O2, -1), null);
        if (this.f737r != m6785e) {
            this.f737r = m6785e;
            this.f739t = true;
        }
        if (this.f738s || this.f739t) {
            m30007b();
        }
        ColorStateList m8056c2 = m8037v.m8056c(x21.f31841Q2);
        if (m8056c2 != null) {
            this.f741v = m8056c2;
            this.f743x = true;
        }
        PorterDuff.Mode m6785e2 = C3373vu.m6785e(m8037v.m8048k(x21.f31846R2, -1), null);
        if (this.f742w != m6785e2) {
            this.f742w = m6785e2;
            this.f744y = true;
        }
        if (this.f743x || this.f744y) {
            m30006c();
        }
        int m8045n = m8037v.m8045n(x21.f31816L2, 0);
        if (m8045n != 0) {
            m29996m(context, m8045n);
        }
        C3282v4 c3282v4 = new C3282v4(this);
        this.f731f0 = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        m8037v.m8036w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f712J = viewConfiguration.getScaledTouchSlop();
        this.f716N = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m22934c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: f */
    public static float m30003f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private C1248f4 getEmojiTextViewHelper() {
        if (this.f732g0 == null) {
            this.f732g0 = new C1248f4(this);
        }
        return this.f732g0;
    }

    private boolean getTargetCheckedState() {
        return this.f717O > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((hu1.m20417b(this) ? 1.0f - this.f717O : this.f717O) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f740u;
        if (drawable != null) {
            Rect rect = this.f734i0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f735p;
            Rect m6786d = drawable2 != null ? C3373vu.m6786d(drawable2) : C3373vu.f30588c;
            return ((((this.f718P - this.f720R) - rect.left) - rect.right) - m6786d.left) - m6786d.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f708F = charSequence;
        this.f709G = m30002g(charSequence);
        this.f728c0 = null;
        if (this.f710H) {
            m29993p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f706D = charSequence;
        this.f707E = m30002g(charSequence);
        this.f727b0 = null;
        if (this.f710H) {
            m29993p();
        }
    }

    /* renamed from: a */
    public final void m30008a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f701j0, z ? 1.0f : 0.0f);
        this.f730e0 = ofFloat;
        ofFloat.setDuration(250L);
        C0152b.m29989a(this.f730e0, true);
        this.f730e0.start();
    }

    /* renamed from: b */
    public final void m30007b() {
        Drawable drawable = this.f735p;
        if (drawable != null) {
            if (this.f738s || this.f739t) {
                Drawable mutate = C2366nu.m14809r(drawable).mutate();
                this.f735p = mutate;
                if (this.f738s) {
                    C2366nu.m14812o(mutate, this.f736q);
                }
                if (this.f739t) {
                    C2366nu.m14811p(this.f735p, this.f737r);
                }
                if (this.f735p.isStateful()) {
                    this.f735p.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m30006c() {
        Drawable drawable = this.f740u;
        if (drawable != null) {
            if (this.f743x || this.f744y) {
                Drawable mutate = C2366nu.m14809r(drawable).mutate();
                this.f740u = mutate;
                if (this.f743x) {
                    C2366nu.m14812o(mutate, this.f741v);
                }
                if (this.f744y) {
                    C2366nu.m14811p(this.f740u, this.f742w);
                }
                if (this.f740u.isStateful()) {
                    this.f740u.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m30005d() {
        ObjectAnimator objectAnimator = this.f730e0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f734i0;
        int i3 = this.f721S;
        int i4 = this.f722T;
        int i5 = this.f723U;
        int i6 = this.f724V;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f735p;
        Rect m6786d = drawable != null ? C3373vu.m6786d(drawable) : C3373vu.f30588c;
        Drawable drawable2 = this.f740u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (m6786d != null) {
                int i8 = m6786d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = m6786d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = m6786d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = m6786d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f740u.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f740u.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f735p;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f720R + rect.right;
            this.f735p.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C2366nu.m14815l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f735p;
        if (drawable != null) {
            C2366nu.m14816k(drawable, f, f2);
        }
        Drawable drawable2 = this.f740u;
        if (drawable2 != null) {
            C2366nu.m14816k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f735p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f740u;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m30004e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence m30002g(CharSequence charSequence) {
        TransformationMethod m22931f = getEmojiTextViewHelper().m22931f(this.f729d0);
        return m22931f != null ? m22931f.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (hu1.m20417b(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f718P;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f704B : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (hu1.m20417b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f718P;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f704B : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f710H;
    }

    public boolean getSplitTrack() {
        return this.f705C;
    }

    public int getSwitchMinWidth() {
        return this.f703A;
    }

    public int getSwitchPadding() {
        return this.f704B;
    }

    public CharSequence getTextOff() {
        return this.f708F;
    }

    public CharSequence getTextOn() {
        return this.f706D;
    }

    public Drawable getThumbDrawable() {
        return this.f735p;
    }

    public final float getThumbPosition() {
        return this.f717O;
    }

    public int getThumbTextPadding() {
        return this.f745z;
    }

    public ColorStateList getThumbTintList() {
        return this.f736q;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f737r;
    }

    public Drawable getTrackDrawable() {
        return this.f740u;
    }

    public ColorStateList getTrackTintList() {
        return this.f741v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f742w;
    }

    /* renamed from: h */
    public final boolean m30001h(float f, float f2) {
        if (this.f735p == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f735p.getPadding(this.f734i0);
        int i = this.f722T;
        int i2 = this.f712J;
        int i3 = i - i2;
        int i4 = (this.f721S + thumbOffset) - i2;
        Rect rect = this.f734i0;
        return f > ((float) i4) && f < ((float) ((((this.f720R + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f724V + i2));
    }

    /* renamed from: i */
    public final Layout m30000i(CharSequence charSequence) {
        TextPaint textPaint = this.f725W;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: j */
    public void m29999j() {
        setTextOnInternal(this.f706D);
        setTextOffInternal(this.f708F);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f735p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f740u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f730e0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f730e0.end();
        this.f730e0 = null;
    }

    /* renamed from: k */
    public final void m29998k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f708F;
            if (charSequence == null) {
                charSequence = getResources().getString(i21.abc_capital_off);
            }
            xs1.m4761H0(this, charSequence);
        }
    }

    /* renamed from: l */
    public final void m29997l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f706D;
            if (charSequence == null) {
                charSequence = getResources().getString(i21.abc_capital_on);
            }
            xs1.m4761H0(this, charSequence);
        }
    }

    /* renamed from: m */
    public void m29996m(Context context, int i) {
        ul1 m8039t = ul1.m8039t(context, i, x21.f31851S2);
        ColorStateList m8056c = m8039t.m8056c(x21.f31869W2);
        if (m8056c == null) {
            m8056c = getTextColors();
        }
        this.f726a0 = m8056c;
        int m8053f = m8039t.m8053f(x21.f31856T2, 0);
        if (m8053f != 0) {
            float f = m8053f;
            if (f != this.f725W.getTextSize()) {
                this.f725W.setTextSize(f);
                requestLayout();
            }
        }
        m29994o(m8039t.m8048k(x21.f31861U2, -1), m8039t.m8048k(x21.f31865V2, -1));
        this.f729d0 = m8039t.m8058a(x21.f31901d3, false) ? new C1780j2(getContext()) : null;
        setTextOnInternal(this.f706D);
        setTextOffInternal(this.f708F);
        m8039t.m8036w();
    }

    /* renamed from: n */
    public void m29995n(Typeface typeface, int i) {
        if (i <= 0) {
            this.f725W.setFakeBoldText(false);
            this.f725W.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
        setSwitchTypeface(defaultFromStyle);
        int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i;
        this.f725W.setFakeBoldText((style & 1) != 0);
        this.f725W.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
    }

    /* renamed from: o */
    public final void m29994o(int i, int i2) {
        m29995n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f702k0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f734i0;
        Drawable drawable = this.f740u;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f722T;
        int i2 = this.f724V;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f735p;
        if (drawable != null) {
            if (!this.f705C || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m6786d = C3373vu.m6786d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m6786d.left;
                rect.right -= m6786d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f727b0 : this.f728c0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f726a0;
            if (colorStateList != null) {
                this.f725W.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f725W.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f706D : this.f708F;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f735p != null) {
            Rect rect = this.f734i0;
            Drawable drawable = this.f740u;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m6786d = C3373vu.m6786d(this.f735p);
            i5 = Math.max(0, m6786d.left - rect.left);
            i9 = Math.max(0, m6786d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (hu1.m20417b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f718P + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f718P) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.f719Q;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.f719Q;
            this.f721S = i6;
            this.f722T = paddingTop;
            this.f724V = i8;
            this.f723U = width;
        } else {
            paddingTop = getPaddingTop();
            i7 = this.f719Q;
        }
        i8 = i7 + paddingTop;
        this.f721S = i6;
        this.f722T = paddingTop;
        this.f724V = i8;
        this.f723U = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f710H) {
            if (this.f727b0 == null) {
                this.f727b0 = m30000i(this.f707E);
            }
            if (this.f728c0 == null) {
                this.f728c0 = m30000i(this.f709G);
            }
        }
        Rect rect = this.f734i0;
        Drawable drawable = this.f735p;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f735p.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f735p.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f720R = Math.max(this.f710H ? Math.max(this.f727b0.getWidth(), this.f728c0.getWidth()) + (this.f745z * 2) : 0, i3);
        Drawable drawable2 = this.f740u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f740u.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f735p;
        if (drawable3 != null) {
            Rect m6786d = C3373vu.m6786d(drawable3);
            i6 = Math.max(i6, m6786d.left);
            i7 = Math.max(i7, m6786d.right);
        }
        int max = Math.max(this.f703A, (this.f720R * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f718P = max;
        this.f719Q = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f706D : this.f708F;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f715M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f711I;
                    if (i == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.f713K) > this.f712J || Math.abs(y - this.f714L) > this.f712J) {
                            this.f711I = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f713K = x;
                            this.f714L = y;
                            return true;
                        }
                    } else if (i == 2) {
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x2 - this.f713K;
                        float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > 0.0f ? 1.0f : -1.0f;
                        if (hu1.m20417b(this)) {
                            f2 = -f2;
                        }
                        float m30003f = m30003f(this.f717O + f2, 0.0f, 1.0f);
                        if (m30003f != this.f717O) {
                            this.f713K = x2;
                            setThumbPosition(m30003f);
                        }
                        return true;
                    }
                }
            }
            if (this.f711I == 2) {
                m29992q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f711I = 0;
            this.f715M.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && m30001h(x3, y2)) {
                this.f711I = 1;
                this.f713K = x3;
                this.f714L = y2;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m29993p() {
        if (this.f733h0 == null && this.f732g0.m22935b() && C0232b.m29569h()) {
            C0232b m29575b = C0232b.m29575b();
            int m29573d = m29575b.m29573d();
            if (m29573d == 3 || m29573d == 0) {
                C0153c c0153c = new C0153c(this);
                this.f733h0 = c0153c;
                m29575b.m29558s(c0153c);
            }
        }
    }

    /* renamed from: q */
    public final void m29992q(MotionEvent motionEvent) {
        this.f711I = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f715M.computeCurrentVelocity(1000);
            float xVelocity = this.f715M.getXVelocity();
            if (Math.abs(xVelocity) <= this.f716N) {
                z = getTargetCheckedState();
            } else if (!hu1.m20417b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m30004e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m22933d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m29997l();
        } else {
            m29998k();
        }
        if (getWindowToken() != null && xs1.m4742V(this)) {
            m30008a(isChecked);
            return;
        }
        m30005d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.m10257q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m22932e(z);
        setTextOnInternal(this.f706D);
        setTextOffInternal(this.f708F);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m22936a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f710H != z) {
            this.f710H = z;
            requestLayout();
            if (z) {
                m29993p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f705C = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f703A = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f704B = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f725W.getTypeface() == null || this.f725W.getTypeface().equals(typeface)) && (this.f725W.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f725W.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m29998k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m29997l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f735p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f735p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f717O = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C2818r4.m11783b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f745z = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f736q = colorStateList;
        this.f738s = true;
        m30007b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f737r = mode;
        this.f739t = true;
        m30007b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f740u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f740u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C2818r4.m11783b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f741v = colorStateList;
        this.f743x = true;
        m30006c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f742w = mode;
        this.f744y = true;
        m30006c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f735p || drawable == this.f740u;
    }
}
