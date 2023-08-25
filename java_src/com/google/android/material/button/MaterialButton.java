package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.daaw.gc1;
import com.daaw.gn0;
import com.daaw.jc1;
import com.daaw.k21;
import com.daaw.nu;
import com.daaw.on0;
import com.daaw.r4;
import com.daaw.s3;
import com.daaw.sk1;
import com.daaw.w01;
import com.daaw.xs1;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class MaterialButton extends s3 implements Checkable, jc1 {
    public static final int[] F = {16842911};
    public static final int[] G = {16842912};
    public static final int H = k21.Widget_MaterialComponents_Button;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public final gn0 s;
    public final LinkedHashSet<a> t;
    public b u;
    public PorterDuff.Mode v;
    public ColorStateList w;
    public Drawable x;
    public int y;
    public int z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean r;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.r = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.H
            android.content.Context r9 = com.daaw.qn0.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.t = r9
            r9 = 0
            r8.C = r9
            r8.D = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.daaw.m21.N1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.daaw.xk1.h(r0, r1, r2, r3, r4, r5)
            int r1 = com.daaw.m21.a2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.B = r1
            int r1 = com.daaw.m21.d2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.daaw.fu1.e(r1, r2)
            r8.v = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.daaw.m21.c2
            android.content.res.ColorStateList r1 = com.daaw.mn0.a(r1, r0, r2)
            r8.w = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.daaw.m21.Y1
            android.graphics.drawable.Drawable r1 = com.daaw.mn0.d(r1, r0, r2)
            r8.x = r1
            int r1 = com.daaw.m21.Z1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.E = r1
            int r1 = com.daaw.m21.b2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.y = r1
            com.daaw.gc1$b r10 = com.daaw.gc1.e(r7, r10, r11, r6)
            com.daaw.gc1 r10 = r10.m()
            com.daaw.gn0 r11 = new com.daaw.gn0
            r11.<init>(r8, r10)
            r8.s = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.B
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.x
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public void a(a aVar) {
        this.t.add(aVar);
    }

    public boolean b() {
        gn0 gn0Var = this.s;
        return gn0Var != null && gn0Var.p();
    }

    public final boolean c() {
        int i = this.E;
        return i == 3 || i == 4;
    }

    public final boolean d() {
        int i = this.E;
        return i == 1 || i == 2;
    }

    public final boolean e() {
        int i = this.E;
        return i == 16 || i == 32;
    }

    public final boolean f() {
        return xs1.E(this) == 1;
    }

    public final boolean g() {
        gn0 gn0Var = this.s;
        return (gn0Var == null || gn0Var.o()) ? false : true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.s.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.x;
    }

    public int getIconGravity() {
        return this.E;
    }

    public int getIconPadding() {
        return this.B;
    }

    public int getIconSize() {
        return this.y;
    }

    public ColorStateList getIconTint() {
        return this.w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.v;
    }

    public int getInsetBottom() {
        return this.s.c();
    }

    public int getInsetTop() {
        return this.s.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.s.h();
        }
        return null;
    }

    public gc1 getShapeAppearanceModel() {
        if (g()) {
            return this.s.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.s.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.s.k();
        }
        return 0;
    }

    @Override // com.daaw.s3, com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.s.l() : super.getSupportBackgroundTintList();
    }

    @Override // com.daaw.s3, com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.s.m() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.t.remove(aVar);
    }

    public final void i() {
        if (d()) {
            sk1.i(this, this.x, null, null, null);
        } else if (c()) {
            sk1.i(this, null, null, this.x, null);
        } else if (e()) {
            sk1.i(this, null, this.x, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.C;
    }

    public final void j(boolean z) {
        Drawable drawable = this.x;
        if (drawable != null) {
            Drawable mutate = nu.r(drawable).mutate();
            this.x = mutate;
            nu.o(mutate, this.w);
            PorterDuff.Mode mode = this.v;
            if (mode != null) {
                nu.p(this.x, mode);
            }
            int i = this.y;
            if (i == 0) {
                i = this.x.getIntrinsicWidth();
            }
            int i2 = this.y;
            if (i2 == 0) {
                i2 = this.x.getIntrinsicHeight();
            }
            Drawable drawable2 = this.x;
            int i3 = this.z;
            int i4 = this.A;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] a2 = sk1.a(this);
        boolean z2 = false;
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((d() && drawable3 != this.x) || ((c() && drawable5 != this.x) || (e() && drawable4 != this.x))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    public final void k(int i, int i2) {
        if (this.x == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.z = 0;
                if (this.E == 16) {
                    this.A = 0;
                    j(false);
                    return;
                }
                int i3 = this.y;
                if (i3 == 0) {
                    i3 = this.x.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.B) - getPaddingBottom()) / 2;
                if (this.A != textHeight) {
                    this.A = textHeight;
                    j(false);
                }
                return;
            }
            return;
        }
        this.A = 0;
        int i4 = this.E;
        if (i4 == 1 || i4 == 3) {
            this.z = 0;
            j(false);
            return;
        }
        int i5 = this.y;
        if (i5 == 0) {
            i5 = this.x.getIntrinsicWidth();
        }
        int textWidth = (((((i - getTextWidth()) - xs1.I(this)) - i5) - this.B) - xs1.J(this)) / 2;
        if (f() != (this.E == 4)) {
            textWidth = -textWidth;
        }
        if (this.z != textWidth) {
            this.z = textWidth;
            j(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            on0.f(this, this.s.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            Button.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // com.daaw.s3, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // com.daaw.s3, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.daaw.s3, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gn0 gn0Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (gn0Var = this.s) == null) {
            return;
        }
        gn0Var.H(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.r);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.r = this.C;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        k(i, i2);
    }

    @Override // com.daaw.s3, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (g()) {
            this.s.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // com.daaw.s3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.s.s();
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.daaw.s3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? r4.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.s.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.C != z) {
            this.C = z;
            refreshDrawableState();
            if (this.D) {
                return;
            }
            this.D = true;
            Iterator<a> it = this.t.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.C);
            }
            this.D = false;
        }
    }

    public void setCornerRadius(int i) {
        if (g()) {
            this.s.u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (g()) {
            this.s.f().V(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.x != drawable) {
            this.x = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.E != i) {
            this.E = i;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.B != i) {
            this.B = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? r4.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.y != i) {
            this.y = i;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.v != mode) {
            this.v = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(r4.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.s.v(i);
    }

    public void setInsetTop(int i) {
        this.s.w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.u = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.s.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (g()) {
            setRippleColor(r4.a(getContext(), i));
        }
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        if (!g()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.s.y(gc1Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.s.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.s.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (g()) {
            setStrokeColor(r4.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (g()) {
            this.s.B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.daaw.s3, com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.s.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // com.daaw.s3, com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.s.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.C);
    }
}
