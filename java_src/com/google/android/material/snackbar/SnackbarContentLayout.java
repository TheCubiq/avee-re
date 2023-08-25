package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.f11;
import com.daaw.m11;
import com.daaw.m21;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: p */
    public TextView f37657p;

    /* renamed from: q */
    public Button f37658q;

    /* renamed from: r */
    public int f37659r;

    /* renamed from: s */
    public int f37660s;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18258i4);
        this.f37659r = obtainStyledAttributes.getDimensionPixelSize(m21.f18266j4, -1);
        this.f37660s = obtainStyledAttributes.getDimensionPixelSize(m21.f18319q4, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static void m325a(View view, int i, int i2) {
        if (xs1.m4740X(view)) {
            xs1.m4767E0(view, xs1.m4758J(view), i, xs1.m4760I(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: b */
    public final boolean m324b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f37657p.getPaddingTop() == i2 && this.f37657p.getPaddingBottom() == i3) {
            return z;
        }
        m325a(this.f37657p, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f37658q;
    }

    public TextView getMessageView() {
        return this.f37657p;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f37657p = (TextView) findViewById(m11.snackbar_text);
        this.f37658q = (Button) findViewById(m11.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (m324b(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (m324b(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f37659r > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f37659r;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(f11.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(f11.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.f37657p.getLayout().getLineCount() > 1;
        if (!z2 || this.f37660s <= 0 || this.f37658q.getMeasuredWidth() <= this.f37660s) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f37660s = i;
    }
}
