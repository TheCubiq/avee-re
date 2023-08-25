package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    public final int p;
    public final int q;
    public final String r;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 224400000, "21.5.0");
    }

    public zzen(int i, int i2, String str) {
        this.p = i;
        this.q = i2;
        this.r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.k(parcel, 2, this.q);
        z71.q(parcel, 3, this.r, false);
        z71.b(parcel, a);
    }

    public final int zza() {
        return this.q;
    }
}
