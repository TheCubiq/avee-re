package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzfth extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfth> CREATOR = new rt6();
    public final int p;
    public final String q;
    public final String r;

    public zzfth(int i, String str, String str2) {
        this.p = i;
        this.q = str;
        this.r = str2;
    }

    public zzfth(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.q(parcel, 2, this.q, false);
        z71.q(parcel, 3, this.r, false);
        z71.b(parcel, a);
    }
}
