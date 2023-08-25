package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        zzq[] zzqVarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 4:
                    i2 = y71.m4039t(parcel, m4041r);
                    break;
                case 5:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 6:
                    i3 = y71.m4039t(parcel, m4041r);
                    break;
                case 7:
                    i4 = y71.m4039t(parcel, m4041r);
                    break;
                case 8:
                    zzqVarArr = (zzq[]) y71.m4050i(parcel, m4041r, zzq.CREATOR);
                    break;
                case 9:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 10:
                    z3 = y71.m4046m(parcel, m4041r);
                    break;
                case 11:
                    z4 = y71.m4046m(parcel, m4041r);
                    break;
                case 12:
                    z5 = y71.m4046m(parcel, m4041r);
                    break;
                case 13:
                    z6 = y71.m4046m(parcel, m4041r);
                    break;
                case 14:
                    z7 = y71.m4046m(parcel, m4041r);
                    break;
                case 15:
                    z8 = y71.m4046m(parcel, m4041r);
                    break;
                case 16:
                    z9 = y71.m4046m(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzq(str, i, i2, z, i3, i4, zzqVarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
