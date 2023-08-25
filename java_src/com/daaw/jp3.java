package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class jp3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ ro3 f15310a;

    /* renamed from: b */
    public final /* synthetic */ gn3 f15311b;

    public jp3(sp3 sp3Var, ro3 ro3Var, gn3 gn3Var) {
        this.f15310a = ro3Var;
        this.f15311b = gn3Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.f15310a.zzf(adError.zza());
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
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd != null) {
            try {
                this.f15310a.mo11106U2(new eo3(mediationInterscrollerAd));
            } catch (RemoteException e) {
                k04.zzh("", e);
            }
            return new tp3(this.f15311b);
        }
        k04.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f15310a.mo11105a("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            k04.zzh("", e2);
            return null;
        }
    }
}
