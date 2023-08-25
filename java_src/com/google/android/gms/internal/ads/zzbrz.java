package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.aj3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbrz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrz> CREATOR = new aj3();
    public final String p;
    public final boolean q;
    public final int r;
    public final String s;

    public zzbrz(String str, boolean z, int i, String str2) {
        this.p = str;
        this.q = z;
        this.r = i;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.c(parcel, 2, this.q);
        z71.k(parcel, 3, this.r);
        z71.q(parcel, 4, this.s, false);
        z71.b(parcel, a);
    }
}
