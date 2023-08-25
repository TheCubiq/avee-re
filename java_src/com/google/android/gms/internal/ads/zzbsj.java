package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.jj3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbsj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsj> CREATOR = new jj3();

    /* renamed from: p */
    public final String f36870p;

    /* renamed from: q */
    public final Bundle f36871q;

    public zzbsj(String str, Bundle bundle) {
        this.f36870p = str;
        this.f36871q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36870p, false);
        z71.m2729e(parcel, 2, this.f36871q, false);
        z71.m2732b(parcel, m2733a);
    }
}
