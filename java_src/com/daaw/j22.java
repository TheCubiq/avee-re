package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
/* loaded from: classes.dex */
public final class j22 implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    i = y71.t(parcel, r);
                    break;
                case 2:
                    i2 = y71.t(parcel, r);
                    break;
                case 3:
                    i3 = y71.t(parcel, r);
                    break;
                case 4:
                    j = y71.u(parcel, r);
                    break;
                case 5:
                    j2 = y71.u(parcel, r);
                    break;
                case 6:
                    str = y71.f(parcel, r);
                    break;
                case 7:
                    str2 = y71.f(parcel, r);
                    break;
                case 8:
                    i4 = y71.t(parcel, r);
                    break;
                case 9:
                    i5 = y71.t(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
