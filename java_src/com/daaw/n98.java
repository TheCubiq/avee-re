package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
/* loaded from: classes.dex */
public final class n98 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m4034y = y71.m4034y(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < m4034y) {
            int m4041r = y71.m4041r(parcel);
            int m4047l = y71.m4047l(m4041r);
            if (m4047l == 1) {
                bundle = y71.m4058a(parcel, m4041r);
            } else if (m4047l == 2) {
                featureArr = (Feature[]) y71.m4050i(parcel, m4041r, Feature.CREATOR);
            } else if (m4047l == 3) {
                i = y71.m4039t(parcel, m4041r);
            } else if (m4047l != 4) {
                y71.m4035x(parcel, m4041r);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) y71.m4054e(parcel, m4041r, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        y71.m4048k(parcel, m4034y);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
