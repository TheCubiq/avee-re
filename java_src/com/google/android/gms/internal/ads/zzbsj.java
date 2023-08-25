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
    public final String p;
    public final Bundle q;

    public zzbsj(String str, Bundle bundle) {
        this.p = str;
        this.q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.e(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }
}
