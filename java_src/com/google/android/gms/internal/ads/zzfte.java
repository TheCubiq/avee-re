package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.pt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzfte extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfte> CREATOR = new pt6();
    public final int p;
    public final byte[] q;

    public zzfte(int i, byte[] bArr) {
        this.p = i;
        this.q = bArr;
    }

    public zzfte(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.f(parcel, 2, this.q, false);
        z71.b(parcel, a);
    }
}
