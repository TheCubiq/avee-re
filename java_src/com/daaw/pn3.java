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
public final class pn3 extends bp2 {
    public pn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final zzdq h3() {
        Parcel I = I(16, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    public final nc3 i3() {
        Parcel I = I(19, D());
        nc3 g3 = mc3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    public final vc3 j3() {
        Parcel I = I(5, D());
        vc3 g3 = uc3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    public final yd0 k3() {
        Parcel I = I(20, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    public final yd0 l3() {
        Parcel I = I(21, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    public final List m3() {
        Parcel I = I(3, D());
        ArrayList b = dp2.b(I);
        I.recycle();
        return b;
    }

    public final void n3(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(9, D);
    }

    public final void o3(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(10, D);
    }

    public final void p3(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        dp2.g(D, yd0Var3);
        M(22, D);
    }

    public final void q3(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(14, D);
    }

    public final boolean r3() {
        Parcel I = I(11, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    public final Bundle zze() {
        Parcel I = I(13, D());
        Bundle bundle = (Bundle) dp2.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    public final yd0 zzi() {
        Parcel I = I(15, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    public final String zzl() {
        Parcel I = I(7, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    public final String zzm() {
        Parcel I = I(4, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel I = I(6, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    public final void zzr() {
        M(8, D());
    }

    public final boolean zzv() {
        Parcel I = I(12, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }
}
