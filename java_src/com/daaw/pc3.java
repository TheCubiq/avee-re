package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class pc3 implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    public final sd3 a;

    public pc3(sd3 sd3Var) {
        this.a = sd3Var;
        try {
            sd3Var.zzm();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.f0(nt0.g3(view));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }
}
