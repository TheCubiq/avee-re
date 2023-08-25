package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
/* loaded from: classes2.dex */
public final class c22 implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zai createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                zatVar = (zat) y71.e(parcel, r, zat.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new zai(i, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i) {
        return new zai[i];
    }
}
