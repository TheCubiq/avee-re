package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcdy;
/* loaded from: classes.dex */
public final class kw3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                str2 = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzcdy(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdy[i];
    }
}
