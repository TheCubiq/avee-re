package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yc2;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new yc2();
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.p = i;
        this.q = z;
        this.r = z2;
        this.s = i2;
        this.t = i3;
    }

    public int h() {
        return this.s;
    }

    public int q() {
        return this.t;
    }

    public boolean s() {
        return this.q;
    }

    public boolean t() {
        return this.r;
    }

    public int u() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, u());
        z71.c(parcel, 2, s());
        z71.c(parcel, 3, t());
        z71.k(parcel, 4, h());
        z71.k(parcel, 5, q());
        z71.b(parcel, a);
    }
}
