package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
/* loaded from: classes2.dex */
public final class f22 implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zak createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                connectionResult = (ConnectionResult) y71.m4054e(parcel, m4041r, ConnectionResult.CREATOR);
            } else if (m4047l != 3) {
                y71.m4035x(parcel, m4041r);
            } else {
                zavVar = (zav) y71.m4054e(parcel, m4041r, zav.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zak(i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }
}
