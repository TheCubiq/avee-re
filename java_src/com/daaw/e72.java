package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class e72 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzkw zzkwVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
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
                    zzkwVar = (zzkw) y71.m4054e(parcel, m4041r, zzkw.CREATOR);
                    break;
                case 5:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                case 6:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 7:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    zzawVar = (zzaw) y71.m4054e(parcel, m4041r, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = y71.m4038u(parcel, m4041r);
                    break;
                case 10:
                    zzawVar2 = (zzaw) y71.m4054e(parcel, m4041r, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = y71.m4038u(parcel, m4041r);
                    break;
                case 12:
                    zzawVar3 = (zzaw) y71.m4054e(parcel, m4041r, zzaw.CREATOR);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzac(str, str2, zzkwVar, j, z, str3, zzawVar, j2, zzawVar2, j3, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
