package com.daaw;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class f84 extends g84 {
    public f84(a74 a74Var, x33 x33Var, boolean z) {
        super(a74Var, x33Var, z);
    }

    @Override // com.daaw.h74, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m21885G0(webView, str, null);
    }
}
