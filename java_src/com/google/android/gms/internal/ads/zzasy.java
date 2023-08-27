package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
@zzadh
/* loaded from: classes2.dex */
final class zzasy {
    private static Boolean zzdfk;

    private zzasy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(WebView webView, String str) {
        if (PlatformVersion.isAtLeastKitKat() && zzb(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }

    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzasy.class) {
            if (zzdfk == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zzdfk = true;
                } catch (IllegalStateException unused) {
                    zzdfk = false;
                }
            }
            booleanValue = zzdfk.booleanValue();
        }
        return booleanValue;
    }
}
