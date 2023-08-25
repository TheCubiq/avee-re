package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public class nw5 extends fn3 {
    public final jq4 p;
    public final ty4 q;
    public final gr4 r;
    public final vr4 s;
    public final as4 t;
    public final uv4 u;
    public final xs4 v;
    public final lz4 w;
    public final qv4 x;
    public final br4 y;

    public nw5(jq4 jq4Var, ty4 ty4Var, gr4 gr4Var, vr4 vr4Var, as4 as4Var, uv4 uv4Var, xs4 xs4Var, lz4 lz4Var, qv4 qv4Var, br4 br4Var) {
        this.p = jq4Var;
        this.q = ty4Var;
        this.r = gr4Var;
        this.s = vr4Var;
        this.t = as4Var;
        this.u = uv4Var;
        this.v = xs4Var;
        this.w = lz4Var;
        this.x = qv4Var;
        this.y = br4Var;
    }

    @Override // com.daaw.gn3
    public final void A(zze zzeVar) {
        this.y.b(tj6.c(8, zzeVar));
    }

    @Override // com.daaw.gn3
    @Deprecated
    public final void F(int i) {
        A(new zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void S0(tv3 tv3Var) {
    }

    @Override // com.daaw.gn3
    public final void S1(sd3 sd3Var, String str) {
    }

    public void b() {
    }

    @Override // com.daaw.gn3
    public final void c(int i) {
    }

    public void e() {
        this.w.zzd();
    }

    @Override // com.daaw.gn3
    public final void j0(int i, String str) {
    }

    @Override // com.daaw.gn3
    public final void k() {
        this.w.zzb();
    }

    @Override // com.daaw.gn3
    public final void l2(String str, String str2) {
        this.u.W(str, str2);
    }

    @Override // com.daaw.gn3
    public final void n(String str) {
        A(new zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void o2(zzcdd zzcddVar) {
    }

    @Override // com.daaw.gn3
    public final void q0(zze zzeVar) {
    }

    @Override // com.daaw.gn3
    public final void zze() {
        this.p.onAdClicked();
        this.q.zzq();
    }

    @Override // com.daaw.gn3
    public final void zzf() {
        this.v.zzf(4);
    }

    public void zzm() {
        this.r.zza();
        this.x.zzb();
    }

    @Override // com.daaw.gn3
    public final void zzn() {
        this.s.zzb();
    }

    @Override // com.daaw.gn3
    public final void zzo() {
        this.t.zzn();
    }

    @Override // com.daaw.gn3
    public final void zzp() {
        this.v.zzb();
        this.x.zza();
    }

    public void zzv() {
        this.w.zza();
    }

    @Override // com.daaw.gn3
    public final void zzx() {
        this.w.zzc();
    }
}
