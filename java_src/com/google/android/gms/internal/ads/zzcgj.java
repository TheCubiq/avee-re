package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.dz3;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcgj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgj> CREATOR = new dz3();
    @Deprecated
    public final String p;
    public final String q;
    @Deprecated
    public final zzq r;
    public final zzl s;

    public zzcgj(String str, String str2, zzq zzqVar, zzl zzlVar) {
        this.p = str;
        this.q = str2;
        this.r = zzqVar;
        this.s = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.q(parcel, 2, this.q, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.p(parcel, 4, this.s, i, false);
        z71.b(parcel, a);
    }
}
