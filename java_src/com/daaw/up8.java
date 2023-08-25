package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
/* loaded from: classes.dex */
public final class up8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                z = y71.m4046m(parcel, m4041r);
            } else if (m4047l == 2) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 3) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l != 4) {
                y71.m4035x(parcel, m4041r);
            } else {
                i2 = y71.m4039t(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzq(z, str, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
