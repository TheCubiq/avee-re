package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 2:
                    z = y71.m(parcel, r);
                    break;
                case 3:
                    z2 = y71.m(parcel, r);
                    break;
                case 4:
                    str = y71.f(parcel, r);
                    break;
                case 5:
                    z3 = y71.m(parcel, r);
                    break;
                case 6:
                    f = y71.p(parcel, r);
                    break;
                case 7:
                    i = y71.t(parcel, r);
                    break;
                case 8:
                    z4 = y71.m(parcel, r);
                    break;
                case 9:
                    z5 = y71.m(parcel, r);
                    break;
                case 10:
                    z6 = y71.m(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzj(z, z2, str, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
