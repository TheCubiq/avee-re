package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.daaw.ii3;
import com.daaw.sh3;
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends sh3 {
    public final ii3 a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.a = new ii3(context, webView);
    }

    @Override // com.daaw.sh3
    public WebViewClient a() {
        return this.a;
    }

    public void clearAdObjects() {
        this.a.b();
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.a.a();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.a.c(webViewClient);
    }
}
