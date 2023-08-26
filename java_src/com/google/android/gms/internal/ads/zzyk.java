package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzyk extends zzxr {
    private final MediationAdapter zzbus;
    private zzyl zzbut;

    public zzyk(MediationAdapter mediationAdapter) {
        this.zzbus = mediationAdapter;
    }

    private final Bundle zza(String str, zzjj zzjjVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzane.zzdk(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zzbus instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjjVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjjVar.zzaqa);
                }
            }
            return bundle;
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    private static boolean zzm(zzjj zzjjVar) {
        if (zzjjVar.zzapz) {
            return true;
        }
        zzkb.zzif();
        return zzamu.zzsg();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void destroy() throws RemoteException {
        try {
            this.zzbus.onDestroy();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle getInterstitialAdapterInfo() {
        MediationAdapter mediationAdapter = this.zzbus;
        if (mediationAdapter instanceof zzatm) {
            return ((zzatm) mediationAdapter).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzane.zzdk(valueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzlo getVideoController() {
        MediationAdapter mediationAdapter = this.zzbus;
        if (mediationAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationAdapter).getVideoController();
            } catch (Throwable th) {
                zzane.zzb("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final IObjectWrapper getView() throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final boolean isInitialized() throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.zzbus).isInitialized();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void pause() throws RemoteException {
        try {
            this.zzbus.onPause();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void resume() throws RemoteException {
        try {
            this.zzbus.onResume();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void setImmersiveMode(boolean z) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof OnImmersiveModeUpdatedListener)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdj(valueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) mediationAdapter).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzane.zzb("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void showInterstitial() throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzbus).showInterstitial();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void showVideo() throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.zzbus).showVideo();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzaic zzaicVar, List<String> list) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzbus;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(zza(str, (zzjj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzaif(zzaicVar), arrayList);
        } catch (Throwable th) {
            zzane.zzc("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzaic zzaicVar, String str2) throws RemoteException {
        zzyj zzyjVar;
        Bundle bundle;
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzbus;
            Bundle zza = zza(str2, zzjjVar, (String) null);
            if (zzjjVar != null) {
                zzyj zzyjVar2 = new zzyj(zzjjVar.zzapw == -1 ? null : new Date(zzjjVar.zzapw), zzjjVar.zzapx, zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null, zzjjVar.zzaqe, zzm(zzjjVar), zzjjVar.zzaqa, zzjjVar.zzaql);
                bundle = zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                zzyjVar = zzyjVar2;
            } else {
                zzyjVar = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzyjVar, str, new zzaif(zzaicVar), zza, bundle);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException {
        zza(iObjectWrapper, zzjjVar, str, (String) null, zzxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzbus;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzyl(zzxtVar), zza(str, zzjjVar, str2), new zzyj(zzjjVar.zzapw == -1 ? null : new Date(zzjjVar.zzapw), zzjjVar.zzapx, zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null, zzjjVar.zzaqe, zzm(zzjjVar), zzjjVar.zzaqa, zzjjVar.zzaql), zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar, zzpl zzplVar, List<String> list) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(valueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationAdapter;
            zzyo zzyoVar = new zzyo(zzjjVar.zzapw == -1 ? null : new Date(zzjjVar.zzapw), zzjjVar.zzapx, zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null, zzjjVar.zzaqe, zzm(zzjjVar), zzjjVar.zzaqa, zzplVar, list, zzjjVar.zzaql);
            Bundle bundle = zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzbut = new zzyl(zzxtVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzbut, zza(str, zzjjVar, str2), zzyoVar, bundle);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException {
        zza(iObjectWrapper, zzjnVar, zzjjVar, str, null, zzxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzbus;
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzyl(zzxtVar), zza(str, zzjjVar, str2), com.google.android.gms.ads.zzb.zza(zzjnVar.width, zzjnVar.height, zzjnVar.zzarb), new zzyj(zzjjVar.zzapw == -1 ? null : new Date(zzjjVar.zzapw), zzjjVar.zzapx, zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null, zzjjVar.zzaqe, zzm(zzjjVar), zzjjVar.zzaqa, zzjjVar.zzaql), zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(zzjj zzjjVar, String str, String str2) throws RemoteException {
        MediationAdapter mediationAdapter = this.zzbus;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzbus;
            mediationRewardedVideoAdAdapter.loadAd(new zzyj(zzjjVar.zzapw == -1 ? null : new Date(zzjjVar.zzapw), zzjjVar.zzapx, zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null, zzjjVar.zzaqe, zzm(zzjjVar), zzjjVar.zzaqa, zzjjVar.zzaql), zza(str, zzjjVar, str2), zzjjVar.zzaqg != null ? zzjjVar.zzaqg.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzc(zzjj zzjjVar, String str) throws RemoteException {
        zza(zzjjVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            ((OnContextChangedListener) this.zzbus).onContextChanged((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } catch (Throwable th) {
            zzane.zzc("Failed", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxz zzmo() {
        NativeAdMapper zzmx = this.zzbut.zzmx();
        if (zzmx instanceof NativeAppInstallAdMapper) {
            return new zzym((NativeAppInstallAdMapper) zzmx);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzyc zzmp() {
        NativeAdMapper zzmx = this.zzbut.zzmx();
        if (zzmx instanceof NativeContentAdMapper) {
            return new zzyn((NativeContentAdMapper) zzmx);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle zzmq() {
        MediationAdapter mediationAdapter = this.zzbus;
        if (mediationAdapter instanceof zzatl) {
            return ((zzatl) mediationAdapter).zzmq();
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzane.zzdk(valueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle zzmr() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final boolean zzms() {
        return this.zzbus instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzqs zzmt() {
        NativeCustomTemplateAd zzmz = this.zzbut.zzmz();
        if (zzmz instanceof zzqv) {
            return ((zzqv) zzmz).zzku();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzyf zzmu() {
        UnifiedNativeAdMapper zzmy = this.zzbut.zzmy();
        if (zzmy != null) {
            return new zzze(zzmy);
        }
        return null;
    }
}
