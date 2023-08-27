package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
@zzadh
/* loaded from: classes2.dex */
public final class zzyq<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzxt zzbuu;

    public zzyq(zzxt zzxtVar) {
        this.zzbuu = zzxtVar;
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzane.zzck("Adapter called onClick.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyr(this));
            return;
        }
        try {
            this.zzbuu.onAdClicked();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzane.zzck("Adapter called onDismissScreen.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzdk("#008 Must be called on the main UI thread.");
            zzamu.zzsy.post(new zzyu(this));
            return;
        }
        try {
            this.zzbuu.onAdClosed();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzane.zzck("Adapter called onDismissScreen.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyz(this));
            return;
        }
        try {
            this.zzbuu.onAdClosed();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzane.zzck(sb.toString());
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyv(this, errorCode));
            return;
        }
        try {
            this.zzbuu.onAdFailedToLoad(zzzc.zza(errorCode));
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzane.zzck(sb.toString());
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzza(this, errorCode));
            return;
        }
        try {
            this.zzbuu.onAdFailedToLoad(zzzc.zza(errorCode));
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzane.zzck("Adapter called onLeaveApplication.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyw(this));
            return;
        }
        try {
            this.zzbuu.onAdLeftApplication();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzane.zzck("Adapter called onLeaveApplication.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzzb(this));
            return;
        }
        try {
            this.zzbuu.onAdLeftApplication();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzane.zzck("Adapter called onPresentScreen.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyx(this));
            return;
        }
        try {
            this.zzbuu.onAdOpened();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzane.zzck("Adapter called onPresentScreen.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzys(this));
            return;
        }
        try {
            this.zzbuu.onAdOpened();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzane.zzck("Adapter called onReceivedAd.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyy(this));
            return;
        }
        try {
            this.zzbuu.onAdLoaded();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzane.zzck("Adapter called onReceivedAd.");
        zzkb.zzif();
        if (!zzamu.zzsh()) {
            zzane.zzd("#008 Must be called on the main UI thread.", null);
            zzamu.zzsy.post(new zzyt(this));
            return;
        }
        try {
            this.zzbuu.onAdLoaded();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
