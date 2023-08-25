package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ez5 implements zza, vy4 {
    @GuardedBy("this")

    /* renamed from: p */
    public zzbe f8972p;

    /* renamed from: b */
    public final synchronized void m22977b(zzbe zzbeVar) {
        this.f8972p = zzbeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbe zzbeVar = this.f8972p;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                k04.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzq() {
        zzbe zzbeVar = this.f8972p;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                k04.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzr() {
    }
}
