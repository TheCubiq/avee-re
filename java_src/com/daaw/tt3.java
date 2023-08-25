package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbh;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class tt3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                z = y71.m(parcel, r);
            } else if (l != 3) {
                y71.x(parcel, r);
            } else {
                arrayList = y71.h(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzcbh(z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbh[i];
    }
}
