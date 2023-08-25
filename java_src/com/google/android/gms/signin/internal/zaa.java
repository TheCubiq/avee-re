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
    public final int p;
    public int q;
    public Intent r;

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int i, int i2, Intent intent) {
        this.p = i;
        this.q = i2;
        this.r = intent;
    }

    @Override // com.daaw.q51
    public final Status getStatus() {
        return this.q == 0 ? Status.v : Status.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.k(parcel, 2, this.q);
        z71.p(parcel, 3, this.r, i, false);
        z71.b(parcel, a);
    }
}
