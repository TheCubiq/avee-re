package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzftq;
/* loaded from: classes.dex */
public final class yt6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                i2 = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 3) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 4) {
                str2 = y71.m4053f(parcel, m4041r);
            } else if (m4047l != 5) {
                y71.m4035x(parcel, m4041r);
            } else {
                i3 = y71.m4039t(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzftq(i, i2, i3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzftq[i];
    }
}
