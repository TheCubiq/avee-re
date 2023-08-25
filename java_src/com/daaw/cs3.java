package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class cs3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l == 2) {
                i = y71.t(parcel, r);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                j = y71.u(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new Feature(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
