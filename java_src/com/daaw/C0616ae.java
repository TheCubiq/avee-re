package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
/* renamed from: com.daaw.ae */
/* loaded from: classes.dex */
public class C0616ae extends FrameLayout {

    /* renamed from: v */
    public static final int[] f3107v = {16842801};

    /* renamed from: w */
    public static final InterfaceC1273fe f3108w;

    /* renamed from: p */
    public boolean f3109p;

    /* renamed from: q */
    public boolean f3110q;

    /* renamed from: r */
    public int f3111r;

    /* renamed from: s */
    public int f3112s;

    /* renamed from: t */
    public final Rect f3113t;

    /* renamed from: u */
    public final InterfaceC1179ee f3114u;

    static {
        f3108w = Build.VERSION.SDK_INT >= 21 ? new C0948ce() : new C0834be();
        f3108w.mo22759h();
    }

    public ColorStateList getCardBackgroundColor() {
        return f3108w.mo22766a(this.f3114u);
    }

    public float getCardElevation() {
        return f3108w.mo22757j(this.f3114u);
    }

    public int getContentPaddingBottom() {
        return this.f3113t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3113t.left;
    }

    public int getContentPaddingRight() {
        return this.f3113t.right;
    }

    public int getContentPaddingTop() {
        return this.f3113t.top;
    }

    public float getMaxCardElevation() {
        return f3108w.mo22756k(this.f3114u);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3110q;
    }

    public float getRadius() {
        return f3108w.mo22761f(this.f3114u);
    }

    public boolean getUseCompatPadding() {
        return this.f3109p;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC1273fe interfaceC1273fe = f3108w;
        if (!(interfaceC1273fe instanceof C0948ce)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC1273fe.mo22760g(this.f3114u)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC1273fe.mo22764c(this.f3114u)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f3108w.mo22762e(this.f3114u, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f3108w.mo22762e(this.f3114u, colorStateList);
    }

    public void setCardElevation(float f) {
        f3108w.mo22755l(this.f3114u, f);
    }

    public void setMaxCardElevation(float f) {
        f3108w.mo22763d(this.f3114u, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f3112s = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f3111r = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3110q) {
            this.f3110q = z;
            f3108w.mo22754m(this.f3114u);
        }
    }

    public void setRadius(float f) {
        f3108w.mo22765b(this.f3114u, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3109p != z) {
            this.f3109p = z;
            f3108w.mo22758i(this.f3114u);
        }
    }
}
