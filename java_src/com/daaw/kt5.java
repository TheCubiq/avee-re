package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class kt5 implements c15 {
    public final th6 a;
    public final dp3 b;
    public final AdFormat c;
    public gr4 d = null;

    public kt5(th6 th6Var, dp3 dp3Var, AdFormat adFormat) {
        this.a = th6Var;
        this.b = dp3Var;
        this.c = adFormat;
    }

    @Override // com.daaw.c15
    public final void a(boolean z, Context context, br4 br4Var) {
        boolean q1;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.c.ordinal();
            if (ordinal == 1) {
                q1 = this.b.q1(nt0.g3(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    q1 = this.b.q(nt0.g3(context));
                }
                throw new b15("Adapter failed to show.");
            } else {
                q1 = this.b.L1(nt0.g3(context));
            }
            if (q1) {
                if (this.d == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().b(g93.p1)).booleanValue() || this.a.Z != 2) {
                    return;
                }
                this.d.zza();
                return;
            }
            throw new b15("Adapter failed to show.");
        } catch (Throwable th) {
            throw new b15(th);
        }
    }

    public final void b(gr4 gr4Var) {
        this.d = gr4Var;
    }
}
