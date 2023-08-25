package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbef;
/* loaded from: classes.dex */
public final class i33 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) y71.m4054e(parcel, m4041r, ParcelFileDescriptor.CREATOR);
            } else if (m4047l == 3) {
                z = y71.m4046m(parcel, m4041r);
            } else if (m4047l == 4) {
                z2 = y71.m4046m(parcel, m4041r);
            } else if (m4047l == 5) {
                j = y71.m4038u(parcel, m4041r);
            } else if (m4047l != 6) {
                y71.m4035x(parcel, m4041r);
            } else {
                z3 = y71.m4046m(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzbef(parcelFileDescriptor, z, z2, j, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbef[i];
    }
}
