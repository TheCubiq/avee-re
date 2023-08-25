package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.g93;
import com.daaw.gf3;
import com.daaw.if3;
import com.daaw.jf3;
import com.daaw.k04;
import com.daaw.ry0;
import com.daaw.uq3;
import com.daaw.wq3;
import com.daaw.xm3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzblz;
/* loaded from: classes.dex */
public class AdLoader {
    public final zzp a;
    public final Context b;
    public final zzbn c;

    /* loaded from: classes.dex */
    public static class Builder {
        public final Context a;
        public final zzbq b;

        public Builder(Context context, String str) {
            zzbq zzc = zzay.zza().zzc(context, str, new xm3());
            this.a = (Context) ry0.k(context, "context cannot be null");
            this.b = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.a, this.b.zze(), zzp.zza);
            } catch (RemoteException e) {
                k04.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.a, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.b.zzj(new if3(onAdManagerAdViewLoadedListener), new zzq(this.a, adSizeArr));
            } catch (RemoteException e) {
                k04.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            uq3 uq3Var = new uq3(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, uq3Var.b(), uq3Var.a());
            } catch (RemoteException e) {
                k04.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            gf3 gf3Var = new gf3(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, gf3Var.e(), gf3Var.d());
            } catch (RemoteException e) {
                k04.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.b.zzk(new wq3(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.b.zzk(new jf3(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.b.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                k04.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzblz(nativeAdOptions));
            } catch (RemoteException e) {
                k04.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzblz(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
            } catch (RemoteException e) {
                k04.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.b = context;
        this.c = zzbnVar;
        this.a = zzpVar;
    }

    public final /* synthetic */ void a(zzdx zzdxVar) {
        try {
            this.c.zzg(this.a.zza(this.b, zzdxVar));
        } catch (RemoteException e) {
            k04.zzh("Failed to load ad.", e);
        }
    }

    public final void b(final zzdx zzdxVar) {
        g93.c(this.b);
        if (((Boolean) ya3.c.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.a(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.c.zzg(this.a.zza(this.b, zzdxVar));
        } catch (RemoteException e) {
            k04.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.c.zzi();
        } catch (RemoteException e) {
            k04.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        b(adRequest.zza());
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        b(adManagerAdRequest.a);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.c.zzh(this.a.zza(this.b, adRequest.zza()), i);
        } catch (RemoteException e) {
            k04.zzh("Failed to load ads.", e);
        }
    }
}
