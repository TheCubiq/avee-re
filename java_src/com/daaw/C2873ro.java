package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
/* renamed from: com.daaw.ro */
/* loaded from: classes2.dex */
public class C2873ro extends nn0 {

    /* renamed from: N */
    public final Paint f25431N;

    /* renamed from: O */
    public final RectF f25432O;

    /* renamed from: P */
    public int f25433P;

    public C2873ro() {
        this(null);
    }

    public C2873ro(gc1 gc1Var) {
        super(gc1Var == null ? new gc1() : gc1Var);
        this.f25431N = new Paint(1);
        m11127p0();
        this.f25432O = new RectF();
    }

    @Override // com.daaw.nn0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m11132k0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f25432O, this.f25431N);
        m11133j0(canvas);
    }

    /* renamed from: i0 */
    public boolean m11134i0() {
        return !this.f25432O.isEmpty();
    }

    /* renamed from: j0 */
    public final void m11133j0(Canvas canvas) {
        if (m11126q0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f25433P);
    }

    /* renamed from: k0 */
    public final void m11132k0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!m11126q0(callback)) {
            m11130m0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    /* renamed from: l0 */
    public void m11131l0() {
        m11129n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: m0 */
    public final void m11130m0(Canvas canvas) {
        this.f25433P = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    /* renamed from: n0 */
    public void m11129n0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f25432O;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: o0 */
    public void m11128o0(RectF rectF) {
        m11129n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: p0 */
    public final void m11127p0() {
        this.f25431N.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f25431N.setColor(-1);
        this.f25431N.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: q0 */
    public final boolean m11126q0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
