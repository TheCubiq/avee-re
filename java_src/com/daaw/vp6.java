package com.daaw;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class vp6 {

    /* renamed from: a */
    public final fq6 f30420a;

    /* renamed from: b */
    public final WebView f30421b;

    /* renamed from: c */
    public final List f30422c = new ArrayList();

    /* renamed from: d */
    public final Map f30423d = new HashMap();

    /* renamed from: e */
    public final String f30424e = "";

    /* renamed from: f */
    public final String f30425f;

    /* renamed from: g */
    public final wp6 f30426g;

    public vp6(fq6 fq6Var, WebView webView, String str, List list, String str2, String str3, wp6 wp6Var) {
        this.f30420a = fq6Var;
        this.f30421b = webView;
        this.f30426g = wp6Var;
        this.f30425f = str2;
    }

    /* renamed from: b */
    public static vp6 m6950b(fq6 fq6Var, WebView webView, String str, String str2) {
        return new vp6(fq6Var, webView, null, null, str, "", wp6.HTML);
    }

    /* renamed from: c */
    public static vp6 m6949c(fq6 fq6Var, WebView webView, String str, String str2) {
        return new vp6(fq6Var, webView, null, null, str, "", wp6.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView m6951a() {
        return this.f30421b;
    }

    /* renamed from: d */
    public final wp6 m6948d() {
        return this.f30426g;
    }

    /* renamed from: e */
    public final fq6 m6947e() {
        return this.f30420a;
    }

    /* renamed from: f */
    public final String m6946f() {
        return this.f30425f;
    }

    /* renamed from: g */
    public final String m6945g() {
        return this.f30424e;
    }

    /* renamed from: h */
    public final List m6944h() {
        return Collections.unmodifiableList(this.f30422c);
    }

    /* renamed from: i */
    public final Map m6943i() {
        return Collections.unmodifiableMap(this.f30423d);
    }
}
