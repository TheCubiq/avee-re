package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ae extends FrameLayout {
    public static final int[] v = {16842801};
    public static final fe w;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public final Rect t;
    public final ee u;

    static {
        w = Build.VERSION.SDK_INT >= 21 ? new ce() : new be();
        w.h();
    }

    public ColorStateList getCardBackgroundColor() {
        return w.a(this.u);
    }

    public float getCardElevation() {
        return w.j(this.u);
    }

    public int getContentPaddingBottom() {
        return this.t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.t.left;
    }

    public int getContentPaddingRight() {
        return this.t.right;
    }

    public int getContentPaddingTop() {
        return this.t.top;
    }

    public float getMaxCardElevation() {
        return w.k(this.u);
    }

    public boolean getPreventCornerOverlap() {
        return this.q;
    }

    public float getRadius() {
        return w.f(this.u);
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        fe feVar = w;
        if (!(feVar instanceof ce)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(feVar.g(this.u)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(feVar.c(this.u)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        w.e(this.u, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        w.e(this.u, colorStateList);
    }

    public void setCardElevation(float f) {
        w.l(this.u, f);
    }

    public void setMaxCardElevation(float f) {
        w.d(this.u, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.s = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.r = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.q) {
            this.q = z;
            w.m(this.u);
        }
    }

    public void setRadius(float f) {
        w.b(this.u, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            w.i(this.u);
        }
    }
}
