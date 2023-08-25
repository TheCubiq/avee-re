package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcgj;
/* loaded from: classes.dex */
public final class dz3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String str2 = null;
        zzq zzqVar = null;
        zzl zzlVar = null;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                str = y71.f(parcel, r);
            } else if (l == 2) {
                str2 = y71.f(parcel, r);
            } else if (l == 3) {
                zzqVar = (zzq) y71.e(parcel, r, zzq.CREATOR);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                zzlVar = (zzl) y71.e(parcel, r, zzl.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new zzcgj(str, str2, zzqVar, zzlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcgj[i];
    }
}
