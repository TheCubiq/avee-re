package com.daaw;

import android.webkit.WebView;
/* loaded from: classes.dex */
public final class pq6 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ WebView f23189p;

    /* renamed from: q */
    public final /* synthetic */ String f23190q;

    public pq6(qq6 qq6Var, WebView webView, String str) {
        this.f23189p = webView;
        this.f23190q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23189p.loadUrl(this.f23190q);
    }
}
