package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfkz;
/* loaded from: classes.dex */
public final class pk6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 2:
                    i2 = y71.m4039t(parcel, m4041r);
                    break;
                case 3:
                    i3 = y71.m4039t(parcel, m4041r);
                    break;
                case 4:
                    i4 = y71.m4039t(parcel, m4041r);
                    break;
                case 5:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 6:
                    i5 = y71.m4039t(parcel, m4041r);
                    break;
                case 7:
                    i6 = y71.m4039t(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzfkz(i, i2, i3, i4, str, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfkz[i];
    }
}
