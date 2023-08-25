package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadi;
/* loaded from: classes.dex */
public final class s82 implements x82 {

    /* renamed from: a */
    public final long[] f25999a;

    /* renamed from: b */
    public final long[] f26000b;

    /* renamed from: c */
    public final long f26001c;

    public s82(long[] jArr, long[] jArr2, long j) {
        this.f25999a = jArr;
        this.f26000b = jArr2;
        this.f26001c = j == -9223372036854775807L ? it5.m19394f0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static s82 m10528a(long j, zzadi zzadiVar, long j2) {
        int length = zzadiVar.f36754t.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzadiVar.f36752r + zzadiVar.f36754t[i3];
            j3 += zzadiVar.f36753s + zzadiVar.f36755u[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new s82(jArr, jArr2, j2);
    }

    /* renamed from: c */
    public static Pair m10527c(long j, long[] jArr, long[] jArr2) {
        double d;
        Long valueOf;
        Long valueOf2;
        int m19418N = it5.m19418N(jArr, j, true, true);
        long j2 = jArr[m19418N];
        long j3 = jArr2[m19418N];
        int i = m19418N + 1;
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
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        Pair m10527c = m10527c(it5.m19386j0(it5.m19402b0(j, 0L, this.f26001c)), this.f26000b, this.f25999a);
        long longValue = ((Long) m10527c.first).longValue();
        j42 j42Var = new j42(it5.m19394f0(longValue), ((Long) m10527c.second).longValue());
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.x82
    /* renamed from: e */
    public final long mo2629e(long j) {
        return it5.m19394f0(((Long) m10527c(j, this.f25999a, this.f26000b).second).longValue());
    }

    @Override // com.daaw.x82
    public final long zzb() {
        return -1L;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f26001c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
