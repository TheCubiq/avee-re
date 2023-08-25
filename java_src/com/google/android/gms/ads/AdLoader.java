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

    /* renamed from: a */
    public final zzp f36003a;

    /* renamed from: b */
    public final Context f36004b;

    /* renamed from: c */
    public final zzbn f36005c;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        public final Context f36006a;

        /* renamed from: b */
        public final zzbq f36007b;

        public Builder(Context context, String str) {
            zzbq zzc = zzay.zza().zzc(context, str, new xm3());
            this.f36006a = (Context) ry0.m10829k(context, "context cannot be null");
            this.f36007b = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f36006a, this.f36007b.zze(), zzp.zza);
            } catch (RemoteException e) {
                k04.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.f36006a, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f36007b.zzj(new if3(onAdManagerAdViewLoadedListener), new zzq(this.f36006a, adSizeArr));
            } catch (RemoteException e) {
                k04.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            uq3 uq3Var = new uq3(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f36007b.zzh(str, uq3Var.m7808b(), uq3Var.m7809a());
            } catch (RemoteException e) {
                k04.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            gf3 gf3Var = new gf3(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.f36007b.zzh(str, gf3Var.m21720e(), gf3Var.m21721d());
            } catch (RemoteException e) {
                k04.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f36007b.zzk(new wq3(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.f36007b.zzk(new jf3(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f36007b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                k04.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f36007b.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                k04.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f36007b.zzo(new zzblz(nativeAdOptions));
            } catch (RemoteException e) {
                k04.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.f36007b.zzo(new zzblz(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
            } catch (RemoteException e) {
                k04.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.f36004b = context;
        this.f36005c = zzbnVar;
        this.f36003a = zzpVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void m1467a(zzdx zzdxVar) {
        try {
            this.f36005c.zzg(this.f36003a.zza(this.f36004b, zzdxVar));
        } catch (RemoteException e) {
            k04.zzh("Failed to load ad.", e);
        }
    }

    /* renamed from: b */
    public final void m1466b(final zzdx zzdxVar) {
        g93.m21879c(this.f36004b);
        if (((Boolean) ya3.f33451c.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.m1467a(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.f36005c.zzg(this.f36003a.zza(this.f36004b, zzdxVar));
        } catch (RemoteException e) {
            k04.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.f36005c.zzi();
        } catch (RemoteException e) {
            k04.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        m1466b(adRequest.zza());
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        m1466b(adManagerAdRequest.f36008a);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.f36005c.zzh(this.f36003a.zza(this.f36004b, adRequest.zza()), i);
        } catch (RemoteException e) {
            k04.zzh("Failed to load ads.", e);
        }
    }
}
