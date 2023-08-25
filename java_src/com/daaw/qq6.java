package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class qq6 {

    /* renamed from: a */
    public static final qq6 f24263a = new qq6();

    /* renamed from: a */
    public static final qq6 m12283a() {
        return f24263a;
    }

    /* renamed from: b */
    public final void m12282b(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView == null) {
            String concat = "The WebView is null for ".concat(str);
            if (qp6.f24234a.booleanValue()) {
                TextUtils.isEmpty(concat);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    obj = "\"\"";
                } else {
                    if (obj2 instanceof String) {
                        obj = obj2.toString();
                        if (!obj.startsWith("{")) {
                            sb.append('\"');
                            sb.append(obj);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(",");
                }
                sb.append(obj);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new pq6(this, webView, sb2));
        }
    }

    /* renamed from: c */
    public final void m12281c(WebView webView) {
        m12282b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void m12280d(WebView webView, JSONObject jSONObject) {
        m12282b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void m12279e(WebView webView, float f) {
        m12282b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: f */
    public final void m12278f(WebView webView, String str) {
        m12282b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void m12277g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m12282b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
