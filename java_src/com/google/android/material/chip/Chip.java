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
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.ik1;
import com.daaw.jc1;
import com.daaw.k21;
import com.daaw.kk1;
import com.daaw.m21;
import com.daaw.on0;
import com.daaw.rq0;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.yz;
import com.daaw.z51;
import com.google.android.material.chip.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0098a, jc1 {
    public static final int J = k21.Widget_MaterialComponents_Chip_Action;
    public static final Rect K = new Rect();
    public static final int[] L = {16842913};
    public static final int[] M = {16842911};
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final c F;
    public final Rect G;
    public final RectF H;
    public final kk1 I;
    public com.google.android.material.chip.a t;
    public InsetDrawable u;
    public RippleDrawable v;
    public View.OnClickListener w;
    public CompoundButton.OnCheckedChangeListener x;
    public boolean y;
    public boolean z;

    /* loaded from: classes2.dex */
    public class a extends kk1 {
        public a() {
        }

        @Override // com.daaw.kk1
        public void a(int i) {
        }

        @Override // com.daaw.kk1
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.t.J2() ? Chip.this.t.f1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.t != null) {
                Chip.this.t.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends yz {
        public c(Chip chip) {
            super(chip);
        }

        @Override // com.daaw.yz
        public int B(float f, float f2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // com.daaw.yz
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.w != null) {
                list.add(1);
            }
        }

        @Override // com.daaw.yz
        public boolean J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.t();
                }
                return false;
            }
            return false;
        }

        @Override // com.daaw.yz
        public void M(y yVar) {
            yVar.Z(Chip.this.r());
            yVar.c0(Chip.this.isClickable());
            yVar.b0((Chip.this.r() || Chip.this.isClickable()) ? Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                yVar.z0(text);
            } else {
                yVar.f0(text);
            }
        }

        @Override // com.daaw.yz
        public void N(int i, y yVar) {
            if (i != 1) {
                yVar.f0("");
                yVar.X(Chip.K);
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
            yVar.f0(closeIconContentDescription);
            yVar.X(Chip.this.getCloseIconTouchBoundsInt());
            yVar.b(y.a.i);
            yVar.g0(Chip.this.isEnabled());
        }

        @Override // com.daaw.yz
        public void O(int i, boolean z) {
            if (i == 1) {
                Chip.this.B = z;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.J
            android.content.Context r8 = com.daaw.qn0.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.G = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.H = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.I = r8
            android.content.Context r8 = r7.getContext()
            r7.C(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.t0(r8, r9, r10, r4)
            r7.o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = com.daaw.xs1.y(r7)
            r6.V(r0)
            int[] r2 = com.daaw.m21.N
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.daaw.xk1.h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = com.daaw.m21.Q
            android.content.res.ColorStateList r8 = com.daaw.mn0.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = com.daaw.m21.z0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.F = r9
            r7.x()
            if (r8 != 0) goto L69
            r7.p()
        L69:
            boolean r8 = r7.y
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.f1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.Z0()
            r7.setEllipsize(r8)
            r7.B()
            com.google.android.material.chip.a r8 = r7.t
            boolean r8 = r8.J2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.A()
            boolean r8 = r7.v()
            if (r8 == 0) goto La2
            int r8 = r7.E
            r7.setMinHeight(r8)
        La2:
            int r8 = com.daaw.xs1.E(r7)
            r7.D = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.H.setEmpty();
        if (n() && this.w != null) {
            this.t.W0(this.H);
        }
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.G.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.G;
    }

    private ik1 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A != z) {
            this.A = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.z != z) {
            this.z = z;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.t) == null) {
            return;
        }
        int H0 = (int) (aVar.H0() + this.t.h1() + this.t.o0());
        int M0 = (int) (this.t.M0() + this.t.i1() + this.t.k0());
        if (this.u != null) {
            Rect rect = new Rect();
            this.u.getPadding(rect);
            M0 += rect.left;
            H0 += rect.right;
        }
        xs1.E0(this, M0, getPaddingTop(), H0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        ik1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.I);
        }
    }

    public final void C(AttributeSet attributeSet) {
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

    @Override // com.google.android.material.chip.a.InterfaceC0098a
    public void a() {
        k(this.E);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.F.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.F.w(keyEvent) || this.F.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.t;
        if ((aVar == null || !aVar.n1()) ? false : this.t.j2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.u;
        return insetDrawable == null ? this.t : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return Math.max(0.0f, aVar.G0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.t;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.F.A() == 1 || this.F.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public rq0 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public gc1 getShapeAppearanceModel() {
        return this.t.C();
    }

    public rq0 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public final void i(com.google.android.material.chip.a aVar) {
        aVar.n2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] j() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.B) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.A) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.z) {
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
        if (this.B) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.A) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.z) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public boolean k(int i) {
        this.E = i;
        if (!v()) {
            if (this.u != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i - this.t.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.t.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.u != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.u != null) {
            Rect rect = new Rect();
            this.u.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        q(i2, i3, i2, i3);
        y();
        return true;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.u && this.t.getCallback() == null) {
            this.t.setCallback(this.u);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = yz.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.F)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = yz.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.F, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.t;
        return (aVar == null || aVar.P0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = xk1.h(context, attributeSet, m21.N, i, J, new int[0]);
        this.C = h.getBoolean(m21.u0, false);
        this.E = (int) Math.ceil(h.getDimension(m21.i0, (float) Math.ceil(fu1.b(getContext(), 48))));
        h.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.f(this, this.t);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, L);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, M);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.F.I(z, i, rect);
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
        accessibilityNodeInfo.setClassName((r() || isClickable()) ? r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            y.D0(accessibilityNodeInfo).e0(y.c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
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
        if (this.D != i) {
            this.D = i;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.z
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.z
            if (r0 == 0) goto L34
            r5.t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    public final void q(int i, int i2, int i3, int i4) {
        this.u = new InsetDrawable((Drawable) this.t, i, i2, i3, i4);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.t;
        return aVar != null && aVar.m1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.t;
        return aVar != null && aVar.o1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.v) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.v) {
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.v1(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.w1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.t;
        if (aVar == null) {
            this.y = z;
        } else if (aVar.m1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.x) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.x1(drawable);
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.y1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.z1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.A1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.B1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.C1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.D1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.E1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.F1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.G1(i);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.t;
        if (aVar2 != aVar) {
            w(aVar2);
            this.t = aVar;
            aVar.y2(false);
            i(this.t);
            k(this.E);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.H1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.I1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.J1(drawable);
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.K1(i);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.L1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.M1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.N1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.O1(i);
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.P1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.Q1(z);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.R1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.S1(i);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.T1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.U1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.V1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.W1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.X1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.Y1(i);
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.a2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.b2(charSequence);
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.c2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.d2(i);
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.e2(i);
        }
        x();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.f2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.g2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.h2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.i2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.k2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.l2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.m2(z);
        }
        x();
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.V(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.t == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.o2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.C = z;
        k(this.E);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(rq0 rq0Var) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.p2(rq0Var);
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.q2(i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.r2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.s2(i);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.t2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.u2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.t == null) {
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.v2(i);
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
        this.x = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
        if (this.t.k1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.x2(i);
            if (this.t.k1()) {
                return;
            }
            z();
        }
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.t.setShapeAppearanceModel(gc1Var);
    }

    public void setShowMotionSpec(rq0 rq0Var) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.z2(rq0Var);
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.A2(i);
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
        com.google.android.material.chip.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.J2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.t;
        if (aVar2 != null) {
            aVar2.B2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.D2(i);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.D2(i);
        }
        B();
    }

    public void setTextAppearance(ik1 ik1Var) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.C2(ik1Var);
        }
        B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.E2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.F2(i);
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.G2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.t;
        if (aVar != null) {
            aVar.H2(i);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.F.U(1, 1);
        return z;
    }

    public final void u() {
        if (this.u != null) {
            this.u = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.C;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.n2(null);
        }
    }

    public final void x() {
        xs1.r0(this, (n() && s() && this.w != null) ? this.F : null);
    }

    public final void y() {
        if (z51.a) {
            z();
            return;
        }
        this.t.I2(true);
        xs1.v0(this, getBackgroundDrawable());
        A();
        l();
    }

    public final void z() {
        this.v = new RippleDrawable(z51.a(this.t.d1()), getBackgroundDrawable(), null);
        this.t.I2(false);
        xs1.v0(this, this.v);
        A();
    }
}
