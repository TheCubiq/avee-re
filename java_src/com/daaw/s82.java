package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadi;
/* loaded from: classes.dex */
public final class s82 implements x82 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public s82(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? it5.f0(jArr2[jArr2.length - 1]) : j;
    }

    public static s82 a(long j, zzadi zzadiVar, long j2) {
        int length = zzadiVar.t.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzadiVar.r + zzadiVar.t[i3];
            j3 += zzadiVar.s + zzadiVar.u[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new s82(jArr, jArr2, j2);
    }

    public static Pair c(long j, long[] jArr, long[] jArr2) {
        double d;
        Long valueOf;
        Long valueOf2;
        int N = it5.N(jArr, j, true, true);
        long j2 = jArr[N];
        long j3 = jArr2[N];
        int i = N + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            if (j4 == j2) {
                d = 0.0d;
            } else {
                double d2 = j;
                double d3 = j2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = j4 - j2;
                Double.isNaN(d4);
                d = (d2 - d3) / d4;
            }
            valueOf = Long.valueOf(j);
            double d5 = j5 - j3;
            Double.isNaN(d5);
            valueOf2 = Long.valueOf(((long) (d * d5)) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        Pair c = c(it5.j0(it5.b0(j, 0L, this.c)), this.b, this.a);
        long longValue = ((Long) c.first).longValue();
        j42 j42Var = new j42(it5.f0(longValue), ((Long) c.second).longValue());
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.x82
    public final long e(long j) {
        return it5.f0(((Long) c(j, this.a, this.b).second).longValue());
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return -1L;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
