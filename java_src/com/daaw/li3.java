package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbrm;
/* loaded from: classes.dex */
public final class li3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l == 2) {
                strArr = y71.g(parcel, r);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                strArr2 = y71.g(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzbrm(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrm[i];
    }
}
