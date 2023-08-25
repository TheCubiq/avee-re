package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class pc3 implements NativeCustomTemplateAd.DisplayOpenMeasurement {

    /* renamed from: a */
    public final sd3 f22831a;

    public pc3(sd3 sd3Var) {
        this.f22831a = sd3Var;
        try {
            sd3Var.zzm();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f22831a.mo2684f0(nt0.m14830g3(view));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f22831a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }
}
