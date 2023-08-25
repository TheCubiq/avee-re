package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class qy1 {
    public static final String s = ll0.f("WorkSpec");
    public static final v50<List<Object>, List<Object>> t = new a();
    public String a;
    public yx1 b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public sj j;
    public int k;
    public ha l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public zu0 r;

    /* loaded from: classes.dex */
    public class a implements v50<List<Object>, List<Object>> {
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public yx1 b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b != bVar.b) {
                    return false;
                }
                return this.a.equals(bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public qy1(qy1 qy1Var) {
        this.b = yx1.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = sj.i;
        this.l = ha.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = qy1Var.a;
        this.c = qy1Var.c;
        this.b = qy1Var.b;
        this.d = qy1Var.d;
        this.e = new androidx.work.b(qy1Var.e);
        this.f = new androidx.work.b(qy1Var.f);
        this.g = qy1Var.g;
        this.h = qy1Var.h;
        this.i = qy1Var.i;
        this.j = new sj(qy1Var.j);
        this.k = qy1Var.k;
        this.l = qy1Var.l;
        this.m = qy1Var.m;
        this.n = qy1Var.n;
        this.o = qy1Var.o;
        this.p = qy1Var.p;
        this.q = qy1Var.q;
        this.r = qy1Var.r;
    }

    public qy1(String str, String str2) {
        this.b = yx1.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = sj.i;
        this.l = ha.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        if (c()) {
            return this.n + Math.min(18000000L, this.l == ha.LINEAR ? this.m * this.k : Math.scalb((float) this.m, this.k - 1));
        }
        if (!d()) {
            long j = this.n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.n;
        long j3 = j2 == 0 ? currentTimeMillis + this.g : j2;
        long j4 = this.i;
        long j5 = this.h;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (j4 != j5) {
            return j3 + j5 + (i == 0 ? j4 * (-1) : 0L);
        }
        return j3 + (i != 0 ? j5 : 0L);
    }

    public boolean b() {
        return !sj.i.equals(this.j);
    }

    public boolean c() {
        return this.b == yx1.ENQUEUED && this.k > 0;
    }

    public boolean d() {
        return this.h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy1.class != obj.getClass()) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        if (this.g == qy1Var.g && this.h == qy1Var.h && this.i == qy1Var.i && this.k == qy1Var.k && this.m == qy1Var.m && this.n == qy1Var.n && this.o == qy1Var.o && this.p == qy1Var.p && this.q == qy1Var.q && this.a.equals(qy1Var.a) && this.b == qy1Var.b && this.c.equals(qy1Var.c)) {
            String str = this.d;
            if (str == null ? qy1Var.d == null : str.equals(qy1Var.d)) {
                return this.e.equals(qy1Var.e) && this.f.equals(qy1Var.f) && this.j.equals(qy1Var.j) && this.l == qy1Var.l && this.r == qy1Var.r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + this.r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }
}
