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

    /* renamed from: A */
    public final boolean f36963A;

    /* renamed from: p */
    public final Bundle f36964p;

    /* renamed from: q */
    public final zzchu f36965q;

    /* renamed from: r */
    public final ApplicationInfo f36966r;

    /* renamed from: s */
    public final String f36967s;

    /* renamed from: t */
    public final List f36968t;

    /* renamed from: u */
    public final PackageInfo f36969u;

    /* renamed from: v */
    public final String f36970v;

    /* renamed from: w */
    public final String f36971w;

    /* renamed from: x */
    public zzfkz f36972x;

    /* renamed from: y */
    public String f36973y;

    /* renamed from: z */
    public final boolean f36974z;

    public zzccb(Bundle bundle, zzchu zzchuVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfkz zzfkzVar, String str4, boolean z, boolean z2) {
        this.f36964p = bundle;
        this.f36965q = zzchuVar;
        this.f36967s = str;
        this.f36966r = applicationInfo;
        this.f36968t = list;
        this.f36969u = packageInfo;
        this.f36970v = str2;
        this.f36971w = str3;
        this.f36972x = zzfkzVar;
        this.f36973y = str4;
        this.f36974z = z;
        this.f36963A = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2729e(parcel, 1, this.f36964p, false);
        z71.m2718p(parcel, 2, this.f36965q, i, false);
        z71.m2718p(parcel, 3, this.f36966r, i, false);
        z71.m2717q(parcel, 4, this.f36967s, false);
        z71.m2715s(parcel, 5, this.f36968t, false);
        z71.m2718p(parcel, 6, this.f36969u, i, false);
        z71.m2717q(parcel, 7, this.f36970v, false);
        z71.m2717q(parcel, 9, this.f36971w, false);
        z71.m2718p(parcel, 10, this.f36972x, i, false);
        z71.m2717q(parcel, 11, this.f36973y, false);
        z71.m2731c(parcel, 12, this.f36974z);
        z71.m2731c(parcel, 13, this.f36963A);
        z71.m2732b(parcel, m2733a);
    }
}
