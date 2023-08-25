package com.daaw;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class w7 implements View.OnTouchListener {
    public static final int G = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final View r;
    public Runnable s;
    public int v;
    public int w;
    public final a p = new a();
    public final Interpolator q = new AccelerateInterpolator();
    public float[] t = {0.0f, 0.0f};
    public float[] u = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] x = {0.0f, 0.0f};
    public float[] y = {0.0f, 0.0f};
    public float[] z = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public float j;
        public int k;
        public long e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g = g(e(currentAnimationTimeMillis));
            this.f = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f)) * g;
            this.g = (int) (this.c * f);
            this.h = (int) (f * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public final float e(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j < j3) {
                return w7.e(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (1.0f - f) + (f * w7.e(((float) (j - j3)) / this.k, 0.0f, 1.0f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public final float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = w7.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w7 w7Var = w7.this;
            if (w7Var.D) {
                if (w7Var.B) {
                    w7Var.B = false;
                    w7Var.p.m();
                }
                a aVar = w7.this.p;
                if (aVar.h() || !w7.this.v()) {
                    w7.this.D = false;
                    return;
                }
                w7 w7Var2 = w7.this;
                if (w7Var2.C) {
                    w7Var2.C = false;
                    w7Var2.c();
                }
                aVar.a();
                w7.this.j(aVar.b(), aVar.c());
                xs1.j0(w7.this.r, this);
            }
        }
    }

    public w7(View view) {
        this.r = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        t(0.2f, 0.2f);
        u(1.0f, 1.0f);
        k(G);
        r(500);
        q(500);
    }

    public static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.r.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i, float f, float f2, float f3) {
        float h = h(this.t[i], f2, this.u[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.x[i];
        float f5 = this.y[i];
        float f6 = this.z[i];
        float f7 = f4 * f3;
        return h > 0.0f ? e(h * f7, f5, f6) : -e((-h) * f7, f5, f6);
    }

    public final float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.v;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.D && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float e = e(f * f2, 0.0f, f3);
        float g = g(f2 - f4, e) - g(f4, e);
        if (g < 0.0f) {
            interpolation = -this.q.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.q.getInterpolation(g);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.B) {
            this.D = false;
        } else {
            this.p.i();
        }
    }

    public abstract void j(int i, int i2);

    public w7 k(int i) {
        this.w = i;
        return this;
    }

    public w7 l(int i) {
        this.v = i;
        return this;
    }

    public w7 m(boolean z) {
        if (this.E && !z) {
            i();
        }
        this.E = z;
        return this;
    }

    public w7 n(float f, float f2) {
        float[] fArr = this.u;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public w7 o(float f, float f2) {
        float[] fArr = this.z;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.E
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.C = r2
            r5.A = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.r
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            com.daaw.w7$a r7 = r5.p
            r7.l(r0, r6)
            boolean r6 = r5.D
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.F
            if (r6 == 0) goto L61
            boolean r6 = r5.D
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.w7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public w7 p(float f, float f2) {
        float[] fArr = this.y;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public w7 q(int i) {
        this.p.j(i);
        return this;
    }

    public w7 r(int i) {
        this.p.k(i);
        return this;
    }

    public w7 t(float f, float f2) {
        float[] fArr = this.t;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public w7 u(float f, float f2) {
        float[] fArr = this.x;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean v() {
        a aVar = this.p;
        int f = aVar.f();
        int d = aVar.d();
        return (f != 0 && b(f)) || (d != 0 && a(d));
    }

    public final void w() {
        int i;
        if (this.s == null) {
            this.s = new b();
        }
        this.D = true;
        this.B = true;
        if (this.A || (i = this.w) <= 0) {
            this.s.run();
        } else {
            xs1.k0(this.r, this.s, i);
        }
        this.A = true;
    }
}
