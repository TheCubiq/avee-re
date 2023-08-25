package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class ms5 extends qo3 {
    public final tq5 p;
    public final /* synthetic */ ns5 q;

    public /* synthetic */ ms5(ns5 ns5Var, tq5 tq5Var, ls5 ls5Var) {
        this.q = ns5Var;
        this.p = tq5Var;
    }

    @Override // com.daaw.ro3
    public final void P2(yd0 yd0Var) {
        ns5.e(this.q, (View) nt0.M(yd0Var));
        ((ys5) this.p.c).zzo();
    }

    @Override // com.daaw.ro3
    public final void U2(mn3 mn3Var) {
        ns5.d(this.q, mn3Var);
        ((ys5) this.p.c).zzo();
    }

    @Override // com.daaw.ro3
    public final void a(String str) {
        ((ys5) this.p.c).j0(0, str);
    }

    @Override // com.daaw.ro3
    public final void zzf(zze zzeVar) {
        ((ys5) this.p.c).q0(zzeVar);
    }
}
