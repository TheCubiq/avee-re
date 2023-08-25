package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ut3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbj> CREATOR = new ut3();

    /* renamed from: p */
    public final String f36953p;

    /* renamed from: q */
    public final int f36954q;

    /* renamed from: r */
    public final Bundle f36955r;

    /* renamed from: s */
    public final byte[] f36956s;

    /* renamed from: t */
    public final boolean f36957t;

    /* renamed from: u */
    public final String f36958u;

    /* renamed from: v */
    public final String f36959v;

    public zzcbj(String str, int i, Bundle bundle, byte[] bArr, boolean z, String str2, String str3) {
        this.f36953p = str;
        this.f36954q = i;
        this.f36955r = bundle;
        this.f36956s = bArr;
        this.f36957t = z;
        this.f36958u = str2;
        this.f36959v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36953p, false);
        z71.m2723k(parcel, 2, this.f36954q);
        z71.m2729e(parcel, 3, this.f36955r, false);
        z71.m2728f(parcel, 4, this.f36956s, false);
        z71.m2731c(parcel, 5, this.f36957t);
        z71.m2717q(parcel, 6, this.f36958u, false);
        z71.m2717q(parcel, 7, this.f36959v, false);
        z71.m2732b(parcel, m2733a);
    }
}
