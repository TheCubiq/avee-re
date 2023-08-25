package com.daaw;

import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ae6 implements cf6 {

    /* renamed from: a */
    public rp4 f3136a;

    /* renamed from: b */
    public final Executor f3137b = m77.m16187b();

    @Override // com.daaw.cf6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ f77 mo13423a(df6 df6Var, ye6 ye6Var, Object obj) {
        return m27505c(df6Var, ye6Var, null);
    }

    /* renamed from: b */
    public final rp4 m27506b() {
        return this.f3136a;
    }

    /* renamed from: c */
    public final f77 m27505c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        qp4 mo3795a = ye6Var.mo3795a(df6Var.f7039b);
        mo3795a.mo7273j(new if6(true));
        rp4 rp4Var2 = (rp4) mo3795a.zzh();
        this.f3136a = rp4Var2;
        final jn4 zzb = rp4Var2.zzb();
        final qk6 qk6Var = new qk6();
        return s67.m10630m(s67.m10629n(j67.m18784D(zzb.m18382j()), new w57() { // from class: com.daaw.vd6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                qk6 qk6Var2 = qk6Var;
                jn4 jn4Var = zzb;
                fi6 fi6Var = (fi6) obj;
                qk6Var2.f24124b = fi6Var;
                Iterator it = fi6Var.f9624b.f8507a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((th6) it.next()).f27680a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return jn4Var.m18383i(s67.m10634i(fi6Var));
                    }
                }
                return s67.m10634i(null);
            }
        }, this.f3137b), new ey6() { // from class: com.daaw.zd6
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                qk6 qk6Var2 = qk6.this;
                qk6Var2.f24125c = (zl4) obj;
                return qk6Var2;
            }
        }, this.f3137b);
    }

    @Override // com.daaw.cf6
    public final /* synthetic */ Object zzd() {
        return this.f3136a;
    }
}
