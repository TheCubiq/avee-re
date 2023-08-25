package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.k04;
import com.daaw.k33;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbei> CREATOR = new k33();

    /* renamed from: p */
    public final String f36833p;

    /* renamed from: q */
    public final long f36834q;

    /* renamed from: r */
    public final String f36835r;

    /* renamed from: s */
    public final String f36836s;

    /* renamed from: t */
    public final String f36837t;

    /* renamed from: u */
    public final Bundle f36838u;

    /* renamed from: v */
    public final boolean f36839v;

    /* renamed from: w */
    public long f36840w;

    /* renamed from: x */
    public String f36841x;

    /* renamed from: y */
    public int f36842y;

    public zzbei(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f36833p = str;
        this.f36834q = j;
        this.f36835r = str2 == null ? "" : str2;
        this.f36836s = str3 == null ? "" : str3;
        this.f36837t = str4 == null ? "" : str4;
        this.f36838u = bundle == null ? new Bundle() : bundle;
        this.f36839v = z;
        this.f36840w = j2;
        this.f36841x = str5;
        this.f36842y = i;
    }

    /* renamed from: h */
    public static zzbei m1106h(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    k04.zzj("Expected 2 path parts for namespace and id, found :" + size);
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter("url");
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new zzbei(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            k04.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f36833p, false);
        z71.m2720n(parcel, 3, this.f36834q);
        z71.m2717q(parcel, 4, this.f36835r, false);
        z71.m2717q(parcel, 5, this.f36836s, false);
        z71.m2717q(parcel, 6, this.f36837t, false);
        z71.m2729e(parcel, 7, this.f36838u, false);
        z71.m2731c(parcel, 8, this.f36839v);
        z71.m2720n(parcel, 9, this.f36840w);
        z71.m2717q(parcel, 10, this.f36841x, false);
        z71.m2723k(parcel, 11, this.f36842y);
        z71.m2732b(parcel, m2733a);
    }
}
