package com.daaw;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final class zq6 implements Runnable {

    /* renamed from: p */
    public final WebView f35410p;

    /* renamed from: q */
    public final /* synthetic */ ar6 f35411q;

    public zq6(ar6 ar6Var) {
        WebView webView;
        this.f35411q = ar6Var;
        webView = ar6Var.f3500d;
        this.f35410p = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35410p.destroy();
    }
}
