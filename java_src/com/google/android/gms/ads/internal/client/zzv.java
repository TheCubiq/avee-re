package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        zze zzeVar = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 2:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                case 3:
                    zzeVar = (zze) y71.m4054e(parcel, m4041r, zze.CREATOR);
                    break;
                case 4:
                    bundle = y71.m4058a(parcel, m4041r);
                    break;
                case 5:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 6:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 7:
                    str4 = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    str5 = y71.m4053f(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzu(str, j, zzeVar, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
