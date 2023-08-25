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
        int m4034y = y71.m4034y(parcel);
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    applicationInfo = (ApplicationInfo) y71.m4054e(parcel, m4041r, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    packageInfo = (PackageInfo) y71.m4054e(parcel, m4041r, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 5:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 6:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 7:
                    arrayList = y71.m4051h(parcel, m4041r);
                    break;
                case 8:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 9:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzcbf(applicationInfo, str, packageInfo, str2, i, str3, arrayList, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbf[i];
    }
}
