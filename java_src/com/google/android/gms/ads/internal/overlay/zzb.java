package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 4:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 5:
                    str4 = y71.m4053f(parcel, m4041r);
                    break;
                case 6:
                    str5 = y71.m4053f(parcel, m4041r);
                    break;
                case 7:
                    str6 = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    str7 = y71.m4053f(parcel, m4041r);
                    break;
                case 9:
                    intent = (Intent) y71.m4054e(parcel, m4041r, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = y71.m4040s(parcel, m4041r);
                    break;
                case 11:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
