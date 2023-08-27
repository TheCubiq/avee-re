package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzart extends zzaru {
    public zzart(zzaqw zzaqwVar, boolean z) {
        super(zzaqwVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
