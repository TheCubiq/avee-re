package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.hy2;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new hy2();
    public final String p;
    public final String q;

    public zza(String str, String str2) {
        this.p = str;
        this.q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.q(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }
}
