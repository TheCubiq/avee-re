package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.jv3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzccy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccy> CREATOR = new jv3();
    public final zzl p;
    public final String q;

    public zzccy(zzl zzlVar, String str) {
        this.p = zzlVar;
        this.q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.p(parcel, 2, this.p, i, false);
        z71.q(parcel, 3, this.q, false);
        z71.b(parcel, a);
    }
}
