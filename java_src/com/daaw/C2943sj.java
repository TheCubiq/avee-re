package com.daaw;

import android.os.Build;
/* renamed from: com.daaw.sj */
/* loaded from: classes.dex */
public final class C2943sj {

    /* renamed from: i */
    public static final C2943sj f26283i = new C2944a().m10306a();

    /* renamed from: a */
    public qs0 f26284a;

    /* renamed from: b */
    public boolean f26285b;

    /* renamed from: c */
    public boolean f26286c;

    /* renamed from: d */
    public boolean f26287d;

    /* renamed from: e */
    public boolean f26288e;

    /* renamed from: f */
    public long f26289f;

    /* renamed from: g */
    public long f26290g;

    /* renamed from: h */
    public C3552xk f26291h;

    /* renamed from: com.daaw.sj$a */
    /* loaded from: classes.dex */
    public static final class C2944a {

        /* renamed from: a */
        public boolean f26292a = false;

        /* renamed from: b */
        public boolean f26293b = false;

        /* renamed from: c */
        public qs0 f26294c = qs0.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f26295d = false;

        /* renamed from: e */
        public boolean f26296e = false;

        /* renamed from: f */
        public long f26297f = -1;

        /* renamed from: g */
        public long f26298g = -1;

        /* renamed from: h */
        public C3552xk f26299h = new C3552xk();

        /* renamed from: a */
        public C2943sj m10306a() {
            return new C2943sj(this);
        }

        /* renamed from: b */
        public C2944a m10305b(qs0 qs0Var) {
            this.f26294c = qs0Var;
            return this;
        }
    }

    public C2943sj() {
        this.f26284a = qs0.NOT_REQUIRED;
        this.f26289f = -1L;
        this.f26290g = -1L;
        this.f26291h = new C3552xk();
    }

    public C2943sj(C2944a c2944a) {
        this.f26284a = qs0.NOT_REQUIRED;
        this.f26289f = -1L;
        this.f26290g = -1L;
        this.f26291h = new C3552xk();
        this.f26285b = c2944a.f26292a;
        int i = Build.VERSION.SDK_INT;
        this.f26286c = i >= 23 && c2944a.f26293b;
        this.f26284a = c2944a.f26294c;
        this.f26287d = c2944a.f26295d;
        this.f26288e = c2944a.f26296e;
        if (i >= 24) {
            this.f26291h = c2944a.f26299h;
            this.f26289f = c2944a.f26297f;
            this.f26290g = c2944a.f26298g;
        }
    }

    public C2943sj(C2943sj c2943sj) {
        this.f26284a = qs0.NOT_REQUIRED;
        this.f26289f = -1L;
        this.f26290g = -1L;
        this.f26291h = new C3552xk();
        this.f26285b = c2943sj.f26285b;
        this.f26286c = c2943sj.f26286c;
        this.f26284a = c2943sj.f26284a;
        this.f26287d = c2943sj.f26287d;
        this.f26288e = c2943sj.f26288e;
        this.f26291h = c2943sj.f26291h;
    }

    /* renamed from: a */
    public C3552xk m10323a() {
        return this.f26291h;
    }

    /* renamed from: b */
    public qs0 m10322b() {
        return this.f26284a;
    }

    /* renamed from: c */
    public long m10321c() {
        return this.f26289f;
    }

    /* renamed from: d */
    public long m10320d() {
        return this.f26290g;
    }

    /* renamed from: e */
    public boolean m10319e() {
        return this.f26291h.m5038c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2943sj.class != obj.getClass()) {
            return false;
        }
        C2943sj c2943sj = (C2943sj) obj;
        if (this.f26285b == c2943sj.f26285b && this.f26286c == c2943sj.f26286c && this.f26287d == c2943sj.f26287d && this.f26288e == c2943sj.f26288e && this.f26289f == c2943sj.f26289f && this.f26290g == c2943sj.f26290g && this.f26284a == c2943sj.f26284a) {
            return this.f26291h.equals(c2943sj.f26291h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m10318f() {
        return this.f26287d;
    }

    /* renamed from: g */
    public boolean m10317g() {
        return this.f26285b;
    }

    /* renamed from: h */
    public boolean m10316h() {
        return this.f26286c;
    }

    public int hashCode() {
        long j = this.f26289f;
        long j2 = this.f26290g;
        return (((((((((((((this.f26284a.hashCode() * 31) + (this.f26285b ? 1 : 0)) * 31) + (this.f26286c ? 1 : 0)) * 31) + (this.f26287d ? 1 : 0)) * 31) + (this.f26288e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f26291h.hashCode();
    }

    /* renamed from: i */
    public boolean m10315i() {
        return this.f26288e;
    }

    /* renamed from: j */
    public void m10314j(C3552xk c3552xk) {
        this.f26291h = c3552xk;
    }

    /* renamed from: k */
    public void m10313k(qs0 qs0Var) {
        this.f26284a = qs0Var;
    }

    /* renamed from: l */
    public void m10312l(boolean z) {
        this.f26287d = z;
    }

    /* renamed from: m */
    public void m10311m(boolean z) {
        this.f26285b = z;
    }

    /* renamed from: n */
    public void m10310n(boolean z) {
        this.f26286c = z;
    }

    /* renamed from: o */
    public void m10309o(boolean z) {
        this.f26288e = z;
    }

    /* renamed from: p */
    public void m10308p(long j) {
        this.f26289f = j;
    }

    /* renamed from: q */
    public void m10307q(long j) {
        this.f26290g = j;
    }
}
