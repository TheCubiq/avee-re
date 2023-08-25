package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbye;
import java.util.List;
/* loaded from: classes.dex */
public final class bn3 extends bp2 implements dn3 {
    public bn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.daaw.dn3
    public final void D0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(str);
        D.writeString(str2);
        dp2.g(D, gn3Var);
        M(7, D);
    }

    @Override // com.daaw.dn3
    public final void D1(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(37, D);
    }

    @Override // com.daaw.dn3
    public final void I2(yd0 yd0Var, pv3 pv3Var, List list) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, pv3Var);
        D.writeStringList(list);
        M(23, D);
    }

    @Override // com.daaw.dn3
    public final void J1(yd0 yd0Var, zzl zzlVar, String str, pv3 pv3Var, String str2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(null);
        dp2.g(D, pv3Var);
        D.writeString(str2);
        M(10, D);
    }

    @Override // com.daaw.dn3
    public final void N0(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(39, D);
    }

    @Override // com.daaw.dn3
    public final void R0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var, zzblz zzblzVar, List list) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(str);
        D.writeString(str2);
        dp2.g(D, gn3Var);
        dp2.e(D, zzblzVar);
        D.writeStringList(list);
        M(14, D);
    }

    @Override // com.daaw.dn3
    public final void V1(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(30, D);
    }

    @Override // com.daaw.dn3
    public final void W(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(str);
        dp2.g(D, gn3Var);
        M(32, D);
    }

    @Override // com.daaw.dn3
    public final void W1(boolean z) {
        Parcel D = D();
        dp2.d(D, z);
        M(25, D);
    }

    @Override // com.daaw.dn3
    public final void X0(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        dp2.e(D, zzlVar);
        D.writeString(str);
        D.writeString(str2);
        dp2.g(D, gn3Var);
        M(35, D);
    }

    @Override // com.daaw.dn3
    public final void d() {
        M(9, D());
    }

    @Override // com.daaw.dn3
    public final void h() {
        M(4, D());
    }

    @Override // com.daaw.dn3
    public final void i0(yd0 yd0Var, dj3 dj3Var, List list) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, dj3Var);
        D.writeTypedList(list);
        M(31, D);
    }

    @Override // com.daaw.dn3
    public final void k1(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        dp2.e(D, zzlVar);
        D.writeString(str);
        D.writeString(str2);
        dp2.g(D, gn3Var);
        M(6, D);
    }

    @Override // com.daaw.dn3
    public final void p() {
        M(12, D());
    }

    @Override // com.daaw.dn3
    public final void q2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(str);
        dp2.g(D, gn3Var);
        M(28, D);
    }

    @Override // com.daaw.dn3
    public final void t2(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(21, D);
    }

    @Override // com.daaw.dn3
    public final void v2(zzl zzlVar, String str) {
        Parcel D = D();
        dp2.e(D, zzlVar);
        D.writeString(str);
        M(11, D);
    }

    @Override // com.daaw.dn3
    public final void x2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzlVar);
        D.writeString(str);
        dp2.g(D, gn3Var);
        M(38, D);
    }

    @Override // com.daaw.dn3
    public final void zzE() {
        M(8, D());
    }

    @Override // com.daaw.dn3
    public final boolean zzM() {
        Parcel I = I(22, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.dn3
    public final boolean zzN() {
        Parcel I = I(13, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.dn3
    public final on3 zzO() {
        on3 on3Var;
        Parcel I = I(15, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            on3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            on3Var = queryLocalInterface instanceof on3 ? (on3) queryLocalInterface : new on3(readStrongBinder);
        }
        I.recycle();
        return on3Var;
    }

    @Override // com.daaw.dn3
    public final pn3 zzP() {
        pn3 pn3Var;
        Parcel I = I(16, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            pn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            pn3Var = queryLocalInterface instanceof pn3 ? (pn3) queryLocalInterface : new pn3(readStrongBinder);
        }
        I.recycle();
        return pn3Var;
    }

    @Override // com.daaw.dn3
    public final zzdq zzh() {
        Parcel I = I(26, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.dn3
    public final mn3 zzj() {
        mn3 kn3Var;
        Parcel I = I(36, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            kn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            kn3Var = queryLocalInterface instanceof mn3 ? (mn3) queryLocalInterface : new kn3(readStrongBinder);
        }
        I.recycle();
        return kn3Var;
    }

    @Override // com.daaw.dn3
    public final sn3 zzk() {
        sn3 qn3Var;
        Parcel I = I(27, D());
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            qn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            qn3Var = queryLocalInterface instanceof sn3 ? (sn3) queryLocalInterface : new qn3(readStrongBinder);
        }
        I.recycle();
        return qn3Var;
    }

    @Override // com.daaw.dn3
    public final zzbye zzl() {
        Parcel I = I(33, D());
        zzbye zzbyeVar = (zzbye) dp2.a(I, zzbye.CREATOR);
        I.recycle();
        return zzbyeVar;
    }

    @Override // com.daaw.dn3
    public final zzbye zzm() {
        Parcel I = I(34, D());
        zzbye zzbyeVar = (zzbye) dp2.a(I, zzbye.CREATOR);
        I.recycle();
        return zzbyeVar;
    }

    @Override // com.daaw.dn3
    public final yd0 zzn() {
        Parcel I = I(2, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.dn3
    public final void zzo() {
        M(5, D());
    }
}
