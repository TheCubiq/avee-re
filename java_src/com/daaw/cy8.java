package com.daaw;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzxk;
import java.util.Objects;
/* loaded from: classes.dex */
public final class cy8 {
    public final ox8 a = new ox8();
    public final yx8 b;
    public final by8 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public cy8(Context context) {
        yx8 yx8Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = it5.a;
            yx8Var = ay8.b(applicationContext);
            if (yx8Var == null) {
                yx8Var = zx8.b(applicationContext);
            }
        } else {
            yx8Var = null;
        }
        this.b = yx8Var;
        this.c = yx8Var != null ? by8.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void b(cy8 cy8Var, Display display) {
        long j;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j2 = (long) (1.0E9d / refreshRate);
            cy8Var.k = j2;
            j = (j2 * 80) / 100;
        } else {
            s95.e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            cy8Var.k = -9223372036854775807L;
        }
        cy8Var.l = j;
    }

    public final long a(long j) {
        long j2;
        if (this.p != -1 && this.a.g()) {
            long c = this.q + (((float) (this.a.c() * (this.m - this.p))) / this.i);
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                l();
            }
        }
        this.n = this.m;
        this.o = j;
        by8 by8Var = this.c;
        if (by8Var == null || this.k == -9223372036854775807L) {
            return j;
        }
        long j3 = by8Var.p;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.l;
    }

    public final void c(float f) {
        this.f = f;
        this.a.f();
        m();
    }

    public final void d(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.e(j * 1000);
        m();
    }

    public final void e(float f) {
        this.i = f;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.d = true;
        l();
        if (this.b != null) {
            by8 by8Var = this.c;
            Objects.requireNonNull(by8Var);
            by8Var.b();
            this.b.a(new wx8(this));
        }
        n(false);
    }

    public final void h() {
        this.d = false;
        yx8 yx8Var = this.b;
        if (yx8Var != null) {
            yx8Var.zza();
            by8 by8Var = this.c;
            Objects.requireNonNull(by8Var);
            by8Var.c();
        }
        k();
    }

    public final void i(Surface surface) {
        if (true == (surface instanceof zzxk)) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        k();
        this.e = surface;
        n(true);
    }

    public final void j(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        n(true);
    }

    public final void k() {
        Surface surface;
        if (it5.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        xx8.a(surface, 0.0f);
    }

    public final void l() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.g) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r9.a.b() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r9 = this;
            int r0 = com.daaw.it5.a
            r1 = 30
            if (r0 < r1) goto L6f
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lb
            goto L6f
        Lb:
            com.daaw.ox8 r0 = r9.a
            boolean r0 = r0.g()
            if (r0 == 0) goto L1a
            com.daaw.ox8 r0 = r9.a
            float r0 = r0.a()
            goto L1c
        L1a:
            float r0 = r9.f
        L1c:
            float r2 = r9.g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L58
            com.daaw.ox8 r1 = r9.a
            boolean r1 = r1.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.daaw.ox8 r1 = r9.a
            long r5 = r1.d()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L65
            goto L66
        L58:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            com.daaw.ox8 r2 = r9.a
            int r2 = r2.b()
            if (r2 < r1) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L69
            goto L6a
        L69:
            return
        L6a:
            r9.g = r0
            r9.n(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cy8.m():void");
    }

    public final void n(boolean z) {
        Surface surface;
        if (it5.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (z || this.h != f) {
            this.h = f;
            xx8.a(surface, f);
        }
    }
}
