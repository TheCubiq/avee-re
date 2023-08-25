package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class nu3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        Bundle bundle = null;
        zzchu zzchuVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfkz zzfkzVar = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    bundle = y71.a(parcel, r);
                    break;
                case 2:
                    zzchuVar = (zzchu) y71.e(parcel, r, zzchu.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) y71.e(parcel, r, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = y71.f(parcel, r);
                    break;
                case 5:
                    arrayList = y71.h(parcel, r);
                    break;
                case 6:
                    packageInfo = (PackageInfo) y71.e(parcel, r, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = y71.f(parcel, r);
                    break;
                case 8:
                default:
                    y71.x(parcel, r);
                    break;
                case 9:
                    str3 = y71.f(parcel, r);
                    break;
                case 10:
                    zzfkzVar = (zzfkz) y71.e(parcel, r, zzfkz.CREATOR);
                    break;
                case 11:
                    str4 = y71.f(parcel, r);
                    break;
                case 12:
                    z = y71.m(parcel, r);
                    break;
                case 13:
                    z2 = y71.m(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzccb(bundle, zzchuVar, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfkzVar, str4, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccb[i];
    }
}
