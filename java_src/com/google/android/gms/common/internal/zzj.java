package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.n98;
import com.daaw.z71;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new n98();
    public Bundle p;
    public Feature[] q;
    public int r;
    public ConnectionTelemetryConfiguration s;

    public zzj() {
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.p = bundle;
        this.q = featureArr;
        this.r = i;
        this.s = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.e(parcel, 1, this.p, false);
        z71.t(parcel, 2, this.q, i, false);
        z71.k(parcel, 3, this.r);
        z71.p(parcel, 4, this.s, i, false);
        z71.b(parcel, a);
    }
}
