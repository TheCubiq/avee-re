package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzub extends zzkt {
    private final zzss zzbom;
    private com.google.android.gms.ads.internal.zzal zzbor;
    private final zztt zzbpd;
    private final String zzye;
    private boolean zzyu;

    public zzub(Context context, String str, zzxn zzxnVar, zzang zzangVar, com.google.android.gms.ads.internal.zzw zzwVar) {
        this(str, new zzss(context, zzxnVar, zzangVar, zzwVar));
    }

    private zzub(String str, zzss zzssVar) {
        this.zzye = str;
        this.zzbom = zzssVar;
        this.zzbpd = new zztt();
        com.google.android.gms.ads.internal.zzbv.zzex().zza(zzssVar);
    }

    private final void abort() {
        if (this.zzbor != null) {
            return;
        }
        com.google.android.gms.ads.internal.zzal zzav = this.zzbom.zzav(this.zzye);
        this.zzbor = zzav;
        this.zzbpd.zzd(zzav);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void destroy() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String getMediationAdapterClassName() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            return zzalVar.getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzlo getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isLoading() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        return zzalVar != null && zzalVar.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isReady() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        return zzalVar != null && zzalVar.isReady();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void pause() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void resume() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.resume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setImmersiveMode(boolean z) {
        this.zzyu = z;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        abort();
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.setManualImpressionsEnabled(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void showInterstitial() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar == null) {
            zzakb.zzdk("Interstitial ad must be loaded before showInterstitial().");
            return;
        }
        zzalVar.setImmersiveMode(this.zzyu);
        this.zzbor.showInterstitial();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void stopLoading() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.stopLoading();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzaaw zzaawVar) throws RemoteException {
        zzakb.zzdk("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzabc zzabcVar, String str) throws RemoteException {
        zzakb.zzdk("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzahe zzaheVar) {
        this.zzbpd.zzboh = zzaheVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzjn zzjnVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.zza(zzjnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzke zzkeVar) throws RemoteException {
        this.zzbpd.zzbog = zzkeVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkh zzkhVar) throws RemoteException {
        this.zzbpd.zzxs = zzkhVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkx zzkxVar) throws RemoteException {
        this.zzbpd.zzbod = zzkxVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzla zzlaVar) throws RemoteException {
        this.zzbpd.zzboe = zzlaVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlg zzlgVar) throws RemoteException {
        abort();
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.zza(zzlgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlu zzluVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzmu zzmuVar) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzod zzodVar) throws RemoteException {
        this.zzbpd.zzbof = zzodVar;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            this.zzbpd.zzd(zzalVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean zzb(zzjj zzjjVar) throws RemoteException {
        if (!zztw.zzh(zzjjVar).contains("gw")) {
            abort();
        }
        if (zztw.zzh(zzjjVar).contains("_skipMediation")) {
            abort();
        }
        if (zzjjVar.zzaqd != null) {
            abort();
        }
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            return zzalVar.zzb(zzjjVar);
        }
        zztw zzex = com.google.android.gms.ads.internal.zzbv.zzex();
        if (zztw.zzh(zzjjVar).contains("_ad")) {
            zzex.zzb(zzjjVar, this.zzye);
        }
        zztz zza = zzex.zza(zzjjVar, this.zzye);
        if (zza == null) {
            abort();
            zzua.zzlk().zzlo();
            return this.zzbor.zzb(zzjjVar);
        }
        if (zza.zzwa) {
            zzua.zzlk().zzln();
        } else {
            zza.load();
            zzua.zzlk().zzlo();
        }
        this.zzbor = zza.zzbor;
        zza.zzbot.zza(this.zzbpd);
        this.zzbpd.zzd(this.zzbor);
        return zza.zzbov;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final Bundle zzba() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        return zzalVar != null ? zzalVar.zzba() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final IObjectWrapper zzbj() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            return zzalVar.zzbj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzjn zzbk() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            return zzalVar.zzbk();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zzbm() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            zzalVar.zzbm();
        } else {
            zzakb.zzdk("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzla zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzkh zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String zzck() throws RemoteException {
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        if (zzalVar != null) {
            return zzalVar.zzck();
        }
        return null;
    }
}
