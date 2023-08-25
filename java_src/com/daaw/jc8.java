package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class jc8 implements Parcelable.Creator {
    public static void a(zzkw zzkwVar, Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, zzkwVar.p);
        z71.q(parcel, 2, zzkwVar.q, false);
        z71.n(parcel, 3, zzkwVar.r);
        z71.o(parcel, 4, zzkwVar.s, false);
        z71.i(parcel, 5, null, false);
        z71.q(parcel, 6, zzkwVar.t, false);
        z71.q(parcel, 7, zzkwVar.u, false);
        z71.g(parcel, 8, zzkwVar.v, false);
        z71.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    str = y71.f(parcel, r);
                    break;
                case 3:
                    j = y71.u(parcel, r);
                    break;
                case 4:
                    l = y71.v(parcel, r);
                    break;
                case 5:
                    f = y71.q(parcel, r);
                    break;
                case 6:
                    str2 = y71.f(parcel, r);
                    break;
                case 7:
                    str3 = y71.f(parcel, r);
                    break;
                case 8:
                    d = y71.o(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new zzkw(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkw[i];
    }
}
