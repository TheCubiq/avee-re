package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.g54;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new g54();
    public final long p;
    public final long q;
    public final boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final Bundle v;
    public final String w;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.p = j;
        this.q = j2;
        this.r = z;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = bundle;
        this.w = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.n(parcel, 1, this.p);
        z71.n(parcel, 2, this.q);
        z71.c(parcel, 3, this.r);
        z71.q(parcel, 4, this.s, false);
        z71.q(parcel, 5, this.t, false);
        z71.q(parcel, 6, this.u, false);
        z71.e(parcel, 7, this.v, false);
        z71.q(parcel, 8, this.w, false);
        z71.b(parcel, a);
    }
}
