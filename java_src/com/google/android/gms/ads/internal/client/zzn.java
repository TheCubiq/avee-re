package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzfh zzfhVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    j = y71.u(parcel, r);
                    break;
                case 3:
                    bundle = y71.a(parcel, r);
                    break;
                case 4:
                    i2 = y71.t(parcel, r);
                    break;
                case 5:
                    arrayList = y71.h(parcel, r);
                    break;
                case 6:
                    z = y71.m(parcel, r);
                    break;
                case 7:
                    i3 = y71.t(parcel, r);
                    break;
                case 8:
                    z2 = y71.m(parcel, r);
                    break;
                case 9:
                    str = y71.f(parcel, r);
                    break;
                case 10:
                    zzfhVar = (zzfh) y71.e(parcel, r, zzfh.CREATOR);
                    break;
                case 11:
                    location = (Location) y71.e(parcel, r, Location.CREATOR);
                    break;
                case 12:
                    str2 = y71.f(parcel, r);
                    break;
                case 13:
                    bundle2 = y71.a(parcel, r);
                    break;
                case 14:
                    bundle3 = y71.a(parcel, r);
                    break;
                case 15:
                    arrayList2 = y71.h(parcel, r);
                    break;
                case 16:
                    str3 = y71.f(parcel, r);
                    break;
                case 17:
                    str4 = y71.f(parcel, r);
                    break;
                case 18:
                    z3 = y71.m(parcel, r);
                    break;
                case 19:
                    zzcVar = (zzc) y71.e(parcel, r, zzc.CREATOR);
                    break;
                case 20:
                    i4 = y71.t(parcel, r);
                    break;
                case 21:
                    str5 = y71.f(parcel, r);
                    break;
                case 22:
                    arrayList3 = y71.h(parcel, r);
                    break;
                case 23:
                    i5 = y71.t(parcel, r);
                    break;
                case 24:
                    str6 = y71.f(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzl(i, j, bundle, i2, arrayList, z, i3, z2, str, zzfhVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzcVar, i4, str5, arrayList3, i5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
