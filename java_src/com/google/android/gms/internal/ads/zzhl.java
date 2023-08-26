package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzhl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhl> CREATOR = new zzhm();
    public final String url;
    private final long zzajv;
    private final String zzajw;
    private final String zzajx;
    private final String zzajy;
    private final Bundle zzajz;
    private final boolean zzaka;
    private long zzakb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhl(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzajv = j;
        this.zzajw = str2 == null ? "" : str2;
        this.zzajx = str3 == null ? "" : str3;
        this.zzajy = str4 == null ? "" : str4;
        this.zzajz = bundle == null ? new Bundle() : bundle;
        this.zzaka = z;
        this.zzakb = j2;
    }

    public static zzhl zzaa(String str) {
        return zzd(Uri.parse(str));
    }

    public static zzhl zzd(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Expected 2 path parts for namespace and id, found :");
                    sb.append(size);
                    zzakb.zzdk(sb.toString());
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter(ImagesContract.URL);
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : com.google.android.gms.ads.internal.zzbv.zzem().zzh(uri)) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new zzhl(queryParameter, parseLong, host, str, str2, bundle, equals, 0L);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            zzakb.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzajv);
        SafeParcelWriter.writeString(parcel, 4, this.zzajw, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzajx, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzajy, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzajz, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzaka);
        SafeParcelWriter.writeLong(parcel, 9, this.zzakb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
