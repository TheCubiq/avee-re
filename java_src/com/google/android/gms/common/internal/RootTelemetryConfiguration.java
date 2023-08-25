package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yc2;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new yc2();

    /* renamed from: p */
    public final int f36645p;

    /* renamed from: q */
    public final boolean f36646q;

    /* renamed from: r */
    public final boolean f36647r;

    /* renamed from: s */
    public final int f36648s;

    /* renamed from: t */
    public final int f36649t;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f36645p = i;
        this.f36646q = z;
        this.f36647r = z2;
        this.f36648s = i2;
        this.f36649t = i3;
    }

    /* renamed from: h */
    public int m1165h() {
        return this.f36648s;
    }

    /* renamed from: q */
    public int m1164q() {
        return this.f36649t;
    }

    /* renamed from: s */
    public boolean m1163s() {
        return this.f36646q;
    }

    /* renamed from: t */
    public boolean m1162t() {
        return this.f36647r;
    }

    /* renamed from: u */
    public int m1161u() {
        return this.f36645p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, m1161u());
        z71.m2731c(parcel, 2, m1163s());
        z71.m2731c(parcel, 3, m1162t());
        z71.m2723k(parcel, 4, m1165h());
        z71.m2723k(parcel, 5, m1164q());
        z71.m2732b(parcel, m2733a);
    }
}
