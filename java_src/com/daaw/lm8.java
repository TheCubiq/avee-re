package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzo;
/* loaded from: classes.dex */
public final class lm8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l == 2) {
                z = y71.m(parcel, r);
            } else if (l == 3) {
                z2 = y71.m(parcel, r);
            } else if (l == 4) {
                iBinder = y71.s(parcel, r);
            } else if (l != 5) {
                y71.x(parcel, r);
            } else {
                z3 = y71.m(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzo(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
