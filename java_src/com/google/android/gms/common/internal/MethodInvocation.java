package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.j22;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new j22();
    public final int p;
    public final int q;
    public final int r;
    public final long s;
    public final long t;
    public final String u;
    public final String v;
    public final int w;
    public final int x;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = j;
        this.t = j2;
        this.u = str;
        this.v = str2;
        this.w = i4;
        this.x = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.k(parcel, 2, this.q);
        z71.k(parcel, 3, this.r);
        z71.n(parcel, 4, this.s);
        z71.n(parcel, 5, this.t);
        z71.q(parcel, 6, this.u, false);
        z71.q(parcel, 7, this.v, false);
        z71.k(parcel, 8, this.w);
        z71.k(parcel, 9, this.x);
        z71.b(parcel, a);
    }
}
