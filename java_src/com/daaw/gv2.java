package com.daaw;
/* loaded from: classes.dex */
public final class gv2 implements kw2 {
    public final kw2[] p;

    public gv2(kw2[] kw2VarArr) {
        this.p = kw2VarArr;
    }

    @Override // com.daaw.kw2
    public final boolean a(long j) {
        kw2[] kw2VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (kw2 kw2Var : this.p) {
                if (kw2Var.zza() == zza) {
                    z |= kw2Var.a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.daaw.kw2
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (kw2 kw2Var : this.p) {
            long zza = kw2Var.zza();
            if (zza != Long.MIN_VALUE) {
                j = Math.min(j, zza);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
