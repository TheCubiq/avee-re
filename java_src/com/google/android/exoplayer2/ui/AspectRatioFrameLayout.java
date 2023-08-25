package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.daaw.w21;
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final c p;
    public b q;
    public float r;
    public int s;

    /* loaded from: classes.dex */
    public interface b {
        void a(float f, float f2, boolean z);
    }

    /* loaded from: classes.dex */
    public final class c implements Runnable {
        public float p;
        public float q;
        public boolean r;
        public boolean s;

        public c() {
        }

        public void a(float f, float f2, boolean z) {
            this.p = f;
            this.q = f2;
            this.r = z;
            if (this.s) {
                return;
            }
            this.s = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s = false;
            if (AspectRatioFrameLayout.this.q == null) {
                return;
            }
            AspectRatioFrameLayout.this.q.a(this.p, this.q, this.r);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w21.a, 0, 0);
            try {
                this.s = obtainStyledAttributes.getInt(w21.b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.p = new c();
    }

    public int getResizeMode() {
        return this.s;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.r
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.r
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.p
            float r10 = r8.r
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L31:
            int r5 = r8.s
            r6 = 1
            if (r5 == 0) goto L4e
            if (r5 == r6) goto L49
            r7 = 2
            if (r5 == r7) goto L43
            r7 = 4
            if (r5 == r7) goto L3f
            goto L53
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L49
        L43:
            float r9 = r8.r
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L53
        L49:
            float r10 = r8.r
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L53
        L4e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L49
        L53:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.p
            float r1 = r8.r
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.r != f) {
            this.r = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.q = bVar;
    }

    public void setResizeMode(int i) {
        if (this.s != i) {
            this.s = i;
            requestLayout();
        }
    }
}
