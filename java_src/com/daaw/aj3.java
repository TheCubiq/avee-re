package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbrz;
/* loaded from: classes.dex */
public final class aj3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l == 2) {
                z = y71.m(parcel, r);
            } else if (l == 3) {
                i = y71.t(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                str2 = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzbrz(str, z, i, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrz[i];
    }
}
