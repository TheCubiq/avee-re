package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccy;
/* loaded from: classes.dex */
public final class jv3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        zzl zzlVar = null;
        String str = null;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 2) {
                zzlVar = (zzl) y71.m4054e(parcel, m4041r, zzl.CREATOR);
            } else if (m4047l != 3) {
                y71.m4035x(parcel, m4041r);
            } else {
                str = y71.m4053f(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzccy(zzlVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccy[i];
    }
}
