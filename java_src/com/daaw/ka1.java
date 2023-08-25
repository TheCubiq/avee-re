package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ka1 {

    /* renamed from: a */
    public final d31 f15831a;

    /* renamed from: b */
    public final long f15832b;

    /* renamed from: c */
    public final long f15833c;

    /* renamed from: com.daaw.ka1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1927a extends ka1 {

        /* renamed from: d */
        public final long f15834d;

        /* renamed from: e */
        public final long f15835e;

        /* renamed from: f */
        public final List<C1930d> f15836f;

        public AbstractC1927a(d31 d31Var, long j, long j2, long j3, long j4, List<C1930d> list) {
            super(d31Var, j, j2);
            this.f15834d = j3;
            this.f15835e = j4;
            this.f15836f = list;
        }

        /* renamed from: c */
        public long m17931c() {
            return this.f15834d;
        }

        /* renamed from: d */
        public abstract int mo17925d(long j);

        /* renamed from: e */
        public final long m17930e(long j, long j2) {
            List<C1930d> list = this.f15836f;
            if (list != null) {
                return (list.get((int) (j - this.f15834d)).f15841b * 1000000) / this.f15832b;
            }
            int mo17925d = mo17925d(j2);
            return (mo17925d == -1 || j != (m17931c() + ((long) mo17925d)) - 1) ? (this.f15835e * 1000000) / this.f15832b : j2 - m17928g(j);
        }

        /* renamed from: f */
        public long m17929f(long j, long j2) {
            long m17931c = m17931c();
            long mo17925d = mo17925d(j2);
            if (mo17925d == 0) {
                return m17931c;
            }
            if (this.f15836f == null) {
                long j3 = this.f15834d + (j / ((this.f15835e * 1000000) / this.f15832b));
                return j3 < m17931c ? m17931c : mo17925d == -1 ? j3 : Math.min(j3, (m17931c + mo17925d) - 1);
            }
            long j4 = (mo17925d + m17931c) - 1;
            long j5 = m17931c;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long m17928g = m17928g(j6);
                if (m17928g < j) {
                    j5 = j6 + 1;
                } else if (m17928g <= j) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            return j5 == m17931c ? j5 : j4;
        }

        /* renamed from: g */
        public final long m17928g(long j) {
            List<C1930d> list = this.f15836f;
            return sq1.m10025T(list != null ? list.get((int) (j - this.f15834d)).f15840a - this.f15833c : (j - this.f15834d) * this.f15835e, 1000000L, this.f15832b);
        }

        /* renamed from: h */
        public abstract d31 mo17924h(j41 j41Var, long j);

        /* renamed from: i */
        public boolean mo17927i() {
            return this.f15836f != null;
        }
    }

    /* renamed from: com.daaw.ka1$b */
    /* loaded from: classes.dex */
    public static class C1928b extends AbstractC1927a {

        /* renamed from: g */
        public final List<d31> f15837g;

        public C1928b(d31 d31Var, long j, long j2, long j3, long j4, List<C1930d> list, List<d31> list2) {
            super(d31Var, j, j2, j3, j4, list);
            this.f15837g = list2;
        }

        @Override // com.daaw.ka1.AbstractC1927a
        /* renamed from: d */
        public int mo17925d(long j) {
            return this.f15837g.size();
        }

        @Override // com.daaw.ka1.AbstractC1927a
        /* renamed from: h */
        public d31 mo17924h(j41 j41Var, long j) {
            return this.f15837g.get((int) (j - this.f15834d));
        }

        @Override // com.daaw.ka1.AbstractC1927a
        /* renamed from: i */
        public boolean mo17927i() {
            return true;
        }
    }

    /* renamed from: com.daaw.ka1$c */
    /* loaded from: classes.dex */
    public static class C1929c extends AbstractC1927a {

        /* renamed from: g */
        public final kq1 f15838g;

        /* renamed from: h */
        public final kq1 f15839h;

        public C1929c(d31 d31Var, long j, long j2, long j3, long j4, List<C1930d> list, kq1 kq1Var, kq1 kq1Var2) {
            super(d31Var, j, j2, j3, j4, list);
            this.f15838g = kq1Var;
            this.f15839h = kq1Var2;
        }

        @Override // com.daaw.ka1
        /* renamed from: a */
        public d31 mo17926a(j41 j41Var) {
            kq1 kq1Var = this.f15838g;
            if (kq1Var != null) {
                Format format = j41Var.f14244c;
                return new d31(kq1Var.m17488a(format.f35716p, 0L, format.f35717q, 0L), 0L, -1L);
            }
            return super.mo17926a(j41Var);
        }

        @Override // com.daaw.ka1.AbstractC1927a
        /* renamed from: d */
        public int mo17925d(long j) {
            List<C1930d> list = this.f15836f;
            if (list != null) {
                return list.size();
            }
            if (j != -9223372036854775807L) {
                return (int) sq1.m10009g(j, (this.f15835e * 1000000) / this.f15832b);
            }
            return -1;
        }

        @Override // com.daaw.ka1.AbstractC1927a
        /* renamed from: h */
        public d31 mo17924h(j41 j41Var, long j) {
            List<C1930d> list = this.f15836f;
            long j2 = list != null ? list.get((int) (j - this.f15834d)).f15840a : (j - this.f15834d) * this.f15835e;
            kq1 kq1Var = this.f15839h;
            Format format = j41Var.f14244c;
            return new d31(kq1Var.m17488a(format.f35716p, j, format.f35717q, j2), 0L, -1L);
        }
    }

    /* renamed from: com.daaw.ka1$d */
    /* loaded from: classes.dex */
    public static class C1930d {

        /* renamed from: a */
        public final long f15840a;

        /* renamed from: b */
        public final long f15841b;

        public C1930d(long j, long j2) {
            this.f15840a = j;
            this.f15841b = j2;
        }
    }

    /* renamed from: com.daaw.ka1$e */
    /* loaded from: classes.dex */
    public static class C1931e extends ka1 {

        /* renamed from: d */
        public final long f15842d;

        /* renamed from: e */
        public final long f15843e;

        public C1931e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public C1931e(d31 d31Var, long j, long j2, long j3, long j4) {
            super(d31Var, j, j2);
            this.f15842d = j3;
            this.f15843e = j4;
        }

        /* renamed from: c */
        public d31 m17923c() {
            long j = this.f15843e;
            if (j <= 0) {
                return null;
            }
            return new d31(null, this.f15842d, j);
        }
    }

    public ka1(d31 d31Var, long j, long j2) {
        this.f15831a = d31Var;
        this.f15832b = j;
        this.f15833c = j2;
    }

    /* renamed from: a */
    public d31 mo17926a(j41 j41Var) {
        return this.f15831a;
    }

    /* renamed from: b */
    public long m17932b() {
        return sq1.m10025T(this.f15833c, 1000000L, this.f15832b);
    }
}
