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
    /* renamed from: C1 */
    public final void mo8379C1(zzkw zzkwVar, zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzkwVar);
        ne3.m15205e(m20847D, zzqVar);
        m20845M(2, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: C2 */
    public final void mo8378C2(zzac zzacVar, zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzacVar);
        ne3.m15205e(m20847D, zzqVar);
        m20845M(12, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: G0 */
    public final List mo8377G0(String str, String str2, String str3) {
        Parcel m20847D = m20847D();
        m20847D.writeString(null);
        m20847D.writeString(str2);
        m20847D.writeString(str3);
        Parcel m20846I = m20846I(17, m20847D);
        ArrayList createTypedArrayList = m20846I.createTypedArrayList(zzac.CREATOR);
        m20846I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    /* renamed from: T1 */
    public final void mo8376T1(zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzqVar);
        m20845M(20, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: X */
    public final void mo8375X(zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzqVar);
        m20845M(6, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: a2 */
    public final List mo8374a2(String str, String str2, boolean z, zzq zzqVar) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15206d(m20847D, z);
        ne3.m15205e(m20847D, zzqVar);
        Parcel m20846I = m20846I(14, m20847D);
        ArrayList createTypedArrayList = m20846I.createTypedArrayList(zzkw.CREATOR);
        m20846I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    /* renamed from: e0 */
    public final void mo8373e0(Bundle bundle, zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, bundle);
        ne3.m15205e(m20847D, zzqVar);
        m20845M(19, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: h0 */
    public final List mo8372h0(String str, String str2, String str3, boolean z) {
        Parcel m20847D = m20847D();
        m20847D.writeString(null);
        m20847D.writeString(str2);
        m20847D.writeString(str3);
        ne3.m15206d(m20847D, z);
        Parcel m20846I = m20846I(15, m20847D);
        ArrayList createTypedArrayList = m20846I.createTypedArrayList(zzkw.CREATOR);
        m20846I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    /* renamed from: i1 */
    public final void mo8371i1(zzaw zzawVar, zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzawVar);
        ne3.m15205e(m20847D, zzqVar);
        m20845M(1, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: m0 */
    public final byte[] mo8368m0(zzaw zzawVar, String str) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzawVar);
        m20847D.writeString(str);
        Parcel m20846I = m20846I(9, m20847D);
        byte[] createByteArray = m20846I.createByteArray();
        m20846I.recycle();
        return createByteArray;
    }

    @Override // com.daaw.ua5
    /* renamed from: m1 */
    public final void mo8367m1(zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzqVar);
        m20845M(4, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: n1 */
    public final List mo8366n1(String str, String str2, zzq zzqVar) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15205e(m20847D, zzqVar);
        Parcel m20846I = m20846I(16, m20847D);
        ArrayList createTypedArrayList = m20846I.createTypedArrayList(zzac.CREATOR);
        m20846I.recycle();
        return createTypedArrayList;
    }

    @Override // com.daaw.ua5
    /* renamed from: s2 */
    public final void mo8365s2(zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzqVar);
        m20845M(18, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: u1 */
    public final void mo8364u1(long j, String str, String str2, String str3) {
        Parcel m20847D = m20847D();
        m20847D.writeLong(j);
        m20847D.writeString(str);
        m20847D.writeString(str2);
        m20847D.writeString(str3);
        m20845M(10, m20847D);
    }

    @Override // com.daaw.ua5
    /* renamed from: w0 */
    public final String mo8363w0(zzq zzqVar) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, zzqVar);
        Parcel m20846I = m20846I(11, m20847D);
        String readString = m20846I.readString();
        m20846I.recycle();
        return readString;
    }
}
