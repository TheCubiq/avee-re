package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.daaw.d */
/* loaded from: classes.dex */
public abstract class AbstractC1031d extends View {

    /* renamed from: p */
    public Bitmap f6323p;

    /* renamed from: q */
    public Canvas f6324q;

    /* renamed from: r */
    public Bitmap f6325r;

    /* renamed from: s */
    public Canvas f6326s;

    /* renamed from: t */
    public mu0 f6327t;

    /* renamed from: u */
    public int f6328u;

    /* renamed from: v */
    public int f6329v;

    /* renamed from: w */
    public int f6330w;

    /* renamed from: x */
    public float f6331x;

    /* renamed from: y */
    public boolean f6332y;

    /* renamed from: z */
    public boolean f6333z;

    public AbstractC1031d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6329v = 20;
        this.f6330w = 5;
        this.f6331x = 1.0f;
        this.f6332y = false;
        this.f6333z = false;
        m24847e(context, attributeSet);
    }

    /* renamed from: a */
    public void mo16296a() {
        int width;
        int height;
        if (this.f6333z) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        this.f6325r = Bitmap.createBitmap(Math.max(width - (this.f6328u * 2), 1), this.f6330w, Bitmap.Config.ARGB_8888);
        this.f6326s = new Canvas(this.f6325r);
        Bitmap bitmap = this.f6323p;
        if (bitmap != null && bitmap.getWidth() == width && this.f6323p.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.f6323p;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f6323p = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f6324q = new Canvas(this.f6323p);
    }

    /* renamed from: b */
    public abstract void mo7122b(Canvas canvas);

    /* renamed from: c */
    public abstract void mo7121c(Canvas canvas, float f, float f2);

    /* renamed from: d */
    public int m24848d(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    /* renamed from: e */
    public final void m24847e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v21.f29750a, 0, 0);
        try {
            this.f6333z = obtainStyledAttributes.getBoolean(v21.f29751b, this.f6333z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public abstract void mo7120f(float f);

    /* renamed from: g */
    public void m24846g() {
        this.f6329v = m24848d(e11.default_slider_handler_radius);
        this.f6330w = m24848d(e11.default_slider_bar_height);
        this.f6328u = this.f6329v;
        if (this.f6325r == null) {
            mo16296a();
        }
        mo7122b(this.f6326s);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f6333z) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.f6325r == null || (canvas2 = this.f6324q) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        Canvas canvas3 = this.f6324q;
        Bitmap bitmap = this.f6325r;
        canvas3.drawBitmap(bitmap, this.f6328u, (height - bitmap.getHeight()) / 2, (Paint) null);
        int i = this.f6329v;
        mo7121c(this.f6324q, i + (this.f6331x * (width - (i * 2))), height / 2.0f);
        canvas.drawBitmap(this.f6323p, 0.0f, 0.0f, (Paint) null);
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
        m24846g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                mo7120f(this.f6331x);
                mu0 mu0Var = this.f6327t;
                if (mu0Var != null) {
                    mu0Var.m15762a(this.f6331x);
                }
                invalidate();
                return true;
            }
        }
        if (this.f6325r != null) {
            this.f6331x = this.f6333z ? 1.0f - ((motionEvent.getY() - this.f6328u) / this.f6325r.getWidth()) : (motionEvent.getX() - this.f6328u) / this.f6325r.getWidth();
            float max = Math.max(0.0f, Math.min(this.f6331x, 1.0f));
            this.f6331x = max;
            mo7120f(max);
            invalidate();
        }
        return true;
    }

    public void setOnValueChangedListener(mu0 mu0Var) {
        this.f6327t = mu0Var;
    }

    public void setShowBorder(boolean z) {
        this.f6332y = z;
    }
}
