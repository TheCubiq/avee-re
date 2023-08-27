package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakk;
/* JADX INFO: Access modifiers changed from: package-private */
@zzadh
/* loaded from: classes.dex */
public final class zzao extends zzajx {
    final /* synthetic */ zzal zzza;
    private final int zzzb;

    public zzao(zzal zzalVar, int i) {
        this.zzza = zzalVar;
        this.zzzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        boolean z;
        float f;
        boolean z2;
        boolean z3 = this.zzza.zzvw.zzze;
        boolean zzdi = this.zzza.zzdi();
        z = this.zzza.zzys;
        f = this.zzza.zzyt;
        int i = this.zzza.zzvw.zzze ? this.zzzb : -1;
        z2 = this.zzza.zzyu;
        zzaq zzaqVar = new zzaq(z3, zzdi, z, f, i, z2, this.zzza.zzvw.zzacw.zzzl, this.zzza.zzvw.zzacw.zzzm);
        int requestedOrientation = this.zzza.zzvw.zzacw.zzbyo.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.zzza.zzvw.zzacw.orientation;
        }
        zzal zzalVar = this.zzza;
        zzakk.zzcrm.post(new zzap(this, new AdOverlayInfoParcel(zzalVar, zzalVar, zzalVar, zzalVar.zzvw.zzacw.zzbyo, requestedOrientation, this.zzza.zzvw.zzacr, this.zzza.zzvw.zzacw.zzcev, zzaqVar)));
    }
}
