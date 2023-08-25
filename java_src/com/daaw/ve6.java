package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ve6 {
    public final fk6 a;
    public final rp4 b;
    public final Executor c;
    public ue6 d;

    public ve6(fk6 fk6Var, rp4 rp4Var, Executor executor) {
        this.a = fk6Var;
        this.b = rp4Var;
        this.c = executor;
    }

    public final f77 c() {
        f77 f;
        ue6 ue6Var = this.d;
        if (ue6Var == null) {
            if (((Boolean) lb3.a.e()).booleanValue()) {
                f = s67.f(s67.m(j67.D(this.b.zzb().e(this.a.zza())), new se6(this), this.c), pk5.class, new re6(this), this.c);
            } else {
                ue6 ue6Var2 = new ue6(null, e(), null);
                this.d = ue6Var2;
                f = s67.i(ue6Var2);
            }
            return s67.m(f, new ey6() { // from class: com.daaw.qe6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return (ue6) obj;
                }
            }, this.c);
        }
        return s67.i(ue6Var);
    }

    @Deprecated
    public final rk6 e() {
        ri6 zzg = this.b.zzg();
        return this.a.c(zzg.d, zzg.f, zzg.j);
    }
}
