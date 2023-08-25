package com.daaw;
/* loaded from: classes.dex */
public final class gv2 implements kw2 {

    /* renamed from: p */
    public final kw2[] f11764p;

    public gv2(kw2[] kw2VarArr) {
        this.f11764p = kw2VarArr;
    }

    @Override // com.daaw.kw2
    /* renamed from: a */
    public final boolean mo1848a(long j) {
        kw2[] kw2VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (kw2 kw2Var : this.f11764p) {
                if (kw2Var.zza() == zza) {
                    z |= kw2Var.mo1848a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.daaw.kw2
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (kw2 kw2Var : this.f11764p) {
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
