package com.daaw;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class jy2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                i2 = y71.m4039t(parcel, m4041r);
            } else if (m4047l == 2) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 3) {
                pendingIntent = (PendingIntent) y71.m4054e(parcel, m4041r, PendingIntent.CREATOR);
            } else if (m4047l == 4) {
                connectionResult = (ConnectionResult) y71.m4054e(parcel, m4041r, ConnectionResult.CREATOR);
            } else if (m4047l != 1000) {
                y71.m4035x(parcel, m4041r);
            } else {
                i = y71.m4039t(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
