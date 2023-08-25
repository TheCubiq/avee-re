package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ot0;
import com.daaw.v22;
import com.daaw.z71;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC3989b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new v22();

    /* renamed from: p */
    public final int f36656p;

    /* renamed from: q */
    public final IBinder f36657q;

    /* renamed from: r */
    public final ConnectionResult f36658r;

    /* renamed from: s */
    public final boolean f36659s;

    /* renamed from: t */
    public final boolean f36660t;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f36656p = i;
        this.f36657q = iBinder;
        this.f36658r = connectionResult;
        this.f36659s = z;
        this.f36660t = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zav) {
            zav zavVar = (zav) obj;
            return this.f36658r.equals(zavVar.f36658r) && ot0.m13981a(m1154q(), zavVar.m1154q());
        }
        return false;
    }

    /* renamed from: h */
    public final ConnectionResult m1155h() {
        return this.f36658r;
    }

    /* renamed from: q */
    public final InterfaceC3989b m1154q() {
        IBinder iBinder = this.f36657q;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3989b.AbstractBinderC3990a.m1156I(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36656p);
        z71.m2724j(parcel, 2, this.f36657q, false);
        z71.m2718p(parcel, 3, this.f36658r, i, false);
        z71.m2731c(parcel, 4, this.f36659s);
        z71.m2731c(parcel, 5, this.f36660t);
        z71.m2732b(parcel, m2733a);
    }
}
