package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class qt3 implements Parcelable.Creator {
    public static final zzcbc a(Parcel parcel) {
        int y = y71.y(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzl zzlVar = null;
        zzq zzqVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzchu zzchuVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzblz zzblzVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzdu zzduVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbsl zzbslVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    bundle = y71.a(parcel, r);
                    break;
                case 3:
                    zzlVar = (zzl) y71.e(parcel, r, zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (zzq) y71.e(parcel, r, zzq.CREATOR);
                    break;
                case 5:
                    str = y71.f(parcel, r);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) y71.e(parcel, r, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) y71.e(parcel, r, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = y71.f(parcel, r);
                    break;
                case 9:
                    str3 = y71.f(parcel, r);
                    break;
                case 10:
                    str4 = y71.f(parcel, r);
                    break;
                case 11:
                    zzchuVar = (zzchu) y71.e(parcel, r, zzchu.CREATOR);
                    break;
                case 12:
                    bundle2 = y71.a(parcel, r);
                    break;
                case 13:
                    i2 = y71.t(parcel, r);
                    break;
                case 14:
                    arrayList = y71.h(parcel, r);
                    break;
                case 15:
                    bundle3 = y71.a(parcel, r);
                    break;
                case 16:
                    z = y71.m(parcel, r);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    y71.x(parcel, r);
                    break;
                case 18:
                    i3 = y71.t(parcel, r);
                    break;
                case 19:
                    i4 = y71.t(parcel, r);
                    break;
                case 20:
                    f = y71.p(parcel, r);
                    break;
                case 21:
                    str5 = y71.f(parcel, r);
                    break;
                case 25:
                    j = y71.u(parcel, r);
                    break;
                case 26:
                    str6 = y71.f(parcel, r);
                    break;
                case 27:
                    arrayList2 = y71.h(parcel, r);
                    break;
                case 28:
                    str7 = y71.f(parcel, r);
                    break;
                case 29:
                    zzblzVar = (zzblz) y71.e(parcel, r, zzblz.CREATOR);
                    break;
                case 30:
                    arrayList3 = y71.h(parcel, r);
                    break;
                case 31:
                    j2 = y71.u(parcel, r);
                    break;
                case 33:
                    str8 = y71.f(parcel, r);
                    break;
                case 34:
                    f2 = y71.p(parcel, r);
                    break;
                case 35:
                    i5 = y71.t(parcel, r);
                    break;
                case 36:
                    i6 = y71.t(parcel, r);
                    break;
                case 37:
                    z3 = y71.m(parcel, r);
                    break;
                case 39:
                    str9 = y71.f(parcel, r);
                    break;
                case 40:
                    z2 = y71.m(parcel, r);
                    break;
                case 41:
                    str10 = y71.f(parcel, r);
                    break;
                case 42:
                    z4 = y71.m(parcel, r);
                    break;
                case 43:
                    i7 = y71.t(parcel, r);
                    break;
                case 44:
                    bundle4 = y71.a(parcel, r);
                    break;
                case 45:
                    str11 = y71.f(parcel, r);
                    break;
                case 46:
                    zzduVar = (zzdu) y71.e(parcel, r, zzdu.CREATOR);
                    break;
                case 47:
                    z5 = y71.m(parcel, r);
                    break;
                case 48:
                    bundle5 = y71.a(parcel, r);
                    break;
                case 49:
                    str12 = y71.f(parcel, r);
                    break;
                case 50:
                    str13 = y71.f(parcel, r);
                    break;
                case 51:
                    str14 = y71.f(parcel, r);
                    break;
                case 52:
                    z6 = y71.m(parcel, r);
                    break;
                case 53:
                    arrayList4 = y71.d(parcel, r);
                    break;
                case 54:
                    str15 = y71.f(parcel, r);
                    break;
                case 55:
                    arrayList5 = y71.h(parcel, r);
                    break;
                case 56:
                    i8 = y71.t(parcel, r);
                    break;
                case 57:
                    z7 = y71.m(parcel, r);
                    break;
                case 58:
                    z8 = y71.m(parcel, r);
                    break;
                case 59:
                    z9 = y71.m(parcel, r);
                    break;
                case 60:
                    arrayList6 = y71.h(parcel, r);
                    break;
                case 61:
                    str16 = y71.f(parcel, r);
                    break;
                case 63:
                    zzbslVar = (zzbsl) y71.e(parcel, r, zzbsl.CREATOR);
                    break;
                case 64:
                    str17 = y71.f(parcel, r);
                    break;
                case 65:
                    bundle6 = y71.a(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzcbc(i, bundle, zzlVar, zzqVar, str, applicationInfo, packageInfo, str2, str3, str4, zzchuVar, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzblzVar, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzduVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbslVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbc[i];
    }
}
