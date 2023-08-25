package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbef;
/* loaded from: classes.dex */
public final class i33 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) y71.e(parcel, r, ParcelFileDescriptor.CREATOR);
            } else if (l == 3) {
                z = y71.m(parcel, r);
            } else if (l == 4) {
                z2 = y71.m(parcel, r);
            } else if (l == 5) {
                j = y71.u(parcel, r);
            } else if (l != 6) {
                y71.x(parcel, r);
            } else {
                z3 = y71.m(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzbef(parcelFileDescriptor, z, z2, j, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbef[i];
    }
}
