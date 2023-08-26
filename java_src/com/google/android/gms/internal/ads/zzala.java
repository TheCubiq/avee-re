package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzala extends zzakz {
    @Override // com.google.android.gms.internal.ads.zzakq
    public final WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzakt, com.google.android.gms.internal.ads.zzakq
    public final zzaqx zza(zzaqw zzaqwVar, boolean z) {
        return new zzarv(zzaqwVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final CookieManager zzax(Context context) {
        if (zzrp()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzakb.zzb("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakv, com.google.android.gms.internal.ads.zzakq
    public final int zzrq() {
        return 16974374;
    }
}
