package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.f22;
import com.daaw.z71;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new f22();
    public final int p;
    public final ConnectionResult q;
    public final zav r;

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.p = i;
        this.q = connectionResult;
        this.r = zavVar;
    }

    public final ConnectionResult h() {
        return this.q;
    }

    public final zav q() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.p(parcel, 2, this.q, i, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.b(parcel, a);
    }
}
