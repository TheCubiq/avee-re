package com.daaw;
/* loaded from: classes2.dex */
public final class bs4 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ gk5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs4(gk5 gk5Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(gk5Var, false);
        this.v = gk5Var;
        this.t = str;
        this.u = obj;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.v.i;
        ((ju3) ry0.j(ju3Var)).logHealthData(5, this.t, nt0.g3(this.u), nt0.g3(null), nt0.g3(null));
    }
}
