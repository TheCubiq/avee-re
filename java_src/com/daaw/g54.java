package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class g54 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    j = y71.u(parcel, r);
                    break;
                case 2:
                    j2 = y71.u(parcel, r);
                    break;
                case 3:
                    z = y71.m(parcel, r);
                    break;
                case 4:
                    str = y71.f(parcel, r);
                    break;
                case 5:
                    str2 = y71.f(parcel, r);
                    break;
                case 6:
                    str3 = y71.f(parcel, r);
                    break;
                case 7:
                    bundle = y71.a(parcel, r);
                    break;
                case 8:
                    str4 = y71.f(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
