package com.daaw;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* renamed from: com.daaw.w7 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC3402w7 implements View.OnTouchListener {

    /* renamed from: G */
    public static final int f30936G = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    public boolean f30937A;

    /* renamed from: B */
    public boolean f30938B;

    /* renamed from: C */
    public boolean f30939C;

    /* renamed from: D */
    public boolean f30940D;

    /* renamed from: E */
    public boolean f30941E;

    /* renamed from: F */
    public boolean f30942F;

    /* renamed from: r */
    public final View f30945r;

    /* renamed from: s */
    public Runnable f30946s;

    /* renamed from: v */
    public int f30949v;

    /* renamed from: w */
    public int f30950w;

    /* renamed from: p */
    public final C3403a f30943p = new C3403a();

    /* renamed from: q */
    public final Interpolator f30944q = new AccelerateInterpolator();

    /* renamed from: t */
    public float[] f30947t = {0.0f, 0.0f};

    /* renamed from: u */
    public float[] f30948u = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: x */
    public float[] f30951x = {0.0f, 0.0f};

    /* renamed from: y */
    public float[] f30952y = {0.0f, 0.0f};

    /* renamed from: z */
    public float[] f30953z = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: com.daaw.w7$a */
    /* loaded from: classes.dex */
    public static class C3403a {

        /* renamed from: a */
        public int f30954a;

        /* renamed from: b */
        public int f30955b;

        /* renamed from: c */
        public float f30956c;

        /* renamed from: d */
        public float f30957d;

        /* renamed from: j */
        public float f30963j;

        /* renamed from: k */
        public int f30964k;

        /* renamed from: e */
        public long f30958e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f30962i = -1;

        /* renamed from: f */
        public long f30959f = 0;

        /* renamed from: g */
        public int f30960g = 0;

        /* renamed from: h */
        public int f30961h = 0;

        /* renamed from: a */
        public void m6492a() {
            if (this.f30959f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m6486g = m6486g(m6488e(currentAnimationTimeMillis));
            this.f30959f = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f30959f)) * m6486g;
            this.f30960g = (int) (this.f30956c * f);
            this.f30961h = (int) (f * this.f30957d);
        }

        /* renamed from: b */
        public int m6491b() {
            return this.f30960g;
        }

        /* renamed from: c */
        public int m6490c() {
            return this.f30961h;
        }

        /* renamed from: d */
        public int m6489d() {
            float f = this.f30956c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float m6488e(long j) {
            long j2 = this.f30958e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f30962i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC3402w7.m6510e(((float) (j - j2)) / this.f30954a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f30963j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC3402w7.m6510e(((float) (j - j3)) / this.f30964k, 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int m6487f() {
            float f = this.f30957d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float m6486g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean m6485h() {
            return this.f30962i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f30962i + ((long) this.f30964k);
        }

        /* renamed from: i */
        public void m6484i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f30964k = AbstractView$OnTouchListenerC3402w7.m6509f((int) (currentAnimationTimeMillis - this.f30958e), 0, this.f30955b);
            this.f30963j = m6488e(currentAnimationTimeMillis);
            this.f30962i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m6483j(int i) {
            this.f30955b = i;
        }

        /* renamed from: k */
        public void m6482k(int i) {
            this.f30954a = i;
        }

        /* renamed from: l */
        public void m6481l(float f, float f2) {
            this.f30956c = f;
            this.f30957d = f2;
        }

        /* renamed from: m */
        public void m6480m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f30958e = currentAnimationTimeMillis;
            this.f30962i = -1L;
            this.f30959f = currentAnimationTimeMillis;
            this.f30963j = 0.5f;
            this.f30960g = 0;
            this.f30961h = 0;
        }
    }

    /* renamed from: com.daaw.w7$b */
    /* loaded from: classes.dex */
    public class RunnableC3404b implements Runnable {
        public RunnableC3404b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC3402w7 abstractView$OnTouchListenerC3402w7 = AbstractView$OnTouchListenerC3402w7.this;
            if (abstractView$OnTouchListenerC3402w7.f30940D) {
                if (abstractView$OnTouchListenerC3402w7.f30938B) {
                    abstractView$OnTouchListenerC3402w7.f30938B = false;
                    abstractView$OnTouchListenerC3402w7.f30943p.m6480m();
                }
                C3403a c3403a = AbstractView$OnTouchListenerC3402w7.this.f30943p;
                if (c3403a.m6485h() || !AbstractView$OnTouchListenerC3402w7.this.m6494v()) {
                    AbstractView$OnTouchListenerC3402w7.this.f30940D = false;
                    return;
                }
                AbstractView$OnTouchListenerC3402w7 abstractView$OnTouchListenerC3402w72 = AbstractView$OnTouchListenerC3402w7.this;
                if (abstractView$OnTouchListenerC3402w72.f30939C) {
                    abstractView$OnTouchListenerC3402w72.f30939C = false;
                    abstractView$OnTouchListenerC3402w72.m6512c();
                }
                c3403a.m6492a();
                AbstractView$OnTouchListenerC3402w7.this.mo6505j(c3403a.m6491b(), c3403a.m6490c());
                xs1.m4718j0(AbstractView$OnTouchListenerC3402w7.this.f30945r, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC3402w7(View view) {
        this.f30945r = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m6500o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m6499p(f3, f3);
        m6503l(1);
        m6501n(Float.MAX_VALUE, Float.MAX_VALUE);
        m6496t(0.2f, 0.2f);
        m6495u(1.0f, 1.0f);
        m6504k(f30936G);
        m6497r(500);
        m6498q(500);
    }

    /* renamed from: e */
    public static float m6510e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m6509f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo6514a(int i);

    /* renamed from: b */
    public abstract boolean mo6513b(int i);

    /* renamed from: c */
    public void m6512c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f30945r.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float m6511d(int i, float f, float f2, float f3) {
        float m6507h = m6507h(this.f30947t[i], f2, this.f30948u[i], f);
        if (m6507h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f30951x[i];
        float f5 = this.f30952y[i];
        float f6 = this.f30953z[i];
        float f7 = f4 * f3;
        return m6507h > 0.0f ? m6510e(m6507h * f7, f5, f6) : -m6510e((-m6507h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float m6508g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f30949v;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f30940D && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m6507h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m6510e = m6510e(f * f2, 0.0f, f3);
        float m6508g = m6508g(f2 - f4, m6510e) - m6508g(f4, m6510e);
        if (m6508g < 0.0f) {
            interpolation = -this.f30944q.getInterpolation(-m6508g);
        } else if (m6508g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f30944q.getInterpolation(m6508g);
        }
        return m6510e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m6506i() {
        if (this.f30938B) {
            this.f30940D = false;
        } else {
            this.f30943p.m6484i();
        }
    }

    /* renamed from: j */
    public abstract void mo6505j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC3402w7 m6504k(int i) {
        this.f30950w = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC3402w7 m6503l(int i) {
        this.f30949v = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC3402w7 m6502m(boolean z) {
        if (this.f30941E && !z) {
            m6506i();
        }
        this.f30941E = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC3402w7 m6501n(float f, float f2) {
        float[] fArr = this.f30948u;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC3402w7 m6500o(float f, float f2) {
        float[] fArr = this.f30953z;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f30941E) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            m6506i();
            return this.f30942F && this.f30940D;
        }
        this.f30939C = true;
        this.f30937A = false;
        this.f30943p.m6481l(m6511d(0, motionEvent.getX(), view.getWidth(), this.f30945r.getWidth()), m6511d(1, motionEvent.getY(), view.getHeight(), this.f30945r.getHeight()));
        if (!this.f30940D && m6494v()) {
            m6493w();
        }
        if (this.f30942F) {
            return false;
        }
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC3402w7 m6499p(float f, float f2) {
        float[] fArr = this.f30952y;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC3402w7 m6498q(int i) {
        this.f30943p.m6483j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC3402w7 m6497r(int i) {
        this.f30943p.m6482k(i);
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC3402w7 m6496t(float f, float f2) {
        float[] fArr = this.f30947t;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: u */
    public AbstractView$OnTouchListenerC3402w7 m6495u(float f, float f2) {
        float[] fArr = this.f30951x;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: v */
    public boolean m6494v() {
        C3403a c3403a = this.f30943p;
        int m6487f = c3403a.m6487f();
        int m6489d = c3403a.m6489d();
        return (m6487f != 0 && mo6513b(m6487f)) || (m6489d != 0 && mo6514a(m6489d));
    }

    /* renamed from: w */
    public final void m6493w() {
        int i;
        if (this.f30946s == null) {
            this.f30946s = new RunnableC3404b();
        }
        this.f30940D = true;
        this.f30938B = true;
        if (this.f30937A || (i = this.f30950w) <= 0) {
            this.f30946s.run();
        } else {
            xs1.m4716k0(this.f30945r, this.f30946s, i);
        }
        this.f30937A = true;
    }
}
