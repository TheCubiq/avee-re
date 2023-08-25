package com.daaw;

import android.webkit.ValueCallback;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class q13 implements Runnable {
    public final ValueCallback p;
    public final /* synthetic */ i13 q;
    public final /* synthetic */ WebView r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ s13 t;

    public q13(s13 s13Var, final i13 i13Var, final WebView webView, final boolean z) {
        this.t = s13Var;
        this.q = i13Var;
        this.r = webView;
        this.s = z;
        this.p = new ValueCallback() { // from class: com.daaw.p13
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                q13 q13Var = q13.this;
                i13 i13Var2 = i13Var;
                WebView webView2 = webView;
                boolean z2 = z;
                q13Var.t.d(i13Var2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.r.getSettings().getJavaScriptEnabled()) {
            try {
                this.r.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.p);
            } catch (Throwable unused) {
                this.p.onReceiveValue("");
            }
        }
    }
}
