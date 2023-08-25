package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzccy;
/* loaded from: classes.dex */
public final class jv3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        zzl zzlVar = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                zzlVar = (zzl) y71.e(parcel, r, zzl.CREATOR);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                str = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzccy(zzlVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccy[i];
    }
}
