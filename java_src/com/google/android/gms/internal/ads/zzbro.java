package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.mi3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzbro extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbro> CREATOR = new mi3();

    /* renamed from: p */
    public final boolean f36858p;

    /* renamed from: q */
    public final String f36859q;

    /* renamed from: r */
    public final int f36860r;

    /* renamed from: s */
    public final byte[] f36861s;

    /* renamed from: t */
    public final String[] f36862t;

    /* renamed from: u */
    public final String[] f36863u;

    /* renamed from: v */
    public final boolean f36864v;

    /* renamed from: w */
    public final long f36865w;

    public zzbro(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f36858p = z;
        this.f36859q = str;
        this.f36860r = i;
        this.f36861s = bArr;
        this.f36862t = strArr;
        this.f36863u = strArr2;
        this.f36864v = z2;
        this.f36865w = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 1, this.f36858p);
        z71.m2717q(parcel, 2, this.f36859q, false);
        z71.m2723k(parcel, 3, this.f36860r);
        z71.m2728f(parcel, 4, this.f36861s, false);
        z71.m2716r(parcel, 5, this.f36862t, false);
        z71.m2716r(parcel, 6, this.f36863u, false);
        z71.m2731c(parcel, 7, this.f36864v);
        z71.m2720n(parcel, 8, this.f36865w);
        z71.m2732b(parcel, m2733a);
    }
}
