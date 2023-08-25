package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        long j = 0;
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
                str = y71.f(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                j = y71.u(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzs(i, i2, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
