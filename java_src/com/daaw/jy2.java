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
        int y = y71.y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i2 = y71.t(parcel, r);
            } else if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) y71.e(parcel, r, PendingIntent.CREATOR);
            } else if (l == 4) {
                connectionResult = (ConnectionResult) y71.e(parcel, r, ConnectionResult.CREATOR);
            } else if (l != 1000) {
                y71.x(parcel, r);
            } else {
                i = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
