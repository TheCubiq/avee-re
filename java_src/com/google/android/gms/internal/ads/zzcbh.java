package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.tt3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbh> CREATOR = new tt3();

    /* renamed from: p */
    public final boolean f36951p;

    /* renamed from: q */
    public final List f36952q;

    public zzcbh(boolean z, List list) {
        this.f36951p = z;
        this.f36952q = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 2, this.f36951p);
        z71.m2715s(parcel, 3, this.f36952q, false);
        z71.m2732b(parcel, m2733a);
    }
}
