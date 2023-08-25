package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* loaded from: classes.dex */
public final class kq3 implements NativeCustomFormatAd.DisplayOpenMeasurement {

    /* renamed from: a */
    public final sd3 f16697a;

    public kq3(sd3 sd3Var) {
        this.f16697a = sd3Var;
        try {
            sd3Var.zzm();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f16697a.mo2684f0(nt0.m14830g3(view));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f16697a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }
}
