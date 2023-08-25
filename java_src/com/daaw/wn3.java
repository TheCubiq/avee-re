package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class wn3 implements MediationAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ gn3 f31392a;

    /* renamed from: b */
    public final /* synthetic */ Adapter f31393b;

    /* renamed from: c */
    public final /* synthetic */ do3 f31394c;

    public wn3(do3 do3Var, gn3 gn3Var, Adapter adapter) {
        this.f31394c = do3Var;
        this.f31392a = gn3Var;
        this.f31393b = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f31393b.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            k04.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.f31392a.mo3325q0(adError.zza());
            this.f31392a.mo3330j0(adError.getCode(), adError.getMessage());
            this.f31392a.mo3333c(adError.getCode());
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
        try {
            this.f31394c.f7583x = (MediationInterscrollerAd) obj;
            this.f31392a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new un3(this.f31392a);
    }
}
