package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class d15 implements fs4, zzo, ir4 {

    /* renamed from: p */
    public final Context f6365p;

    /* renamed from: q */
    public final a74 f6366q;

    /* renamed from: r */
    public final th6 f6367r;

    /* renamed from: s */
    public final zzchu f6368s;

    /* renamed from: t */
    public final k43 f6369t;

    /* renamed from: u */
    public yd0 f6370u;

    public d15(Context context, a74 a74Var, th6 th6Var, zzchu zzchuVar, k43 k43Var) {
        this.f6365p = context;
        this.f6366q = a74Var;
        this.f6367r = th6Var;
        this.f6368s = zzchuVar;
        this.f6369t = k43Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.f6370u == null || this.f6366q == null) {
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10396D4)).booleanValue()) {
            return;
        }
        this.f6366q.mo6434T("onSdkImpression", new C1370g6());
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
        this.f6370u = null;
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (this.f6370u == null || this.f6366q == null) {
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10396D4)).booleanValue()) {
            this.f6366q.mo6434T("onSdkImpression", new C1370g6());
        }
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        pq5 pq5Var;
        oq5 oq5Var;
        k43 k43Var = this.f6369t;
        if ((k43Var == k43.REWARD_BASED_VIDEO_AD || k43Var == k43.INTERSTITIAL || k43Var == k43.APP_OPEN) && this.f6367r.f27674U && this.f6366q != null && zzt.zzA().mo14876d(this.f6365p)) {
            zzchu zzchuVar = this.f6368s;
            String str = zzchuVar.f36994q + "." + zzchuVar.f36995r;
            String m8112a = this.f6367r.f27676W.m8112a();
            if (this.f6367r.f27676W.m8111b() == 1) {
                oq5Var = oq5.VIDEO;
                pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
            } else {
                pq5Var = this.f6367r.f27679Z == 2 ? pq5.UNSPECIFIED : pq5.BEGIN_TO_RENDER;
                oq5Var = oq5.HTML_DISPLAY;
            }
            yd0 mo14877c = zzt.zzA().mo14877c(str, this.f6366q.mo6416h(), "", "javascript", m8112a, pq5Var, oq5Var, this.f6367r.f27707n0);
            this.f6370u = mo14877c;
            if (mo14877c != null) {
                zzt.zzA().mo14878b(this.f6370u, (View) this.f6366q);
                this.f6366q.mo6438R(this.f6370u);
                zzt.zzA().zzd(this.f6370u);
                this.f6366q.mo6434T("onSdkLoaded", new C1370g6());
            }
        }
    }
}
