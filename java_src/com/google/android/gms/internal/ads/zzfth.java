package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzfth extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfth> CREATOR = new rt6();

    /* renamed from: p */
    public final int f37013p;

    /* renamed from: q */
    public final String f37014q;

    /* renamed from: r */
    public final String f37015r;

    public zzfth(int i, String str, String str2) {
        this.f37013p = i;
        this.f37014q = str;
        this.f37015r = str2;
    }

    public zzfth(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37013p);
        z71.m2717q(parcel, 2, this.f37014q, false);
        z71.m2717q(parcel, 3, this.f37015r, false);
        z71.m2732b(parcel, m2733a);
    }
}
