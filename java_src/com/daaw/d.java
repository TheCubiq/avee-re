package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public abstract class d extends View {
    public Bitmap p;
    public Canvas q;
    public Bitmap r;
    public Canvas s;
    public mu0 t;
    public int u;
    public int v;
    public int w;
    public float x;
    public boolean y;
    public boolean z;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = 20;
        this.w = 5;
        this.x = 1.0f;
        this.y = false;
        this.z = false;
        e(context, attributeSet);
    }

    public void a() {
        int width;
        int height;
        if (this.z) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        this.r = Bitmap.createBitmap(Math.max(width - (this.u * 2), 1), this.w, Bitmap.Config.ARGB_8888);
        this.s = new Canvas(this.r);
        Bitmap bitmap = this.p;
        if (bitmap != null && bitmap.getWidth() == width && this.p.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.p;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.p = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.q = new Canvas(this.p);
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas, float f, float f2);

    public int d(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v21.a, 0, 0);
        try {
            this.z = obtainStyledAttributes.getBoolean(v21.b, this.z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void f(float f);

    public void g() {
        this.v = d(e11.default_slider_handler_radius);
        this.w = d(e11.default_slider_bar_height);
        this.u = this.v;
        if (this.r == null) {
            a();
        }
        b(this.s);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.z) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.r == null || (canvas2 = this.q) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        Canvas canvas3 = this.q;
        Bitmap bitmap = this.r;
        canvas3.drawBitmap(bitmap, this.u, (height - bitmap.getHeight()) / 2, (Paint) null);
        int i = this.v;
        c(this.q, i + (this.x * (width - (i * 2))), height / 2.0f);
        canvas.drawBitmap(this.p, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            i = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : 0;
        }
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L1f
            goto L5f
        Ld:
            float r4 = r3.x
            r3.f(r4)
            com.daaw.mu0 r4 = r3.t
            if (r4 == 0) goto L1b
            float r0 = r3.x
            r4.a(r0)
        L1b:
            r3.invalidate()
            goto L5f
        L1f:
            android.graphics.Bitmap r0 = r3.r
            if (r0 == 0) goto L5f
            boolean r0 = r3.z
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L3c
            float r4 = r4.getY()
            int r0 = r3.u
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.r
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r2 - r4
            goto L4c
        L3c:
            float r4 = r4.getX()
            int r0 = r3.u
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.r
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
        L4c:
            r3.x = r4
            r4 = 0
            float r0 = r3.x
            float r0 = java.lang.Math.min(r0, r2)
            float r4 = java.lang.Math.max(r4, r0)
            r3.x = r4
            r3.f(r4)
            goto L1b
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnValueChangedListener(mu0 mu0Var) {
        this.t = mu0Var;
    }

    public void setShowBorder(boolean z) {
        this.y = z;
    }
}
