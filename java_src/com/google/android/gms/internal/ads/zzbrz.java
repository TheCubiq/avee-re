package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.aj3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbrz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrz> CREATOR = new aj3();

    /* renamed from: p */
    public final String f36866p;

    /* renamed from: q */
    public final boolean f36867q;

    /* renamed from: r */
    public final int f36868r;

    /* renamed from: s */
    public final String f36869s;

    public zzbrz(String str, boolean z, int i, String str2) {
        this.f36866p = str;
        this.f36867q = z;
        this.f36868r = i;
        this.f36869s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36866p, false);
        z71.m2731c(parcel, 2, this.f36867q);
        z71.m2723k(parcel, 3, this.f36868r);
        z71.m2717q(parcel, 4, this.f36869s, false);
        z71.m2732b(parcel, m2733a);
    }
}
