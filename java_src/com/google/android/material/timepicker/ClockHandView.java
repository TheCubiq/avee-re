package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.daaw.f11;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.w01;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    public final int A;
    public float B;
    public boolean C;
    public c D;
    public double E;
    public int F;
    public ValueAnimator p;
    public boolean q;
    public float r;
    public float s;
    public boolean t;
    public int u;
    public final List<d> v;
    public final int w;
    public final float x;
    public final Paint y;
    public final RectF z;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(float f, boolean z);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = new ArrayList();
        Paint paint = new Paint();
        this.y = paint;
        this.z = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.P0, i, k21.Widget_MaterialComponents_TimePicker_Clock);
        this.F = obtainStyledAttributes.getDimensionPixelSize(m21.R0, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(m21.S0, 0);
        Resources resources = getResources();
        this.A = resources.getDimensionPixelSize(f11.material_clock_hand_stroke_width);
        this.x = resources.getDimensionPixelSize(f11.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(m21.Q0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.u = ViewConfiguration.get(context).getScaledTouchSlop();
        xs1.B0(this, 2);
        obtainStyledAttributes.recycle();
    }

    public void b(d dVar) {
        this.v.add(dVar);
    }

    public final void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.y.setStrokeWidth(0.0f);
        canvas.drawCircle((this.F * ((float) Math.cos(this.E))) + width2, (this.F * ((float) Math.sin(this.E))) + f, this.w, this.y);
        double sin = Math.sin(this.E);
        double cos = Math.cos(this.E);
        Double.isNaN(r6);
        Double.isNaN(r6);
        this.y.setStrokeWidth(this.A);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.y);
        canvas.drawCircle(width2, f, this.x, this.y);
    }

    public RectF d() {
        return this.z;
    }

    public final int e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public float f() {
        return this.B;
    }

    public int g() {
        return this.w;
    }

    public final Pair<Float, Float> h(float f) {
        float f2 = f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    public final boolean i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = e(f, f2);
        boolean z4 = false;
        boolean z5 = f() != e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.q) {
                z4 = true;
            }
            l(e, z4);
            return true;
        }
        return false;
    }

    public void j(int i) {
        this.F = i;
        invalidate();
    }

    public void k(float f) {
        l(f, false);
    }

    public void l(float f, boolean z) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f, false);
            return;
        }
        Pair<Float, Float> h = h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h.first).floatValue(), ((Float) h.second).floatValue());
        this.p = ofFloat;
        ofFloat.setDuration(200L);
        this.p.addUpdateListener(new a());
        this.p.addListener(new b());
        this.p.start();
    }

    public final void m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.B = f2;
        this.E = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.F * ((float) Math.cos(this.E)));
        float height = (getHeight() / 2) + (this.F * ((float) Math.sin(this.E)));
        RectF rectF = this.z;
        int i = this.w;
        rectF.set(width - i, height - i, width + i, height + i);
        for (d dVar : this.v) {
            dVar.a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.r);
                int i2 = (int) (y - this.s);
                this.t = (i * i) + (i2 * i2) > this.u;
                boolean z4 = this.C;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.r = x;
            this.s = y;
            this.t = true;
            this.C = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean i3 = i(x, y, z2, z3, z) | this.C;
        this.C = i3;
        if (i3 && z && (cVar = this.D) != null) {
            cVar.a(e(x, y), this.t);
        }
        return true;
    }
}
