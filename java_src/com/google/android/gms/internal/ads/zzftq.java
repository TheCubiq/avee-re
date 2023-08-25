package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzftq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzftq> CREATOR = new yt6();

    /* renamed from: p */
    public final int f37019p;

    /* renamed from: q */
    public final int f37020q;

    /* renamed from: r */
    public final String f37021r;

    /* renamed from: s */
    public final String f37022s;

    /* renamed from: t */
    public final int f37023t;

    public zzftq(int i, int i2, int i3, String str, String str2) {
        this.f37019p = i;
        this.f37020q = i2;
        this.f37021r = str;
        this.f37022s = str2;
        this.f37023t = i3;
    }

    public zzftq(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37019p);
        z71.m2723k(parcel, 2, this.f37020q);
        z71.m2717q(parcel, 3, this.f37021r, false);
        z71.m2717q(parcel, 4, this.f37022s, false);
        z71.m2723k(parcel, 5, this.f37023t);
        z71.m2732b(parcel, m2733a);
    }
}
