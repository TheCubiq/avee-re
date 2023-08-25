package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
/* loaded from: classes.dex */
public final class if3 extends ie3 {

    /* renamed from: p */
    public final OnAdManagerAdViewLoadedListener f13617p;

    public if3(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.f13617p = onAdManagerAdViewLoadedListener;
    }

    @Override // com.daaw.je3
    /* renamed from: U0 */
    public final void mo18543U0(zzbu zzbuVar, yd0 yd0Var) {
        if (zzbuVar == null || yd0Var == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) nt0.m14831M(yd0Var));
        try {
            if (zzbuVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        try {
            if (zzbuVar.zzj() instanceof h13) {
                h13 h13Var = (h13) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(h13Var != null ? h13Var.m21089g3() : null);
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
        d04.f6340b.post(new hf3(this, adManagerAdView, zzbuVar));
    }
}
