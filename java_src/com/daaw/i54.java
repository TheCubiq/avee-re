package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class i54 {
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final f53 q;
    public static final th8 r;
    public Object a = o;
    public f53 b = q;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    @Deprecated
    public boolean h;
    public ht2 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.a("androidx.media3.common.Timeline");
        ee2Var.b(Uri.EMPTY);
        q = ee2Var.c();
        r = new th8() { // from class: com.daaw.f44
        };
    }

    public final i54 a(Object obj, f53 f53Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ht2 ht2Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.b = f53Var != null ? f53Var : q;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = ht2Var != null;
        this.i = ht2Var;
        this.k = 0L;
        this.l = j5;
        this.m = 0;
        this.n = 0;
        this.j = false;
        return this;
    }

    public final boolean b() {
        uo4.f(this.h == (this.i != null));
        return this.i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i54.class.equals(obj.getClass())) {
            i54 i54Var = (i54) obj;
            if (it5.t(this.a, i54Var.a) && it5.t(this.b, i54Var.b) && it5.t(null, null) && it5.t(this.i, i54Var.i) && this.c == i54Var.c && this.d == i54Var.d && this.e == i54Var.e && this.f == i54Var.f && this.g == i54Var.g && this.j == i54Var.j && this.l == i54Var.l && this.m == i54Var.m && this.n == i54Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() + 217) * 31) + this.b.hashCode()) * 961;
        ht2 ht2Var = this.i;
        int hashCode2 = ht2Var == null ? 0 : ht2Var.hashCode();
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.j;
        long j4 = this.l;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.m) * 31) + this.n) * 31;
    }
}
