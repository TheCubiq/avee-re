package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzchu zzchuVar = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 2:
                    zzcVar = (zzc) y71.m4054e(parcel, m4041r, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = y71.m4040s(parcel, m4041r);
                    break;
                case 4:
                    iBinder2 = y71.m4040s(parcel, m4041r);
                    break;
                case 5:
                    iBinder3 = y71.m4040s(parcel, m4041r);
                    break;
                case 6:
                    iBinder4 = y71.m4040s(parcel, m4041r);
                    break;
                case 7:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 9:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 10:
                    iBinder5 = y71.m4040s(parcel, m4041r);
                    break;
                case 11:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 12:
                    i2 = y71.m4039t(parcel, m4041r);
                    break;
                case 13:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 14:
                    zzchuVar = (zzchu) y71.m4054e(parcel, m4041r, zzchu.CREATOR);
                    break;
                case 15:
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
                case 16:
                    str4 = y71.m4053f(parcel, m4041r);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) y71.m4054e(parcel, m4041r, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = y71.m4040s(parcel, m4041r);
                    break;
                case 19:
                    str5 = y71.m4053f(parcel, m4041r);
                    break;
                case 20:
                    iBinder7 = y71.m4040s(parcel, m4041r);
                    break;
                case 21:
                    iBinder8 = y71.m4040s(parcel, m4041r);
                    break;
                case 22:
                    iBinder9 = y71.m4040s(parcel, m4041r);
                    break;
                case 23:
                    iBinder10 = y71.m4040s(parcel, m4041r);
                    break;
                case 24:
                    str6 = y71.m4053f(parcel, m4041r);
                    break;
                case 25:
                    str7 = y71.m4053f(parcel, m4041r);
                    break;
                case 26:
                    iBinder11 = y71.m4040s(parcel, m4041r);
                    break;
                case 27:
                    iBinder12 = y71.m4040s(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzchuVar, str4, zzjVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
