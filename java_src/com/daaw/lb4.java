package com.daaw;
/* loaded from: classes.dex */
public final class lb4 implements xh4 {
    public final bb4 a;
    public if6 b;
    public ge6 c;
    public pw4 d;
    public up4 e;

    public /* synthetic */ lb4(bb4 bb4Var, kb4 kb4Var) {
        this.a = bb4Var;
    }

    @Override // com.daaw.xh4
    public final /* synthetic */ xh4 a(up4 up4Var) {
        this.e = up4Var;
        return this;
    }

    @Override // com.daaw.xh4
    public final /* synthetic */ xh4 b(pw4 pw4Var) {
        this.d = pw4Var;
        return this;
    }

    @Override // com.daaw.qp4
    public final /* synthetic */ qp4 f(ge6 ge6Var) {
        this.c = ge6Var;
        return this;
    }

    @Override // com.daaw.qp4
    public final /* synthetic */ qp4 j(if6 if6Var) {
        this.b = if6Var;
        return this;
    }

    @Override // com.daaw.qp4
    public final /* bridge */ /* synthetic */ Object zzh() {
        e08.c(this.d, pw4.class);
        e08.c(this.e, up4.class);
        return new nb4(this.a, new ln4(), new xj6(), new cp4(), new xd5(), this.d, this.e, null, this.b, this.c, null);
    }
}
