package com.google.android.exoplayer2.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.w21;
/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: p */
    public final RunnableC3974c f35914p;

    /* renamed from: q */
    public InterfaceC3973b f35915q;

    /* renamed from: r */
    public float f35916r;

    /* renamed from: s */
    public int f35917s;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3973b {
        /* renamed from: a */
        void m1516a(float f, float f2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    /* loaded from: classes.dex */
    public final class RunnableC3974c implements Runnable {

        /* renamed from: p */
        public float f35918p;

        /* renamed from: q */
        public float f35919q;

        /* renamed from: r */
        public boolean f35920r;

        /* renamed from: s */
        public boolean f35921s;

        public RunnableC3974c() {
        }

        /* renamed from: a */
        public void m1515a(float f, float f2, boolean z) {
            this.f35918p = f;
            this.f35919q = f2;
            this.f35920r = z;
            if (this.f35921s) {
                return;
            }
            this.f35921s = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35921s = false;
            if (AspectRatioFrameLayout.this.f35915q == null) {
                return;
            }
            AspectRatioFrameLayout.this.f35915q.m1516a(this.f35918p, this.f35919q, this.f35920r);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35917s = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w21.f30799a, 0, 0);
            try {
                this.f35917s = obtainStyledAttributes.getInt(w21.f30800b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f35914p = new RunnableC3974c();
    }

    public int getResizeMode() {
        return this.f35917s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r4 > 0.0f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r4 > 0.0f) goto L21;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f35916r <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = f / f2;
        float f4 = (this.f35916r / f3) - 1.0f;
        if (Math.abs(f4) <= 0.01f) {
            this.f35914p.m1515a(this.f35916r, f3, false);
            return;
        }
        int i3 = this.f35917s;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 4) {
                    }
                }
                measuredWidth = (int) (f2 * this.f35916r);
            }
            measuredHeight = (int) (f / this.f35916r);
        }
        this.f35914p.m1515a(this.f35916r, f3, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f35916r != f) {
            this.f35916r = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC3973b interfaceC3973b) {
        this.f35915q = interfaceC3973b;
    }

    public void setResizeMode(int i) {
        if (this.f35917s != i) {
            this.f35917s = i;
            requestLayout();
        }
    }
}
