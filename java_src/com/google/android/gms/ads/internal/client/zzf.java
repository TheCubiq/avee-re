package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.y71;
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String str2 = null;
        zze zzeVar = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                str2 = y71.f(parcel, r);
            } else if (l == 4) {
                zzeVar = (zze) y71.e(parcel, r, zze.CREATOR);
            } else if (l != 5) {
                y71.x(parcel, r);
            } else {
                iBinder = y71.s(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zze(i, str, str2, zzeVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
