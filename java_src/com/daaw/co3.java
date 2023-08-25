package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
/* loaded from: classes.dex */
public final class co3 implements MediationAdLoadCallback {
    public final /* synthetic */ gn3 a;
    public final /* synthetic */ do3 b;

    public co3(do3 do3Var, gn3 gn3Var) {
        this.b = do3Var;
        this.a = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.b.p;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.a.q0(adError.zza());
            this.a.j0(adError.getCode(), adError.getMessage());
            this.a.c(adError.getCode());
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.b.p;
            String canonicalName = obj.getClass().getCanonicalName();
            k04.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.a.j0(0, str);
            this.a.c(0);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.b.y = (MediationAppOpenAd) obj;
            this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.a);
    }
}
