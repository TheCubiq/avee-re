package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.pt6;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzfte extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfte> CREATOR = new pt6();

    /* renamed from: p */
    public final int f37011p;

    /* renamed from: q */
    public final byte[] f37012q;

    public zzfte(int i, byte[] bArr) {
        this.f37011p = i;
        this.f37012q = bArr;
    }

    public zzfte(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37011p);
        z71.m2728f(parcel, 2, this.f37012q, false);
        z71.m2732b(parcel, m2733a);
    }
}
