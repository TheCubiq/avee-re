package com.daaw;

import com.google.android.gms.internal.ads.zzccb;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class le6 implements cf6 {

    /* renamed from: a */
    public final fk6 f17358a;

    /* renamed from: b */
    public final Executor f17359b;

    /* renamed from: c */
    public final o67 f17360c = new je6(this);

    public le6(fk6 fk6Var, Executor executor) {
        this.f17358a = fk6Var;
        this.f17359b = executor;
    }

    @Override // com.daaw.cf6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ f77 mo13423a(df6 df6Var, ye6 ye6Var, Object obj) {
        return m16982c(df6Var, ye6Var, null);
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m16983b(rp4 rp4Var, ue6 ue6Var) {
        rk6 rk6Var = ue6Var.f29015b;
        zzccb zzccbVar = ue6Var.f29014a;
        qk6 mo21508b = rk6Var != null ? this.f17358a.mo21508b(rk6Var) : null;
        if (rk6Var == null) {
            return s67.m10634i(null);
        }
        if (mo21508b != null && zzccbVar != null) {
            s67.m10625r(rp4Var.zzb().m18384h(zzccbVar), this.f17360c, this.f17359b);
        }
        return s67.m10634i(new ke6(rk6Var, zzccbVar, mo21508b));
    }

    /* renamed from: c */
    public final f77 m16982c(df6 df6Var, ye6 ye6Var, final rp4 rp4Var) {
        return s67.m10637f(s67.m10629n(j67.m18784D(new ve6(this.f17358a, rp4Var, this.f17359b).m7208c()), new w57() { // from class: com.daaw.he6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return le6.this.m16983b(rp4Var, (ue6) obj);
            }
        }, this.f17359b), Exception.class, new ie6(this), this.f17359b);
    }

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
