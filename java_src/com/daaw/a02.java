package com.daaw;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zaa;
/* loaded from: classes2.dex */
public final class a02 implements Parcelable.Creator<zaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zaa createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                i2 = y71.m4039t(parcel, m4041r);
            } else if (m4047l != 3) {
                y71.m4035x(parcel, m4041r);
            } else {
                intent = (Intent) y71.m4054e(parcel, m4041r, Intent.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zaa(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaa[] newArray(int i) {
        return new zaa[i];
    }
}
