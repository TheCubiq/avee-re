package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class nu2 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m14781a(zzaw zzawVar, Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, zzawVar.f37068p, false);
        z71.m2718p(parcel, 3, zzawVar.f37069q, i, false);
        z71.m2717q(parcel, 4, zzawVar.f37070r, false);
        z71.m2720n(parcel, 5, zzawVar.f37071s);
        z71.m2732b(parcel, m2733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 2) {
                str = y71.m4053f(parcel, m4041r);
            } else if (m4047l == 3) {
                zzauVar = (zzau) y71.m4054e(parcel, m4041r, zzau.CREATOR);
            } else if (m4047l == 4) {
                str2 = y71.m4053f(parcel, m4041r);
            } else if (m4047l != 5) {
                y71.m4035x(parcel, m4041r);
            } else {
                j = y71.m4038u(parcel, m4041r);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzaw(str, zzauVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
