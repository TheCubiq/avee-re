package com.daaw;
/* loaded from: classes.dex */
public class qz8 implements i42 {

    /* renamed from: a */
    public final long f24674a;

    /* renamed from: b */
    public final long f24675b;

    /* renamed from: c */
    public final int f24676c;

    /* renamed from: d */
    public final long f24677d;

    /* renamed from: e */
    public final int f24678e;

    /* renamed from: f */
    public final long f24679f;

    public qz8(long j, long j2, int i, int i2, boolean z) {
        long m11893c;
        this.f24674a = j;
        this.f24675b = j2;
        this.f24676c = i2 == -1 ? 1 : i2;
        this.f24678e = i;
        if (j == -1) {
            this.f24677d = -1L;
            m11893c = -9223372036854775807L;
        } else {
            this.f24677d = j - j2;
            m11893c = m11893c(j, j2, i);
        }
        this.f24679f = m11893c;
    }

    /* renamed from: c */
    public static long m11893c(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    /* renamed from: a */
    public final long m11894a(long j) {
        return m11893c(j, this.f24675b, this.f24678e);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        long j2 = this.f24677d;
        if (j2 == -1) {
            j42 j42Var = new j42(0L, this.f24675b);
            return new g42(j42Var, j42Var);
        }
        int i = this.f24678e;
        long j3 = this.f24676c;
        long j4 = (((i * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.f24675b + Math.max(j4, 0L);
        long m11894a = m11894a(max);
        j42 j42Var2 = new j42(m11894a, max);
        if (this.f24677d != -1 && m11894a < j) {
            long j5 = max + this.f24676c;
            if (j5 < this.f24674a) {
                return new g42(j42Var2, new j42(m11894a(j5), j5));
            }
        }
        return new g42(j42Var2, j42Var2);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f24679f;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.f24677d != -1;
    }
}
