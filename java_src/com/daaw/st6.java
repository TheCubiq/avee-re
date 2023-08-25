package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzftj;
/* loaded from: classes.dex */
public final class st6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                bArr = y71.b(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzftj(i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzftj[i];
    }
}
