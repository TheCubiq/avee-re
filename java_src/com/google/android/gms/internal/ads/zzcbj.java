package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ut3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbj> CREATOR = new ut3();
    public final String p;
    public final int q;
    public final Bundle r;
    public final byte[] s;
    public final boolean t;
    public final String u;
    public final String v;

    public zzcbj(String str, int i, Bundle bundle, byte[] bArr, boolean z, String str2, String str3) {
        this.p = str;
        this.q = i;
        this.r = bundle;
        this.s = bArr;
        this.t = z;
        this.u = str2;
        this.v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.k(parcel, 2, this.q);
        z71.e(parcel, 3, this.r, false);
        z71.f(parcel, 4, this.s, false);
        z71.c(parcel, 5, this.t);
        z71.q(parcel, 6, this.u, false);
        z71.q(parcel, 7, this.v, false);
        z71.b(parcel, a);
    }
}
