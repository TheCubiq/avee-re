package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
/* loaded from: classes.dex */
public final class kp3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ uo3 f16610a;

    /* renamed from: b */
    public final /* synthetic */ gn3 f16611b;

    /* renamed from: c */
    public final /* synthetic */ sp3 f16612c;

    public kp3(sp3 sp3Var, uo3 uo3Var, gn3 gn3Var) {
        this.f16612c = sp3Var;
        this.f16610a = uo3Var;
        this.f16611b = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f16610a.zzf(adError.zza());
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
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                this.f16612c.f26500q = mediationInterstitialAd;
                this.f16610a.zzg();
            } catch (RemoteException e) {
                k04.zzh("", e);
            }
            return new tp3(this.f16611b);
        }
        k04.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f16610a.mo7878a("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            k04.zzh("", e2);
            return null;
        }
    }
}
