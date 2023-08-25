package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
/* loaded from: classes.dex */
public final class qp3 implements SignalCallbacks {

    /* renamed from: a */
    public final /* synthetic */ gp3 f24232a;

    public qp3(sp3 sp3Var, gp3 gp3Var) {
        this.f24232a = gp3Var;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.f24232a.mo5731Z(adError.zza());
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.f24232a.mo5729f(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.f24232a.mo5730a(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
