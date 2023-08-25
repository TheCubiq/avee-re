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

    /* renamed from: p */
    public final String f36989p;

    /* renamed from: q */
    public final String f36990q;
    @Deprecated

    /* renamed from: r */
    public final zzq f36991r;

    /* renamed from: s */
    public final zzl f36992s;

    public zzcgj(String str, String str2, zzq zzqVar, zzl zzlVar) {
        this.f36989p = str;
        this.f36990q = str2;
        this.f36991r = zzqVar;
        this.f36992s = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36989p, false);
        z71.m2717q(parcel, 2, this.f36990q, false);
        z71.m2718p(parcel, 3, this.f36991r, i, false);
        z71.m2718p(parcel, 4, this.f36992s, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
