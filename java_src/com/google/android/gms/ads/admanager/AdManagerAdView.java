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
        ry0.m10829k(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        ry0.m10829k(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        ry0.m10829k(context, "Context cannot be null");
    }

    /* renamed from: a */
    public final /* synthetic */ void m1452a(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.f36023p.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e) {
            et3.m23193c(getContext()).mo21236a(e, "AdManagerAdView.loadAd");
        }
    }

    public AdSize[] getAdSizes() {
        return this.f36023p.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.f36023p.zzh();
    }

    public VideoController getVideoController() {
        return this.f36023p.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.f36023p.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        g93.m21879c(getContext());
        if (((Boolean) ya3.f33454f.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.this.m1452a(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.f36023p.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f36023p.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f36023p.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f36023p.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f36023p.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.f36023p.zzy(videoOptions);
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.f36023p.zzz(zzbuVar);
    }
}
