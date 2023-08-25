package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class yc2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l == 2) {
                z = y71.m(parcel, r);
            } else if (l == 3) {
                z2 = y71.m(parcel, r);
            } else if (l == 4) {
                i2 = y71.t(parcel, r);
            } else if (l != 5) {
                y71.x(parcel, r);
            } else {
                i3 = y71.t(parcel, r);
            }
        }
        y71.k(parcel, y);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
