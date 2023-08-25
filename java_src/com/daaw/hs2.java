package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzau;
/* loaded from: classes2.dex */
public final class hs2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            if (y71.l(r) != 2) {
                y71.x(parcel, r);
            } else {
                bundle = y71.a(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzau(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
