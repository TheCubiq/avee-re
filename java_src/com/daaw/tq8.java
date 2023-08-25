package com.daaw;
/* loaded from: classes.dex */
public final class tq8 implements vt8 {

    /* renamed from: p */
    public final vt8[] f27990p;

    public tq8(vt8[] vt8VarArr) {
        this.f27990p = vt8VarArr;
    }

    @Override // com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        vt8[] vt8VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (vt8 vt8Var : this.f27990p) {
                long zzc2 = vt8Var.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j;
                if (zzc2 == zzc || z3) {
                    z |= vt8Var.mo3303c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
        for (vt8 vt8Var : this.f27990p) {
            vt8Var.mo3296j(j);
        }
    }

    @Override // com.daaw.vt8
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (vt8 vt8Var : this.f27990p) {
            long zzb = vt8Var.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.vt8
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (vt8 vt8Var : this.f27990p) {
            long zzc = vt8Var.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.vt8
    public final boolean zzp() {
        for (vt8 vt8Var : this.f27990p) {
            if (vt8Var.zzp()) {
                return true;
            }
        }
        return false;
    }
}
