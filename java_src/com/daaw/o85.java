package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class o85 extends hc3 implements ua5 {
    public o85(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.daaw.ua5
    public final void C1(zzkw zzkwVar, zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzkwVar);
        ne3.e(D, zzqVar);
        M(2, D);
    }

    @Override // com.daaw.ua5
    public final void C2(zzac zzacVar, zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzacVar);
        ne3.e(D, zzqVar);
        M(12, D);
    }

    @Override // com.daaw.ua5
    public final List G0(String str, String str2, String str3) {
        Parcel D = D();
        D.writeString(null);
        D.writeString(str2);
        D.writeString(str3);
        Parcel I = I(17, D);
        ArrayList createTypedArrayList = I.createTypedArrayList(zzac.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    public final void T1(zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzqVar);
        M(20, D);
    }

    @Override // com.daaw.ua5
    public final void X(zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzqVar);
        M(6, D);
    }

    @Override // com.daaw.ua5
    public final List a2(String str, String str2, boolean z, zzq zzqVar) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.d(D, z);
        ne3.e(D, zzqVar);
        Parcel I = I(14, D);
        ArrayList createTypedArrayList = I.createTypedArrayList(zzkw.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    public final void e0(Bundle bundle, zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, bundle);
        ne3.e(D, zzqVar);
        M(19, D);
    }

    @Override // com.daaw.ua5
    public final List h0(String str, String str2, String str3, boolean z) {
        Parcel D = D();
        D.writeString(null);
        D.writeString(str2);
        D.writeString(str3);
        ne3.d(D, z);
        Parcel I = I(15, D);
        ArrayList createTypedArrayList = I.createTypedArrayList(zzkw.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    public final void i1(zzaw zzawVar, zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzawVar);
        ne3.e(D, zzqVar);
        M(1, D);
    }

    @Override // com.daaw.ua5
    public final byte[] m0(zzaw zzawVar, String str) {
        Parcel D = D();
        ne3.e(D, zzawVar);
        D.writeString(str);
        Parcel I = I(9, D);
        byte[] createByteArray = I.createByteArray();
        I.recycle();
        return createByteArray;
    }

    @Override // com.daaw.ua5
    public final void m1(zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzqVar);
        M(4, D);
    }

    @Override // com.daaw.ua5
    public final List n1(String str, String str2, zzq zzqVar) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.e(D, zzqVar);
        Parcel I = I(16, D);
        ArrayList createTypedArrayList = I.createTypedArrayList(zzac.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    public final void s2(zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzqVar);
        M(18, D);
    }

    @Override // com.daaw.ua5
    public final void u1(long j, String str, String str2, String str3) {
        Parcel D = D();
        D.writeLong(j);
        D.writeString(str);
        D.writeString(str2);
        D.writeString(str3);
        M(10, D);
    }

    @Override // com.daaw.ua5
    public final String w0(zzq zzqVar) {
        Parcel D = D();
        ne3.e(D, zzqVar);
        Parcel I = I(11, D);
        String readString = I.readString();
        I.recycle();
        return readString;
    }
}
