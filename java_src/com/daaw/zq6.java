package com.daaw;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final class zq6 implements Runnable {
    public final WebView p;
    public final /* synthetic */ ar6 q;

    public zq6(ar6 ar6Var) {
        WebView webView;
        this.q = ar6Var;
        webView = ar6Var.d;
        this.p = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.destroy();
    }
}
