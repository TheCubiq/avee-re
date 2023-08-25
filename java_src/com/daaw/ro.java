package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
/* loaded from: classes2.dex */
public class ro extends nn0 {
    public final Paint N;
    public final RectF O;
    public int P;

    public ro() {
        this(null);
    }

    public ro(gc1 gc1Var) {
        super(gc1Var == null ? new gc1() : gc1Var);
        this.N = new Paint(1);
        p0();
        this.O = new RectF();
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        k0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.O, this.N);
        j0(canvas);
    }

    public boolean i0() {
        return !this.O.isEmpty();
    }

    public final void j0(Canvas canvas) {
        if (q0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.P);
    }

    public final void k0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!q0(callback)) {
            m0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    public void l0() {
        n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void m0(Canvas canvas) {
        this.P = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    public void n0(float f, float f2, float f3, float f4) {
        RectF rectF = this.O;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void o0(RectF rectF) {
        n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void p0() {
        this.N.setStyle(Paint.Style.FILL_AND_STROKE);
        this.N.setColor(-1);
        this.N.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean q0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
