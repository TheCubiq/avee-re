package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;
/* loaded from: classes.dex */
public final class h15 implements lq4, cy4 {
    public final sx3 p;
    public final Context q;
    public final ky3 r;
    public final View s;
    public String t;
    public final k43 u;

    public h15(sx3 sx3Var, Context context, ky3 ky3Var, View view, k43 k43Var) {
        this.p = sx3Var;
        this.q = context;
        this.r = ky3Var;
        this.s = view;
        this.u = k43Var;
    }

    @Override // com.daaw.lq4
    public final void T() {
    }

    @Override // com.daaw.lq4
    public final void c() {
    }

    @Override // com.daaw.lq4
    @ParametersAreNonnullByDefault
    public final void m(cv3 cv3Var, String str, String str2) {
        if (this.r.z(this.q)) {
            try {
                ky3 ky3Var = this.r;
                Context context = this.q;
                ky3Var.t(context, ky3Var.f(context), this.p.b(), cv3Var.zzc(), cv3Var.zzb());
            } catch (RemoteException e) {
                k04.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.daaw.cy4
    public final void zzf() {
    }

    @Override // com.daaw.cy4
    public final void zzg() {
        if (this.u == k43.APP_OPEN) {
            return;
        }
        String i = this.r.i(this.q);
        this.t = i;
        this.t = String.valueOf(i).concat(this.u == k43.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        this.p.c(false);
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        View view = this.s;
        if (view != null && this.t != null) {
            this.r.x(view.getContext(), this.t);
        }
        this.p.c(true);
    }
}
