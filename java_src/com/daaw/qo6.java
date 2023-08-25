package com.daaw;
/* loaded from: classes.dex */
public final class qo6 implements o67 {
    public final /* synthetic */ to6 a;
    public final /* synthetic */ io6 b;
    public final /* synthetic */ boolean c;

    public qo6(to6 to6Var, io6 io6Var, boolean z) {
        this.a = to6Var;
        this.b = io6Var;
        this.c = z;
    }

    @Override // com.daaw.o67
    public final void a(Object obj) {
        to6 to6Var = this.a;
        io6 io6Var = this.b;
        io6Var.zzf(true);
        to6Var.a(io6Var);
        if (this.c) {
            this.a.g();
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        io6 io6Var = this.b;
        if (io6Var.zzj()) {
            to6 to6Var = this.a;
            io6Var.e(th);
            io6Var.zzf(false);
            to6Var.a(io6Var);
            if (this.c) {
                this.a.g();
            }
        }
    }
}
