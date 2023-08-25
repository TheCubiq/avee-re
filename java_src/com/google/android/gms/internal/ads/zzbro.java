package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.mi3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbro extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbro> CREATOR = new mi3();
    public final boolean p;
    public final String q;
    public final int r;
    public final byte[] s;
    public final String[] t;
    public final String[] u;
    public final boolean v;
    public final long w;

    public zzbro(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.p = z;
        this.q = str;
        this.r = i;
        this.s = bArr;
        this.t = strArr;
        this.u = strArr2;
        this.v = z2;
        this.w = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.c(parcel, 1, this.p);
        z71.q(parcel, 2, this.q, false);
        z71.k(parcel, 3, this.r);
        z71.f(parcel, 4, this.s, false);
        z71.r(parcel, 5, this.t, false);
        z71.r(parcel, 6, this.u, false);
        z71.c(parcel, 7, this.v);
        z71.n(parcel, 8, this.w);
        z71.b(parcel, a);
    }
}
