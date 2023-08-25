package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class kt5 implements c15 {

    /* renamed from: a */
    public final th6 f16741a;

    /* renamed from: b */
    public final dp3 f16742b;

    /* renamed from: c */
    public final AdFormat f16743c;

    /* renamed from: d */
    public gr4 f16744d = null;

    public kt5(th6 th6Var, dp3 dp3Var, AdFormat adFormat) {
        this.f16741a = th6Var;
        this.f16742b = dp3Var;
        this.f16743c = adFormat;
    }

    @Override // com.daaw.c15
    /* renamed from: a */
    public final void mo3165a(boolean z, Context context, br4 br4Var) {
        boolean mo10072q1;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.f16743c.ordinal();
            if (ordinal == 1) {
                mo10072q1 = this.f16742b.mo10072q1(nt0.m14830g3(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    mo10072q1 = this.f16742b.mo10073q(nt0.m14830g3(context));
                }
                throw new b15("Adapter failed to show.");
            } else {
                mo10072q1 = this.f16742b.mo10087L1(nt0.m14830g3(context));
            }
            if (mo10072q1) {
                if (this.f16744d == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().m23658b(g93.f10788p1)).booleanValue() || this.f16741a.f27679Z != 2) {
                    return;
                }
                this.f16744d.zza();
                return;
            }
            throw new b15("Adapter failed to show.");
        } catch (Throwable th) {
            throw new b15(th);
        }
    }

    /* renamed from: b */
    public final void m17435b(gr4 gr4Var) {
        this.f16744d = gr4Var;
    }
}
