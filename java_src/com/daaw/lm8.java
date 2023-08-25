package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzo;
/* loaded from: classes.dex */
public final class lm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 2) {
                z = y71.m4046m(parcel, m4041r);
            } else if (m4047l == 3) {
                z2 = y71.m4046m(parcel, m4041r);
            } else if (m4047l == 4) {
                iBinder = y71.m4040s(parcel, m4041r);
            } else if (m4047l != 5) {
                y71.m4035x(parcel, m4041r);
            } else {
                z3 = y71.m4046m(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzo(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
