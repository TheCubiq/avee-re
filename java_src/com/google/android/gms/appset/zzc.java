package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.al4;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new al4();
    public final String p;
    public final int q;

    public zzc(String str, int i) {
        this.p = str;
        this.q = i;
    }

    public final String h() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.k(parcel, 2, this.q);
        z71.b(parcel, a);
    }

    public final int zza() {
        return this.q;
    }
}
