package com.daaw;
/* loaded from: classes.dex */
public final class k62 extends x09 {

    /* renamed from: b */
    public final long f15704b;

    public k62(k09 k09Var, long j) {
        super(k09Var);
        uo4.m7874d(k09Var.zzf() >= j);
        this.f15704b = j;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zzd() {
        return super.zzd() - this.f15704b;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zze() {
        return super.zze() - this.f15704b;
    }

    @Override // com.daaw.x09, com.daaw.k09
    public final long zzf() {
        return super.zzf() - this.f15704b;
    }
}
