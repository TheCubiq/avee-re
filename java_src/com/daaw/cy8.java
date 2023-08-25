package com.daaw;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzxk;
import java.util.Objects;
/* loaded from: classes.dex */
public final class cy8 {

    /* renamed from: a */
    public final ox8 f6280a = new ox8();

    /* renamed from: b */
    public final yx8 f6281b;

    /* renamed from: c */
    public final by8 f6282c;

    /* renamed from: d */
    public boolean f6283d;

    /* renamed from: e */
    public Surface f6284e;

    /* renamed from: f */
    public float f6285f;

    /* renamed from: g */
    public float f6286g;

    /* renamed from: h */
    public float f6287h;

    /* renamed from: i */
    public float f6288i;

    /* renamed from: j */
    public int f6289j;

    /* renamed from: k */
    public long f6290k;

    /* renamed from: l */
    public long f6291l;

    /* renamed from: m */
    public long f6292m;

    /* renamed from: n */
    public long f6293n;

    /* renamed from: o */
    public long f6294o;

    /* renamed from: p */
    public long f6295p;

    /* renamed from: q */
    public long f6296q;

    public cy8(Context context) {
        yx8 yx8Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = it5.f13991a;
            yx8Var = ay8.m26599b(applicationContext);
            if (yx8Var == null) {
                yx8Var = zx8.m1795b(applicationContext);
            }
        } else {
            yx8Var = null;
        }
        this.f6281b = yx8Var;
        this.f6282c = yx8Var != null ? by8.m25728a() : null;
        this.f6290k = -9223372036854775807L;
        this.f6291l = -9223372036854775807L;
        this.f6285f = -1.0f;
        this.f6288i = 1.0f;
        this.f6289j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m24880b(cy8 cy8Var, Display display) {
        long j;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j2 = (long) (1.0E9d / refreshRate);
            cy8Var.f6290k = j2;
            j = (j2 * 80) / 100;
        } else {
            s95.m10493e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            cy8Var.f6290k = -9223372036854775807L;
        }
        cy8Var.f6291l = j;
    }

    /* renamed from: a */
    public final long m24881a(long j) {
        long j2;
        if (this.f6295p != -1 && this.f6280a.m13876g()) {
            long m13880c = this.f6296q + (((float) (this.f6280a.m13880c() * (this.f6292m - this.f6295p))) / this.f6288i);
            if (Math.abs(j - m13880c) <= 20000000) {
                j = m13880c;
            } else {
                m24870l();
            }
        }
        this.f6293n = this.f6292m;
        this.f6294o = j;
        by8 by8Var = this.f6282c;
        if (by8Var == null || this.f6290k == -9223372036854775807L) {
            return j;
        }
        long j3 = by8Var.f5280p;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f6290k;
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
        return j5 - this.f6291l;
    }

    /* renamed from: c */
    public final void m24879c(float f) {
        this.f6285f = f;
        this.f6280a.m13877f();
        m24869m();
    }

    /* renamed from: d */
    public final void m24878d(long j) {
        long j2 = this.f6293n;
        if (j2 != -1) {
            this.f6295p = j2;
            this.f6296q = this.f6294o;
        }
        this.f6292m++;
        this.f6280a.m13878e(j * 1000);
        m24869m();
    }

    /* renamed from: e */
    public final void m24877e(float f) {
        this.f6288i = f;
        m24870l();
        m24868n(false);
    }

    /* renamed from: f */
    public final void m24876f() {
        m24870l();
    }

    /* renamed from: g */
    public final void m24875g() {
        this.f6283d = true;
        m24870l();
        if (this.f6281b != null) {
            by8 by8Var = this.f6282c;
            Objects.requireNonNull(by8Var);
            by8Var.m25727b();
            this.f6281b.mo1796a(new wx8(this));
        }
        m24868n(false);
    }

    /* renamed from: h */
    public final void m24874h() {
        this.f6283d = false;
        yx8 yx8Var = this.f6281b;
        if (yx8Var != null) {
            yx8Var.zza();
            by8 by8Var = this.f6282c;
            Objects.requireNonNull(by8Var);
            by8Var.m25726c();
        }
        m24871k();
    }

    /* renamed from: i */
    public final void m24873i(Surface surface) {
        if (true == (surface instanceof zzxk)) {
            surface = null;
        }
        if (this.f6284e == surface) {
            return;
        }
        m24871k();
        this.f6284e = surface;
        m24868n(true);
    }

    /* renamed from: j */
    public final void m24872j(int i) {
        if (this.f6289j == i) {
            return;
        }
        this.f6289j = i;
        m24868n(true);
    }

    /* renamed from: k */
    public final void m24871k() {
        Surface surface;
        if (it5.f13991a < 30 || (surface = this.f6284e) == null || this.f6289j == Integer.MIN_VALUE || this.f6287h == 0.0f) {
            return;
        }
        this.f6287h = 0.0f;
        xx8.m4412a(surface, 0.0f);
    }

    /* renamed from: l */
    public final void m24870l() {
        this.f6292m = 0L;
        this.f6295p = -1L;
        this.f6293n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.f6286g) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r9.f6280a.m13881b() >= 30) goto L24;
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
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24869m() {
        if (it5.f13991a < 30 || this.f6284e == null) {
            return;
        }
        float m13882a = this.f6280a.m13876g() ? this.f6280a.m13882a() : this.f6285f;
        float f = this.f6286g;
        if (m13882a == f) {
            return;
        }
        boolean z = true;
        if (m13882a != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.f6280a.m13876g() && this.f6280a.m13879d() >= 5000000000L) {
                f2 = 0.02f;
            }
        } else if (m13882a == -1.0f) {
        }
        this.f6286g = m13882a;
        m24868n(false);
    }

    /* renamed from: n */
    public final void m24868n(boolean z) {
        Surface surface;
        if (it5.f13991a < 30 || (surface = this.f6284e) == null || this.f6289j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.f6283d) {
            float f2 = this.f6286g;
            if (f2 != -1.0f) {
                f = this.f6288i * f2;
            }
        }
        if (z || this.f6287h != f) {
            this.f6287h = f;
            xx8.m4412a(surface, f);
        }
    }
}
