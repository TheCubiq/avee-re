package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rc8;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new rc8();

    /* renamed from: p */
    public final RootTelemetryConfiguration f36614p;

    /* renamed from: q */
    public final boolean f36615q;

    /* renamed from: r */
    public final boolean f36616r;

    /* renamed from: s */
    public final int[] f36617s;

    /* renamed from: t */
    public final int f36618t;

    /* renamed from: u */
    public final int[] f36619u;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f36614p = rootTelemetryConfiguration;
        this.f36615q = z;
        this.f36616r = z2;
        this.f36617s = iArr;
        this.f36618t = i;
        this.f36619u = iArr2;
    }

    /* renamed from: h */
    public int m1172h() {
        return this.f36618t;
    }

    /* renamed from: q */
    public int[] m1171q() {
        return this.f36617s;
    }

    /* renamed from: s */
    public int[] m1170s() {
        return this.f36619u;
    }

    /* renamed from: t */
    public boolean m1169t() {
        return this.f36615q;
    }

    /* renamed from: u */
    public boolean m1168u() {
        return this.f36616r;
    }

    /* renamed from: v */
    public final RootTelemetryConfiguration m1167v() {
        return this.f36614p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2718p(parcel, 1, this.f36614p, i, false);
        z71.m2731c(parcel, 2, m1169t());
        z71.m2731c(parcel, 3, m1168u());
        z71.m2722l(parcel, 4, m1171q(), false);
        z71.m2723k(parcel, 5, m1172h());
        z71.m2722l(parcel, 6, m1170s(), false);
        z71.m2732b(parcel, m2733a);
    }
}
