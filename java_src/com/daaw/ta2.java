package com.daaw;
/* loaded from: classes.dex */
public final class ta2 implements i42 {
    public final /* synthetic */ ua2 a;

    public /* synthetic */ ta2(ua2 ua2Var, sa2 sa2Var) {
        this.a = ua2Var;
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        gb2 gb2Var;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        ua2 ua2Var = this.a;
        gb2Var = ua2Var.d;
        long f = gb2Var.f(j);
        j2 = ua2Var.b;
        j3 = ua2Var.c;
        j4 = ua2Var.b;
        j5 = ua2Var.f;
        j6 = ua2Var.b;
        j7 = ua2Var.c;
        j42 j42Var = new j42(j, it5.b0((-30000) + j2 + ((f * (j3 - j4)) / j5), j6, j7 - 1));
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.i42
    public final long zze() {
        gb2 gb2Var;
        long j;
        ua2 ua2Var = this.a;
        gb2Var = ua2Var.d;
        j = ua2Var.f;
        return gb2Var.e(j);
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
