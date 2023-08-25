package com.daaw;
/* loaded from: classes.dex */
public final class l62 implements i42 {

    /* renamed from: a */
    public final /* synthetic */ i42 f17088a;

    /* renamed from: b */
    public final /* synthetic */ m62 f17089b;

    public l62(m62 m62Var, i42 i42Var) {
        this.f17089b = m62Var;
        this.f17088a = i42Var;
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        long j2;
        long j3;
        g42 mo2631b = this.f17088a.mo2631b(j);
        j42 j42Var = mo2631b.f10252a;
        long j4 = j42Var.f14256a;
        long j5 = j42Var.f14257b;
        j2 = this.f17089b.f18473p;
        j42 j42Var2 = new j42(j4, j5 + j2);
        j42 j42Var3 = mo2631b.f10253b;
        long j6 = j42Var3.f14256a;
        long j7 = j42Var3.f14257b;
        j3 = this.f17089b.f18473p;
        return new g42(j42Var2, new j42(j6, j7 + j3));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f17088a.zze();
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.f17088a.zzh();
    }
}
