package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcbj;
/* loaded from: classes.dex */
public final class ut3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 2:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 3:
                    bundle = y71.m4058a(parcel, m4041r);
                    break;
                case 4:
                    bArr = y71.m4057b(parcel, m4041r);
                    break;
                case 5:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 6:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 7:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzcbj(str, i, bundle, bArr, z, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbj[i];
    }
}
