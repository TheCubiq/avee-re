package com.google.android.gms.ads.p003h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.daaw.ii3;
import com.daaw.sh3;
/* renamed from: com.google.android.gms.ads.h5.H5AdsWebViewClient */
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends sh3 {

    /* renamed from: a */
    public final ii3 f36074a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.f36074a = new ii3(context, webView);
    }

    @Override // com.daaw.sh3
    /* renamed from: a */
    public WebViewClient mo1442a() {
        return this.f36074a;
    }

    public void clearAdObjects() {
        this.f36074a.m19772b();
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.f36074a.mo1442a();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.f36074a.m19771c(webViewClient);
    }
}
