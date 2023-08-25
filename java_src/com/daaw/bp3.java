package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbye;
/* loaded from: classes.dex */
public final class bp3 extends bp2 implements dp3 {
    public bp3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.daaw.dp3
    public final void E2(String str, String str2, zzl zzlVar, yd0 yd0Var, uo3 uo3Var, gn3 gn3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, uo3Var);
        dp2.g(D, gn3Var);
        M(14, D);
    }

    @Override // com.daaw.dp3
    public final boolean L1(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(17, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.dp3
    public final void N2(String str) {
        Parcel D = D();
        D.writeString(str);
        M(19, D);
    }

    @Override // com.daaw.dp3
    public final void Q(String str, String str2, zzl zzlVar, yd0 yd0Var, oo3 oo3Var, gn3 gn3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, oo3Var);
        dp2.g(D, gn3Var);
        M(23, D);
    }

    @Override // com.daaw.dp3
    public final void U(yd0 yd0Var, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, gp3 gp3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        dp2.e(D, bundle);
        dp2.e(D, bundle2);
        dp2.e(D, zzqVar);
        dp2.g(D, gp3Var);
        M(1, D);
    }

    @Override // com.daaw.dp3
    public final void Z1(String str, String str2, zzl zzlVar, yd0 yd0Var, ap3 ap3Var, gn3 gn3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, ap3Var);
        dp2.g(D, gn3Var);
        M(20, D);
    }

    @Override // com.daaw.dp3
    public final void b1(String str, String str2, zzl zzlVar, yd0 yd0Var, xo3 xo3Var, gn3 gn3Var, zzblz zzblzVar) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, xo3Var);
        dp2.g(D, gn3Var);
        dp2.e(D, zzblzVar);
        M(22, D);
    }

    @Override // com.daaw.dp3
    public final void c3(String str, String str2, zzl zzlVar, yd0 yd0Var, ro3 ro3Var, gn3 gn3Var, zzq zzqVar) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, ro3Var);
        dp2.g(D, gn3Var);
        dp2.e(D, zzqVar);
        M(21, D);
    }

    @Override // com.daaw.dp3
    public final boolean q(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(24, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.dp3
    public final boolean q1(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(15, D);
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.dp3
    public final void s1(String str, String str2, zzl zzlVar, yd0 yd0Var, ro3 ro3Var, gn3 gn3Var, zzq zzqVar) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, ro3Var);
        dp2.g(D, gn3Var);
        dp2.e(D, zzqVar);
        M(13, D);
    }

    @Override // com.daaw.dp3
    public final void y2(String str, String str2, zzl zzlVar, yd0 yd0Var, xo3 xo3Var, gn3 gn3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, xo3Var);
        dp2.g(D, gn3Var);
        M(18, D);
    }

    @Override // com.daaw.dp3
    public final void z1(String str, String str2, zzl zzlVar, yd0 yd0Var, ap3 ap3Var, gn3 gn3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        dp2.e(D, zzlVar);
        dp2.g(D, yd0Var);
        dp2.g(D, ap3Var);
        dp2.g(D, gn3Var);
        M(16, D);
    }

    @Override // com.daaw.dp3
    public final zzdq zze() {
        Parcel I = I(5, D());
        zzdq zzb = zzdp.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }

    @Override // com.daaw.dp3
    public final zzbye zzf() {
        Parcel I = I(2, D());
        zzbye zzbyeVar = (zzbye) dp2.a(I, zzbye.CREATOR);
        I.recycle();
        return zzbyeVar;
    }

    @Override // com.daaw.dp3
    public final zzbye zzg() {
        Parcel I = I(3, D());
        zzbye zzbyeVar = (zzbye) dp2.a(I, zzbye.CREATOR);
        I.recycle();
        return zzbyeVar;
    }
}
