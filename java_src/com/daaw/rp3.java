package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
/* loaded from: classes.dex */
public final class rp3 implements MediationAdLoadCallback {
    public final /* synthetic */ ap3 a;
    public final /* synthetic */ gn3 b;
    public final /* synthetic */ sp3 c;

    public rp3(sp3 sp3Var, ap3 ap3Var, gn3 gn3Var) {
        this.c = sp3Var;
        this.a = ap3Var;
        this.b = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.a.zzf(adError.zza());
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.c.r = mediationRewardedAd;
                this.a.zzg();
            } catch (RemoteException e) {
                k04.zzh("", e);
            }
            return new tp3(this.b);
        }
        k04.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.a.a("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            k04.zzh("", e2);
            return null;
        }
    }
}
