package com.daaw;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.p003h5.H5AdsRequestHandler;
import com.google.android.gms.ads.p003h5.OnH5AdsEventListener;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ii3 extends sh3 {

    /* renamed from: d */
    public static final /* synthetic */ int f13666d = 0;

    /* renamed from: a */
    public WebViewClient f13667a;

    /* renamed from: b */
    public final H5AdsRequestHandler f13668b;

    /* renamed from: c */
    public final WebView f13669c;

    public ii3(Context context, final WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        sy6.m9703f(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.f13669c = webView;
        this.f13668b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.daaw.hi3
            @Override // com.google.android.gms.ads.p003h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = ii3.f13666d;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    @Override // com.daaw.sh3
    /* renamed from: a */
    public final WebViewClient mo1442a() {
        return this.f13667a;
    }

    /* renamed from: b */
    public final void m19772b() {
        this.f13668b.clearAdObjects();
    }

    /* renamed from: c */
    public final void m19771c(WebViewClient webViewClient) {
        sy6.m9703f(webViewClient != this, "Delegate cannot be itself.");
        this.f13667a = webViewClient;
    }

    /* renamed from: d */
    public final boolean m19770d(WebView webView) {
        if (this.f13669c.equals(webView)) {
            return true;
        }
        k04.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (m19770d(webView) && !this.f13668b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (m19770d(this.f13669c)) {
            if (this.f13668b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // com.daaw.sh3, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (m19770d(webView)) {
            if (this.f13668b.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}
