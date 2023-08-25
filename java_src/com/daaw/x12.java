package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class x12 implements Parcelable.Creator<zag> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zag createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                arrayList = y71.h(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                str = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zag(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zag[] newArray(int i) {
        return new zag[i];
    }
}
