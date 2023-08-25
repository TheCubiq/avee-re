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

    /* renamed from: p */
    public final int f37110p;

    /* renamed from: q */
    public final ConnectionResult f37111q;

    /* renamed from: r */
    public final zav f37112r;

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.f37110p = i;
        this.f37111q = connectionResult;
        this.f37112r = zavVar;
    }

    /* renamed from: h */
    public final ConnectionResult m1072h() {
        return this.f37111q;
    }

    /* renamed from: q */
    public final zav m1071q() {
        return this.f37112r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37110p);
        z71.m2718p(parcel, 2, this.f37111q, i, false);
        z71.m2718p(parcel, 3, this.f37112r, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
