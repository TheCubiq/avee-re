package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.nu3;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzccb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccb> CREATOR = new nu3();
    public final boolean A;
    public final Bundle p;
    public final zzchu q;
    public final ApplicationInfo r;
    public final String s;
    public final List t;
    public final PackageInfo u;
    public final String v;
    public final String w;
    public zzfkz x;
    public String y;
    public final boolean z;

    public zzccb(Bundle bundle, zzchu zzchuVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfkz zzfkzVar, String str4, boolean z, boolean z2) {
        this.p = bundle;
        this.q = zzchuVar;
        this.s = str;
        this.r = applicationInfo;
        this.t = list;
        this.u = packageInfo;
        this.v = str2;
        this.w = str3;
        this.x = zzfkzVar;
        this.y = str4;
        this.z = z;
        this.A = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.e(parcel, 1, this.p, false);
        z71.p(parcel, 2, this.q, i, false);
        z71.p(parcel, 3, this.r, i, false);
        z71.q(parcel, 4, this.s, false);
        z71.s(parcel, 5, this.t, false);
        z71.p(parcel, 6, this.u, i, false);
        z71.q(parcel, 7, this.v, false);
        z71.q(parcel, 9, this.w, false);
        z71.p(parcel, 10, this.x, i, false);
        z71.q(parcel, 11, this.y, false);
        z71.c(parcel, 12, this.z);
        z71.c(parcel, 13, this.A);
        z71.b(parcel, a);
    }
}
