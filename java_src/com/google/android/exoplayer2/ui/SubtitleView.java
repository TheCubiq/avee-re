package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.daaw.ln;
import com.daaw.pk1;
import com.daaw.zd;
import com.daaw.zh1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class SubtitleView extends View implements pk1 {
    public final List<zh1> p;
    public List<ln> q;
    public int r;
    public float s;
    public boolean t;
    public boolean u;
    public zd v;
    public float w;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new ArrayList();
        this.r = 0;
        this.s = 0.0533f;
        this.t = true;
        this.u = true;
        this.v = zd.g;
        this.w = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private zd getUserCaptionStyleV19() {
        return zd.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    public final float a(int i, float f, int i2, int i3) {
        float f2;
        if (i == 0) {
            f2 = i3;
        } else if (i != 1) {
            if (i != 2) {
                return Float.MIN_VALUE;
            }
            return f;
        } else {
            f2 = i2;
        }
        return f * f2;
    }

    public final float b(ln lnVar, int i, int i2, float f) {
        int i3 = lnVar.B;
        if (i3 != Integer.MIN_VALUE) {
            float f2 = lnVar.C;
            if (f2 == Float.MIN_VALUE) {
                return f;
            }
            float a = a(i3, f2, i, i2);
            return a > 0.0f ? a : f;
        }
        return f;
    }

    public void c(float f, boolean z) {
        d(z ? 1 : 0, f);
    }

    public final void d(int i, float f) {
        if (this.r == i && this.s == f) {
            return;
        }
        this.r = i;
        this.s = f;
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<ln> list = this.q;
        int i = 0;
        int size = list == null ? 0 : list.size();
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() - getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom <= paddingTop || right <= left) {
            return;
        }
        int i2 = bottom - top;
        int i3 = paddingBottom - paddingTop;
        float a = a(this.r, this.s, i2, i3);
        if (a <= 0.0f) {
            return;
        }
        while (i < size) {
            ln lnVar = this.q.get(i);
            int i4 = size;
            int i5 = paddingBottom;
            int i6 = right;
            this.p.get(i).b(lnVar, this.t, this.u, this.v, b(lnVar, i2, i3, a), this.w, canvas, left, paddingTop, i6, i5);
            i++;
            paddingBottom = i5;
            size = i4;
            a = a;
            right = i6;
        }
    }

    @Override // com.daaw.pk1
    public void h(List<ln> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.t == z && this.u == z) {
            return;
        }
        this.t = z;
        this.u = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f) {
        if (this.w == f) {
            return;
        }
        this.w = f;
        invalidate();
    }

    public void setCues(List<ln> list) {
        if (this.q == list) {
            return;
        }
        this.q = list;
        int size = list == null ? 0 : list.size();
        while (this.p.size() < size) {
            this.p.add(new zh1(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f) {
        c(f, false);
    }

    public void setStyle(zd zdVar) {
        if (this.v == zdVar) {
            return;
        }
        this.v = zdVar;
        invalidate();
    }
}
