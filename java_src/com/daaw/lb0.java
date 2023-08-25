package com.daaw;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class lb0 extends nb0 {
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final long h;
    public final int i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final DrmInitData n;
    public final List<a> o;
    public final long p;

    /* loaded from: classes.dex */
    public static final class a implements Comparable<Long> {
        public final String p;
        public final a q;
        public final long r;
        public final int s;
        public final long t;
        public final String u;
        public final String v;
        public final long w;
        public final long x;
        public final boolean y;

        public a(String str, long j, long j2) {
            this(str, null, 0L, -1, -9223372036854775807L, null, null, j, j2, false);
        }

        public a(String str, a aVar, long j, int i, long j2, String str2, String str3, long j3, long j4, boolean z) {
            this.p = str;
            this.q = aVar;
            this.r = j;
            this.s = i;
            this.t = j2;
            this.u = str2;
            this.v = str3;
            this.w = j3;
            this.x = j4;
            this.y = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.t > l.longValue()) {
                return 1;
            }
            return this.t < l.longValue() ? -1 : 0;
        }
    }

    public lb0(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<a> list2) {
        super(str, list);
        this.c = i;
        this.e = j2;
        this.f = z;
        this.g = i2;
        this.h = j3;
        this.i = i3;
        this.j = j4;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = drmInitData;
        this.o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.p = 0L;
        } else {
            a aVar = list2.get(list2.size() - 1);
            this.p = aVar.t + aVar.r;
        }
        this.d = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.p + j;
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public lb0 a(List<f41> list) {
        return this;
    }

    public lb0 c(long j, int i) {
        return new lb0(this.c, this.a, this.b, this.d, j, true, i, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public lb0 d() {
        return this.l ? this : new lb0(this.c, this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, true, this.m, this.n, this.o);
    }

    public long e() {
        return this.e + this.p;
    }

    public boolean f(lb0 lb0Var) {
        if (lb0Var != null) {
            long j = this.h;
            long j2 = lb0Var.h;
            if (j > j2) {
                return true;
            }
            if (j < j2) {
                return false;
            }
            int size = this.o.size();
            int size2 = lb0Var.o.size();
            if (size <= size2) {
                return size == size2 && this.l && !lb0Var.l;
            }
            return true;
        }
        return true;
    }
}
