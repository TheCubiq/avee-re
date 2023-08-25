package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.kj3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsl> CREATOR = new kj3();
    public final int p;
    public final int q;
    public final String r;
    public final int s;

    public zzbsl(int i, int i2, String str, int i3) {
        this.p = i;
        this.q = i2;
        this.r = str;
        this.s = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.q);
        z71.q(parcel, 2, this.r, false);
        z71.k(parcel, 3, this.s);
        z71.k(parcel, 1000, this.p);
        z71.b(parcel, a);
    }
}
