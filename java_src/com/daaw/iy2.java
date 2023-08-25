package com.daaw;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class iy2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l == 2) {
                i2 = y71.t(parcel, r);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) y71.e(parcel, r, PendingIntent.CREATOR);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                str = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
