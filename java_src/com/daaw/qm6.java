package com.daaw;
/* loaded from: classes.dex */
public final class qm6 implements o67 {
    public final /* synthetic */ gm6 a;
    public final /* synthetic */ vm6 b;

    public qm6(vm6 vm6Var, gm6 gm6Var) {
        this.b = vm6Var;
        this.a = gm6Var;
    }

    @Override // com.daaw.o67
    public final void a(Object obj) {
        xm6 xm6Var;
        xm6Var = this.b.f.c;
        xm6Var.T(this.a);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        xm6 xm6Var;
        xm6Var = this.b.f.c;
        xm6Var.M(this.a, th);
    }
}
