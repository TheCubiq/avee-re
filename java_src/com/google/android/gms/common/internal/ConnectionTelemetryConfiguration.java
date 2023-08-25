package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rc8;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new rc8();
    public final RootTelemetryConfiguration p;
    public final boolean q;
    public final boolean r;
    public final int[] s;
    public final int t;
    public final int[] u;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.p = rootTelemetryConfiguration;
        this.q = z;
        this.r = z2;
        this.s = iArr;
        this.t = i;
        this.u = iArr2;
    }

    public int h() {
        return this.t;
    }

    public int[] q() {
        return this.s;
    }

    public int[] s() {
        return this.u;
    }

    public boolean t() {
        return this.q;
    }

    public boolean u() {
        return this.r;
    }

    public final RootTelemetryConfiguration v() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.p(parcel, 1, this.p, i, false);
        z71.c(parcel, 2, t());
        z71.c(parcel, 3, u());
        z71.l(parcel, 4, q(), false);
        z71.k(parcel, 5, h());
        z71.l(parcel, 6, s(), false);
        z71.b(parcel, a);
    }
}
