package com.daaw;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ar6 extends xq6 {
    public WebView d;
    public Long e = null;
    public final Map f;

    public ar6(Map map, String str) {
        this.f = map;
    }

    @Override // com.daaw.xq6
    public final void c() {
        super.c();
        new Handler().postDelayed(new zq6(this), Math.max(4000 - (this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // com.daaw.xq6
    public final void f(xp6 xp6Var, vp6 vp6Var) {
        JSONObject jSONObject = new JSONObject();
        Map i = vp6Var.i();
        for (String str : i.keySet()) {
            br6.h(jSONObject, str, (gq6) i.get(str));
        }
        g(xp6Var, vp6Var, jSONObject);
    }

    @Override // com.daaw.xq6
    public final void j() {
        WebView webView = new WebView(oq6.b().a());
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.d);
        WebView webView2 = this.d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f.keySet().iterator();
        if (!it.hasNext()) {
            this.e = Long.valueOf(System.nanoTime());
            return;
        }
        gq6 gq6Var = (gq6) this.f.get((String) it.next());
        throw null;
    }
}
