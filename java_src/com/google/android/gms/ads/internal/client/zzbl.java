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
        Parcel D = D();
        dp2.e(D, zzlVar);
        M(1, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) {
        Parcel D = D();
        dp2.e(D, zzlVar);
        D.writeInt(i);
        M(5, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        Parcel I = I(3, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
