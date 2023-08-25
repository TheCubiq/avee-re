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

    /* renamed from: d */
    public WebView f3500d;

    /* renamed from: e */
    public Long f3501e = null;

    /* renamed from: f */
    public final Map f3502f;

    public ar6(Map map, String str) {
        this.f3502f = map;
    }

    @Override // com.daaw.xq6
    /* renamed from: c */
    public final void mo4809c() {
        super.mo4809c();
        new Handler().postDelayed(new zq6(this), Math.max(4000 - (this.f3501e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f3501e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f3500d = null;
    }

    @Override // com.daaw.xq6
    /* renamed from: f */
    public final void mo4806f(xp6 xp6Var, vp6 vp6Var) {
        JSONObject jSONObject = new JSONObject();
        Map m6943i = vp6Var.m6943i();
        for (String str : m6943i.keySet()) {
            br6.m25875h(jSONObject, str, (gq6) m6943i.get(str));
        }
        m4805g(xp6Var, vp6Var, jSONObject);
    }

    @Override // com.daaw.xq6
    /* renamed from: j */
    public final void mo4802j() {
        WebView webView = new WebView(oq6.m14068b().m14069a());
        this.f3500d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m4803i(this.f3500d);
        WebView webView2 = this.f3500d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f3502f.keySet().iterator();
        if (!it.hasNext()) {
            this.f3501e = Long.valueOf(System.nanoTime());
            return;
        }
        gq6 gq6Var = (gq6) this.f3502f.get((String) it.next());
        throw null;
    }
}
