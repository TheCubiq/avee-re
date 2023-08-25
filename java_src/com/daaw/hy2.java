package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zza;
/* loaded from: classes.dex */
public final class hy2 implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zza createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l != 2) {
                y71.x(parcel, r);
            } else {
                str2 = y71.f(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zza(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i) {
        return new zza[i];
    }
}
