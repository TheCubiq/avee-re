package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
/* loaded from: classes.dex */
public final class ro0 {

    /* renamed from: a */
    public final qo0 f25434a;

    /* renamed from: b */
    public final Object f25435b;

    /* renamed from: c */
    public final d81[] f25436c;

    /* renamed from: d */
    public final boolean[] f25437d;

    /* renamed from: e */
    public long f25438e;

    /* renamed from: f */
    public boolean f25439f;

    /* renamed from: g */
    public boolean f25440g;

    /* renamed from: h */
    public so0 f25441h;

    /* renamed from: i */
    public ro0 f25442i;

    /* renamed from: j */
    public TrackGroupArray f25443j;

    /* renamed from: k */
    public xm1 f25444k;

    /* renamed from: l */
    public final b41[] f25445l;

    /* renamed from: m */
    public final wm1 f25446m;

    /* renamed from: n */
    public final bp0 f25447n;

    /* renamed from: o */
    public xm1 f25448o;

    public ro0(b41[] b41VarArr, long j, wm1 wm1Var, InterfaceC2006l2 interfaceC2006l2, bp0 bp0Var, Object obj, so0 so0Var) {
        this.f25445l = b41VarArr;
        this.f25438e = j - so0Var.f26442b;
        this.f25446m = wm1Var;
        this.f25447n = bp0Var;
        this.f25435b = C2914s6.m10686e(obj);
        this.f25441h = so0Var;
        this.f25436c = new d81[b41VarArr.length];
        this.f25437d = new boolean[b41VarArr.length];
        qo0 mo16118g = bp0Var.mo16118g(so0Var.f26441a, interfaceC2006l2);
        long j2 = so0Var.f26443c;
        this.f25434a = j2 != Long.MIN_VALUE ? new C3704yf(mo16118g, true, 0L, j2) : mo16118g;
    }

    /* renamed from: a */
    public long m11125a(long j, boolean z) {
        return m11124b(j, z, new boolean[this.f25445l.length]);
    }

    /* renamed from: b */
    public long m11124b(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            xm1 xm1Var = this.f25444k;
            boolean z2 = true;
            if (i >= xm1Var.f32791a) {
                break;
            }
            boolean[] zArr2 = this.f25437d;
            if (z || !xm1Var.m5005b(this.f25448o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m11120f(this.f25436c);
        m11108r(this.f25444k);
        um1 um1Var = this.f25444k.f32793c;
        long mo2080i = this.f25434a.mo2080i(um1Var.m8018b(), this.f25437d, this.f25436c, zArr, j);
        m11123c(this.f25436c);
        this.f25440g = false;
        int i2 = 0;
        while (true) {
            d81[] d81VarArr = this.f25436c;
            if (i2 >= d81VarArr.length) {
                return mo2080i;
            }
            if (d81VarArr[i2] != null) {
                C2914s6.m10685f(this.f25444k.m5004c(i2));
                if (this.f25445l[i2].mo5361i() != 5) {
                    this.f25440g = true;
                }
            } else {
                C2914s6.m10685f(um1Var.m8019a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m11123c(d81[] d81VarArr) {
        int i = 0;
        while (true) {
            b41[] b41VarArr = this.f25445l;
            if (i >= b41VarArr.length) {
                return;
            }
            if (b41VarArr[i].mo5361i() == 5 && this.f25444k.m5004c(i)) {
                d81VarArr[i] = new C2985sw();
            }
            i++;
        }
    }

    /* renamed from: d */
    public void m11122d(long j) {
        this.f25434a.mo2086c(m11110p(j));
    }

    /* renamed from: e */
    public final void m11121e(xm1 xm1Var) {
        for (int i = 0; i < xm1Var.f32791a; i++) {
            boolean m5004c = xm1Var.m5004c(i);
            InterfaceC3970c m8019a = xm1Var.f32793c.m8019a(i);
            if (m5004c && m8019a != null) {
                m8019a.mo1528g();
            }
        }
    }

    /* renamed from: f */
    public final void m11120f(d81[] d81VarArr) {
        int i = 0;
        while (true) {
            b41[] b41VarArr = this.f25445l;
            if (i >= b41VarArr.length) {
                return;
            }
            if (b41VarArr[i].mo5361i() == 5) {
                d81VarArr[i] = null;
            }
            i++;
        }
    }

    /* renamed from: g */
    public final void m11119g(xm1 xm1Var) {
        for (int i = 0; i < xm1Var.f32791a; i++) {
            boolean m5004c = xm1Var.m5004c(i);
            InterfaceC3970c m8019a = xm1Var.f32793c.m8019a(i);
            if (m5004c && m8019a != null) {
                m8019a.mo1530e();
            }
        }
    }

    /* renamed from: h */
    public long m11118h(boolean z) {
        if (this.f25439f) {
            long mo2083f = this.f25434a.mo2083f();
            return (mo2083f == Long.MIN_VALUE && z) ? this.f25441h.f26445e : mo2083f;
        }
        return this.f25441h.f26442b;
    }

    /* renamed from: i */
    public long m11117i() {
        if (this.f25439f) {
            return this.f25434a.mo2087b();
        }
        return 0L;
    }

    /* renamed from: j */
    public long m11116j() {
        return this.f25438e;
    }

    /* renamed from: k */
    public void m11115k(float f) {
        this.f25439f = true;
        this.f25443j = this.f25434a.mo2072s();
        m11111o(f);
        long m11125a = m11125a(this.f25441h.f26442b, false);
        long j = this.f25438e;
        so0 so0Var = this.f25441h;
        this.f25438e = j + (so0Var.f26442b - m11125a);
        this.f25441h = so0Var.m10128b(m11125a);
    }

    /* renamed from: l */
    public boolean m11114l() {
        return this.f25439f && (!this.f25440g || this.f25434a.mo2083f() == Long.MIN_VALUE);
    }

    /* renamed from: m */
    public void m11113m(long j) {
        if (this.f25439f) {
            this.f25434a.mo2082g(m11110p(j));
        }
    }

    /* renamed from: n */
    public void m11112n() {
        bp0 bp0Var;
        qo0 qo0Var;
        m11108r(null);
        try {
            if (this.f25441h.f26443c != Long.MIN_VALUE) {
                bp0Var = this.f25447n;
                qo0Var = ((C3704yf) this.f25434a).f33614p;
            } else {
                bp0Var = this.f25447n;
                qo0Var = this.f25434a;
            }
            bp0Var.mo16120a(qo0Var);
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: o */
    public boolean m11111o(float f) {
        InterfaceC3970c[] m8018b;
        xm1 mo1547c = this.f25446m.mo1547c(this.f25445l, this.f25443j);
        if (mo1547c.m5006a(this.f25448o)) {
            return false;
        }
        this.f25444k = mo1547c;
        for (InterfaceC3970c interfaceC3970c : mo1547c.f32793c.m8018b()) {
            if (interfaceC3970c != null) {
                interfaceC3970c.mo1522m(f);
            }
        }
        return true;
    }

    /* renamed from: p */
    public long m11110p(long j) {
        return j - m11116j();
    }

    /* renamed from: q */
    public long m11109q(long j) {
        return j + m11116j();
    }

    /* renamed from: r */
    public final void m11108r(xm1 xm1Var) {
        xm1 xm1Var2 = this.f25448o;
        if (xm1Var2 != null) {
            m11121e(xm1Var2);
        }
        this.f25448o = xm1Var;
        if (xm1Var != null) {
            m11119g(xm1Var);
        }
    }
}
