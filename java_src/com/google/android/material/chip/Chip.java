package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.AbstractC3781yz;
import com.daaw.C3654y;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.ik1;
import com.daaw.jc1;
import com.daaw.k21;
import com.daaw.kk1;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.on0;
import com.daaw.qn0;
import com.daaw.rq0;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
import com.daaw.z51;
import com.google.android.material.chip.C4052a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements C4052a.InterfaceC4053a, jc1 {

    /* renamed from: J */
    public static final int f37320J = k21.Widget_MaterialComponents_Chip_Action;

    /* renamed from: K */
    public static final Rect f37321K = new Rect();

    /* renamed from: L */
    public static final int[] f37322L = {16842913};

    /* renamed from: M */
    public static final int[] f37323M = {16842911};

    /* renamed from: A */
    public boolean f37324A;

    /* renamed from: B */
    public boolean f37325B;

    /* renamed from: C */
    public boolean f37326C;

    /* renamed from: D */
    public int f37327D;

    /* renamed from: E */
    public int f37328E;

    /* renamed from: F */
    public final C4046c f37329F;

    /* renamed from: G */
    public final Rect f37330G;

    /* renamed from: H */
    public final RectF f37331H;

    /* renamed from: I */
    public final kk1 f37332I;

    /* renamed from: t */
    public C4052a f37333t;

    /* renamed from: u */
    public InsetDrawable f37334u;

    /* renamed from: v */
    public RippleDrawable f37335v;

    /* renamed from: w */
    public View.OnClickListener f37336w;

    /* renamed from: x */
    public CompoundButton.OnCheckedChangeListener f37337x;

    /* renamed from: y */
    public boolean f37338y;

    /* renamed from: z */
    public boolean f37339z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes2.dex */
    public class C4044a extends kk1 {
        public C4044a() {
        }

        @Override // com.daaw.kk1
        /* renamed from: a */
        public void mo784a(int i) {
        }

        @Override // com.daaw.kk1
        /* renamed from: b */
        public void mo783b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f37333t.m730J2() ? Chip.this.f37333t.m680f1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes2.dex */
    public class C4045b extends ViewOutlineProvider {
        public C4045b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f37333t != null) {
                Chip.this.f37333t.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes2.dex */
    public class C4046c extends AbstractC3781yz {
        public C4046c(Chip chip) {
            super(chip);
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: B */
        public int mo782B(float f, float f2) {
            return (Chip.this.m797n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: C */
        public void mo781C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m797n() && Chip.this.m792s() && Chip.this.f37336w != null) {
                list.add(1);
            }
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: J */
        public boolean mo780J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m791t();
                }
                return false;
            }
            return false;
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: M */
        public void mo779M(C3654y c3654y) {
            c3654y.m4339Z(Chip.this.m793r());
            c3654y.m4333c0(Chip.this.isClickable());
            c3654y.m4335b0((Chip.this.m793r() || Chip.this.isClickable()) ? Chip.this.m793r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c3654y.m4287z0(text);
            } else {
                c3654y.m4327f0(text);
            }
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: N */
        public void mo778N(int i, C3654y c3654y) {
            if (i != 1) {
                c3654y.m4327f0("");
                c3654y.m4341X(Chip.f37321K);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = h21.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i2, objArr).trim();
            }
            c3654y.m4327f0(closeIconContentDescription);
            c3654y.m4341X(Chip.this.getCloseIconTouchBoundsInt());
            c3654y.m4336b(C3654y.C3655a.f33173i);
            c3654y.m4325g0(Chip.this.isEnabled());
        }

        @Override // com.daaw.AbstractC3781yz
        /* renamed from: O */
        public void mo777O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f37325B = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f37320J;
        this.f37330G = new Rect();
        this.f37331H = new RectF();
        this.f37332I = new C4044a();
        Context context2 = getContext();
        m810C(attributeSet);
        C4052a m641t0 = C4052a.m641t0(context2, attributeSet, i, i2);
        m796o(context2, attributeSet, i);
        setChipDrawable(m641t0);
        m641t0.m14998V(xs1.m4689y(this));
        TypedArray m5026h = xk1.m5026h(context2, attributeSet, m21.f18098N, i, i2, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(mn0.m15930a(context2, m5026h, m21.f18119Q));
        }
        boolean hasValue = m5026h.hasValue(m21.f18378z0);
        m5026h.recycle();
        this.f37329F = new C4046c(this);
        m787x();
        if (!hasValue) {
            m795p();
        }
        setChecked(this.f37338y);
        setText(m641t0.m680f1());
        setEllipsize(m641t0.m693Z0());
        m811B();
        if (!this.f37333t.m730J2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m812A();
        if (m789v()) {
            setMinHeight(this.f37328E);
        }
        this.f37327D = xs1.m4768E(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f37331H.setEmpty();
        if (m797n() && this.f37336w != null) {
            this.f37333t.m699W0(this.f37331H);
        }
        return this.f37331H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f37330G.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f37330G;
    }

    private ik1 getTextAppearance() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m678g1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f37324A != z) {
            this.f37324A = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f37339z != z) {
            this.f37339z = z;
            refreshDrawableState();
        }
    }

    /* renamed from: A */
    public final void m812A() {
        C4052a c4052a;
        if (TextUtils.isEmpty(getText()) || (c4052a = this.f37333t) == null) {
            return;
        }
        int m738H0 = (int) (c4052a.m738H0() + this.f37333t.m676h1() + this.f37333t.m656o0());
        int m723M0 = (int) (this.f37333t.m723M0() + this.f37333t.m673i1() + this.f37333t.m668k0());
        if (this.f37334u != null) {
            Rect rect = new Rect();
            this.f37334u.getPadding(rect);
            m723M0 += rect.left;
            m738H0 += rect.right;
        }
        xs1.m4767E0(this, m723M0, getPaddingTop(), m738H0, getPaddingBottom());
    }

    /* renamed from: B */
    public final void m811B() {
        TextPaint paint = getPaint();
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            paint.drawableState = c4052a.getState();
        }
        ik1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m19733j(getContext(), paint, this.f37332I);
        }
    }

    /* renamed from: C */
    public final void m810C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    }

    @Override // com.google.android.material.chip.C4052a.InterfaceC4053a
    /* renamed from: a */
    public void mo620a() {
        m800k(this.f37328E);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m798m(motionEvent) || this.f37329F.m3039v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f37329F.m3038w(keyEvent) || this.f37329F.m3064A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4052a c4052a = this.f37333t;
        if ((c4052a == null || !c4052a.m658n1()) ? false : this.f37333t.m669j2(m801j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f37334u;
        return insetDrawable == null ? this.f37333t : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m750D0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m747E0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m744F0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return Math.max(0.0f, c4052a.m741G0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f37333t;
    }

    public float getChipEndPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m738H0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m735I0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m732J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m729K0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m726L0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m723M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m720N0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m717O0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m714P0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m711Q0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m709R0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m707S0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m705T0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m701V0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m693Z0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f37329F.m3064A() == 1 || this.f37329F.m3037x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public rq0 getHideMotionSpec() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m690a1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m688b1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m686c1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m684d1();
        }
        return null;
    }

    public gc1 getShapeAppearanceModel() {
        return this.f37333t.m15017C();
    }

    public rq0 getShowMotionSpec() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m682e1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m676h1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            return c4052a.m673i1();
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final void m802i(C4052a c4052a) {
        c4052a.m657n2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: j */
    public final int[] m801j() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.f37325B) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.f37324A) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f37339z) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f37325B) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f37324A) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f37339z) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean m800k(int i) {
        this.f37328E = i;
        if (!m789v()) {
            if (this.f37334u != null) {
                m790u();
            } else {
                m786y();
            }
            return false;
        }
        int max = Math.max(0, i - this.f37333t.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f37333t.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f37334u != null) {
                m790u();
            } else {
                m786y();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f37334u != null) {
            Rect rect = new Rect();
            this.f37334u.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m786y();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        m794q(i2, i3, i2, i3);
        m786y();
        return true;
    }

    /* renamed from: l */
    public final void m799l() {
        if (getBackgroundDrawable() == this.f37334u && this.f37333t.getCallback() == null) {
            this.f37333t.setCallback(this.f37334u);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    public final boolean m798m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC3781yz.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f37329F)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC3781yz.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f37329F, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m797n() {
        C4052a c4052a = this.f37333t;
        return (c4052a == null || c4052a.m714P0() == null) ? false : true;
    }

    /* renamed from: o */
    public final void m796o(Context context, AttributeSet attributeSet, int i) {
        TypedArray m5026h = xk1.m5026h(context, attributeSet, m21.f18098N, i, f37320J, new int[0]);
        this.f37326C = m5026h.getBoolean(m21.f18343u0, false);
        this.f37328E = (int) Math.ceil(m5026h.getDimension(m21.f18254i0, (float) Math.ceil(fu1.m22261b(getContext(), 48))));
        m5026h.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.m14140f(this, this.f37333t);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f37322L);
        }
        if (m793r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f37323M);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f37329F.m3058I(z, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((m793r() || isClickable()) ? m793r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(m793r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C3654y.m4361D0(accessibilityNodeInfo).m4329e0(C3654y.C3657c.m4280a(chipGroup.m11833b(this), 1, chipGroup.mo776c() ? chipGroup.m765o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f37327D != i) {
            this.f37327D = i;
            m812A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f37339z) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.f37339z) {
                m791t();
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m795p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C4045b());
        }
    }

    /* renamed from: q */
    public final void m794q(int i, int i2, int i3, int i4) {
        this.f37334u = new InsetDrawable((Drawable) this.f37333t, i, i2, i3, i4);
    }

    /* renamed from: r */
    public boolean m793r() {
        C4052a c4052a = this.f37333t;
        return c4052a != null && c4052a.m661m1();
    }

    /* renamed from: s */
    public boolean m792s() {
        C4052a c4052a = this.f37333t;
        return c4052a != null && c4052a.m655o1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f37335v) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f37335v) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m634v1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m631w1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C4052a c4052a = this.f37333t;
        if (c4052a == null) {
            this.f37338y = z;
        } else if (c4052a.m661m1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f37337x) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m628x1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m625y1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m622z1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m758A1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m755B1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m752C1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m749D1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m746E1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m743F1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m740G1(i);
        }
    }

    public void setChipDrawable(C4052a c4052a) {
        C4052a c4052a2 = this.f37333t;
        if (c4052a2 != c4052a) {
            m788w(c4052a2);
            this.f37333t = c4052a;
            c4052a.m624y2(false);
            m802i(this.f37333t);
            m800k(this.f37328E);
        }
    }

    public void setChipEndPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m737H1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m734I1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m731J1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m728K1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m725L1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m722M1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m719N1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m716O1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m713P1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m710Q1(z);
        }
    }

    public void setChipMinHeight(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m708R1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m706S1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m704T1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m702U1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m700V1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m698W1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m696X1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m694Y1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m689a2(drawable);
        }
        m787x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m687b2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m685c2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m683d2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m681e2(i);
        }
        m787x();
    }

    public void setCloseIconSize(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m679f2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m677g2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m675h2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m672i2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m666k2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m663l2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m660m2(z);
        }
        m787x();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m14998V(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f37333t == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m654o2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f37326C = z;
        m800k(this.f37328E);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(rq0 rq0Var) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m651p2(rq0Var);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m648q2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m645r2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m642s2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m639t2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m636u2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f37333t == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m633v2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f37337x = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f37336w = onClickListener;
        m787x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m630w2(colorStateList);
        }
        if (this.f37333t.m667k1()) {
            return;
        }
        m785z();
    }

    public void setRippleColorResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m627x2(i);
            if (this.f37333t.m667k1()) {
                return;
            }
            m785z();
        }
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.f37333t.setShapeAppearanceModel(gc1Var);
    }

    public void setShowMotionSpec(rq0 rq0Var) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m621z2(rq0Var);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m757A2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C4052a c4052a = this.f37333t;
        if (c4052a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c4052a.m730J2() ? null : charSequence, bufferType);
        C4052a c4052a2 = this.f37333t;
        if (c4052a2 != null) {
            c4052a2.m754B2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m748D2(i);
        }
        m811B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m748D2(i);
        }
        m811B();
    }

    public void setTextAppearance(ik1 ik1Var) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m751C2(ik1Var);
        }
        m811B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m745E2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m742F2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m739G2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4052a c4052a = this.f37333t;
        if (c4052a != null) {
            c4052a.m736H2(i);
        }
    }

    /* renamed from: t */
    public boolean m791t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f37336w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f37329F.m3050U(1, 1);
        return z;
    }

    /* renamed from: u */
    public final void m790u() {
        if (this.f37334u != null) {
            this.f37334u = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m786y();
        }
    }

    /* renamed from: v */
    public boolean m789v() {
        return this.f37326C;
    }

    /* renamed from: w */
    public final void m788w(C4052a c4052a) {
        if (c4052a != null) {
            c4052a.m657n2(null);
        }
    }

    /* renamed from: x */
    public final void m787x() {
        xs1.m4702r0(this, (m797n() && m792s() && this.f37336w != null) ? this.f37329F : null);
    }

    /* renamed from: y */
    public final void m786y() {
        if (z51.f34455a) {
            m785z();
            return;
        }
        this.f37333t.m733I2(true);
        xs1.m4694v0(this, getBackgroundDrawable());
        m812A();
        m799l();
    }

    /* renamed from: z */
    public final void m785z() {
        this.f37335v = new RippleDrawable(z51.m2812a(this.f37333t.m684d1()), getBackgroundDrawable(), null);
        this.f37333t.m733I2(false);
        xs1.m4694v0(this, this.f37335v);
        m812A();
    }
}
