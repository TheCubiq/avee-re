package com.daaw;
/* loaded from: classes2.dex */
public final class u58 extends hl2 {
    public final /* synthetic */ x78 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u58(x78 x78Var, xe7 xe7Var) {
        super(xe7Var);
        this.e = x78Var;
    }

    @Override // com.daaw.hl2
    public final void c() {
        x78 x78Var = this.e;
        x78Var.f();
        if (x78Var.z()) {
            x78Var.a.i().v().a("Inactivity, disconnecting from the service");
            x78Var.Q();
        }
    }
}
