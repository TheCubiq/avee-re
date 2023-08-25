package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ve6 {

    /* renamed from: a */
    public final fk6 f30187a;

    /* renamed from: b */
    public final rp4 f30188b;

    /* renamed from: c */
    public final Executor f30189c;

    /* renamed from: d */
    public ue6 f30190d;

    public ve6(fk6 fk6Var, rp4 rp4Var, Executor executor) {
        this.f30187a = fk6Var;
        this.f30188b = rp4Var;
        this.f30189c = executor;
    }

    /* renamed from: c */
    public final f77 m7208c() {
        f77 m10637f;
        ue6 ue6Var = this.f30190d;
        if (ue6Var == null) {
            if (((Boolean) lb3.f17221a.m16137e()).booleanValue()) {
                m10637f = s67.m10637f(s67.m10630m(j67.m18784D(this.f30188b.zzb().m18387e(this.f30187a.zza())), new se6(this), this.f30189c), pk5.class, new re6(this), this.f30189c);
            } else {
                ue6 ue6Var2 = new ue6(null, m7206e(), null);
                this.f30190d = ue6Var2;
                m10637f = s67.m10634i(ue6Var2);
            }
            return s67.m10630m(m10637f, new ey6() { // from class: com.daaw.qe6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return (ue6) obj;
                }
            }, this.f30189c);
        }
        return s67.m10634i(ue6Var);
    }

    @Deprecated
    /* renamed from: e */
    public final rk6 m7206e() {
        ri6 zzg = this.f30188b.zzg();
        return this.f30187a.mo21507c(zzg.f25344d, zzg.f25346f, zzg.f25350j);
    }
}
