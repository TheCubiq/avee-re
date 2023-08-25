package com.triggertrap.seekarc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.avee.R;
import com.daaw.u21;
/* loaded from: classes2.dex */
public class SeekArc extends View {
    public static final String N = SeekArc.class.getSimpleName();
    public static int O = -1;
    public boolean A;
    public int B;
    public float C;
    public RectF D;
    public Paint E;
    public Paint F;
    public int G;
    public int H;
    public int I;
    public int J;
    public double K;
    public float L;
    public a M;
    public final int p;
    public Drawable q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(SeekArc seekArc);

        void b(SeekArc seekArc);

        void c(SeekArc seekArc, int i, boolean z);
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = -90;
        this.r = 100;
        this.s = 0;
        this.t = 4;
        this.u = 2;
        this.v = 0;
        this.w = 360;
        this.x = 0;
        this.y = false;
        this.z = true;
        this.A = true;
        this.B = 0;
        this.C = 0.0f;
        this.D = new RectF();
        d(context, attributeSet, R.attr.seekArcStyle);
    }

    public final int a(double d) {
        double k = k();
        Double.isNaN(k);
        int round = (int) Math.round(k * d);
        if (round < 0) {
            round = O;
        }
        return round > this.r ? O : round;
    }

    public final double b(float f, float f2) {
        float f3 = f - this.G;
        float f4 = f2 - this.H;
        if (!this.A) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.x));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        double d = this.v;
        Double.isNaN(d);
        return degrees - d;
    }

    public final boolean c(float f, float f2) {
        float f3 = f - this.G;
        float f4 = f2 - this.H;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.L;
    }

    public final void d(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = resources.getColor(R.color.progress_gray);
        int color2 = resources.getColor(17170450);
        this.q = resources.getDrawable(R.drawable.seek_arc_control_selector);
        this.t = (int) (this.t * f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u21.u1, i, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(11);
            if (drawable != null) {
                this.q = drawable;
            }
            int intrinsicHeight = this.q.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.q.getIntrinsicWidth() / 2;
            this.q.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            this.r = obtainStyledAttributes.getInteger(3, this.r);
            this.s = obtainStyledAttributes.getInteger(4, this.s);
            this.t = (int) obtainStyledAttributes.getDimension(6, this.t);
            this.u = (int) obtainStyledAttributes.getDimension(1, this.u);
            this.v = obtainStyledAttributes.getInt(9, this.v);
            this.w = obtainStyledAttributes.getInt(10, this.w);
            this.x = obtainStyledAttributes.getInt(7, this.x);
            this.y = obtainStyledAttributes.getBoolean(8, this.y);
            this.z = obtainStyledAttributes.getBoolean(13, this.z);
            this.A = obtainStyledAttributes.getBoolean(2, this.A);
            color = obtainStyledAttributes.getColor(0, color);
            color2 = obtainStyledAttributes.getColor(5, color2);
            obtainStyledAttributes.recycle();
        }
        int i2 = this.s;
        int i3 = this.r;
        if (i2 > i3) {
            i2 = i3;
        }
        this.s = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.s = i2;
        int i4 = this.w;
        if (i4 > 360) {
            i4 = 360;
        }
        this.w = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.w = i4;
        int i5 = this.v;
        if (i5 > 360) {
            i5 = 0;
        }
        this.v = i5;
        this.v = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(color);
        this.E.setAntiAlias(true);
        this.E.setStyle(Paint.Style.STROKE);
        this.E.setStrokeWidth(this.u);
        Paint paint2 = new Paint();
        this.F = paint2;
        paint2.setColor(color2);
        this.F.setAntiAlias(true);
        this.F.setStyle(Paint.Style.STROKE);
        this.F.setStrokeWidth(this.t);
        if (this.y) {
            this.E.setStrokeCap(Paint.Cap.ROUND);
            this.F.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            this.q.setState(getDrawableState());
        }
        invalidate();
    }

    public final void e(int i, boolean z) {
        i(i, z);
    }

    public final void f() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void g() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public int getArcRotation() {
        return this.x;
    }

    public int getArcWidth() {
        return this.u;
    }

    public int getProgressWidth() {
        return this.t;
    }

    public int getStartAngle() {
        return this.v;
    }

    public int getSweepAngle() {
        return this.w;
    }

    public final void h(MotionEvent motionEvent) {
        if (c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double b = b(motionEvent.getX(), motionEvent.getY());
        this.K = b;
        e(a(b), true);
    }

    public final void i(int i, boolean z) {
        if (i == O) {
            return;
        }
        a aVar = this.M;
        if (aVar != null) {
            aVar.c(this, i, z);
        }
        int i2 = this.r;
        if (i > i2) {
            i = i2;
        }
        if (this.s < 0) {
            i = 0;
        }
        this.s = i;
        this.C = (i / i2) * this.w;
        j();
        invalidate();
    }

    public final void j() {
        double d = this.B;
        double d2 = (int) (this.v + this.C + this.x + 90.0f);
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.I = (int) (d * cos);
        double d3 = this.B;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.J = (int) (d3 * sin);
    }

    public final float k() {
        return this.r / this.w;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.A) {
            canvas.scale(-1.0f, 1.0f, this.D.centerX(), this.D.centerY());
        }
        float f = (this.v - 90) + this.x;
        canvas.drawArc(this.D, f, this.w, false, this.E);
        canvas.drawArc(this.D, f, this.C, false, this.F);
        canvas.translate(this.G - this.I, this.H - this.J);
        this.q.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int min = Math.min(defaultSize2, defaultSize);
        this.G = (int) (defaultSize2 * 0.5f);
        this.H = (int) (defaultSize * 0.5f);
        int paddingLeft = min - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.B = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.D.set(f2, f, f2 + f3, f3 + f);
        double d = this.B;
        double d2 = ((int) this.C) + this.v + this.x + 90;
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.I = (int) (d * cos);
        double d3 = this.B;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.J = (int) (d3 * sin);
        setTouchInSide(this.z);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L18
            r2 = 0
            if (r0 == r1) goto L11
            r3 = 2
            if (r0 == r3) goto L1b
            r5 = 3
            if (r0 == r5) goto L11
            goto L1e
        L11:
            r4.g()
            r4.setPressed(r2)
            goto L1e
        L18:
            r4.f()
        L1b:
            r4.h(r5)
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.triggertrap.seekarc.SeekArc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setArcRotation(int i) {
        this.x = i;
        j();
    }

    public void setArcWidth(int i) {
        this.u = i;
        this.E.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.A = z;
    }

    public void setOnSeekArcChangeListener(a aVar) {
        this.M = aVar;
    }

    public void setProgress(int i) {
        i(i, false);
    }

    public void setProgressWidth(int i) {
        this.t = i;
        this.F.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        Paint paint;
        Paint.Cap cap;
        this.y = z;
        if (z) {
            this.E.setStrokeCap(Paint.Cap.ROUND);
            paint = this.F;
            cap = Paint.Cap.ROUND;
        } else {
            this.E.setStrokeCap(Paint.Cap.SQUARE);
            paint = this.F;
            cap = Paint.Cap.SQUARE;
        }
        paint.setStrokeCap(cap);
    }

    public void setStartAngle(int i) {
        this.v = i;
        j();
    }

    public void setSweepAngle(int i) {
        this.w = i;
        j();
    }

    public void setTouchInSide(boolean z) {
        int intrinsicHeight = this.q.getIntrinsicHeight() / 2;
        int intrinsicWidth = this.q.getIntrinsicWidth() / 2;
        this.z = z;
        this.L = z ? this.B / 4.0f : this.B - Math.min(intrinsicWidth, intrinsicHeight);
    }
}
