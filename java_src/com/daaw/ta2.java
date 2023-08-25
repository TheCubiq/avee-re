package com.daaw;
/* loaded from: classes.dex */
public final class ta2 implements i42 {

    /* renamed from: a */
    public final /* synthetic */ ua2 f27155a;

    public /* synthetic */ ta2(ua2 ua2Var, sa2 sa2Var) {
        this.f27155a = ua2Var;
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        gb2 gb2Var;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        ua2 ua2Var = this.f27155a;
        gb2Var = ua2Var.f28841d;
        long m21824f = gb2Var.m21824f(j);
        j2 = ua2Var.f28839b;
        j3 = ua2Var.f28840c;
        j4 = ua2Var.f28839b;
        j5 = ua2Var.f28843f;
        j6 = ua2Var.f28839b;
        j7 = ua2Var.f28840c;
        j42 j42Var = new j42(j, it5.m19402b0((-30000) + j2 + ((m21824f * (j3 - j4)) / j5), j6, j7 - 1));
        return new g42(j42Var, j42Var);
    }

    @Override // com.daaw.i42
    public final long zze() {
        gb2 gb2Var;
        long j;
        ua2 ua2Var = this.f27155a;
        gb2Var = ua2Var.f28841d;
        j = ua2Var.f28843f;
        return gb2Var.m21825e(j);
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
