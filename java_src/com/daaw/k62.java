package com.daaw;
/* loaded from: classes.dex */
public final class k62 extends x09 {
    public final long b;

    public k62(k09 k09Var, long j) {
        super(k09Var);
        uo4.d(k09Var.zzf() >= j);
        this.b = j;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zzd() {
        return super.zzd() - this.b;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zze() {
        return super.zze() - this.b;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zzf() {
        return super.zzf() - this.b;
    }
}
