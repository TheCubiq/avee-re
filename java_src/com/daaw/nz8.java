package com.daaw;
/* loaded from: classes.dex */
public class nz8 {

    /* renamed from: a */
    public final hz8 f20871a;

    /* renamed from: b */
    public final mz8 f20872b;

    /* renamed from: c */
    public jz8 f20873c;

    /* renamed from: d */
    public final int f20874d;

    public nz8(kz8 kz8Var, mz8 mz8Var, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f20872b = mz8Var;
        this.f20874d = i;
        this.f20871a = new hz8(kz8Var, j, 0L, j3, j4, j5, j6);
    }

    /* renamed from: f */
    public static final int m14698f(k09 k09Var, long j, f42 f42Var) {
        if (j == k09Var.zzf()) {
            return 0;
        }
        f42Var.f9093a = j;
        return 1;
    }

    /* renamed from: g */
    public static final boolean m14697g(k09 k09Var, long j) {
        long zzf = j - k09Var.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((rz8) k09Var).m10811l((int) zzf, false);
        return true;
    }

    /* renamed from: a */
    public final int m14703a(k09 k09Var, f42 f42Var) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            jz8 jz8Var = this.f20873c;
            uo4.m7876b(jz8Var);
            j = jz8Var.f15565f;
            j2 = jz8Var.f15566g;
            j3 = jz8Var.f15567h;
            if (j2 - j <= this.f20874d) {
                m14701c(false, j);
                return m14698f(k09Var, j, f42Var);
            } else if (!m14697g(k09Var, j3)) {
                return m14698f(k09Var, j3, f42Var);
            } else {
                k09Var.zzj();
                mz8 mz8Var = this.f20872b;
                j4 = jz8Var.f15561b;
                lz8 mo9320a = mz8Var.mo9320a(k09Var, j4);
                i = mo9320a.f17931a;
                if (i == -3) {
                    m14701c(false, j3);
                    return m14698f(k09Var, j3, f42Var);
                } else if (i == -2) {
                    j10 = mo9320a.f17932b;
                    j11 = mo9320a.f17933c;
                    jz8.m18116h(jz8Var, j10, j11);
                } else if (i != -1) {
                    j5 = mo9320a.f17933c;
                    m14697g(k09Var, j5);
                    j6 = mo9320a.f17933c;
                    m14701c(true, j6);
                    j7 = mo9320a.f17933c;
                    return m14698f(k09Var, j7, f42Var);
                } else {
                    j8 = mo9320a.f17932b;
                    j9 = mo9320a.f17933c;
                    jz8.m18117g(jz8Var, j8, j9);
                }
            }
        }
    }

    /* renamed from: b */
    public final i42 m14702b() {
        return this.f20871a;
    }

    /* renamed from: c */
    public final void m14701c(boolean z, long j) {
        this.f20873c = null;
        this.f20872b.zzb();
    }

    /* renamed from: d */
    public final void m14700d(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        jz8 jz8Var = this.f20873c;
        if (jz8Var != null) {
            j6 = jz8Var.f15560a;
            if (j6 == j) {
                return;
            }
        }
        long m20307g = this.f20871a.m20307g(j);
        hz8 hz8Var = this.f20871a;
        j2 = hz8Var.f13088c;
        j3 = hz8Var.f13089d;
        j4 = hz8Var.f13090e;
        j5 = hz8Var.f13091f;
        this.f20873c = new jz8(j, m20307g, 0L, j2, j3, j4, j5);
    }

    /* renamed from: e */
    public final boolean m14699e() {
        return this.f20873c != null;
    }
}
