package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;
/* loaded from: classes.dex */
public final class h15 implements lq4, cy4 {

    /* renamed from: p */
    public final sx3 f11951p;

    /* renamed from: q */
    public final Context f11952q;

    /* renamed from: r */
    public final ky3 f11953r;

    /* renamed from: s */
    public final View f11954s;

    /* renamed from: t */
    public String f11955t;

    /* renamed from: u */
    public final k43 f11956u;

    public h15(sx3 sx3Var, Context context, ky3 ky3Var, View view, k43 k43Var) {
        this.f11951p = sx3Var;
        this.f11952q = context;
        this.f11953r = ky3Var;
        this.f11954s = view;
        this.f11956u = k43Var;
    }

    @Override // com.daaw.lq4
    /* renamed from: T */
    public final void mo5177T() {
    }

    @Override // com.daaw.lq4
    /* renamed from: c */
    public final void mo5175c() {
    }

    @Override // com.daaw.lq4
    @ParametersAreNonnullByDefault
    /* renamed from: m */
    public final void mo5170m(cv3 cv3Var, String str, String str2) {
        if (this.f11953r.m17317z(this.f11952q)) {
            try {
                ky3 ky3Var = this.f11953r;
                Context context = this.f11952q;
                ky3Var.m17323t(context, ky3Var.m17337f(context), this.f11951p.m9784b(), cv3Var.zzc(), cv3Var.zzb());
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
        if (this.f11956u == k43.APP_OPEN) {
            return;
        }
        String m17334i = this.f11953r.m17334i(this.f11952q);
        this.f11955t = m17334i;
        this.f11955t = String.valueOf(m17334i).concat(this.f11956u == k43.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        this.f11951p.m9783c(false);
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        View view = this.f11954s;
        if (view != null && this.f11955t != null) {
            this.f11953r.m17319x(view.getContext(), this.f11955t);
        }
        this.f11951p.m9783c(true);
    }
}
