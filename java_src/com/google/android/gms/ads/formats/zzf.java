package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                z = y71.m(parcel, r);
            } else if (l == 2) {
                iBinder = y71.s(parcel, r);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                iBinder2 = y71.s(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
