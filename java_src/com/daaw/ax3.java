package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcem;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ax3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 4:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 5:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 6:
                    arrayList = y71.m4051h(parcel, m4041r);
                    break;
                case 7:
                    z3 = y71.m4046m(parcel, m4041r);
                    break;
                case 8:
                    z4 = y71.m4046m(parcel, m4041r);
                    break;
                case 9:
                    arrayList2 = y71.m4051h(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzcem(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcem[i];
    }
}
