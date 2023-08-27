package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzjr;
@zzadh
/* loaded from: classes2.dex */
public final class zzma {
    private final Context mContext;
    private zzjd zzapt;
    private AdListener zzapu;
    private com.google.android.gms.ads.reward.zza zzapv;
    private final zzxm zzast;
    private Correlator zzasx;
    private zzks zzasy;
    private OnCustomRenderedAdLoadedListener zzasz;
    private boolean zzatd;
    private RewardedVideoAdListener zzhc;
    private final zzjm zzuk;
    private AppEventListener zzvo;
    private String zzye;
    private boolean zzyu;

    public zzma(Context context) {
        this(context, zzjm.zzara, null);
    }

    public zzma(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzjm.zzara, publisherInterstitialAd);
    }

    private zzma(Context context, zzjm zzjmVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzast = new zzxm();
        this.mContext = context;
        this.zzuk = zzjmVar;
    }

    private final void zzaj(String str) {
        if (this.zzasy != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    public final AdListener getAdListener() {
        return this.zzapu;
    }

    public final String getAdUnitId() {
        return this.zzye;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzvo;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzasy != null) {
                return this.zzasy.zzck();
            }
            return null;
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzasz;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzasy == null) {
                return false;
            }
            return this.zzasy.isReady();
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzasy == null) {
                return false;
            }
            return this.zzasy.isLoading();
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzapu = adListener;
            if (this.zzasy != null) {
                this.zzasy.zza(adListener != null ? new zzjf(adListener) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzye != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzye = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzvo = appEventListener;
            if (this.zzasy != null) {
                this.zzasy.zza(appEventListener != null ? new zzjp(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzasx = correlator;
        try {
            if (this.zzasy != null) {
                this.zzasy.zza(correlator == null ? null : correlator.zzaz());
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzyu = z;
            if (this.zzasy != null) {
                this.zzasy.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzasz = onCustomRenderedAdLoadedListener;
            if (this.zzasy != null) {
                this.zzasy.zza(onCustomRenderedAdLoadedListener != null ? new zzog(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzhc = rewardedVideoAdListener;
            if (this.zzasy != null) {
                this.zzasy.zza(rewardedVideoAdListener != null ? new zzahj(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void show() {
        try {
            zzaj("show");
            this.zzasy.showInterstitial();
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.reward.zza zzaVar) {
        try {
            this.zzapv = zzaVar;
            if (this.zzasy != null) {
                this.zzasy.zza(zzaVar != null ? new zzji(zzaVar) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(zzjd zzjdVar) {
        try {
            this.zzapt = zzjdVar;
            if (this.zzasy != null) {
                this.zzasy.zza(zzjdVar != null ? new zzje(zzjdVar) : null);
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(zzlw zzlwVar) {
        try {
            if (this.zzasy == null) {
                if (this.zzye == null) {
                    zzaj("loadAd");
                }
                zzjn zzhx = this.zzatd ? zzjn.zzhx() : new zzjn();
                zzjr zzig = zzkb.zzig();
                Context context = this.mContext;
                zzks zzksVar = (zzks) zzjr.zza(context, false, (zzjr.zza<Object>) new zzju(zzig, context, zzhx, this.zzye, this.zzast));
                this.zzasy = zzksVar;
                if (this.zzapu != null) {
                    zzksVar.zza(new zzjf(this.zzapu));
                }
                if (this.zzapt != null) {
                    this.zzasy.zza(new zzje(this.zzapt));
                }
                if (this.zzapv != null) {
                    this.zzasy.zza(new zzji(this.zzapv));
                }
                if (this.zzvo != null) {
                    this.zzasy.zza(new zzjp(this.zzvo));
                }
                if (this.zzasz != null) {
                    this.zzasy.zza(new zzog(this.zzasz));
                }
                if (this.zzasx != null) {
                    this.zzasy.zza(this.zzasx.zzaz());
                }
                if (this.zzhc != null) {
                    this.zzasy.zza(new zzahj(this.zzhc));
                }
                this.zzasy.setImmersiveMode(this.zzyu);
            }
            if (this.zzasy.zzb(zzjm.zza(this.mContext, zzlwVar))) {
                this.zzast.zzj(zzlwVar.zzir());
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(boolean z) {
        this.zzatd = true;
    }

    public final Bundle zzba() {
        try {
            if (this.zzasy != null) {
                return this.zzasy.zzba();
            }
        } catch (RemoteException e) {
            zzane.zzd("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }
}
