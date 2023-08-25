package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.ry0;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
/* loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        ry0.k(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        ry0.k(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        ry0.k(context, "Context cannot be null");
    }

    public final /* synthetic */ void a(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.p.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e) {
            et3.c(getContext()).a(e, "AdManagerAdView.loadAd");
        }
    }

    public AdSize[] getAdSizes() {
        return this.p.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.p.zzh();
    }

    public VideoController getVideoController() {
        return this.p.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.p.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(getContext());
        if (((Boolean) ya3.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.this.a(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.p.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.p.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.p.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.p.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.p.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.p.zzy(videoOptions);
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.p.zzz(zzbuVar);
    }
}
