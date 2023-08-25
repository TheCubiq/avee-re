package com.daaw;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final class pq6 implements Runnable {
    public final /* synthetic */ WebView p;
    public final /* synthetic */ String q;

    public pq6(qq6 qq6Var, WebView webView, String str) {
        this.p = webView;
        this.q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.loadUrl(this.q);
    }
}
