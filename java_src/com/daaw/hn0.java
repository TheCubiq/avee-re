package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public class hn0 extends C0616ae implements Checkable, jc1 {

    /* renamed from: B */
    public static final int[] f12682B = {16842911};

    /* renamed from: C */
    public static final int[] f12683C = {16842912};

    /* renamed from: D */
    public static final int[] f12684D = {w01.state_dragged};

    /* renamed from: E */
    public static final int f12685E = k21.Widget_MaterialComponents_CardView;

    /* renamed from: A */
    public InterfaceC1592a f12686A;

    /* renamed from: x */
    public boolean f12687x;

    /* renamed from: y */
    public boolean f12688y;

    /* renamed from: z */
    public boolean f12689z;

    /* renamed from: com.daaw.hn0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1592a {
        /* renamed from: a */
        void m20614a(hn0 hn0Var, boolean z);
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    /* renamed from: d */
    public final void m20617d() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    /* renamed from: e */
    public boolean m20616e() {
        return false;
    }

    /* renamed from: f */
    public boolean m20615f() {
        return this.f12689z;
    }

    @Override // com.daaw.C0616ae
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public gc1 getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f12688y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m20616e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f12682B);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f12683C);
        }
        if (m20615f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f12684D);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m20616e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // com.daaw.C0616ae, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f12687x) {
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.daaw.C0616ae
    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // com.daaw.C0616ae
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f12688y != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C2818r4.m11783b(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(int i) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    public void setDragged(boolean z) {
        if (this.f12689z != z) {
            this.f12689z = z;
            refreshDrawableState();
            m20617d();
            invalidate();
        }
    }

    @Override // com.daaw.C0616ae
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC1592a interfaceC1592a) {
        this.f12686A = interfaceC1592a;
    }

    @Override // com.daaw.C0616ae
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        C2818r4.m11784a(getContext(), i);
        throw null;
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(gc1Var.m21792u(getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    @Override // com.daaw.C0616ae
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m20616e() && isEnabled()) {
            this.f12688y = !this.f12688y;
            refreshDrawableState();
            m20617d();
            InterfaceC1592a interfaceC1592a = this.f12686A;
            if (interfaceC1592a != null) {
                interfaceC1592a.m20614a(this, this.f12688y);
            }
        }
    }
}
