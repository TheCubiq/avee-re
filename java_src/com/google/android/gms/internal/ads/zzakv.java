package com.google.android.gms.internal.ads;

import android.net.http.SslError;
/* loaded from: classes2.dex */
public class zzakv extends zzakt {
    @Override // com.google.android.gms.internal.ads.zzakq
    public final String zza(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public int zzrq() {
        return 1;
    }
}
