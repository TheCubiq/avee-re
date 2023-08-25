package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.st3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbf> CREATOR = new st3();
    public final ApplicationInfo p;
    public final String q;
    public final PackageInfo r;
    public final String s;
    public final int t;
    public final String u;
    public final List v;
    public final boolean w;
    public final boolean x;

    public zzcbf(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z, boolean z2) {
        this.q = str;
        this.p = applicationInfo;
        this.r = packageInfo;
        this.s = str2;
        this.t = i;
        this.u = str3;
        this.v = list;
        this.w = z;
        this.x = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.p(parcel, 1, this.p, i, false);
        z71.q(parcel, 2, this.q, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.q(parcel, 4, this.s, false);
        z71.k(parcel, 5, this.t);
        z71.q(parcel, 6, this.u, false);
        z71.s(parcel, 7, this.v, false);
        z71.c(parcel, 8, this.w);
        z71.c(parcel, 9, this.x);
        z71.b(parcel, a);
    }
}
