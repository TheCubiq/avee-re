package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j52 {

    /* renamed from: a */
    public final m42 f14353a;

    /* renamed from: b */
    public final int f14354b;

    /* renamed from: c */
    public final int f14355c;

    /* renamed from: d */
    public final long f14356d;

    /* renamed from: e */
    public final int f14357e;

    /* renamed from: f */
    public int f14358f;

    /* renamed from: g */
    public int f14359g;

    /* renamed from: h */
    public int f14360h;

    /* renamed from: i */
    public int f14361i;

    /* renamed from: j */
    public int f14362j;

    /* renamed from: k */
    public long[] f14363k;

    /* renamed from: l */
    public int[] f14364l;

    public j52(int i, int i2, long j, int i3, m42 m42Var) {
        i2 = i2 != 1 ? 2 : i2;
        this.f14356d = j;
        this.f14357e = i3;
        this.f14353a = m42Var;
        this.f14354b = m18863i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f14355c = i2 == 2 ? m18863i(i, 1650720768) : -1;
        this.f14363k = new long[512];
        this.f14364l = new int[512];
    }

    /* renamed from: i */
    public static int m18863i(int i, int i2) {
        return ((i / 10) + 48) | (((i % 10) + 48) << 8) | i2;
    }

    /* renamed from: a */
    public final g42 m18871a(long j) {
        int m18862j = (int) (j / m18862j(1));
        int m19419M = it5.m19419M(this.f14364l, m18862j, true, true);
        if (this.f14364l[m19419M] == m18862j) {
            j42 m18861k = m18861k(m19419M);
            return new g42(m18861k, m18861k);
        }
        j42 m18861k2 = m18861k(m19419M);
        int i = m19419M + 1;
        return i < this.f14363k.length ? new g42(m18861k2, m18861k(i)) : new g42(m18861k2, m18861k2);
    }

    /* renamed from: b */
    public final void m18870b(long j) {
        if (this.f14362j == this.f14364l.length) {
            long[] jArr = this.f14363k;
            this.f14363k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f14364l;
            this.f14364l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f14363k;
        int i = this.f14362j;
        jArr2[i] = j;
        this.f14364l[i] = this.f14361i;
        this.f14362j = i + 1;
    }

    /* renamed from: c */
    public final void m18869c() {
        this.f14363k = Arrays.copyOf(this.f14363k, this.f14362j);
        this.f14364l = Arrays.copyOf(this.f14364l, this.f14362j);
    }

    /* renamed from: d */
    public final void m18868d() {
        this.f14361i++;
    }

    /* renamed from: e */
    public final void m18867e(int i) {
        this.f14358f = i;
        this.f14359g = i;
    }

    /* renamed from: f */
    public final void m18866f(long j) {
        int i;
        if (this.f14362j == 0) {
            i = 0;
        } else {
            i = this.f14364l[it5.m19418N(this.f14363k, j, true, true)];
        }
        this.f14360h = i;
    }

    /* renamed from: g */
    public final boolean m18865g(int i) {
        return this.f14354b == i || this.f14355c == i;
    }

    /* renamed from: h */
    public final boolean m18864h(k09 k09Var) {
        int i = this.f14359g;
        int mo16219e = i - this.f14353a.mo16219e(k09Var, i, false);
        this.f14359g = mo16219e;
        boolean z = mo16219e == 0;
        if (z) {
            if (this.f14358f > 0) {
                this.f14353a.mo16222b(m18862j(this.f14360h), Arrays.binarySearch(this.f14364l, this.f14360h) >= 0 ? 1 : 0, this.f14358f, 0, null);
            }
            this.f14360h++;
        }
        return z;
    }

    /* renamed from: j */
    public final long m18862j(int i) {
        return (this.f14356d * i) / this.f14357e;
    }

    /* renamed from: k */
    public final j42 m18861k(int i) {
        return new j42(this.f14364l[i] * m18862j(1), this.f14363k[i]);
    }
}
