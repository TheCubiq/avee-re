package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ka1 {
    public final d31 a;
    public final long b;
    public final long c;

    /* loaded from: classes.dex */
    public static abstract class a extends ka1 {
        public final long d;
        public final long e;
        public final List<d> f;

        public a(d31 d31Var, long j, long j2, long j3, long j4, List<d> list) {
            super(d31Var, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
        }

        public long c() {
            return this.d;
        }

        public abstract int d(long j);

        public final long e(long j, long j2) {
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - this.d)).b * 1000000) / this.b;
            }
            int d = d(j2);
            return (d == -1 || j != (c() + ((long) d)) - 1) ? (this.e * 1000000) / this.b : j2 - g(j);
        }

        public long f(long j, long j2) {
            long c = c();
            long d = d(j2);
            if (d == 0) {
                return c;
            }
            if (this.f == null) {
                long j3 = this.d + (j / ((this.e * 1000000) / this.b));
                return j3 < c ? c : d == -1 ? j3 : Math.min(j3, (c + d) - 1);
            }
            long j4 = (d + c) - 1;
            long j5 = c;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long g = g(j6);
                if (g < j) {
                    j5 = j6 + 1;
                } else if (g <= j) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            return j5 == c ? j5 : j4;
        }

        public final long g(long j) {
            List<d> list = this.f;
            return sq1.T(list != null ? list.get((int) (j - this.d)).a - this.c : (j - this.d) * this.e, 1000000L, this.b);
        }

        public abstract d31 h(j41 j41Var, long j);

        public boolean i() {
            return this.f != null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public final List<d31> g;

        public b(d31 d31Var, long j, long j2, long j3, long j4, List<d> list, List<d31> list2) {
            super(d31Var, j, j2, j3, j4, list);
            this.g = list2;
        }

        @Override // com.daaw.ka1.a
        public int d(long j) {
            return this.g.size();
        }

        @Override // com.daaw.ka1.a
        public d31 h(j41 j41Var, long j) {
            return this.g.get((int) (j - this.d));
        }

        @Override // com.daaw.ka1.a
        public boolean i() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public final kq1 g;
        public final kq1 h;

        public c(d31 d31Var, long j, long j2, long j3, long j4, List<d> list, kq1 kq1Var, kq1 kq1Var2) {
            super(d31Var, j, j2, j3, j4, list);
            this.g = kq1Var;
            this.h = kq1Var2;
        }

        @Override // com.daaw.ka1
        public d31 a(j41 j41Var) {
            kq1 kq1Var = this.g;
            if (kq1Var != null) {
                Format format = j41Var.c;
                return new d31(kq1Var.a(format.p, 0L, format.q, 0L), 0L, -1L);
            }
            return super.a(j41Var);
        }

        @Override // com.daaw.ka1.a
        public int d(long j) {
            List<d> list = this.f;
            if (list != null) {
                return list.size();
            }
            if (j != -9223372036854775807L) {
                return (int) sq1.g(j, (this.e * 1000000) / this.b);
            }
            return -1;
        }

        @Override // com.daaw.ka1.a
        public d31 h(j41 j41Var, long j) {
            List<d> list = this.f;
            long j2 = list != null ? list.get((int) (j - this.d)).a : (j - this.d) * this.e;
            kq1 kq1Var = this.h;
            Format format = j41Var.c;
            return new d31(kq1Var.a(format.p, j, format.q, j2), 0L, -1L);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ka1 {
        public final long d;
        public final long e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(d31 d31Var, long j, long j2, long j3, long j4) {
            super(d31Var, j, j2);
            this.d = j3;
            this.e = j4;
        }

        public d31 c() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new d31(null, this.d, j);
        }
    }

    public ka1(d31 d31Var, long j, long j2) {
        this.a = d31Var;
        this.b = j;
        this.c = j2;
    }

    public d31 a(j41 j41Var) {
        return this.a;
    }

    public long b() {
        return sq1.T(this.c, 1000000L, this.b);
    }
}
