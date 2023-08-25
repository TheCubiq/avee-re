package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            if (y71.l(r) != 2) {
                y71.x(parcel, r);
            } else {
                i = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzdu(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdu[i];
    }
}
