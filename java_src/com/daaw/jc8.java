package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class jc8 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m18604a(zzkw zzkwVar, Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, zzkwVar.f37072p);
        z71.m2717q(parcel, 2, zzkwVar.f37073q, false);
        z71.m2720n(parcel, 3, zzkwVar.f37074r);
        z71.m2719o(parcel, 4, zzkwVar.f37075s, false);
        z71.m2725i(parcel, 5, null, false);
        z71.m2717q(parcel, 6, zzkwVar.f37076t, false);
        z71.m2717q(parcel, 7, zzkwVar.f37077u, false);
        z71.m2727g(parcel, 8, zzkwVar.f37078v, false);
        z71.m2732b(parcel, m2733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 2:
                    str = y71.m4053f(parcel, m4041r);
                    break;
                case 3:
                    j = y71.m4038u(parcel, m4041r);
                    break;
                case 4:
                    l = y71.m4037v(parcel, m4041r);
                    break;
                case 5:
                    f = y71.m4042q(parcel, m4041r);
                    break;
                case 6:
                    str2 = y71.m4053f(parcel, m4041r);
                    break;
                case 7:
                    str3 = y71.m4053f(parcel, m4041r);
                    break;
                case 8:
                    d = y71.m4044o(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzkw(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkw[i];
    }
}
