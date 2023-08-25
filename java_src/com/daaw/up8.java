package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
/* loaded from: classes.dex */
public final class up8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                z = y71.m(parcel, r);
            } else if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                i = y71.t(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                i2 = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzq(z, str, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
