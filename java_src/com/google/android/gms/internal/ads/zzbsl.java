package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.kj3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsl> CREATOR = new kj3();

    /* renamed from: p */
    public final int f36872p;

    /* renamed from: q */
    public final int f36873q;

    /* renamed from: r */
    public final String f36874r;

    /* renamed from: s */
    public final int f36875s;

    public zzbsl(int i, int i2, String str, int i3) {
        this.f36872p = i;
        this.f36873q = i2;
        this.f36874r = str;
        this.f36875s = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36873q);
        z71.m2717q(parcel, 2, this.f36874r, false);
        z71.m2723k(parcel, 3, this.f36875s);
        z71.m2723k(parcel, 1000, this.f36872p);
        z71.m2732b(parcel, m2733a);
    }
}
