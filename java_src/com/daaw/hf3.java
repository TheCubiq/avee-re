package com.daaw;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
/* loaded from: classes.dex */
public final class hf3 implements Runnable {
    public final /* synthetic */ AdManagerAdView p;
    public final /* synthetic */ zzbu q;
    public final /* synthetic */ if3 r;

    public hf3(if3 if3Var, AdManagerAdView adManagerAdView, zzbu zzbuVar) {
        this.r = if3Var;
        this.p = adManagerAdView;
        this.q = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.p.zzb(this.q)) {
            k04.zzj("Could not bind.");
            return;
        }
        onAdManagerAdViewLoadedListener = this.r.p;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.p);
    }
}
