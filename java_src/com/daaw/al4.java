package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;
/* loaded from: classes.dex */
public final class al4 implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                i = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzc(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i) {
        return new zzc[i];
    }
}
