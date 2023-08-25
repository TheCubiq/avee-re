package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.hy2;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new hy2();

    /* renamed from: p */
    public final String f36554p;

    /* renamed from: q */
    public final String f36555q;

    public zza(String str, String str2) {
        this.f36554p = str;
        this.f36555q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36554p, false);
        z71.m2717q(parcel, 2, this.f36555q, false);
        z71.m2732b(parcel, m2733a);
    }
}
