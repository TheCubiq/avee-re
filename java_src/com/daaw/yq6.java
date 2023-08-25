package com.daaw;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class yq6 extends xq6 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public yq6(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        i(webView);
    }
}
