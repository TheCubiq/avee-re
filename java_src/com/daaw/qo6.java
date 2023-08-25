package com.daaw;
/* loaded from: classes.dex */
public final class qo6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ to6 f24224a;

    /* renamed from: b */
    public final /* synthetic */ io6 f24225b;

    /* renamed from: c */
    public final /* synthetic */ boolean f24226c;

    public qo6(to6 to6Var, io6 io6Var, boolean z) {
        this.f24224a = to6Var;
        this.f24225b = io6Var;
        this.f24226c = z;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final void mo2151a(Object obj) {
        to6 to6Var = this.f24224a;
        io6 io6Var = this.f24225b;
        io6Var.zzf(true);
        to6Var.m8902a(io6Var);
        if (this.f24226c) {
            this.f24224a.m8896g();
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        io6 io6Var = this.f24225b;
        if (io6Var.zzj()) {
            to6 to6Var = this.f24224a;
            io6Var.mo17590e(th);
            io6Var.zzf(false);
            to6Var.m8902a(io6Var);
            if (this.f24226c) {
                this.f24224a.m8896g();
            }
        }
    }
}
