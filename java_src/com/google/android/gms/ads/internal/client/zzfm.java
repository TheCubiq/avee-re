package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzfm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                z = y71.m(parcel, r);
            } else if (l == 3) {
                z2 = y71.m(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                z3 = y71.m(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzfl(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfl[i];
    }
}
