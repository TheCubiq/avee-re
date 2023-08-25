package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public final class zzdo extends bp2 implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        Parcel I = I(5, D());
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdrVar;
        Parcel I = I(11, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        I.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(3, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        M(2, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        M(1, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        Parcel D = D();
        dp2.g(D, zzdtVar);
        M(8, D);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        M(13, D());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        Parcel I = I(12, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        Parcel I = I(10, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        Parcel I = I(4, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
