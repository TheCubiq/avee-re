package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class tq0 implements zz {
    public static final e00 o = new a();
    public static final int p = sq1.v("Xing");
    public static final int q = sq1.v("Info");
    public static final int r = sq1.v("VBRI");
    public final int a;
    public final long b;
    public final rv0 c;
    public final yq0 d;
    public final y50 e;
    public final re0 f;
    public d00 g;
    public sm1 h;
    public int i;
    public Metadata j;
    public b k;
    public long l;
    public long m;
    public int n;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new tq0()};
        }
    }

    /* loaded from: classes.dex */
    public interface b extends da1 {
        long b(long j);
    }

    public tq0() {
        this(0);
    }

    public tq0(int i) {
        this(i, -9223372036854775807L);
    }

    public tq0(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new rv0(10);
        this.d = new yq0();
        this.e = new y50();
        this.l = -9223372036854775807L;
        this.f = new re0();
    }

    public static int e(rv0 rv0Var, int i) {
        if (rv0Var.d() >= i + 4) {
            rv0Var.J(i);
            int i2 = rv0Var.i();
            if (i2 == p || i2 == q) {
                return i2;
            }
        }
        if (rv0Var.d() >= 40) {
            rv0Var.J(36);
            int i3 = rv0Var.i();
            int i4 = r;
            if (i3 == i4) {
                return i4;
            }
            return 0;
        }
        return 0;
    }

    public static boolean g(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final b b(a00 a00Var) {
        a00Var.k(this.c.a, 0, 4);
        this.c.J(0);
        yq0.b(this.c.i(), this.d);
        return new jj(a00Var.h(), a00Var.getPosition(), this.d);
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return k(a00Var, true);
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        if (this.i == 0) {
            try {
                k(a00Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.k == null) {
            b h = h(a00Var);
            this.k = h;
            if (h == null || (!h.e() && (this.a & 1) != 0)) {
                this.k = b(a00Var);
            }
            this.g.d(this.k);
            sm1 sm1Var = this.h;
            yq0 yq0Var = this.d;
            String str = yq0Var.b;
            int i = yq0Var.e;
            int i2 = yq0Var.d;
            y50 y50Var = this.e;
            sm1Var.d(Format.s(null, str, null, -1, 4096, i, i2, -1, y50Var.a, y50Var.b, null, null, 0, null, (this.a & 2) != 0 ? null : this.j));
        }
        return j(a00Var);
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.i = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.n = 0;
    }

    public final b h(a00 a00Var) {
        int i;
        rv0 rv0Var = new rv0(this.d.c);
        a00Var.k(rv0Var.a, 0, this.d.c);
        yq0 yq0Var = this.d;
        int i2 = yq0Var.a & 1;
        int i3 = yq0Var.e;
        if (i2 != 0) {
            if (i3 != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (i3 == 1) {
                i = 13;
            }
            i = 21;
        }
        int e = e(rv0Var, i);
        if (e != p && e != q) {
            if (e != r) {
                a00Var.i();
                return null;
            }
            as1 a2 = as1.a(a00Var.h(), a00Var.getPosition(), this.d, rv0Var);
            a00Var.j(this.d.c);
            return a2;
        }
        fz1 a3 = fz1.a(a00Var.h(), a00Var.getPosition(), this.d, rv0Var);
        if (a3 != null && !this.e.a()) {
            a00Var.i();
            a00Var.g(i + 141);
            a00Var.k(this.c.a, 0, 3);
            this.c.J(0);
            this.e.d(this.c.A());
        }
        a00Var.j(this.d.c);
        return (a3 == null || a3.e() || e != q) ? a3 : b(a00Var);
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.g = d00Var;
        this.h = d00Var.a(0, 1);
        this.g.n();
    }

    public final int j(a00 a00Var) {
        yq0 yq0Var;
        if (this.n == 0) {
            a00Var.i();
            if (!a00Var.d(this.c.a, 0, 4, true)) {
                return -1;
            }
            this.c.J(0);
            int i = this.c.i();
            if (!g(i, this.i) || yq0.a(i) == -1) {
                a00Var.j(1);
                this.i = 0;
                return 0;
            }
            yq0.b(i, this.d);
            if (this.l == -9223372036854775807L) {
                this.l = this.k.b(a00Var.getPosition());
                if (this.b != -9223372036854775807L) {
                    this.l += this.b - this.k.b(0L);
                }
            }
            this.n = this.d.c;
        }
        int b2 = this.h.b(a00Var, this.n, true);
        if (b2 == -1) {
            return -1;
        }
        int i2 = this.n - b2;
        this.n = i2;
        if (i2 > 0) {
            return 0;
        }
        this.h.a(this.l + ((this.m * 1000000) / yq0Var.d), 1, this.d.c, 0, null);
        this.m += this.d.g;
        this.n = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r14 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r13.j(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        r13.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r12.i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(com.daaw.a00 r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L5
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L7
        L5:
            r0 = 131072(0x20000, float:1.83671E-40)
        L7:
            r13.i()
            long r1 = r13.getPosition()
            r3 = 0
            r5 = 1
            r6 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L40
            int r1 = r12.a
            r1 = r1 & 2
            if (r1 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L24
            com.daaw.qe0$b r1 = com.daaw.y50.c
            goto L25
        L24:
            r1 = 0
        L25:
            com.daaw.re0 r2 = r12.f
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.a(r13, r1)
            r12.j = r1
            if (r1 == 0) goto L34
            com.daaw.y50 r2 = r12.e
            r2.c(r1)
        L34:
            long r1 = r13.e()
            int r2 = (int) r1
            if (r14 != 0) goto L3e
            r13.j(r2)
        L3e:
            r1 = 0
            goto L42
        L40:
            r1 = 0
            r2 = 0
        L42:
            r3 = 0
            r4 = 0
        L44:
            com.daaw.rv0 r7 = r12.c
            byte[] r7 = r7.a
            if (r1 <= 0) goto L4c
            r8 = 1
            goto L4d
        L4c:
            r8 = 0
        L4d:
            r9 = 4
            boolean r7 = r13.d(r7, r6, r9, r8)
            if (r7 != 0) goto L55
            goto L9e
        L55:
            com.daaw.rv0 r7 = r12.c
            r7.J(r6)
            com.daaw.rv0 r7 = r12.c
            int r7 = r7.i()
            if (r3 == 0) goto L69
            long r10 = (long) r3
            boolean r8 = g(r7, r10)
            if (r8 == 0) goto L70
        L69:
            int r8 = com.daaw.yq0.a(r7)
            r10 = -1
            if (r8 != r10) goto L91
        L70:
            int r1 = r4 + 1
            if (r4 != r0) goto L7f
            if (r14 == 0) goto L77
            return r6
        L77:
            com.daaw.tv0 r13 = new com.daaw.tv0
            java.lang.String r14 = "Searched too many bytes."
            r13.<init>(r14)
            throw r13
        L7f:
            if (r14 == 0) goto L8a
            r13.i()
            int r3 = r2 + r1
            r13.g(r3)
            goto L8d
        L8a:
            r13.j(r5)
        L8d:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L44
        L91:
            int r1 = r1 + 1
            if (r1 != r5) goto L9c
            com.daaw.yq0 r3 = r12.d
            com.daaw.yq0.b(r7, r3)
            r3 = r7
            goto Lab
        L9c:
            if (r1 != r9) goto Lab
        L9e:
            if (r14 == 0) goto La5
            int r2 = r2 + r4
            r13.j(r2)
            goto La8
        La5:
            r13.i()
        La8:
            r12.i = r3
            return r5
        Lab:
            int r8 = r8 + (-4)
            r13.g(r8)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.tq0.k(com.daaw.a00, boolean):boolean");
    }
}
