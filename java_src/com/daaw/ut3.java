package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbj;
/* loaded from: classes.dex */
public final class ut3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    str = y71.f(parcel, r);
                    break;
                case 2:
                    i = y71.t(parcel, r);
                    break;
                case 3:
                    bundle = y71.a(parcel, r);
                    break;
                case 4:
                    bArr = y71.b(parcel, r);
                    break;
                case 5:
                    z = y71.m(parcel, r);
                    break;
                case 6:
                    str2 = y71.f(parcel, r);
                    break;
                case 7:
                    str3 = y71.f(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzcbj(str, i, bundle, bArr, z, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbj[i];
    }
}
