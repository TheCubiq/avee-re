package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();

    /* renamed from: p */
    public final int f36176p;

    /* renamed from: q */
    public final int f36177q;

    /* renamed from: r */
    public final String f36178r;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 224400000, "21.5.0");
    }

    public zzen(int i, int i2, String str) {
        this.f36176p = i;
        this.f36177q = i2;
        this.f36178r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36176p);
        z71.m2723k(parcel, 2, this.f36177q);
        z71.m2717q(parcel, 3, this.f36178r, false);
        z71.m2732b(parcel, m2733a);
    }

    public final int zza() {
        return this.f36177q;
    }
}
