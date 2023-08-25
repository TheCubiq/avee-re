package com.daaw;

import android.webkit.ValueCallback;
import android.webkit.WebView;
/* loaded from: classes.dex */
public final class q13 implements Runnable {

    /* renamed from: p */
    public final ValueCallback f23601p;

    /* renamed from: q */
    public final /* synthetic */ i13 f23602q;

    /* renamed from: r */
    public final /* synthetic */ WebView f23603r;

    /* renamed from: s */
    public final /* synthetic */ boolean f23604s;

    /* renamed from: t */
    public final /* synthetic */ s13 f23605t;

    public q13(s13 s13Var, final i13 i13Var, final WebView webView, final boolean z) {
        this.f23605t = s13Var;
        this.f23602q = i13Var;
        this.f23603r = webView;
        this.f23604s = z;
        this.f23601p = new ValueCallback() { // from class: com.daaw.p13
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                q13 q13Var = q13.this;
                i13 i13Var2 = i13Var;
                WebView webView2 = webView;
                boolean z2 = z;
                q13Var.f23605t.m10760d(i13Var2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23603r.getSettings().getJavaScriptEnabled()) {
            try {
                this.f23603r.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f23601p);
            } catch (Throwable unused) {
                this.f23601p.onReceiveValue("");
            }
        }
    }
}
