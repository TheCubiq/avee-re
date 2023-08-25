package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbz;
/* loaded from: classes.dex */
public final class mu3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            if (y71.m4047l(m4041r) != 2) {
                y71.m4035x(parcel, m4041r);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) y71.m4054e(parcel, m4041r, ParcelFileDescriptor.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzcbz(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbz[i];
    }
}
