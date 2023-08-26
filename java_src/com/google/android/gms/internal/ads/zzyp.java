package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzyp<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzxr {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzbvb;
    private final NETWORK_EXTRAS zzbvc;

    public zzyp(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzbvb = mediationAdapter;
        this.zzbvc = network_extras;
    }

    private final SERVER_PARAMETERS zza(String str, int i, String str2) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzbvb.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
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
            this.zzbvb.destroy();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzlo getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final IObjectWrapper getView() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzbvb;
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
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzbvb;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzbvb).showInterstitial();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzaic zzaicVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzaic zzaicVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException {
        zza(iObjectWrapper, zzjjVar, str, (String) null, zzxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzbvb;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzbvb).requestInterstitialAd(new zzyq(zzxtVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zza(str, zzjjVar.zzaqa, str2), zzzc.zza(zzjjVar, zzm(zzjjVar)), this.zzbvc);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjjVar, String str, String str2, zzxt zzxtVar, zzpl zzplVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, zzxt zzxtVar) throws RemoteException {
        zza(iObjectWrapper, zzjnVar, zzjjVar, str, null, zzxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzxt zzxtVar) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzbvb;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzane.zzdk(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzane.zzck("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzbvb;
            zzyq zzyqVar = new zzyq(zzxtVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zza = zza(str, zzjjVar.zzaqa, str2);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i >= 6) {
                    adSize = new AdSize(com.google.android.gms.ads.zzb.zza(zzjnVar.width, zzjnVar.height, zzjnVar.zzarb));
                    break;
                } else if (adSizeArr[i].getWidth() == zzjnVar.width && adSizeArr[i].getHeight() == zzjnVar.height) {
                    adSize = adSizeArr[i];
                    break;
                } else {
                    i++;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzyqVar, activity, zza, adSize, zzzc.zza(zzjjVar, zzm(zzjjVar)), this.zzbvc);
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zza(zzjj zzjjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzc(zzjj zzjjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxz zzmo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzyc zzmp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle zzmq() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final Bundle zzmr() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final boolean zzms() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzqs zzmt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzyf zzmu() {
        return null;
    }
}
