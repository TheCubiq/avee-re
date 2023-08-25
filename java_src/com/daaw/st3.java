package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbf;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class st3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    applicationInfo = (ApplicationInfo) y71.e(parcel, r, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = y71.f(parcel, r);
                    break;
                case 3:
                    packageInfo = (PackageInfo) y71.e(parcel, r, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = y71.f(parcel, r);
                    break;
                case 5:
                    i = y71.t(parcel, r);
                    break;
                case 6:
                    str3 = y71.f(parcel, r);
                    break;
                case 7:
                    arrayList = y71.h(parcel, r);
                    break;
                case 8:
                    z = y71.m(parcel, r);
                    break;
                case 9:
                    z2 = y71.m(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzcbf(applicationInfo, str, packageInfo, str2, i, str3, arrayList, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbf[i];
    }
}
