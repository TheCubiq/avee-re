package com.daaw;
/* loaded from: classes.dex */
public final class l62 implements i42 {
    public final /* synthetic */ i42 a;
    public final /* synthetic */ m62 b;

    public l62(m62 m62Var, i42 i42Var) {
        this.b = m62Var;
        this.a = i42Var;
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        long j2;
        long j3;
        g42 b = this.a.b(j);
        j42 j42Var = b.a;
        long j4 = j42Var.a;
        long j5 = j42Var.b;
        j2 = this.b.p;
        j42 j42Var2 = new j42(j4, j5 + j2);
        j42 j42Var3 = b.b;
        long j6 = j42Var3.a;
        long j7 = j42Var3.b;
        j3 = this.b.p;
        return new g42(j42Var2, new j42(j6, j7 + j3));
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.a.zze();
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.a.zzh();
    }
}
