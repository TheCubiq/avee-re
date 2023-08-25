package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbro;
/* loaded from: classes.dex */
public final class mi3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    z = y71.m(parcel, r);
                    break;
                case 2:
                    str = y71.f(parcel, r);
                    break;
                case 3:
                    i = y71.t(parcel, r);
                    break;
                case 4:
                    bArr = y71.b(parcel, r);
                    break;
                case 5:
                    strArr = y71.g(parcel, r);
                    break;
                case 6:
                    strArr2 = y71.g(parcel, r);
                    break;
                case 7:
                    z2 = y71.m(parcel, r);
                    break;
                case 8:
                    j = y71.u(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzbro(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbro[i];
    }
}
