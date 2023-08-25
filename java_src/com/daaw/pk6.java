package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfkz;
/* loaded from: classes.dex */
public final class pk6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    i2 = y71.t(parcel, r);
                    break;
                case 3:
                    i3 = y71.t(parcel, r);
                    break;
                case 4:
                    i4 = y71.t(parcel, r);
                    break;
                case 5:
                    str = y71.f(parcel, r);
                    break;
                case 6:
                    i5 = y71.t(parcel, r);
                    break;
                case 7:
                    i6 = y71.t(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzfkz(i, i2, i3, i4, str, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfkz[i];
    }
}
