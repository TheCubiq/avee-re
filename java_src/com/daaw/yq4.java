package com.daaw;
/* loaded from: classes2.dex */
public final class yq4 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ oq3 w;
    public final /* synthetic */ gk5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq4(gk5 gk5Var, String str, String str2, boolean z, oq3 oq3Var) {
        super(gk5Var, true);
        this.x = gk5Var;
        this.t = str;
        this.u = str2;
        this.v = z;
        this.w = oq3Var;
    }

    @Override // com.daaw.l75
    public final void a() {
        ju3 ju3Var;
        ju3Var = this.x.i;
        ((ju3) ry0.j(ju3Var)).getUserProperties(this.t, this.u, this.v, this.w);
    }

    @Override // com.daaw.l75
    public final void b() {
        this.w.T0(null);
    }
}
