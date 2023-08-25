package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ot0;
import com.daaw.v22;
import com.daaw.z71;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new v22();
    public final int p;
    public final IBinder q;
    public final ConnectionResult r;
    public final boolean s;
    public final boolean t;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.p = i;
        this.q = iBinder;
        this.r = connectionResult;
        this.s = z;
        this.t = z2;
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
            return this.r.equals(zavVar.r) && ot0.a(q(), zavVar.q());
        }
        return false;
    }

    public final ConnectionResult h() {
        return this.r;
    }

    public final b q() {
        IBinder iBinder = this.q;
        if (iBinder == null) {
            return null;
        }
        return b.a.I(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.j(parcel, 2, this.q, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.c(parcel, 4, this.s);
        z71.c(parcel, 5, this.t);
        z71.b(parcel, a);
    }
}
