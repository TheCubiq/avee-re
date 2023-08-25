package com.daaw;
/* loaded from: classes.dex */
public final class l55 implements ir4 {

    /* renamed from: p */
    public final j35 f17070p;

    /* renamed from: q */
    public final o35 f17071q;

    public l55(j35 j35Var, o35 o35Var) {
        this.f17070p = j35Var;
        this.f17071q = o35Var;
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        j35 j35Var = this.f17070p;
        if (j35Var.m19124c0() == null) {
            return;
        }
        a74 m19131Y = j35Var.m19131Y();
        a74 m19130Z = j35Var.m19130Z();
        if (m19131Y == null) {
            m19131Y = m19130Z == null ? null : m19130Z;
        }
        if (!this.f17071q.mo14579d() || m19131Y == null) {
            return;
        }
        m19131Y.mo6434T("onSdkImpression", new C1370g6());
    }
}
