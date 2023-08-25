package com.daaw;

import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class a81 {

    /* renamed from: i */
    public int f2975i;

    /* renamed from: j */
    public int f2976j;

    /* renamed from: k */
    public int f2977k;

    /* renamed from: l */
    public int f2978l;

    /* renamed from: q */
    public Format f2983q;

    /* renamed from: r */
    public int f2984r;

    /* renamed from: a */
    public int f2967a = 1000;

    /* renamed from: b */
    public int[] f2968b = new int[1000];

    /* renamed from: c */
    public long[] f2969c = new long[1000];

    /* renamed from: f */
    public long[] f2972f = new long[1000];

    /* renamed from: e */
    public int[] f2971e = new int[1000];

    /* renamed from: d */
    public int[] f2970d = new int[1000];

    /* renamed from: g */
    public sm1.C2956a[] f2973g = new sm1.C2956a[1000];

    /* renamed from: h */
    public Format[] f2974h = new Format[1000];

    /* renamed from: m */
    public long f2979m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f2980n = Long.MIN_VALUE;

    /* renamed from: p */
    public boolean f2982p = true;

    /* renamed from: o */
    public boolean f2981o = true;

    /* renamed from: com.daaw.a81$a */
    /* loaded from: classes.dex */
    public static final class C0610a {

        /* renamed from: a */
        public int f2985a;

        /* renamed from: b */
        public long f2986b;

        /* renamed from: c */
        public sm1.C2956a f2987c;
    }

    /* renamed from: A */
    public void m27585A(int i) {
        this.f2984r = i;
    }

    /* renamed from: a */
    public synchronized int m27584a(long j, boolean z, boolean z2) {
        int m27567r = m27567r(this.f2978l);
        if (m27564u() && j >= this.f2972f[m27567r] && (j <= this.f2980n || z2)) {
            int m27574k = m27574k(m27567r, this.f2975i - this.f2978l, j, z);
            if (m27574k == -1) {
                return -1;
            }
            this.f2978l += m27574k;
            return m27574k;
        }
        return -1;
    }

    /* renamed from: b */
    public synchronized int m27583b() {
        int i;
        int i2 = this.f2975i;
        i = i2 - this.f2978l;
        this.f2978l = i2;
        return i;
    }

    /* renamed from: c */
    public synchronized boolean m27582c(long j) {
        if (this.f2975i == 0) {
            return j > this.f2979m;
        } else if (Math.max(this.f2979m, m27569p(this.f2978l)) >= j) {
            return false;
        } else {
            int i = this.f2975i;
            int m27567r = m27567r(i - 1);
            while (i > this.f2978l && this.f2972f[m27567r] >= j) {
                i--;
                m27567r--;
                if (m27567r == -1) {
                    m27567r = this.f2967a - 1;
                }
            }
            m27575j(this.f2976j + i);
            return true;
        }
    }

    /* renamed from: d */
    public synchronized void m27581d(long j, int i, long j2, int i2, sm1.C2956a c2956a) {
        if (this.f2981o) {
            if ((i & 1) == 0) {
                return;
            }
            this.f2981o = false;
        }
        C2914s6.m10685f(!this.f2982p);
        m27580e(j);
        int m27567r = m27567r(this.f2975i);
        this.f2972f[m27567r] = j;
        long[] jArr = this.f2969c;
        jArr[m27567r] = j2;
        this.f2970d[m27567r] = i2;
        this.f2971e[m27567r] = i;
        this.f2973g[m27567r] = c2956a;
        this.f2974h[m27567r] = this.f2983q;
        this.f2968b[m27567r] = this.f2984r;
        int i3 = this.f2975i + 1;
        this.f2975i = i3;
        int i4 = this.f2967a;
        if (i3 == i4) {
            int i5 = i4 + 1000;
            int[] iArr = new int[i5];
            long[] jArr2 = new long[i5];
            long[] jArr3 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            sm1.C2956a[] c2956aArr = new sm1.C2956a[i5];
            Format[] formatArr = new Format[i5];
            int i6 = this.f2977k;
            int i7 = i4 - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy(this.f2972f, this.f2977k, jArr3, 0, i7);
            System.arraycopy(this.f2971e, this.f2977k, iArr2, 0, i7);
            System.arraycopy(this.f2970d, this.f2977k, iArr3, 0, i7);
            System.arraycopy(this.f2973g, this.f2977k, c2956aArr, 0, i7);
            System.arraycopy(this.f2974h, this.f2977k, formatArr, 0, i7);
            System.arraycopy(this.f2968b, this.f2977k, iArr, 0, i7);
            int i8 = this.f2977k;
            System.arraycopy(this.f2969c, 0, jArr2, i7, i8);
            System.arraycopy(this.f2972f, 0, jArr3, i7, i8);
            System.arraycopy(this.f2971e, 0, iArr2, i7, i8);
            System.arraycopy(this.f2970d, 0, iArr3, i7, i8);
            System.arraycopy(this.f2973g, 0, c2956aArr, i7, i8);
            System.arraycopy(this.f2974h, 0, formatArr, i7, i8);
            System.arraycopy(this.f2968b, 0, iArr, i7, i8);
            this.f2969c = jArr2;
            this.f2972f = jArr3;
            this.f2971e = iArr2;
            this.f2970d = iArr3;
            this.f2973g = c2956aArr;
            this.f2974h = formatArr;
            this.f2968b = iArr;
            this.f2977k = 0;
            this.f2975i = this.f2967a;
            this.f2967a = i5;
        }
    }

    /* renamed from: e */
    public synchronized void m27580e(long j) {
        this.f2980n = Math.max(this.f2980n, j);
    }

    /* renamed from: f */
    public final long m27579f(int i) {
        int i2;
        this.f2979m = Math.max(this.f2979m, m27569p(i));
        int i3 = this.f2975i - i;
        this.f2975i = i3;
        this.f2976j += i;
        int i4 = this.f2977k + i;
        this.f2977k = i4;
        int i5 = this.f2967a;
        if (i4 >= i5) {
            this.f2977k = i4 - i5;
        }
        int i6 = this.f2978l - i;
        this.f2978l = i6;
        if (i6 < 0) {
            this.f2978l = 0;
        }
        if (i3 == 0) {
            int i7 = this.f2977k;
            if (i7 != 0) {
                i5 = i7;
            }
            return this.f2969c[i5 - 1] + this.f2970d[i2];
        }
        return this.f2969c[this.f2977k];
    }

    /* renamed from: g */
    public synchronized long m27578g(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f2975i;
        if (i2 != 0) {
            long[] jArr = this.f2972f;
            int i3 = this.f2977k;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f2978l) != i2) {
                    i2 = i + 1;
                }
                int m27574k = m27574k(i3, i2, j, z);
                if (m27574k == -1) {
                    return -1L;
                }
                return m27579f(m27574k);
            }
        }
        return -1L;
    }

    /* renamed from: h */
    public synchronized long m27577h() {
        int i = this.f2975i;
        if (i == 0) {
            return -1L;
        }
        return m27579f(i);
    }

    /* renamed from: i */
    public synchronized long m27576i() {
        int i = this.f2978l;
        if (i == 0) {
            return -1L;
        }
        return m27579f(i);
    }

    /* renamed from: j */
    public long m27575j(int i) {
        int m27565t = m27565t() - i;
        C2914s6.m10690a(m27565t >= 0 && m27565t <= this.f2975i - this.f2978l);
        int i2 = this.f2975i - m27565t;
        this.f2975i = i2;
        this.f2980n = Math.max(this.f2979m, m27569p(i2));
        int i3 = this.f2975i;
        if (i3 == 0) {
            return 0L;
        }
        int m27567r = m27567r(i3 - 1);
        return this.f2969c[m27567r] + this.f2970d[m27567r];
    }

    /* renamed from: k */
    public final int m27574k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f2972f[i] <= j; i4++) {
            if (!z || (this.f2971e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f2967a) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: l */
    public synchronized boolean m27573l(Format format) {
        if (format == null) {
            this.f2982p = true;
            return false;
        }
        this.f2982p = false;
        if (sq1.m10016b(format, this.f2983q)) {
            return false;
        }
        this.f2983q = format;
        return true;
    }

    /* renamed from: m */
    public int m27572m() {
        return this.f2976j;
    }

    /* renamed from: n */
    public synchronized long m27571n() {
        return this.f2975i == 0 ? Long.MIN_VALUE : this.f2972f[this.f2977k];
    }

    /* renamed from: o */
    public synchronized long m27570o() {
        return this.f2980n;
    }

    /* renamed from: p */
    public final long m27569p(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int m27567r = m27567r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f2972f[m27567r]);
            if ((this.f2971e[m27567r] & 1) != 0) {
                break;
            }
            m27567r--;
            if (m27567r == -1) {
                m27567r = this.f2967a - 1;
            }
        }
        return j;
    }

    /* renamed from: q */
    public int m27568q() {
        return this.f2976j + this.f2978l;
    }

    /* renamed from: r */
    public final int m27567r(int i) {
        int i2 = this.f2977k + i;
        int i3 = this.f2967a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: s */
    public synchronized Format m27566s() {
        return this.f2982p ? null : this.f2983q;
    }

    /* renamed from: t */
    public int m27565t() {
        return this.f2976j + this.f2975i;
    }

    /* renamed from: u */
    public synchronized boolean m27564u() {
        return this.f2978l != this.f2975i;
    }

    /* renamed from: v */
    public int m27563v() {
        return m27564u() ? this.f2968b[m27567r(this.f2978l)] : this.f2984r;
    }

    /* renamed from: w */
    public synchronized int m27562w(k30 k30Var, C1454gq c1454gq, boolean z, boolean z2, Format format, C0610a c0610a) {
        if (!m27564u()) {
            if (z2) {
                c1454gq.m11435l(4);
                return -4;
            }
            Format format2 = this.f2983q;
            if (format2 == null || (!z && format2 == format)) {
                return -3;
            }
            k30Var.f15633a = format2;
            return -5;
        }
        int m27567r = m27567r(this.f2978l);
        if (!z && this.f2974h[m27567r] == format) {
            if (c1454gq.m21348q()) {
                return -3;
            }
            c1454gq.f11566s = this.f2972f[m27567r];
            c1454gq.m11435l(this.f2971e[m27567r]);
            c0610a.f2985a = this.f2970d[m27567r];
            c0610a.f2986b = this.f2969c[m27567r];
            c0610a.f2987c = this.f2973g[m27567r];
            this.f2978l++;
            return -4;
        }
        k30Var.f15633a = this.f2974h[m27567r];
        return -5;
    }

    /* renamed from: x */
    public void m27561x(boolean z) {
        this.f2975i = 0;
        this.f2976j = 0;
        this.f2977k = 0;
        this.f2978l = 0;
        this.f2981o = true;
        this.f2979m = Long.MIN_VALUE;
        this.f2980n = Long.MIN_VALUE;
        if (z) {
            this.f2983q = null;
            this.f2982p = true;
        }
    }

    /* renamed from: y */
    public synchronized void m27560y() {
        this.f2978l = 0;
    }

    /* renamed from: z */
    public synchronized boolean m27559z(int i) {
        boolean z;
        int i2 = this.f2976j;
        if (i2 > i || i > this.f2975i + i2) {
            z = false;
        } else {
            this.f2978l = i - i2;
            z = true;
        }
        return z;
    }
}
