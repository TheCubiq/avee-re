package com.daaw;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
/* loaded from: classes.dex */
public final class hf3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AdManagerAdView f12499p;

    /* renamed from: q */
    public final /* synthetic */ zzbu f12500q;

    /* renamed from: r */
    public final /* synthetic */ if3 f12501r;

    public hf3(if3 if3Var, AdManagerAdView adManagerAdView, zzbu zzbuVar) {
        this.f12501r = if3Var;
        this.f12499p = adManagerAdView;
        this.f12500q = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.f12499p.zzb(this.f12500q)) {
            k04.zzj("Could not bind.");
            return;
        }
        onAdManagerAdViewLoadedListener = this.f12501r.f13617p;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.f12499p);
    }
}
