package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzbl extends bp2 implements zzbn {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzlVar);
        m25950M(1, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzlVar);
        m25952D.writeInt(i);
        m25950M(5, m25952D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        Parcel m25951I = m25951I(3, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }
}
