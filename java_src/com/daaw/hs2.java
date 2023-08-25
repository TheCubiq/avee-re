package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzau;
/* loaded from: classes2.dex */
public final class hs2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            if (y71.m4047l(m4041r) != 2) {
                y71.m4035x(parcel, m4041r);
            } else {
                bundle = y71.m4058a(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzau(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
