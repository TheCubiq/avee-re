package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class q04 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                i = y71.t(parcel, r);
            } else if (l == 4) {
                i2 = y71.t(parcel, r);
            } else if (l == 5) {
                z = y71.m(parcel, r);
            } else if (l != 6) {
                y71.x(parcel, r);
            } else {
                z2 = y71.m(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzchu(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzchu[i];
    }
}
