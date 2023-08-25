package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class qn3 extends bp2 implements sn3 {
    public qn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.daaw.sn3
    public final String b() {
        Parcel I = I(9, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final void n0(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(22, D);
    }

    @Override // com.daaw.sn3
    public final void n2(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        dp2.g(D, yd0Var3);
        M(21, D);
    }

    @Override // com.daaw.sn3
    public final void w2(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(20, D);
    }

    @Override // com.daaw.sn3
    public final boolean zzA() {
        Parcel I = I(18, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.sn3
    public final boolean zzB() {
        Parcel I = I(17, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.sn3
    public final double zze() {
        Parcel I = I(8, D());
        double readDouble = I.readDouble();
        I.recycle();
        return readDouble;
    }

    @Override // com.daaw.sn3
    public final float zzf() {
        Parcel I = I(23, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final float zzg() {
        Parcel I = I(25, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final float zzh() {
        Parcel I = I(24, D());
        float readFloat = I.readFloat();
        I.recycle();
        return readFloat;
    }

    @Override // com.daaw.sn3
    public final Bundle zzi() {
        Parcel I = I(16, D());
        Bundle bundle = (Bundle) dp2.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.daaw.sn3
    public final zzdq zzj() {
        Parcel I = I(11, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.sn3
    public final nc3 zzk() {
        Parcel I = I(12, D());
        nc3 g3 = mc3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.daaw.sn3
    public final vc3 zzl() {
        Parcel I = I(5, D());
        vc3 g3 = uc3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.daaw.sn3
    public final yd0 zzm() {
        Parcel I = I(13, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.sn3
    public final yd0 zzn() {
        Parcel I = I(14, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.sn3
    public final yd0 zzo() {
        Parcel I = I(15, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.sn3
    public final String zzp() {
        Parcel I = I(7, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzq() {
        Parcel I = I(4, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzr() {
        Parcel I = I(6, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzs() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final String zzt() {
        Parcel I = I(10, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.sn3
    public final List zzv() {
        Parcel I = I(3, D());
        ArrayList b = dp2.b(I);
        I.recycle();
        return b;
    }

    @Override // com.daaw.sn3
    public final void zzx() {
        M(19, D());
    }
}
