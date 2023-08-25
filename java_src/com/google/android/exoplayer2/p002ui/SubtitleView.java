package com.google.android.exoplayer2.p002ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.daaw.C2099ln;
import com.daaw.C3828zd;
import com.daaw.pk1;
import com.daaw.zh1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
/* loaded from: classes.dex */
public final class SubtitleView extends View implements pk1 {

    /* renamed from: p */
    public final List<zh1> f35960p;

    /* renamed from: q */
    public List<C2099ln> f35961q;

    /* renamed from: r */
    public int f35962r;

    /* renamed from: s */
    public float f35963s;

    /* renamed from: t */
    public boolean f35964t;

    /* renamed from: u */
    public boolean f35965u;

    /* renamed from: v */
    public C3828zd f35966v;

    /* renamed from: w */
    public float f35967w;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35960p = new ArrayList();
        this.f35962r = 0;
        this.f35963s = 0.0533f;
        this.f35964t = true;
        this.f35965u = true;
        this.f35966v = C3828zd.f34955g;
        this.f35967w = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private C3828zd getUserCaptionStyleV19() {
        return C3828zd.m2479a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    /* renamed from: a */
    public final float m1495a(int i, float f, int i2, int i3) {
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

    /* renamed from: b */
    public final float m1494b(C2099ln c2099ln, int i, int i2, float f) {
        int i3 = c2099ln.f17545B;
        if (i3 != Integer.MIN_VALUE) {
            float f2 = c2099ln.f17546C;
            if (f2 == Float.MIN_VALUE) {
                return f;
            }
            float m1495a = m1495a(i3, f2, i, i2);
            return m1495a > 0.0f ? m1495a : f;
        }
        return f;
    }

    /* renamed from: c */
    public void m1493c(float f, boolean z) {
        m1492d(z ? 1 : 0, f);
    }

    /* renamed from: d */
    public final void m1492d(int i, float f) {
        if (this.f35962r == i && this.f35963s == f) {
            return;
        }
        this.f35962r = i;
        this.f35963s = f;
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C2099ln> list = this.f35961q;
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
        float m1495a = m1495a(this.f35962r, this.f35963s, i2, i3);
        if (m1495a <= 0.0f) {
            return;
        }
        while (i < size) {
            C2099ln c2099ln = this.f35961q.get(i);
            int i4 = size;
            int i5 = paddingBottom;
            int i6 = right;
            this.f35960p.get(i).m2304b(c2099ln, this.f35964t, this.f35965u, this.f35966v, m1494b(c2099ln, i2, i3, m1495a), this.f35967w, canvas, left, paddingTop, i6, i5);
            i++;
            paddingBottom = i5;
            size = i4;
            m1495a = m1495a;
            right = i6;
        }
    }

    @Override // com.daaw.pk1
    /* renamed from: h */
    public void mo1491h(List<C2099ln> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f35965u == z) {
            return;
        }
        this.f35965u = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f35964t == z && this.f35965u == z) {
            return;
        }
        this.f35964t = z;
        this.f35965u = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f) {
        if (this.f35967w == f) {
            return;
        }
        this.f35967w = f;
        invalidate();
    }

    public void setCues(List<C2099ln> list) {
        if (this.f35961q == list) {
            return;
        }
        this.f35961q = list;
        int size = list == null ? 0 : list.size();
        while (this.f35960p.size() < size) {
            this.f35960p.add(new zh1(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f) {
        m1493c(f, false);
    }

    public void setStyle(C3828zd c3828zd) {
        if (this.f35966v == c3828zd) {
            return;
        }
        this.f35966v = c3828zd;
        invalidate();
    }
}
