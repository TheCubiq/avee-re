package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcao;
/* loaded from: classes.dex */
public final class at3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                iBinder = y71.s(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                iBinder2 = y71.s(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzcao(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcao[i];
    }
}
