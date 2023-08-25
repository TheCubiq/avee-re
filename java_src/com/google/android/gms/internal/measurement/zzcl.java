package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.g54;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new g54();

    /* renamed from: p */
    public final long f37041p;

    /* renamed from: q */
    public final long f37042q;

    /* renamed from: r */
    public final boolean f37043r;

    /* renamed from: s */
    public final String f37044s;

    /* renamed from: t */
    public final String f37045t;

    /* renamed from: u */
    public final String f37046u;

    /* renamed from: v */
    public final Bundle f37047v;

    /* renamed from: w */
    public final String f37048w;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f37041p = j;
        this.f37042q = j2;
        this.f37043r = z;
        this.f37044s = str;
        this.f37045t = str2;
        this.f37046u = str3;
        this.f37047v = bundle;
        this.f37048w = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2720n(parcel, 1, this.f37041p);
        z71.m2720n(parcel, 2, this.f37042q);
        z71.m2731c(parcel, 3, this.f37043r);
        z71.m2717q(parcel, 4, this.f37044s, false);
        z71.m2717q(parcel, 5, this.f37045t, false);
        z71.m2717q(parcel, 6, this.f37046u, false);
        z71.m2729e(parcel, 7, this.f37047v, false);
        z71.m2717q(parcel, 8, this.f37048w, false);
        z71.m2732b(parcel, m2733a);
    }
}
