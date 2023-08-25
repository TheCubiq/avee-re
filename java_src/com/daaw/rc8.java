package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class rc8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            switch (y71.m4047l(m4041r)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) y71.m4054e(parcel, m4041r, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = y71.m4046m(parcel, m4041r);
                    break;
                case 3:
                    z2 = y71.m4046m(parcel, m4041r);
                    break;
                case 4:
                    iArr = y71.m4056c(parcel, m4041r);
                    break;
                case 5:
                    i = y71.m4039t(parcel, m4041r);
                    break;
                case 6:
                    iArr2 = y71.m4056c(parcel, m4041r);
                    break;
                default:
                    y71.m4035x(parcel, m4041r);
                    break;
            }
        }
        y71.m4048k(parcel, m4034y);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
