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

    /* renamed from: p */
    public Bundle f36661p;

    /* renamed from: q */
    public Feature[] f36662q;

    /* renamed from: r */
    public int f36663r;

    /* renamed from: s */
    public ConnectionTelemetryConfiguration f36664s;

    public zzj() {
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f36661p = bundle;
        this.f36662q = featureArr;
        this.f36663r = i;
        this.f36664s = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2729e(parcel, 1, this.f36661p, false);
        z71.m2714t(parcel, 2, this.f36662q, i, false);
        z71.m2723k(parcel, 3, this.f36663r);
        z71.m2718p(parcel, 4, this.f36664s, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
