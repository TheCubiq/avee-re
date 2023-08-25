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

    /* renamed from: p */
    public final int f37024p;

    /* renamed from: q */
    public final byte[] f37025q;

    /* renamed from: r */
    public final int f37026r;

    public zzfts(int i, byte[] bArr, int i2) {
        this.f37024p = i;
        this.f37025q = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f37026r = i2;
    }

    public zzfts(byte[] bArr, int i) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37024p);
        z71.m2728f(parcel, 2, this.f37025q, false);
        z71.m2723k(parcel, 3, this.f37026r);
        z71.m2732b(parcel, m2733a);
    }
}
