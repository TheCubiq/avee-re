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

    /* renamed from: N */
    public static final String f37987N = SeekArc.class.getSimpleName();

    /* renamed from: O */
    public static int f37988O = -1;

    /* renamed from: A */
    public boolean f37989A;

    /* renamed from: B */
    public int f37990B;

    /* renamed from: C */
    public float f37991C;

    /* renamed from: D */
    public RectF f37992D;

    /* renamed from: E */
    public Paint f37993E;

    /* renamed from: F */
    public Paint f37994F;

    /* renamed from: G */
    public int f37995G;

    /* renamed from: H */
    public int f37996H;

    /* renamed from: I */
    public int f37997I;

    /* renamed from: J */
    public int f37998J;

    /* renamed from: K */
    public double f37999K;

    /* renamed from: L */
    public float f38000L;

    /* renamed from: M */
    public InterfaceC4185a f38001M;

    /* renamed from: p */
    public final int f38002p;

    /* renamed from: q */
    public Drawable f38003q;

    /* renamed from: r */
    public int f38004r;

    /* renamed from: s */
    public int f38005s;

    /* renamed from: t */
    public int f38006t;

    /* renamed from: u */
    public int f38007u;

    /* renamed from: v */
    public int f38008v;

    /* renamed from: w */
    public int f38009w;

    /* renamed from: x */
    public int f38010x;

    /* renamed from: y */
    public boolean f38011y;

    /* renamed from: z */
    public boolean f38012z;

    /* renamed from: com.triggertrap.seekarc.SeekArc$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4185a {
        /* renamed from: a */
        void mo2a(SeekArc seekArc);

        /* renamed from: b */
        void mo1b(SeekArc seekArc);

        /* renamed from: c */
        void mo0c(SeekArc seekArc, int i, boolean z);
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38002p = -90;
        this.f38004r = 100;
        this.f38005s = 0;
        this.f38006t = 4;
        this.f38007u = 2;
        this.f38008v = 0;
        this.f38009w = 360;
        this.f38010x = 0;
        this.f38011y = false;
        this.f38012z = true;
        this.f37989A = true;
        this.f37990B = 0;
        this.f37991C = 0.0f;
        this.f37992D = new RectF();
        m10d(context, attributeSet, R.attr.seekArcStyle);
    }

    /* renamed from: a */
    public final int m13a(double d) {
        double m3k = m3k();
        Double.isNaN(m3k);
        int round = (int) Math.round(m3k * d);
        if (round < 0) {
            round = f37988O;
        }
        return round > this.f38004r ? f37988O : round;
    }

    /* renamed from: b */
    public final double m12b(float f, float f2) {
        float f3 = f - this.f37995G;
        float f4 = f2 - this.f37996H;
        if (!this.f37989A) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.f38010x));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        double d = this.f38008v;
        Double.isNaN(d);
        return degrees - d;
    }

    /* renamed from: c */
    public final boolean m11c(float f, float f2) {
        float f3 = f - this.f37995G;
        float f4 = f2 - this.f37996H;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.f38000L;
    }

    /* renamed from: d */
    public final void m10d(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = resources.getColor(R.color.progress_gray);
        int color2 = resources.getColor(17170450);
        this.f38003q = resources.getDrawable(R.drawable.seek_arc_control_selector);
        this.f38006t = (int) (this.f38006t * f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u21.f28475u1, i, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(11);
            if (drawable != null) {
                this.f38003q = drawable;
            }
            int intrinsicHeight = this.f38003q.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.f38003q.getIntrinsicWidth() / 2;
            this.f38003q.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            this.f38004r = obtainStyledAttributes.getInteger(3, this.f38004r);
            this.f38005s = obtainStyledAttributes.getInteger(4, this.f38005s);
            this.f38006t = (int) obtainStyledAttributes.getDimension(6, this.f38006t);
            this.f38007u = (int) obtainStyledAttributes.getDimension(1, this.f38007u);
            this.f38008v = obtainStyledAttributes.getInt(9, this.f38008v);
            this.f38009w = obtainStyledAttributes.getInt(10, this.f38009w);
            this.f38010x = obtainStyledAttributes.getInt(7, this.f38010x);
            this.f38011y = obtainStyledAttributes.getBoolean(8, this.f38011y);
            this.f38012z = obtainStyledAttributes.getBoolean(13, this.f38012z);
            this.f37989A = obtainStyledAttributes.getBoolean(2, this.f37989A);
            color = obtainStyledAttributes.getColor(0, color);
            color2 = obtainStyledAttributes.getColor(5, color2);
            obtainStyledAttributes.recycle();
        }
        int i2 = this.f38005s;
        int i3 = this.f38004r;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f38005s = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f38005s = i2;
        int i4 = this.f38009w;
        if (i4 > 360) {
            i4 = 360;
        }
        this.f38009w = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.f38009w = i4;
        int i5 = this.f38008v;
        if (i5 > 360) {
            i5 = 0;
        }
        this.f38008v = i5;
        this.f38008v = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.f37993E = paint;
        paint.setColor(color);
        this.f37993E.setAntiAlias(true);
        this.f37993E.setStyle(Paint.Style.STROKE);
        this.f37993E.setStrokeWidth(this.f38007u);
        Paint paint2 = new Paint();
        this.f37994F = paint2;
        paint2.setColor(color2);
        this.f37994F.setAntiAlias(true);
        this.f37994F.setStyle(Paint.Style.STROKE);
        this.f37994F.setStrokeWidth(this.f38006t);
        if (this.f38011y) {
            this.f37993E.setStrokeCap(Paint.Cap.ROUND);
            this.f37994F.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f38003q;
        if (drawable != null && drawable.isStateful()) {
            this.f38003q.setState(getDrawableState());
        }
        invalidate();
    }

    /* renamed from: e */
    public final void m9e(int i, boolean z) {
        m5i(i, z);
    }

    /* renamed from: f */
    public final void m8f() {
        InterfaceC4185a interfaceC4185a = this.f38001M;
        if (interfaceC4185a != null) {
            interfaceC4185a.mo2a(this);
        }
    }

    /* renamed from: g */
    public final void m7g() {
        InterfaceC4185a interfaceC4185a = this.f38001M;
        if (interfaceC4185a != null) {
            interfaceC4185a.mo1b(this);
        }
    }

    public int getArcRotation() {
        return this.f38010x;
    }

    public int getArcWidth() {
        return this.f38007u;
    }

    public int getProgressWidth() {
        return this.f38006t;
    }

    public int getStartAngle() {
        return this.f38008v;
    }

    public int getSweepAngle() {
        return this.f38009w;
    }

    /* renamed from: h */
    public final void m6h(MotionEvent motionEvent) {
        if (m11c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double m12b = m12b(motionEvent.getX(), motionEvent.getY());
        this.f37999K = m12b;
        m9e(m13a(m12b), true);
    }

    /* renamed from: i */
    public final void m5i(int i, boolean z) {
        if (i == f37988O) {
            return;
        }
        InterfaceC4185a interfaceC4185a = this.f38001M;
        if (interfaceC4185a != null) {
            interfaceC4185a.mo0c(this, i, z);
        }
        int i2 = this.f38004r;
        if (i > i2) {
            i = i2;
        }
        if (this.f38005s < 0) {
            i = 0;
        }
        this.f38005s = i;
        this.f37991C = (i / i2) * this.f38009w;
        m4j();
        invalidate();
    }

    /* renamed from: j */
    public final void m4j() {
        double d = this.f37990B;
        double d2 = (int) (this.f38008v + this.f37991C + this.f38010x + 90.0f);
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.f37997I = (int) (d * cos);
        double d3 = this.f37990B;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.f37998J = (int) (d3 * sin);
    }

    /* renamed from: k */
    public final float m3k() {
        return this.f38004r / this.f38009w;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f37989A) {
            canvas.scale(-1.0f, 1.0f, this.f37992D.centerX(), this.f37992D.centerY());
        }
        float f = (this.f38008v - 90) + this.f38010x;
        canvas.drawArc(this.f37992D, f, this.f38009w, false, this.f37993E);
        canvas.drawArc(this.f37992D, f, this.f37991C, false, this.f37994F);
        canvas.translate(this.f37995G - this.f37997I, this.f37996H - this.f37998J);
        this.f38003q.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int min = Math.min(defaultSize2, defaultSize);
        this.f37995G = (int) (defaultSize2 * 0.5f);
        this.f37996H = (int) (defaultSize * 0.5f);
        int paddingLeft = min - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.f37990B = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.f37992D.set(f2, f, f2 + f3, f3 + f);
        double d = this.f37990B;
        double d2 = ((int) this.f37991C) + this.f38008v + this.f38010x + 90;
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.f37997I = (int) (d * cos);
        double d3 = this.f37990B;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.f37998J = (int) (d3 * sin);
        setTouchInSide(this.f38012z);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                }
            }
            m7g();
            setPressed(false);
            return true;
        }
        m8f();
        m6h(motionEvent);
        return true;
    }

    public void setArcRotation(int i) {
        this.f38010x = i;
        m4j();
    }

    public void setArcWidth(int i) {
        this.f38007u = i;
        this.f37993E.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.f37989A = z;
    }

    public void setOnSeekArcChangeListener(InterfaceC4185a interfaceC4185a) {
        this.f38001M = interfaceC4185a;
    }

    public void setProgress(int i) {
        m5i(i, false);
    }

    public void setProgressWidth(int i) {
        this.f38006t = i;
        this.f37994F.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        Paint paint;
        Paint.Cap cap;
        this.f38011y = z;
        if (z) {
            this.f37993E.setStrokeCap(Paint.Cap.ROUND);
            paint = this.f37994F;
            cap = Paint.Cap.ROUND;
        } else {
            this.f37993E.setStrokeCap(Paint.Cap.SQUARE);
            paint = this.f37994F;
            cap = Paint.Cap.SQUARE;
        }
        paint.setStrokeCap(cap);
    }

    public void setStartAngle(int i) {
        this.f38008v = i;
        m4j();
    }

    public void setSweepAngle(int i) {
        this.f38009w = i;
        m4j();
    }

    public void setTouchInSide(boolean z) {
        int intrinsicHeight = this.f38003q.getIntrinsicHeight() / 2;
        int intrinsicWidth = this.f38003q.getIntrinsicWidth() / 2;
        this.f38012z = z;
        this.f38000L = z ? this.f37990B / 4.0f : this.f37990B - Math.min(intrinsicWidth, intrinsicHeight);
    }
}
