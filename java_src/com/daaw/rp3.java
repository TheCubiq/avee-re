package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
/* loaded from: classes.dex */
public final class rp3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ ap3 f25487a;

    /* renamed from: b */
    public final /* synthetic */ gn3 f25488b;

    /* renamed from: c */
    public final /* synthetic */ sp3 f25489c;

    public rp3(sp3 sp3Var, ap3 ap3Var, gn3 gn3Var) {
        this.f25489c = sp3Var;
        this.f25487a = ap3Var;
        this.f25488b = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f25487a.zzf(adError.zza());
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
                this.f25489c.f26501r = mediationRewardedAd;
                this.f25487a.zzg();
            } catch (RemoteException e) {
                k04.zzh("", e);
            }
            return new tp3(this.f25488b);
        }
        k04.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f25487a.mo3475a("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            k04.zzh("", e2);
            return null;
        }
    }
}
