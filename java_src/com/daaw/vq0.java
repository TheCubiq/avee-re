package com.daaw;

import com.daaw.b7;
import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class vq0 implements zz, da1 {
    public static final e00 t = new a();
    public static final int u = sq1.v("qt  ");
    public final int a;
    public final rv0 b;
    public final rv0 c;
    public final rv0 d;
    public final ArrayDeque<b7.a> e;
    public int f;
    public int g;
    public long h;
    public int i;
    public rv0 j;
    public int k;
    public int l;
    public int m;
    public d00 n;
    public b[] o;
    public long[][] p;
    public int q;
    public long r;
    public boolean s;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new vq0()};
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final nm1 a;
        public final tm1 b;
        public final sm1 c;
        public int d;

        public b(nm1 nm1Var, tm1 tm1Var, sm1 sm1Var) {
            this.a = nm1Var;
            this.b = tm1Var;
            this.c = sm1Var;
        }
    }

    public vq0() {
        this(0);
    }

    public vq0(int i) {
        this.a = i;
        this.d = new rv0(16);
        this.e = new ArrayDeque<>();
        this.b = new rv0(sr0.a);
        this.c = new rv0(4);
        this.k = -1;
    }

    public static long[][] j(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            jArr[i] = new long[bVarArr[i].b.a];
            jArr2[i] = bVarArr[i].b.e[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < bVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += bVarArr[i3].b.c[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = bVarArr[i3].b.e[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int l(tm1 tm1Var, long j) {
        int a2 = tm1Var.a(j);
        return a2 == -1 ? tm1Var.b(j) : a2;
    }

    public static long n(tm1 tm1Var, long j, long j2) {
        int l = l(tm1Var, j);
        return l == -1 ? j2 : Math.min(tm1Var.b[l], j2);
    }

    public static boolean p(rv0 rv0Var) {
        rv0Var.J(8);
        if (rv0Var.i() == u) {
            return true;
        }
        rv0Var.K(4);
        while (rv0Var.a() > 0) {
            if (rv0Var.i() == u) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(int i) {
        return i == b7.C || i == b7.E || i == b7.F || i == b7.G || i == b7.H || i == b7.Q;
    }

    public static boolean v(int i) {
        return i == b7.S || i == b7.D || i == b7.T || i == b7.U || i == b7.n0 || i == b7.o0 || i == b7.p0 || i == b7.R || i == b7.q0 || i == b7.r0 || i == b7.s0 || i == b7.t0 || i == b7.u0 || i == b7.P || i == b7.b || i == b7.B0;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return be1.d(a00Var);
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return t(a00Var, iy0Var);
                    }
                    throw new IllegalStateException();
                } else if (s(a00Var, iy0Var)) {
                    return 1;
                }
            } else if (!r(a00Var)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.da1
    public boolean e() {
        return true;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        if (j == 0) {
            k();
        } else if (this.o != null) {
            w(j2);
        }
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b2;
        b[] bVarArr = this.o;
        if (bVarArr.length == 0) {
            return new da1.a(fa1.c);
        }
        int i = this.q;
        if (i != -1) {
            tm1 tm1Var = bVarArr[i].b;
            int l = l(tm1Var, j);
            if (l == -1) {
                return new da1.a(fa1.c);
            }
            long j6 = tm1Var.e[l];
            j2 = tm1Var.b[l];
            if (j6 >= j || l >= tm1Var.a - 1 || (b2 = tm1Var.b(j)) == -1 || b2 == l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = tm1Var.e[b2];
                j5 = tm1Var.b[b2];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            b[] bVarArr2 = this.o;
            if (i2 >= bVarArr2.length) {
                break;
            }
            if (i2 != this.q) {
                tm1 tm1Var2 = bVarArr2[i2].b;
                long n = n(tm1Var2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = n(tm1Var2, j4, j3);
                }
                j2 = n;
            }
            i2++;
        }
        fa1 fa1Var = new fa1(j, j2);
        return j4 == -9223372036854775807L ? new da1.a(fa1Var) : new da1.a(fa1Var, new fa1(j4, j3));
    }

    @Override // com.daaw.da1
    public long h() {
        return this.r;
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.n = d00Var;
    }

    public final void k() {
        this.f = 0;
        this.i = 0;
    }

    public final int m(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.o;
            if (i3 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i3];
            int i4 = bVar.d;
            tm1 tm1Var = bVar.b;
            if (i4 != tm1Var.a) {
                long j5 = tm1Var.b[i4];
                long j6 = this.p[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    public final void o(long j) {
        while (!this.e.isEmpty() && this.e.peek().Q0 == j) {
            b7.a pop = this.e.pop();
            if (pop.a == b7.C) {
                q(pop);
                this.e.clear();
                this.f = 2;
            } else if (!this.e.isEmpty()) {
                this.e.peek().d(pop);
            }
        }
        if (this.f != 2) {
            k();
        }
    }

    public final void q(b7.a aVar) {
        Metadata metadata;
        ArrayList arrayList = new ArrayList();
        y50 y50Var = new y50();
        b7.b g = aVar.g(b7.B0);
        if (g != null) {
            metadata = c7.v(g, this.s);
            if (metadata != null) {
                y50Var.c(metadata);
            }
        } else {
            metadata = null;
        }
        int i = -1;
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < aVar.S0.size(); i2++) {
            b7.a aVar2 = aVar.S0.get(i2);
            if (aVar2.a == b7.E) {
                nm1 u2 = c7.u(aVar2, aVar.g(b7.D), -9223372036854775807L, null, (this.a & 1) != 0, this.s);
                if (u2 != null) {
                    tm1 q = c7.q(u2, aVar2.f(b7.F).f(b7.G).f(b7.H), y50Var);
                    if (q.a != 0) {
                        b bVar = new b(u2, q, this.n.a(i2, u2.b));
                        Format h = u2.f.h(q.d + 30);
                        if (u2.b == 1) {
                            if (y50Var.a()) {
                                h = h.c(y50Var.a, y50Var.b);
                            }
                            if (metadata != null) {
                                h = h.i(metadata);
                            }
                        }
                        bVar.c.d(h);
                        long j2 = u2.e;
                        if (j2 == -9223372036854775807L) {
                            j2 = q.g;
                        }
                        j = Math.max(j, j2);
                        if (u2.b == 2 && i == -1) {
                            i = arrayList.size();
                        }
                        arrayList.add(bVar);
                    }
                }
            }
        }
        this.q = i;
        this.r = j;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.o = bVarArr;
        this.p = j(bVarArr);
        this.n.n();
        this.n.d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(com.daaw.a00 r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.vq0.r(com.daaw.a00):boolean");
    }

    public final boolean s(a00 a00Var, iy0 iy0Var) {
        boolean z;
        long j = this.h - this.i;
        long position = a00Var.getPosition() + j;
        rv0 rv0Var = this.j;
        if (rv0Var != null) {
            a00Var.f(rv0Var.a, this.i, (int) j);
            if (this.g == b7.b) {
                this.s = p(this.j);
            } else if (!this.e.isEmpty()) {
                this.e.peek().e(new b7.b(this.g, this.j));
            }
        } else if (j >= 262144) {
            iy0Var.a = a00Var.getPosition() + j;
            z = true;
            o(position);
            return (z || this.f == 2) ? false : true;
        } else {
            a00Var.j((int) j);
        }
        z = false;
        o(position);
        if (z) {
        }
    }

    public final int t(a00 a00Var, iy0 iy0Var) {
        long position = a00Var.getPosition();
        if (this.k == -1) {
            int m = m(position);
            this.k = m;
            if (m == -1) {
                return -1;
            }
        }
        b bVar = this.o[this.k];
        sm1 sm1Var = bVar.c;
        int i = bVar.d;
        tm1 tm1Var = bVar.b;
        long j = tm1Var.b[i];
        int i2 = tm1Var.c[i];
        long j2 = (j - position) + this.l;
        if (j2 < 0 || j2 >= 262144) {
            iy0Var.a = j;
            return 1;
        }
        if (bVar.a.g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        a00Var.j((int) j2);
        int i3 = bVar.a.j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.l;
                if (i4 >= i2) {
                    break;
                }
                int b2 = sm1Var.b(a00Var, i2 - i4, false);
                this.l += b2;
                this.m -= b2;
            }
        } else {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.l < i2) {
                int i6 = this.m;
                if (i6 == 0) {
                    a00Var.f(this.c.a, i5, i3);
                    this.c.J(0);
                    this.m = this.c.B();
                    this.b.J(0);
                    sm1Var.c(this.b, 4);
                    this.l += 4;
                    i2 += i5;
                } else {
                    int b3 = sm1Var.b(a00Var, i6, false);
                    this.l += b3;
                    this.m -= b3;
                }
            }
        }
        tm1 tm1Var2 = bVar.b;
        sm1Var.a(tm1Var2.e[i], tm1Var2.f[i], i2, 0, null);
        bVar.d++;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        return 0;
    }

    public final void w(long j) {
        b[] bVarArr;
        for (b bVar : this.o) {
            tm1 tm1Var = bVar.b;
            int a2 = tm1Var.a(j);
            if (a2 == -1) {
                a2 = tm1Var.b(j);
            }
            bVar.d = a2;
        }
    }
}
