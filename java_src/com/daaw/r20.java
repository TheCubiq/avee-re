package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes2.dex */
public class r20 extends ViewGroup {

    /* renamed from: p */
    public int f24739p;

    /* renamed from: q */
    public int f24740q;

    /* renamed from: r */
    public boolean f24741r;

    /* renamed from: s */
    public int f24742s;

    public r20(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r20(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24741r = false;
        m11832d(context, attributeSet);
    }

    /* renamed from: a */
    public static int m11834a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: b */
    public int m11833b(View view) {
        Object tag = view.getTag(m11.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo776c() {
        return this.f24741r;
    }

    /* renamed from: d */
    public final void m11832d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m21.f18287m1, 0, 0);
        this.f24739p = obtainStyledAttributes.getDimensionPixelSize(m21.f18302o1, 0);
        this.f24740q = obtainStyledAttributes.getDimensionPixelSize(m21.f18295n1, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f24740q;
    }

    public int getLineSpacing() {
        return this.f24739p;
    }

    public int getRowCount() {
        return this.f24742s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f24742s = 0;
            return;
        }
        this.f24742s = 1;
        boolean z2 = xs1.m4768E(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(m11.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = cn0.m25226b(marginLayoutParams);
                    i5 = cn0.m25227a(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.f24741r && measuredWidth > i7) {
                    i9 = this.f24739p + paddingTop;
                    this.f24742s++;
                    i8 = paddingRight;
                }
                childAt.setTag(m11.row_index_key, Integer.valueOf(this.f24742s - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i6;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.f24740q;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i3 + childAt.getMeasuredWidth() <= paddingRight || mo776c()) {
                    i5 = i10;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f24739p + paddingTop;
                }
                int measuredWidth = i5 + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i3 + i4 + childAt.getMeasuredWidth() + this.f24740q;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m11834a(size, mode, i8 + getPaddingRight()), m11834a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f24740q = i;
    }

    public void setLineSpacing(int i) {
        this.f24739p = i;
    }

    public void setSingleLine(boolean z) {
        this.f24741r = z;
    }
}
