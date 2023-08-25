package com.daaw;

import com.google.android.gms.internal.ads.zzccb;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class le6 implements cf6 {
    public final fk6 a;
    public final Executor b;
    public final o67 c = new je6(this);

    public le6(fk6 fk6Var, Executor executor) {
        this.a = fk6Var;
        this.b = executor;
    }

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ f77 a(df6 df6Var, ye6 ye6Var, Object obj) {
        return c(df6Var, ye6Var, null);
    }

    public final /* synthetic */ f77 b(rp4 rp4Var, ue6 ue6Var) {
        rk6 rk6Var = ue6Var.b;
        zzccb zzccbVar = ue6Var.a;
        qk6 b = rk6Var != null ? this.a.b(rk6Var) : null;
        if (rk6Var == null) {
            return s67.i(null);
        }
        if (b != null && zzccbVar != null) {
            s67.r(rp4Var.zzb().h(zzccbVar), this.c, this.b);
        }
        return s67.i(new ke6(rk6Var, zzccbVar, b));
    }

    public final f77 c(df6 df6Var, ye6 ye6Var, final rp4 rp4Var) {
        return s67.f(s67.n(j67.D(new ve6(this.a, rp4Var, this.b).c()), new w57() { // from class: com.daaw.he6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return le6.this.b(rp4Var, (ue6) obj);
            }
        }, this.b), Exception.class, new ie6(this), this.b);
    }

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
