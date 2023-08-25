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
        int y = y71.y(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l == 2) {
                iBinder = y71.s(parcel, r);
            } else if (l == 3) {
                connectionResult = (ConnectionResult) y71.e(parcel, r, ConnectionResult.CREATOR);
            } else if (l == 4) {
                z = y71.m(parcel, r);
            } else if (l != 5) {
                y71.x(parcel, r);
            } else {
                z2 = y71.m(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i) {
        return new zav[i];
    }
}
