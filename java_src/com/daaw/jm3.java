package com.daaw;
/* loaded from: classes.dex */
public final class jm3 {

    /* renamed from: a */
    public final jl3 f15201a;

    /* renamed from: b */
    public f77 f15202b;

    public jm3(jl3 jl3Var) {
        this.f15201a = jl3Var;
    }

    /* renamed from: a */
    public final mm3 m18412a(String str, ql3 ql3Var, pl3 pl3Var) {
        m18409d();
        return new mm3(this.f15202b, "google.afma.activeView.handleUpdate", ql3Var, pl3Var);
    }

    /* renamed from: b */
    public final void m18411b(final String str, final zg3 zg3Var) {
        m18409d();
        this.f15202b = s67.m10629n(this.f15202b, new w57() { // from class: com.daaw.cm3
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                kl3 kl3Var = (kl3) obj;
                kl3Var.mo16862B0(str, zg3Var);
                return s67.m10634i(kl3Var);
            }
        }, z04.f34310f);
    }

    /* renamed from: c */
    public final void m18410c(final String str, final zg3 zg3Var) {
        this.f15202b = s67.m10630m(this.f15202b, new ey6() { // from class: com.daaw.dm3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                kl3 kl3Var = (kl3) obj;
                kl3Var.mo16861d0(str, zg3Var);
                return kl3Var;
            }
        }, z04.f34310f);
    }

    /* renamed from: d */
    public final void m18409d() {
        if (this.f15202b == null) {
            final e14 e14Var = new e14();
            this.f15202b = e14Var;
            this.f15201a.m18433b(null).m17206e(new i14() { // from class: com.daaw.hm3
                @Override // com.daaw.i14
                public final void zza(Object obj) {
                    e14.this.m23797b((kl3) obj);
                }
            }, new g14() { // from class: com.daaw.im3
                @Override // com.daaw.g14
                public final void zza() {
                    e14.this.m23796c(new ml3("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
