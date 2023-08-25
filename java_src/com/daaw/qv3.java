package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public final class qv3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                i = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzcdd(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdd[i];
    }
}
