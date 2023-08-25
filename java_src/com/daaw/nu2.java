package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class nu2 implements Parcelable.Creator {
    public static void a(zzaw zzawVar, Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, zzawVar.p, false);
        z71.p(parcel, 3, zzawVar.q, i, false);
        z71.q(parcel, 4, zzawVar.r, false);
        z71.n(parcel, 5, zzawVar.s);
        z71.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 2) {
                str = y71.f(parcel, r);
            } else if (l == 3) {
                zzauVar = (zzau) y71.e(parcel, r, zzau.CREATOR);
            } else if (l == 4) {
                str2 = y71.f(parcel, r);
            } else if (l != 5) {
                y71.x(parcel, r);
            } else {
                j = y71.u(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new zzaw(str, zzauVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
