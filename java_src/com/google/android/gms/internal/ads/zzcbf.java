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

    /* renamed from: p */
    public final ApplicationInfo f36942p;

    /* renamed from: q */
    public final String f36943q;

    /* renamed from: r */
    public final PackageInfo f36944r;

    /* renamed from: s */
    public final String f36945s;

    /* renamed from: t */
    public final int f36946t;

    /* renamed from: u */
    public final String f36947u;

    /* renamed from: v */
    public final List f36948v;

    /* renamed from: w */
    public final boolean f36949w;

    /* renamed from: x */
    public final boolean f36950x;

    public zzcbf(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z, boolean z2) {
        this.f36943q = str;
        this.f36942p = applicationInfo;
        this.f36944r = packageInfo;
        this.f36945s = str2;
        this.f36946t = i;
        this.f36947u = str3;
        this.f36948v = list;
        this.f36949w = z;
        this.f36950x = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2718p(parcel, 1, this.f36942p, i, false);
        z71.m2717q(parcel, 2, this.f36943q, false);
        z71.m2718p(parcel, 3, this.f36944r, i, false);
        z71.m2717q(parcel, 4, this.f36945s, false);
        z71.m2723k(parcel, 5, this.f36946t);
        z71.m2717q(parcel, 6, this.f36947u, false);
        z71.m2715s(parcel, 7, this.f36948v, false);
        z71.m2731c(parcel, 8, this.f36949w);
        z71.m2731c(parcel, 9, this.f36950x);
        z71.m2732b(parcel, m2733a);
    }
}
