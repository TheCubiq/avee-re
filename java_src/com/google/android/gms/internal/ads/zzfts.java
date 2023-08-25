package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.daaw.zt6;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzfts extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfts> CREATOR = new zt6();
    public final int p;
    public final byte[] q;
    public final int r;

    public zzfts(int i, byte[] bArr, int i2) {
        this.p = i;
        this.q = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.r = i2;
    }

    public zzfts(byte[] bArr, int i) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.f(parcel, 2, this.q, false);
        z71.k(parcel, 3, this.r);
        z71.b(parcel, a);
    }
}
