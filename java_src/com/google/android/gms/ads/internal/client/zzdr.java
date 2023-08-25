package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzdr extends bp2 implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        M(4, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(5, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        M(3, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        M(2, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        M(1, D());
    }
}
