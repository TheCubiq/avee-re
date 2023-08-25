package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lt8 implements m42 {
    public boolean A;
    public boolean B;
    public xn8 C;
    public final ft8 a;
    public final vn8 d;
    public final jn8 e;
    public kt8 f;
    public f92 g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    public f92 y;
    public f92 z;
    public final ht8 b = new ht8();
    public int h = 1000;
    public int[] i = new int[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public l42[] n = new l42[1000];
    public final yt8 c = new yt8(new gt4() { // from class: com.daaw.gt8
    });
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;

    public lt8(nw8 nw8Var, vn8 vn8Var, jn8 jn8Var, byte[] bArr) {
        this.d = vn8Var;
        this.e = jn8Var;
        this.a = new ft8(nw8Var, null);
    }

    public static /* synthetic */ void A(jt8 jt8Var) {
        tn8 tn8Var = jt8Var.b;
        int i = rn8.a;
    }

    public final void B() {
        xn8 xn8Var = this.C;
        if (xn8Var != null) {
            throw xn8Var.a();
        }
    }

    public final void C() {
        z();
        n();
    }

    public final void D() {
        E(true);
        n();
    }

    public final void E(boolean z) {
        this.a.f();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.c.d();
        if (z) {
            this.y = null;
            this.z = null;
            this.x = true;
        }
    }

    public final void F(long j) {
        this.s = j;
    }

    public final void G(kt8 kt8Var) {
        this.f = kt8Var;
    }

    public final synchronized void H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.r + i <= this.o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uo4.d(z);
        this.r += i;
    }

    public final synchronized boolean I() {
        return this.v;
    }

    public final synchronized boolean J(boolean z) {
        boolean z2 = true;
        if (p()) {
            if (((jt8) this.c.a(this.p + this.r)).a != this.g) {
                return true;
            }
            return q(g(this.r));
        }
        if (!z && !this.v) {
            f92 f92Var = this.z;
            if (f92Var == null) {
                z2 = false;
            } else if (f92Var == this.g) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean K(long j, boolean z) {
        o();
        int i = this.r;
        int g = g(i);
        if (!p() || j < this.m[g] || (j > this.u && !z)) {
            return false;
        }
        int L = L(g, this.o - i, j, true);
        if (L == -1) {
            return false;
        }
        this.s = j;
        this.r += L;
        return true;
    }

    public final int L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // com.daaw.m42
    public final void a(ik5 ik5Var, int i, int i2) {
        this.a.h(ik5Var, i);
    }

    @Override // com.daaw.m42
    public final void b(long j, int i, int i2, int i3, l42 l42Var) {
        int i4 = i & 1;
        if (this.w) {
            if (i4 == 0) {
                return;
            }
            this.w = false;
        }
        if (this.A) {
            if (j < this.s) {
                return;
            }
            if (i4 == 0) {
                if (!this.B) {
                    s95.e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.z)));
                    this.B = true;
                }
                i |= 1;
            }
        }
        l(j, i, (this.a.b() - i2) - i3, i2, l42Var);
    }

    @Override // com.daaw.m42
    public final /* synthetic */ void c(ik5 ik5Var, int i) {
        k42.b(this, ik5Var, i);
    }

    @Override // com.daaw.m42
    public final int d(xp8 xp8Var, int i, boolean z, int i2) {
        return this.a.a(xp8Var, i, z);
    }

    @Override // com.daaw.m42
    public final /* synthetic */ int e(xp8 xp8Var, int i, boolean z) {
        return k42.a(this, xp8Var, i, z);
    }

    @Override // com.daaw.m42
    public final void f(f92 f92Var) {
        this.y = f92Var;
        boolean r = r(f92Var);
        kt8 kt8Var = this.f;
        if (kt8Var == null || !r) {
            return;
        }
        kt8Var.l(f92Var);
    }

    public final int g(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int h(a78 a78Var, ma7 ma7Var, boolean z, boolean z2, ht8 ht8Var) {
        ma7Var.d = false;
        if (!p()) {
            if (!z2 && !this.v) {
                f92 f92Var = this.z;
                if (f92Var == null || (!z && f92Var == this.g)) {
                    return -3;
                }
                m(f92Var, a78Var);
                return -5;
            }
            ma7Var.c(4);
            return -4;
        }
        f92 f92Var2 = ((jt8) this.c.a(this.p + this.r)).a;
        if (!z && f92Var2 == this.g) {
            int g = g(this.r);
            if (!q(g)) {
                ma7Var.d = true;
                return -3;
            }
            ma7Var.c(this.l[g]);
            long j = this.m[g];
            ma7Var.e = j;
            if (j < this.s) {
                ma7Var.a(Integer.MIN_VALUE);
            }
            ht8Var.a = this.k[g];
            ht8Var.b = this.j[g];
            ht8Var.c = this.n[g];
            return -4;
        }
        m(f92Var2, a78Var);
        return -5;
    }

    public final synchronized long i(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.o;
        if (i2 != 0) {
            long[] jArr = this.m;
            int i3 = this.q;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.r) != i2) {
                    i2 = i + 1;
                }
                int L = L(i3, i2, j, false);
                if (L == -1) {
                    return -1L;
                }
                return k(L);
            }
        }
        return -1L;
    }

    public final synchronized long j() {
        int i = this.o;
        if (i == 0) {
            return -1L;
        }
        return k(i);
    }

    public final long k(int i) {
        int i2;
        long j = this.t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = g(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.m[g]);
                if ((this.l[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, j2);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        this.c.e(i4);
        if (this.o == 0) {
            int i8 = this.q;
            if (i8 == 0) {
                i8 = this.h;
            }
            return this.j[i8 - 1] + this.k[i2];
        }
        return this.j[this.q];
    }

    public final synchronized void l(long j, int i, long j2, int i2, l42 l42Var) {
        int i3 = this.o;
        if (i3 > 0) {
            int g = g(i3 - 1);
            uo4.d(this.j[g] + ((long) this.k[g]) <= j2);
        }
        this.v = (536870912 & i) != 0;
        this.u = Math.max(this.u, j);
        int g2 = g(this.o);
        this.m[g2] = j;
        this.j[g2] = j2;
        this.k[g2] = i2;
        this.l[g2] = i;
        this.n[g2] = l42Var;
        this.i[g2] = 0;
        if (this.c.f() || !((jt8) this.c.b()).a.equals(this.z)) {
            tn8 tn8Var = tn8.a;
            yt8 yt8Var = this.c;
            int i4 = this.p + this.o;
            f92 f92Var = this.z;
            Objects.requireNonNull(f92Var);
            yt8Var.c(i4, new jt8(f92Var, tn8Var, null));
        }
        int i5 = this.o + 1;
        this.o = i5;
        int i6 = this.h;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            l42[] l42VarArr = new l42[i7];
            int i8 = this.q;
            int i9 = i6 - i8;
            System.arraycopy(this.j, i8, jArr, 0, i9);
            System.arraycopy(this.m, this.q, jArr2, 0, i9);
            System.arraycopy(this.l, this.q, iArr2, 0, i9);
            System.arraycopy(this.k, this.q, iArr3, 0, i9);
            System.arraycopy(this.n, this.q, l42VarArr, 0, i9);
            System.arraycopy(this.i, this.q, iArr, 0, i9);
            int i10 = this.q;
            System.arraycopy(this.j, 0, jArr, i9, i10);
            System.arraycopy(this.m, 0, jArr2, i9, i10);
            System.arraycopy(this.l, 0, iArr2, i9, i10);
            System.arraycopy(this.k, 0, iArr3, i9, i10);
            System.arraycopy(this.n, 0, l42VarArr, i9, i10);
            System.arraycopy(this.i, 0, iArr, i9, i10);
            this.j = jArr;
            this.m = jArr2;
            this.l = iArr2;
            this.k = iArr3;
            this.n = l42VarArr;
            this.i = iArr;
            this.q = 0;
            this.h = i7;
        }
    }

    public final void m(f92 f92Var, a78 a78Var) {
        f92 f92Var2 = this.g;
        boolean z = f92Var2 == null;
        zzx zzxVar = z ? null : f92Var2.o;
        this.g = f92Var;
        zzx zzxVar2 = f92Var.o;
        a78Var.a = f92Var.c(this.d.a(f92Var));
        a78Var.b = this.C;
        if (z || !it5.t(zzxVar, zzxVar2)) {
            xn8 xn8Var = f92Var.o != null ? new xn8(new fn8(new bo8(1), 6001)) : null;
            this.C = xn8Var;
            a78Var.b = xn8Var;
        }
    }

    public final void n() {
        if (this.C != null) {
            this.C = null;
            this.g = null;
        }
    }

    public final synchronized void o() {
        this.r = 0;
        this.a.g();
    }

    public final boolean p() {
        return this.r != this.o;
    }

    public final boolean q(int i) {
        if (this.C != null) {
            return (this.l[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    public final synchronized boolean r(f92 f92Var) {
        this.x = false;
        if (it5.t(f92Var, this.z)) {
            return false;
        }
        if (!this.c.f() && ((jt8) this.c.b()).a.equals(f92Var)) {
            f92Var = ((jt8) this.c.b()).a;
        }
        this.z = f92Var;
        f92 f92Var2 = this.z;
        this.A = ak3.f(f92Var2.l, f92Var2.i);
        this.B = false;
        return true;
    }

    public final int s() {
        return this.p + this.r;
    }

    public final synchronized int t(long j, boolean z) {
        int i = this.r;
        int g = g(i);
        if (p() && j >= this.m[g]) {
            if (j > this.u && z) {
                return this.o - i;
            }
            int L = L(g, this.o - i, j, true);
            if (L == -1) {
                return 0;
            }
            return L;
        }
        return 0;
    }

    public final int u() {
        return this.p + this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v(com.daaw.a78 r9, com.daaw.ma7 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.daaw.ht8 r7 = r8.b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.g()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.daaw.ft8 r9 = r8.a
            com.daaw.ht8 r11 = r8.b
            r9.d(r10, r11)
            goto L3d
        L2c:
            com.daaw.ft8 r9 = r8.a
            com.daaw.ht8 r11 = r8.b
            r9.e(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.r
            int r9 = r9 + r1
            r8.r = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lt8.v(com.daaw.a78, com.daaw.ma7, int, boolean):int");
    }

    public final synchronized long w() {
        return this.u;
    }

    public final synchronized f92 x() {
        if (this.x) {
            return null;
        }
        return this.z;
    }

    public final void y(long j, boolean z, boolean z2) {
        this.a.c(i(j, false, z2));
    }

    public final void z() {
        this.a.c(j());
    }
}
