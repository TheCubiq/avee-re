package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbro;
/* loaded from: classes.dex */
public final class mi3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 4:
                    bArr = y71.m4057b(parcel, m4041r);
                    break;
                case 5:
                    strArr = y71.m4052g(parcel, m4041r);
                    break;
                case 6:
                    strArr2 = y71.m4052g(parcel, m4041r);
                    break;
                case 7:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 8:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzbro(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbro[i];
    }
}
