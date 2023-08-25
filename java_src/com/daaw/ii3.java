package com.daaw;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ii3 extends sh3 {
    public static final /* synthetic */ int d = 0;
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;

    public ii3(Context context, final WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        sy6.f(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.c = webView;
        this.b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.daaw.hi3
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = ii3.d;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    @Override // com.daaw.sh3
    public final WebViewClient a() {
        return this.a;
    }

    public final void b() {
        this.b.clearAdObjects();
    }

    public final void c(WebViewClient webViewClient) {
        sy6.f(webViewClient != this, "Delegate cannot be itself.");
        this.a = webViewClient;
    }

    public final boolean d(WebView webView) {
        if (this.c.equals(webView)) {
            return true;
        }
        k04.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (d(webView) && !this.b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (d(this.c)) {
            if (this.b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (d(webView)) {
            if (this.b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}
