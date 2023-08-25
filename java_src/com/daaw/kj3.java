package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbsl;
/* loaded from: classes.dex */
public final class kj3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i2 = y71.t(parcel, r);
            } else if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                i3 = y71.t(parcel, r);
            } else if (l != 1000) {
                y71.x(parcel, r);
            } else {
                i = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzbsl(i, i2, str, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbsl[i];
    }
}
