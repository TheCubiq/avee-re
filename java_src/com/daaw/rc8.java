package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class rc8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            switch (y71.l(r)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) y71.e(parcel, r, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = y71.m(parcel, r);
                    break;
                case 3:
                    z2 = y71.m(parcel, r);
                    break;
                case 4:
                    iArr = y71.c(parcel, r);
                    break;
                case 5:
                    i = y71.t(parcel, r);
                    break;
                case 6:
                    iArr2 = y71.c(parcel, r);
                    break;
                default:
                    y71.x(parcel, r);
                    break;
            }
        }
        y71.k(parcel, y);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
