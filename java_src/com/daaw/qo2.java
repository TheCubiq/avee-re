package com.daaw;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class qo2 extends QueryInfoGenerationCallback {

    /* renamed from: a */
    public final /* synthetic */ String f24219a;

    /* renamed from: b */
    public final /* synthetic */ oj1 f24220b;

    public qo2(oj1 oj1Var, String str) {
        this.f24220b = oj1Var;
        this.f24219a = str;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        WebView webView;
        k04.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f24219a, str);
        webView = this.f24220b.f21579b;
        webView.evaluateJavascript(format, null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String format;
        WebView webView;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f24219a);
            jSONObject.put("signal", query);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f24219a, queryInfo.getQuery());
        }
        webView = this.f24220b.f21579b;
        webView.evaluateJavascript(format, null);
    }
}
