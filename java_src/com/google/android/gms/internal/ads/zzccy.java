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

    /* renamed from: p */
    public final zzl f36975p;

    /* renamed from: q */
    public final String f36976q;

    public zzccy(zzl zzlVar, String str) {
        this.f36975p = zzlVar;
        this.f36976q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2718p(parcel, 2, this.f36975p, i, false);
        z71.m2717q(parcel, 3, this.f36976q, false);
        z71.m2732b(parcel, m2733a);
    }
}
