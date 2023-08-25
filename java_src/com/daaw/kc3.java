package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.internal.ads.zzblz;
/* loaded from: classes.dex */
public final class kc3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        zzfl zzflVar = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 2:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 3:
                    i2 = y71.m4039t(parcel, m4041r);
                    break;
                case 4:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 5:
                    i3 = y71.m4039t(parcel, m4041r);
                    break;
                case 6:
                    zzflVar = (zzfl) y71.m4054e(parcel, m4041r, zzfl.CREATOR);
                    break;
                case 7:
                    z3 = y71.m4046m(parcel, m4041r);
                    break;
                case 8:
                    i4 = y71.m4039t(parcel, m4041r);
                    break;
                case 9:
                    i5 = y71.m4039t(parcel, m4041r);
                    break;
                case 10:
                    z4 = y71.m4046m(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzblz(i, z, i2, z2, i3, zzflVar, z3, i4, i5, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblz[i];
    }
}
