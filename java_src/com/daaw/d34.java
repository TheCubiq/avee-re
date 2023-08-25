package com.daaw;
/* loaded from: classes.dex */
public final class d34 {
    public static final th8 h = new th8() { // from class: com.daaw.a24
    };
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public fl4 g = fl4.d;

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b() {
        int i = this.g.a;
        return 0;
    }

    public final int c(long j) {
        return -1;
    }

    public final int d(long j) {
        return -1;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d34.class.equals(obj.getClass())) {
            d34 d34Var = (d34) obj;
            if (it5.t(this.a, d34Var.a) && it5.t(this.b, d34Var.b) && this.c == d34Var.c && this.d == d34Var.d && this.f == d34Var.f && it5.t(this.g, d34Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i, int i2) {
        return this.g.a(i).a(i2);
    }

    public final long g(int i, int i2) {
        gs3 a = this.g.a(i);
        if (a.b != -1) {
            return a.e[i2];
        }
        return -9223372036854775807L;
    }

    public final long h(int i) {
        long j = this.g.a(i).a;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.c;
        long j = this.d;
        return ((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final long i() {
        long j = this.g.b;
        return 0L;
    }

    public final long j(int i) {
        long j = this.g.a(i).f;
        return 0L;
    }

    public final d34 k(Object obj, Object obj2, int i, long j, long j2, fl4 fl4Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = 0;
        this.d = j;
        this.e = 0L;
        this.g = fl4Var;
        this.f = z;
        return this;
    }

    public final boolean l(int i) {
        boolean z = this.g.a(i).g;
        return false;
    }
}
