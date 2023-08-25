package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class d15 implements fs4, zzo, ir4 {
    public final Context p;
    public final a74 q;
    public final th6 r;
    public final zzchu s;
    public final k43 t;
    public yd0 u;

    public d15(Context context, a74 a74Var, th6 th6Var, zzchu zzchuVar, k43 k43Var) {
        this.p = context;
        this.q = a74Var;
        this.r = th6Var;
        this.s = zzchuVar;
        this.t = k43Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.u == null || this.q == null) {
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.D4)).booleanValue()) {
            return;
        }
        this.q.T("onSdkImpression", new g6());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.u = null;
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (this.u == null || this.q == null) {
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.D4)).booleanValue()) {
            this.q.T("onSdkImpression", new g6());
        }
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        pq5 pq5Var;
        oq5 oq5Var;
        k43 k43Var = this.t;
        if ((k43Var == k43.REWARD_BASED_VIDEO_AD || k43Var == k43.INTERSTITIAL || k43Var == k43.APP_OPEN) && this.r.U && this.q != null && zzt.zzA().d(this.p)) {
            zzchu zzchuVar = this.s;
            String str = zzchuVar.q + "." + zzchuVar.r;
            String a = this.r.W.a();
            if (this.r.W.b() == 1) {
                oq5Var = oq5.VIDEO;
                pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
            } else {
                pq5Var = this.r.Z == 2 ? pq5.UNSPECIFIED : pq5.BEGIN_TO_RENDER;
                oq5Var = oq5.HTML_DISPLAY;
            }
            yd0 c = zzt.zzA().c(str, this.q.h(), "", "javascript", a, pq5Var, oq5Var, this.r.n0);
            this.u = c;
            if (c != null) {
                zzt.zzA().b(this.u, (View) this.q);
                this.q.R(this.u);
                zzt.zzA().zzd(this.u);
                this.q.T("onSdkLoaded", new g6());
            }
        }
    }
}
