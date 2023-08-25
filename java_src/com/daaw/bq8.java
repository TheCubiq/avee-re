package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class bq8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = "";
        String str2 = str;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 2:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    str4 = y71.m4053f(parcel, m4041r);
                    break;
                case 4:
                    str5 = y71.m4053f(parcel, m4041r);
                    break;
                case 5:
                    str6 = y71.m4053f(parcel, m4041r);
                    break;
                case 6:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                case 7:
                    j2 = y71.m4038u(parcel, m4041r);
                    break;
                case 8:
                    str7 = y71.m4053f(parcel, m4041r);
                    break;
                case 9:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 10:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 11:
                    j6 = y71.m4038u(parcel, m4041r);
                    break;
                case 12:
                    str8 = y71.m4053f(parcel, m4041r);
                    break;
                case 13:
                    j3 = y71.m4038u(parcel, m4041r);
                    break;
                case 14:
                    j4 = y71.m4038u(parcel, m4041r);
                    break;
                case 15:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 16:
                    z3 = y71.m4046m(parcel, m4041r);
                    break;
                case 17:
                case 20:
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
                case 18:
                    z4 = y71.m4046m(parcel, m4041r);
                    break;
                case 19:
                    str9 = y71.m4053f(parcel, m4041r);
                    break;
                case 21:
                    bool = y71.m4045n(parcel, m4041r);
                    break;
                case 22:
                    j5 = y71.m4038u(parcel, m4041r);
                    break;
                case 23:
                    arrayList = y71.m4051h(parcel, m4041r);
                    break;
                case 24:
                    str10 = y71.m4053f(parcel, m4041r);
                    break;
                case 25:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 26:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 27:
                    str11 = y71.m4053f(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzq(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
