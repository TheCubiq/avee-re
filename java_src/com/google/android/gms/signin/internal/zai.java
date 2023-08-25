package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.c22;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
/* loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new c22();

    /* renamed from: p */
    public final int f37108p;

    /* renamed from: q */
    public final zat f37109q;

    public zai(int i, zat zatVar) {
        this.f37108p = i;
        this.f37109q = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37108p);
        z71.m2718p(parcel, 2, this.f37109q, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
