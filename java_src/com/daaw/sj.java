package com.daaw;

import android.os.Build;
/* loaded from: classes.dex */
public final class sj {
    public static final sj i = new a().a();
    public qs0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public xk h;

    /* loaded from: classes.dex */
    public static final class a {
        public boolean a = false;
        public boolean b = false;
        public qs0 c = qs0.NOT_REQUIRED;
        public boolean d = false;
        public boolean e = false;
        public long f = -1;
        public long g = -1;
        public xk h = new xk();

        public sj a() {
            return new sj(this);
        }

        public a b(qs0 qs0Var) {
            this.c = qs0Var;
            return this;
        }
    }

    public sj() {
        this.a = qs0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new xk();
    }

    public sj(a aVar) {
        this.a = qs0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new xk();
        this.b = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.c = i2 >= 23 && aVar.b;
        this.a = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (i2 >= 24) {
            this.h = aVar.h;
            this.f = aVar.f;
            this.g = aVar.g;
        }
    }

    public sj(sj sjVar) {
        this.a = qs0.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new xk();
        this.b = sjVar.b;
        this.c = sjVar.c;
        this.a = sjVar.a;
        this.d = sjVar.d;
        this.e = sjVar.e;
        this.h = sjVar.h;
    }

    public xk a() {
        return this.h;
    }

    public qs0 b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        return this.h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sj.class != obj.getClass()) {
            return false;
        }
        sj sjVar = (sj) obj;
        if (this.b == sjVar.b && this.c == sjVar.c && this.d == sjVar.d && this.e == sjVar.e && this.f == sjVar.f && this.g == sjVar.g && this.a == sjVar.a) {
            return this.h.equals(sjVar.h);
        }
        return false;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.h.hashCode();
    }

    public boolean i() {
        return this.e;
    }

    public void j(xk xkVar) {
        this.h = xkVar;
    }

    public void k(qs0 qs0Var) {
        this.a = qs0Var;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(long j) {
        this.f = j;
    }

    public void q(long j) {
        this.g = j;
    }
}
