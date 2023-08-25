package com.daaw;
/* loaded from: classes2.dex */
public final class i65 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ gk5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i65(gk5 gk5Var, String str, String str2, Object obj, boolean z) {
        super(gk5Var, true);
        this.x = gk5Var;
        this.t = str;
        this.u = str2;
        this.v = obj;
        this.w = z;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.x.i;
        ((ju3) ry0.j(ju3Var)).setUserProperty(this.t, this.u, nt0.g3(this.v), this.w, this.p);
    }
}
