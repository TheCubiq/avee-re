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

    /* renamed from: A */
    public final int f37833A;

    /* renamed from: B */
    public float f37834B;

    /* renamed from: C */
    public boolean f37835C;

    /* renamed from: D */
    public InterfaceC4161c f37836D;

    /* renamed from: E */
    public double f37837E;

    /* renamed from: F */
    public int f37838F;

    /* renamed from: p */
    public ValueAnimator f37839p;

    /* renamed from: q */
    public boolean f37840q;

    /* renamed from: r */
    public float f37841r;

    /* renamed from: s */
    public float f37842s;

    /* renamed from: t */
    public boolean f37843t;

    /* renamed from: u */
    public int f37844u;

    /* renamed from: v */
    public final List<InterfaceC4162d> f37845v;

    /* renamed from: w */
    public final int f37846w;

    /* renamed from: x */
    public final float f37847x;

    /* renamed from: y */
    public final Paint f37848y;

    /* renamed from: z */
    public final RectF f37849z;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes2.dex */
    public class C4159a implements ValueAnimator.AnimatorUpdateListener {
        public C4159a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m148m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes2.dex */
    public class C4160b extends AnimatorListenerAdapter {
        public C4160b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4161c {
        /* renamed from: a */
        void m147a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4162d {
        /* renamed from: a */
        void mo146a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37845v = new ArrayList();
        Paint paint = new Paint();
        this.f37848y = paint;
        this.f37849z = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18113P0, i, k21.Widget_MaterialComponents_TimePicker_Clock);
        this.f37838F = obtainStyledAttributes.getDimensionPixelSize(m21.f18127R0, 0);
        this.f37846w = obtainStyledAttributes.getDimensionPixelSize(m21.f18134S0, 0);
        Resources resources = getResources();
        this.f37833A = resources.getDimensionPixelSize(f11.material_clock_hand_stroke_width);
        this.f37847x = resources.getDimensionPixelSize(f11.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(m21.f18120Q0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m150k(0.0f);
        this.f37844u = ViewConfiguration.get(context).getScaledTouchSlop();
        xs1.m4773B0(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void m159b(InterfaceC4162d interfaceC4162d) {
        this.f37845v.add(interfaceC4162d);
    }

    /* renamed from: c */
    public final void m158c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f37848y.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f37838F * ((float) Math.cos(this.f37837E))) + width2, (this.f37838F * ((float) Math.sin(this.f37837E))) + f, this.f37846w, this.f37848y);
        double sin = Math.sin(this.f37837E);
        double cos = Math.cos(this.f37837E);
        Double.isNaN(r6);
        Double.isNaN(r6);
        this.f37848y.setStrokeWidth(this.f37833A);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f37848y);
        canvas.drawCircle(width2, f, this.f37847x, this.f37848y);
    }

    /* renamed from: d */
    public RectF m157d() {
        return this.f37849z;
    }

    /* renamed from: e */
    public final int m156e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: f */
    public float m155f() {
        return this.f37834B;
    }

    /* renamed from: g */
    public int m154g() {
        return this.f37846w;
    }

    /* renamed from: h */
    public final Pair<Float, Float> m153h(float f) {
        float m155f = m155f();
        if (Math.abs(m155f - f) > 180.0f) {
            if (m155f > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m155f < 180.0f && f > 180.0f) {
                m155f += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m155f), Float.valueOf(f));
    }

    /* renamed from: i */
    public final boolean m152i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float m156e = m156e(f, f2);
        boolean z4 = false;
        boolean z5 = m155f() != m156e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.f37840q) {
                z4 = true;
            }
            m149l(m156e, z4);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m151j(int i) {
        this.f37838F = i;
        invalidate();
    }

    /* renamed from: k */
    public void m150k(float f) {
        m149l(f, false);
    }

    /* renamed from: l */
    public void m149l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f37839p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m148m(f, false);
            return;
        }
        Pair<Float, Float> m153h = m153h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m153h.first).floatValue(), ((Float) m153h.second).floatValue());
        this.f37839p = ofFloat;
        ofFloat.setDuration(200L);
        this.f37839p.addUpdateListener(new C4159a());
        this.f37839p.addListener(new C4160b());
        this.f37839p.start();
    }

    /* renamed from: m */
    public final void m148m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f37834B = f2;
        this.f37837E = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.f37838F * ((float) Math.cos(this.f37837E)));
        float height = (getHeight() / 2) + (this.f37838F * ((float) Math.sin(this.f37837E)));
        RectF rectF = this.f37849z;
        int i = this.f37846w;
        rectF.set(width - i, height - i, width + i, height + i);
        for (InterfaceC4162d interfaceC4162d : this.f37845v) {
            interfaceC4162d.mo146a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m158c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m150k(m155f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC4161c interfaceC4161c;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f37841r);
                int i2 = (int) (y - this.f37842s);
                this.f37843t = (i * i) + (i2 * i2) > this.f37844u;
                boolean z4 = this.f37835C;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.f37841r = x;
            this.f37842s = y;
            this.f37843t = true;
            this.f37835C = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean m152i = m152i(x, y, z2, z3, z) | this.f37835C;
        this.f37835C = m152i;
        if (m152i && z && (interfaceC4161c = this.f37836D) != null) {
            interfaceC4161c.m147a(m156e(x, y), this.f37843t);
        }
        return true;
    }
}
