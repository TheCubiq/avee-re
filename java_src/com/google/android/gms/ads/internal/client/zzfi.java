package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzfi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            if (y71.l(r) != 15) {
                y71.x(parcel, r);
            } else {
                str = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzfh(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfh[i];
    }
}
