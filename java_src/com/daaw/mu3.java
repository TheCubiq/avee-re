package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbz;
/* loaded from: classes.dex */
public final class mu3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            if (y71.l(r) != 2) {
                y71.x(parcel, r);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) y71.e(parcel, r, ParcelFileDescriptor.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new zzcbz(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbz[i];
    }
}
