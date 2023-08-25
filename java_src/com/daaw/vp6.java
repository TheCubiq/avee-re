package com.daaw;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class vp6 {
    public final fq6 a;
    public final WebView b;
    public final List c = new ArrayList();
    public final Map d = new HashMap();
    public final String e = "";
    public final String f;
    public final wp6 g;

    public vp6(fq6 fq6Var, WebView webView, String str, List list, String str2, String str3, wp6 wp6Var) {
        this.a = fq6Var;
        this.b = webView;
        this.g = wp6Var;
        this.f = str2;
    }

    public static vp6 b(fq6 fq6Var, WebView webView, String str, String str2) {
        return new vp6(fq6Var, webView, null, null, str, "", wp6.HTML);
    }

    public static vp6 c(fq6 fq6Var, WebView webView, String str, String str2) {
        return new vp6(fq6Var, webView, null, null, str, "", wp6.JAVASCRIPT);
    }

    public final WebView a() {
        return this.b;
    }

    public final wp6 d() {
        return this.g;
    }

    public final fq6 e() {
        return this.a;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.d);
    }
}
