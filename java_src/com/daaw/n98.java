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
        int y = y71.y(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                bundle = y71.a(parcel, r);
            } else if (l == 2) {
                featureArr = (Feature[]) y71.i(parcel, r, Feature.CREATOR);
            } else if (l == 3) {
                i = y71.t(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) y71.e(parcel, r, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
