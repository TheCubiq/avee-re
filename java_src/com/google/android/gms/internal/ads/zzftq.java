package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzftq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzftq> CREATOR = new yt6();
    public final int p;
    public final int q;
    public final String r;
    public final String s;
    public final int t;

    public zzftq(int i, int i2, int i3, String str, String str2) {
        this.p = i;
        this.q = i2;
        this.r = str;
        this.s = str2;
        this.t = i3;
    }

    public zzftq(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.k(parcel, 2, this.q);
        z71.q(parcel, 3, this.r, false);
        z71.q(parcel, 4, this.s, false);
        z71.k(parcel, 5, this.t);
        z71.b(parcel, a);
    }
}
