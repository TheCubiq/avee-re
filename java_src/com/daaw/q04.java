package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class q04 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 2) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 3) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 4) {
                i2 = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 5) {
                z = y71.m4046m(parcel, m4041r);
            } else if (m4047l != 6) {
                y71.m4035x(parcel, m4041r);
            } else {
                z2 = y71.m4046m(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzchu(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzchu[i];
    }
}
