package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.j22;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new j22();

    /* renamed from: p */
    public final int f36636p;

    /* renamed from: q */
    public final int f36637q;

    /* renamed from: r */
    public final int f36638r;

    /* renamed from: s */
    public final long f36639s;

    /* renamed from: t */
    public final long f36640t;

    /* renamed from: u */
    public final String f36641u;

    /* renamed from: v */
    public final String f36642v;

    /* renamed from: w */
    public final int f36643w;

    /* renamed from: x */
    public final int f36644x;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f36636p = i;
        this.f36637q = i2;
        this.f36638r = i3;
        this.f36639s = j;
        this.f36640t = j2;
        this.f36641u = str;
        this.f36642v = str2;
        this.f36643w = i4;
        this.f36644x = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36636p);
        z71.m2723k(parcel, 2, this.f36637q);
        z71.m2723k(parcel, 3, this.f36638r);
        z71.m2720n(parcel, 4, this.f36639s);
        z71.m2720n(parcel, 5, this.f36640t);
        z71.m2717q(parcel, 6, this.f36641u, false);
        z71.m2717q(parcel, 7, this.f36642v, false);
        z71.m2723k(parcel, 8, this.f36643w);
        z71.m2723k(parcel, 9, this.f36644x);
        z71.m2732b(parcel, m2733a);
    }
}
