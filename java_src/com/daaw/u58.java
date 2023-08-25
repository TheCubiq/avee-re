package com.daaw;
/* loaded from: classes2.dex */
public final class u58 extends hl2 {

    /* renamed from: e */
    public final /* synthetic */ x78 f28584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u58(x78 x78Var, xe7 xe7Var) {
        super(xe7Var);
        this.f28584e = x78Var;
    }

    @Override // com.daaw.hl2
    /* renamed from: c */
    public final void mo8554c() {
        x78 x78Var = this.f28584e;
        x78Var.mo6991f();
        if (x78Var.m5449z()) {
            x78Var.f25143a.mo3895i().m14156v().m20653a("Inactivity, disconnecting from the service");
            x78Var.m5467Q();
        }
    }
}
