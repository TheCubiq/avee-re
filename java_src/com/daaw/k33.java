package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbei;
/* loaded from: classes.dex */
public final class k33 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 2:
                    str = y71.f(parcel, r);
                    break;
                case 3:
                    j = y71.u(parcel, r);
                    break;
                case 4:
                    str2 = y71.f(parcel, r);
                    break;
                case 5:
                    str3 = y71.f(parcel, r);
                    break;
                case 6:
                    str4 = y71.f(parcel, r);
                    break;
                case 7:
                    bundle = y71.a(parcel, r);
                    break;
                case 8:
                    z = y71.m(parcel, r);
                    break;
                case 9:
                    j2 = y71.u(parcel, r);
                    break;
                case 10:
                    str5 = y71.f(parcel, r);
                    break;
                case 11:
                    i = y71.t(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzbei(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbei[i];
    }
}
