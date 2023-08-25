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
import androidx.emoji2.text.b;
import com.daaw.f4;
import com.daaw.hu1;
import com.daaw.i21;
import com.daaw.j2;
import com.daaw.nu;
import com.daaw.r4;
import com.daaw.sk1;
import com.daaw.ul1;
import com.daaw.v4;
import com.daaw.vu;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import com.daaw.yk1;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> j0 = new a(Float.class, "thumbPos");
    public static final int[] k0 = {16842912};
    public int A;
    public int B;
    public boolean C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public float L;
    public VelocityTracker M;
    public int N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final TextPaint W;
    public ColorStateList a0;
    public Layout b0;
    public Layout c0;
    public TransformationMethod d0;
    public ObjectAnimator e0;
    public final v4 f0;
    public f4 g0;
    public c h0;
    public final Rect i0;
    public Drawable p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public boolean s;
    public boolean t;
    public Drawable u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.O);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b.e {
        public final Reference<SwitchCompat> a;

        public c(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.b.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.b.e
        public void b() {
            SwitchCompat switchCompat = this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = null;
        this.r = null;
        this.s = false;
        this.t = false;
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
        this.M = VelocityTracker.obtain();
        this.i0 = new Rect();
        yk1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.W = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = x21.D2;
        ul1 v = ul1.v(context, attributeSet, iArr, i, 0);
        xs1.p0(this, context, iArr, attributeSet, v.r(), i, 0);
        Drawable g = v.g(x21.G2);
        this.p = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.g(x21.P2);
        this.u = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        setTextOnInternal(v.p(x21.E2));
        setTextOffInternal(v.p(x21.F2));
        this.H = v.a(x21.H2, true);
        this.z = v.f(x21.M2, 0);
        this.A = v.f(x21.J2, 0);
        this.B = v.f(x21.K2, 0);
        this.C = v.a(x21.I2, false);
        ColorStateList c2 = v.c(x21.N2);
        if (c2 != null) {
            this.q = c2;
            this.s = true;
        }
        PorterDuff.Mode e = vu.e(v.k(x21.O2, -1), null);
        if (this.r != e) {
            this.r = e;
            this.t = true;
        }
        if (this.s || this.t) {
            b();
        }
        ColorStateList c3 = v.c(x21.Q2);
        if (c3 != null) {
            this.v = c3;
            this.x = true;
        }
        PorterDuff.Mode e2 = vu.e(v.k(x21.R2, -1), null);
        if (this.w != e2) {
            this.w = e2;
            this.y = true;
        }
        if (this.x || this.y) {
            c();
        }
        int n = v.n(x21.L2, 0);
        if (n != 0) {
            m(context, n);
        }
        v4 v4Var = new v4(this);
        this.f0 = v4Var;
        v4Var.m(attributeSet, i);
        v.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.J = viewConfiguration.getScaledTouchSlop();
        this.N = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private f4 getEmojiTextViewHelper() {
        if (this.g0 == null) {
            this.g0 = new f4(this);
        }
        return this.g0;
    }

    private boolean getTargetCheckedState() {
        return this.O > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((hu1.b(this) ? 1.0f - this.O : this.O) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.u;
        if (drawable != null) {
            Rect rect = this.i0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.p;
            Rect d = drawable2 != null ? vu.d(drawable2) : vu.c;
            return ((((this.P - this.R) - rect.left) - rect.right) - d.left) - d.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.F = charSequence;
        this.G = g(charSequence);
        this.c0 = null;
        if (this.H) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.D = charSequence;
        this.E = g(charSequence);
        this.b0 = null;
        if (this.H) {
            p();
        }
    }

    public final void a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, j0, z ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.e0, true);
        this.e0.start();
    }

    public final void b() {
        Drawable drawable = this.p;
        if (drawable != null) {
            if (this.s || this.t) {
                Drawable mutate = nu.r(drawable).mutate();
                this.p = mutate;
                if (this.s) {
                    nu.o(mutate, this.q);
                }
                if (this.t) {
                    nu.p(this.p, this.r);
                }
                if (this.p.isStateful()) {
                    this.p.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.u;
        if (drawable != null) {
            if (this.x || this.y) {
                Drawable mutate = nu.r(drawable).mutate();
                this.u = mutate;
                if (this.x) {
                    nu.o(mutate, this.v);
                }
                if (this.y) {
                    nu.p(this.u, this.w);
                }
                if (this.u.isStateful()) {
                    this.u.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.e0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.i0;
        int i3 = this.S;
        int i4 = this.T;
        int i5 = this.U;
        int i6 = this.V;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.p;
        Rect d = drawable != null ? vu.d(drawable) : vu.c;
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.u.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.u.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.p;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.R + rect.right;
            this.p.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                nu.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.p;
        if (drawable != null) {
            nu.k(drawable, f, f2);
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            nu.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().f(this.d0);
        return f != null ? f.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (hu1.b(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.P;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.B : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (hu1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.P;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.B : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.H;
    }

    public boolean getSplitTrack() {
        return this.C;
    }

    public int getSwitchMinWidth() {
        return this.A;
    }

    public int getSwitchPadding() {
        return this.B;
    }

    public CharSequence getTextOff() {
        return this.F;
    }

    public CharSequence getTextOn() {
        return this.D;
    }

    public Drawable getThumbDrawable() {
        return this.p;
    }

    public final float getThumbPosition() {
        return this.O;
    }

    public int getThumbTextPadding() {
        return this.z;
    }

    public ColorStateList getThumbTintList() {
        return this.q;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.r;
    }

    public Drawable getTrackDrawable() {
        return this.u;
    }

    public ColorStateList getTrackTintList() {
        return this.v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.w;
    }

    public final boolean h(float f, float f2) {
        if (this.p == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.p.getPadding(this.i0);
        int i = this.T;
        int i2 = this.J;
        int i3 = i - i2;
        int i4 = (this.S + thumbOffset) - i2;
        Rect rect = this.i0;
        return f > ((float) i4) && f < ((float) ((((this.R + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.V + i2));
    }

    public final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.W;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.D);
        setTextOffInternal(this.F);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.e0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.e0.end();
        this.e0 = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.F;
            if (charSequence == null) {
                charSequence = getResources().getString(i21.abc_capital_off);
            }
            xs1.H0(this, charSequence);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.D;
            if (charSequence == null) {
                charSequence = getResources().getString(i21.abc_capital_on);
            }
            xs1.H0(this, charSequence);
        }
    }

    public void m(Context context, int i) {
        ul1 t = ul1.t(context, i, x21.S2);
        ColorStateList c2 = t.c(x21.W2);
        if (c2 == null) {
            c2 = getTextColors();
        }
        this.a0 = c2;
        int f = t.f(x21.T2, 0);
        if (f != 0) {
            float f2 = f;
            if (f2 != this.W.getTextSize()) {
                this.W.setTextSize(f2);
                requestLayout();
            }
        }
        o(t.k(x21.U2, -1), t.k(x21.V2, -1));
        this.d0 = t.a(x21.d3, false) ? new j2(getContext()) : null;
        setTextOnInternal(this.D);
        setTextOffInternal(this.F);
        t.w();
    }

    public void n(Typeface typeface, int i) {
        if (i <= 0) {
            this.W.setFakeBoldText(false);
            this.W.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
        setSwitchTypeface(defaultFromStyle);
        int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i;
        this.W.setFakeBoldText((style & 1) != 0);
        this.W.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
    }

    public final void o(int i, int i2) {
        n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, k0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.i0;
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.T;
        int i2 = this.V;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.p;
        if (drawable != null) {
            if (!this.C || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = vu.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
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
        Layout layout = getTargetCheckedState() ? this.b0 : this.c0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.a0;
            if (colorStateList != null) {
                this.W.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.W.drawableState = drawableState;
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
            CharSequence charSequence = isChecked() ? this.D : this.F;
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
        if (this.p != null) {
            Rect rect = this.i0;
            Drawable drawable = this.u;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = vu.d(this.p);
            i5 = Math.max(0, d.left - rect.left);
            i9 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (hu1.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.P + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.P) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.Q;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.Q;
            this.S = i6;
            this.T = paddingTop;
            this.V = i8;
            this.U = width;
        } else {
            paddingTop = getPaddingTop();
            i7 = this.Q;
        }
        i8 = i7 + paddingTop;
        this.S = i6;
        this.T = paddingTop;
        this.V = i8;
        this.U = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.H) {
            if (this.b0 == null) {
                this.b0 = i(this.E);
            }
            if (this.c0 == null) {
                this.c0 = i(this.G);
            }
        }
        Rect rect = this.i0;
        Drawable drawable = this.p;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.p.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.p.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.R = Math.max(this.H ? Math.max(this.b0.getWidth(), this.c0.getWidth()) + (this.z * 2) : 0, i3);
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.u.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.p;
        if (drawable3 != null) {
            Rect d = vu.d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.A, (this.R * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.P = max;
        this.Q = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.D : this.F;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.M
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.I
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.K
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = com.daaw.hu1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.O
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.O
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.K = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.K
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.J
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.L
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.J
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.I = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.K = r0
            r6.L = r3
            return r1
        L8b:
            int r0 = r6.I
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.I = r0
            android.view.VelocityTracker r0 = r6.M
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.I = r1
            r6.K = r0
            r6.L = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.h0 == null && this.g0.b() && androidx.emoji2.text.b.h()) {
            androidx.emoji2.text.b b2 = androidx.emoji2.text.b.b();
            int d = b2.d();
            if (d == 3 || d == 0) {
                c cVar = new c(this);
                this.h0 = cVar;
                b2.s(cVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.I = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.M.computeCurrentVelocity(1000);
            float xVelocity = this.M.getXVelocity();
            if (Math.abs(xVelocity) <= this.N) {
                z = getTargetCheckedState();
            } else if (!hu1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && xs1.V(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.D);
        setTextOffInternal(this.F);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.H != z) {
            this.H = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.C = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.B = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.W.getTypeface() == null || this.W.getTypeface().equals(typeface)) && (this.W.getTypeface() != null || typeface == null)) {
            return;
        }
        this.W.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.O = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(r4.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.z = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.q = colorStateList;
        this.s = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.r = mode;
        this.t = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(r4.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.x = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.y = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p || drawable == this.u;
    }
}
