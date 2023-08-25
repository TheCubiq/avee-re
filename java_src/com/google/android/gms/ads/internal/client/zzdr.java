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
        m25950M(4, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
        Parcel m25952D = m25952D();
        dp2.m24104d(m25952D, z);
        m25950M(5, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        m25950M(3, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        m25950M(2, m25952D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        m25950M(1, m25952D());
    }
}
