package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.a02;
import com.daaw.q51;
import com.daaw.z71;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements q51 {
    public static final Parcelable.Creator<zaa> CREATOR = new a02();

    /* renamed from: p */
    public final int f37103p;

    /* renamed from: q */
    public int f37104q;

    /* renamed from: r */
    public Intent f37105r;

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int i, int i2, Intent intent) {
        this.f37103p = i;
        this.f37104q = i2;
        this.f37105r = intent;
    }

    @Override // com.daaw.q51
    public final Status getStatus() {
        return this.f37104q == 0 ? Status.f36587v : Status.f36591z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37103p);
        z71.m2723k(parcel, 2, this.f37104q);
        z71.m2718p(parcel, 3, this.f37105r, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
