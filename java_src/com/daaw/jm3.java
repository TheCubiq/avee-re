package com.daaw;
/* loaded from: classes.dex */
public final class jm3 {
    public final jl3 a;
    public f77 b;

    public jm3(jl3 jl3Var) {
        this.a = jl3Var;
    }

    public final mm3 a(String str, ql3 ql3Var, pl3 pl3Var) {
        d();
        return new mm3(this.b, "google.afma.activeView.handleUpdate", ql3Var, pl3Var);
    }

    public final void b(final String str, final zg3 zg3Var) {
        d();
        this.b = s67.n(this.b, new w57() { // from class: com.daaw.cm3
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                kl3 kl3Var = (kl3) obj;
                kl3Var.B0(str, zg3Var);
                return s67.i(kl3Var);
            }
        }, z04.f);
    }

    public final void c(final String str, final zg3 zg3Var) {
        this.b = s67.m(this.b, new ey6() { // from class: com.daaw.dm3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                kl3 kl3Var = (kl3) obj;
                kl3Var.d0(str, zg3Var);
                return kl3Var;
            }
        }, z04.f);
    }

    public final void d() {
        if (this.b == null) {
            final e14 e14Var = new e14();
            this.b = e14Var;
            this.a.b(null).e(new i14() { // from class: com.daaw.hm3
                @Override // com.daaw.i14
                public final void zza(Object obj) {
                    e14.this.b((kl3) obj);
                }
            }, new g14() { // from class: com.daaw.im3
                @Override // com.daaw.g14
                public final void zza() {
                    e14.this.c(new ml3("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
