package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
/* loaded from: classes.dex */
public final class v22 implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                iBinder = y71.m4040s(parcel, m4041r);
            } else if (m4047l == 3) {
                connectionResult = (ConnectionResult) y71.m4054e(parcel, m4041r, ConnectionResult.CREATOR);
            } else if (m4047l == 4) {
                z = y71.m4046m(parcel, m4041r);
            } else if (m4047l != 5) {
                y71.m4035x(parcel, m4041r);
            } else {
                z2 = y71.m4046m(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i) {
        return new zav[i];
    }
}
