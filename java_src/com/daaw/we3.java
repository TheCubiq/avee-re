package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class we3 extends bp2 implements ye3 {
    public we3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.daaw.ye3
    public final void L0(zzdg zzdgVar) {
        Parcel D = D();
        dp2.g(D, zzdgVar);
        M(32, D);
    }

    @Override // com.daaw.ye3
    public final void M1(zzcs zzcsVar) {
        Parcel D = D();
        dp2.g(D, zzcsVar);
        M(26, D);
    }

    @Override // com.daaw.ye3
    public final void W2(Bundle bundle) {
        Parcel D = D();
        dp2.e(D, bundle);
        M(15, D);
    }

    @Override // com.daaw.ye3
    public final void Z0(Bundle bundle) {
        Parcel D = D();
        dp2.e(D, bundle);
        M(17, D);
    }

    @Override // com.daaw.ye3
    public final List b() {
        Parcel I = I(3, D());
        ArrayList b = dp2.b(I);
        I.recycle();
        return b;
    }

    @Override // com.daaw.ye3
    public final void d2(ve3 ve3Var) {
        Parcel D = D();
        dp2.g(D, ve3Var);
        M(21, D);
    }

    @Override // com.daaw.ye3
    public final boolean g() {
        Parcel I = I(24, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.ye3
    public final boolean g2(Bundle bundle) {
        Parcel D = D();
        dp2.e(D, bundle);
        Parcel I = I(16, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.ye3
    public final boolean j() {
        Parcel I = I(30, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.ye3
    public final void k() {
        M(22, D());
    }

    @Override // com.daaw.ye3
    public final void v0(zzcw zzcwVar) {
        Parcel D = D();
        dp2.g(D, zzcwVar);
        M(25, D);
    }

    @Override // com.daaw.ye3
    public final void zzA() {
        M(28, D());
    }

    @Override // com.daaw.ye3
    public final void zzC() {
        M(27, D());
    }

    @Override // com.daaw.ye3
    public final double zze() {
        Parcel I = I(8, D());
        double readDouble = I.readDouble();
        I.recycle();
        return readDouble;
    }

    @Override // com.daaw.ye3
    public final Bundle zzf() {
        Parcel I = I(20, D());
        Bundle bundle = (Bundle) dp2.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.daaw.ye3
    public final zzdn zzg() {
        Parcel I = I(31, D());
        zzdn zzb = zzdm.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.ye3
    public final zzdq zzh() {
        Parcel I = I(11, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.ye3
    public final nc3 zzi() {
        nc3 lc3Var;
        Parcel I = I(14, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            lc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            lc3Var = queryLocalInterface instanceof nc3 ? (nc3) queryLocalInterface : new lc3(readStrongBinder);
        }
        I.recycle();
        return lc3Var;
    }

    @Override // com.daaw.ye3
    public final sc3 zzj() {
        sc3 qc3Var;
        Parcel I = I(29, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            qc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            qc3Var = queryLocalInterface instanceof sc3 ? (sc3) queryLocalInterface : new qc3(readStrongBinder);
        }
        I.recycle();
        return qc3Var;
    }

    @Override // com.daaw.ye3
    public final vc3 zzk() {
        vc3 tc3Var;
        Parcel I = I(5, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            tc3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            tc3Var = queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(readStrongBinder);
        }
        I.recycle();
        return tc3Var;
    }

    @Override // com.daaw.ye3
    public final yd0 zzl() {
        Parcel I = I(19, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.ye3
    public final yd0 zzm() {
        Parcel I = I(18, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.ye3
    public final String zzn() {
        Parcel I = I(7, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzo() {
        Parcel I = I(4, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzp() {
        Parcel I = I(6, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzq() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzr() {
        Parcel I = I(12, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzs() {
        Parcel I = I(10, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final String zzt() {
        Parcel I = I(9, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.ye3
    public final List zzv() {
        Parcel I = I(23, D());
        ArrayList b = dp2.b(I);
        I.recycle();
        return b;
    }

    @Override // com.daaw.ye3
    public final void zzx() {
        M(13, D());
    }
}
