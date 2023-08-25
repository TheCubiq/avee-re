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
    public final String p;
    public final long q;
    public final String r;
    public final String s;
    public final String t;
    public final Bundle u;
    public final boolean v;
    public long w;
    public String x;
    public int y;

    public zzbei(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.p = str;
        this.q = j;
        this.r = str2 == null ? "" : str2;
        this.s = str3 == null ? "" : str3;
        this.t = str4 == null ? "" : str4;
        this.u = bundle == null ? new Bundle() : bundle;
        this.v = z;
        this.w = j2;
        this.x = str5;
        this.y = i;
    }

    public static zzbei h(Uri uri) {
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
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.n(parcel, 3, this.q);
        z71.q(parcel, 4, this.r, false);
        z71.q(parcel, 5, this.s, false);
        z71.q(parcel, 6, this.t, false);
        z71.e(parcel, 7, this.u, false);
        z71.c(parcel, 8, this.v);
        z71.n(parcel, 9, this.w);
        z71.q(parcel, 10, this.x, false);
        z71.k(parcel, 11, this.y);
        z71.b(parcel, a);
    }
}
