package com.daaw;

import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class a81 {
    public int i;
    public int j;
    public int k;
    public int l;
    public Format q;
    public int r;
    public int a = 1000;
    public int[] b = new int[1000];
    public long[] c = new long[1000];
    public long[] f = new long[1000];
    public int[] e = new int[1000];
    public int[] d = new int[1000];
    public sm1.a[] g = new sm1.a[1000];
    public Format[] h = new Format[1000];
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public boolean p = true;
    public boolean o = true;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public long b;
        public sm1.a c;
    }

    public void A(int i) {
        this.r = i;
    }

    public synchronized int a(long j, boolean z, boolean z2) {
        int r = r(this.l);
        if (u() && j >= this.f[r] && (j <= this.n || z2)) {
            int k = k(r, this.i - this.l, j, z);
            if (k == -1) {
                return -1;
            }
            this.l += k;
            return k;
        }
        return -1;
    }

    public synchronized int b() {
        int i;
        int i2 = this.i;
        i = i2 - this.l;
        this.l = i2;
        return i;
    }

    public synchronized boolean c(long j) {
        if (this.i == 0) {
            return j > this.m;
        } else if (Math.max(this.m, p(this.l)) >= j) {
            return false;
        } else {
            int i = this.i;
            int r = r(i - 1);
            while (i > this.l && this.f[r] >= j) {
                i--;
                r--;
                if (r == -1) {
                    r = this.a - 1;
                }
            }
            j(this.j + i);
            return true;
        }
    }

    public synchronized void d(long j, int i, long j2, int i2, sm1.a aVar) {
        if (this.o) {
            if ((i & 1) == 0) {
                return;
            }
            this.o = false;
        }
        s6.f(!this.p);
        e(j);
        int r = r(this.i);
        this.f[r] = j;
        long[] jArr = this.c;
        jArr[r] = j2;
        this.d[r] = i2;
        this.e[r] = i;
        this.g[r] = aVar;
        this.h[r] = this.q;
        this.b[r] = this.r;
        int i3 = this.i + 1;
        this.i = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int i5 = i4 + 1000;
            int[] iArr = new int[i5];
            long[] jArr2 = new long[i5];
            long[] jArr3 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            sm1.a[] aVarArr = new sm1.a[i5];
            Format[] formatArr = new Format[i5];
            int i6 = this.k;
            int i7 = i4 - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy(this.f, this.k, jArr3, 0, i7);
            System.arraycopy(this.e, this.k, iArr2, 0, i7);
            System.arraycopy(this.d, this.k, iArr3, 0, i7);
            System.arraycopy(this.g, this.k, aVarArr, 0, i7);
            System.arraycopy(this.h, this.k, formatArr, 0, i7);
            System.arraycopy(this.b, this.k, iArr, 0, i7);
            int i8 = this.k;
            System.arraycopy(this.c, 0, jArr2, i7, i8);
            System.arraycopy(this.f, 0, jArr3, i7, i8);
            System.arraycopy(this.e, 0, iArr2, i7, i8);
            System.arraycopy(this.d, 0, iArr3, i7, i8);
            System.arraycopy(this.g, 0, aVarArr, i7, i8);
            System.arraycopy(this.h, 0, formatArr, i7, i8);
            System.arraycopy(this.b, 0, iArr, i7, i8);
            this.c = jArr2;
            this.f = jArr3;
            this.e = iArr2;
            this.d = iArr3;
            this.g = aVarArr;
            this.h = formatArr;
            this.b = iArr;
            this.k = 0;
            this.i = this.a;
            this.a = i5;
        }
    }

    public synchronized void e(long j) {
        this.n = Math.max(this.n, j);
    }

    public final long f(int i) {
        int i2;
        this.m = Math.max(this.m, p(i));
        int i3 = this.i - i;
        this.i = i3;
        this.j += i;
        int i4 = this.k + i;
        this.k = i4;
        int i5 = this.a;
        if (i4 >= i5) {
            this.k = i4 - i5;
        }
        int i6 = this.l - i;
        this.l = i6;
        if (i6 < 0) {
            this.l = 0;
        }
        if (i3 == 0) {
            int i7 = this.k;
            if (i7 != 0) {
                i5 = i7;
            }
            return this.c[i5 - 1] + this.d[i2];
        }
        return this.c[this.k];
    }

    public synchronized long g(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.i;
        if (i2 != 0) {
            long[] jArr = this.f;
            int i3 = this.k;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.l) != i2) {
                    i2 = i + 1;
                }
                int k = k(i3, i2, j, z);
                if (k == -1) {
                    return -1L;
                }
                return f(k);
            }
        }
        return -1L;
    }

    public synchronized long h() {
        int i = this.i;
        if (i == 0) {
            return -1L;
        }
        return f(i);
    }

    public synchronized long i() {
        int i = this.l;
        if (i == 0) {
            return -1L;
        }
        return f(i);
    }

    public long j(int i) {
        int t = t() - i;
        s6.a(t >= 0 && t <= this.i - this.l);
        int i2 = this.i - t;
        this.i = i2;
        this.n = Math.max(this.m, p(i2));
        int i3 = this.i;
        if (i3 == 0) {
            return 0L;
        }
        int r = r(i3 - 1);
        return this.c[r] + this.d[r];
    }

    public final int k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f[i] <= j; i4++) {
            if (!z || (this.e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.a) {
                i = 0;
            }
        }
        return i3;
    }

    public synchronized boolean l(Format format) {
        if (format == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (sq1.b(format, this.q)) {
            return false;
        }
        this.q = format;
        return true;
    }

    public int m() {
        return this.j;
    }

    public synchronized long n() {
        return this.i == 0 ? Long.MIN_VALUE : this.f[this.k];
    }

    public synchronized long o() {
        return this.n;
    }

    public final long p(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int r = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f[r]);
            if ((this.e[r] & 1) != 0) {
                break;
            }
            r--;
            if (r == -1) {
                r = this.a - 1;
            }
        }
        return j;
    }

    public int q() {
        return this.j + this.l;
    }

    public final int r(int i) {
        int i2 = this.k + i;
        int i3 = this.a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public synchronized Format s() {
        return this.p ? null : this.q;
    }

    public int t() {
        return this.j + this.i;
    }

    public synchronized boolean u() {
        return this.l != this.i;
    }

    public int v() {
        return u() ? this.b[r(this.l)] : this.r;
    }

    public synchronized int w(k30 k30Var, gq gqVar, boolean z, boolean z2, Format format, a aVar) {
        if (!u()) {
            if (z2) {
                gqVar.l(4);
                return -4;
            }
            Format format2 = this.q;
            if (format2 == null || (!z && format2 == format)) {
                return -3;
            }
            k30Var.a = format2;
            return -5;
        }
        int r = r(this.l);
        if (!z && this.h[r] == format) {
            if (gqVar.q()) {
                return -3;
            }
            gqVar.s = this.f[r];
            gqVar.l(this.e[r]);
            aVar.a = this.d[r];
            aVar.b = this.c[r];
            aVar.c = this.g[r];
            this.l++;
            return -4;
        }
        k30Var.a = this.h[r];
        return -5;
    }

    public void x(boolean z) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.o = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        if (z) {
            this.q = null;
            this.p = true;
        }
    }

    public synchronized void y() {
        this.l = 0;
    }

    public synchronized boolean z(int i) {
        boolean z;
        int i2 = this.j;
        if (i2 > i || i > this.i + i2) {
            z = false;
        } else {
            this.l = i - i2;
            z = true;
        }
        return z;
    }
}
