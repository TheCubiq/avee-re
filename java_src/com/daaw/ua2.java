package com.daaw;

import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class ua2 implements bb2 {

    /* renamed from: a */
    public final ab2 f28838a;

    /* renamed from: b */
    public final long f28839b;

    /* renamed from: c */
    public final long f28840c;

    /* renamed from: d */
    public final gb2 f28841d;

    /* renamed from: e */
    public int f28842e;

    /* renamed from: f */
    public long f28843f;

    /* renamed from: g */
    public long f28844g;

    /* renamed from: h */
    public long f28845h;

    /* renamed from: i */
    public long f28846i;

    /* renamed from: j */
    public long f28847j;

    /* renamed from: k */
    public long f28848k;

    /* renamed from: l */
    public long f28849l;

    public ua2(gb2 gb2Var, long j, long j2, long j3, long j4, boolean z) {
        uo4.m7874d(j >= 0 && j2 > j);
        this.f28841d = gb2Var;
        this.f28839b = j;
        this.f28840c = j2;
        if (j3 == j2 - j || z) {
            this.f28843f = j4;
            this.f28842e = 4;
        } else {
            this.f28842e = 0;
        }
        this.f28838a = new ab2();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // com.daaw.bb2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo7303a(k09 k09Var) {
        long j;
        ab2 ab2Var;
        long m19402b0;
        int i = this.f28842e;
        if (i == 0) {
            long zzf = k09Var.zzf();
            this.f28844g = zzf;
            this.f28842e = 1;
            long j2 = this.f28840c - 65307;
            if (j2 > zzf) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j3 = this.f28846i;
                long j4 = this.f28847j;
                if (j3 != j4) {
                    long zzf2 = k09Var.zzf();
                    if (this.f28838a.m27538c(k09Var, j4)) {
                        this.f28838a.m27539b(k09Var, false);
                        k09Var.zzj();
                        long j5 = this.f28845h;
                        ab2 ab2Var2 = this.f28838a;
                        long j6 = ab2Var2.f3041b;
                        long j7 = j5 - j6;
                        int i2 = ab2Var2.f3043d + ab2Var2.f3044e;
                        if (j7 < 0 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.f28847j = zzf2;
                                this.f28849l = j6;
                            } else {
                                this.f28846i = k09Var.zzf() + i2;
                                this.f28848k = j6;
                            }
                            long j8 = this.f28847j;
                            long j9 = this.f28846i;
                            long j10 = j8 - j9;
                            if (j10 < 100000) {
                                this.f28847j = j9;
                                m19402b0 = j9;
                            } else {
                                m19402b0 = it5.m19402b0((k09Var.zzf() - (i2 * (j7 <= 0 ? 2L : 1L))) + ((j7 * j10) / (this.f28849l - this.f28848k)), j9, j8 - 1);
                            }
                        }
                    } else {
                        m19402b0 = this.f28846i;
                        if (m19402b0 == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (m19402b0 == -1) {
                        return m19402b0;
                    }
                    this.f28842e = 3;
                }
                m19402b0 = -1;
                if (m19402b0 == -1) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.f28838a.m27538c(k09Var, -1L);
                this.f28838a.m27539b(k09Var, false);
                ab2 ab2Var3 = this.f28838a;
                if (ab2Var3.f3041b > this.f28845h) {
                    k09Var.zzj();
                    this.f28842e = 4;
                    return -(this.f28848k + 2);
                }
                ((rz8) k09Var).m10811l(ab2Var3.f3043d + ab2Var3.f3044e, false);
                this.f28846i = k09Var.zzf();
                this.f28848k = this.f28838a.f3041b;
            }
        }
        this.f28838a.m27540a();
        if (this.f28838a.m27538c(k09Var, -1L)) {
            this.f28838a.m27539b(k09Var, false);
            ab2 ab2Var4 = this.f28838a;
            ((rz8) k09Var).m10811l(ab2Var4.f3043d + ab2Var4.f3044e, false);
            do {
                j = this.f28838a.f3041b;
                ab2 ab2Var5 = this.f28838a;
                if ((ab2Var5.f3040a & 4) == 4 || !ab2Var5.m27538c(k09Var, -1L) || k09Var.zzf() >= this.f28840c || !this.f28838a.m27539b(k09Var, true)) {
                    break;
                }
                ab2Var = this.f28838a;
            } while (n09.m15606e(k09Var, ab2Var.f3043d + ab2Var.f3044e));
            this.f28843f = j;
            this.f28842e = 4;
            return this.f28844g;
        }
        throw new EOFException();
    }

    @Override // com.daaw.bb2
    /* renamed from: b */
    public final void mo7302b(long j) {
        this.f28845h = it5.m19402b0(j, 0L, this.f28843f - 1);
        this.f28842e = 2;
        this.f28846i = this.f28839b;
        this.f28847j = this.f28840c;
        this.f28848k = 0L;
        this.f28849l = this.f28843f;
    }

    @Override // com.daaw.bb2
    public final /* bridge */ /* synthetic */ i42 zze() {
        if (this.f28843f != 0) {
            return new ta2(this, null);
        }
        return null;
    }
}
