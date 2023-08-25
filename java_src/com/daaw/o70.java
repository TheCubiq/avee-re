package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public class o70 {
    public final URL a;
    public final ra0 b;
    public final String c;
    public String d;
    public URL e;

    public o70(String str) {
        this(str, ra0.b);
    }

    public o70(String str, ra0 ra0Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (ra0Var == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.c = str;
            this.a = null;
            this.b = ra0Var;
        }
    }

    public o70(URL url) {
        this(url, ra0.b);
    }

    public o70(URL url, ra0 ra0Var) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (ra0Var == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.a = url;
        this.c = null;
        this.b = ra0Var;
    }

    public String a() {
        String str = this.c;
        return str != null ? str : this.a.toString();
    }

    public Map<String, String> b() {
        return this.b.a();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.d)) {
            String str = this.c;
            if (TextUtils.isEmpty(str)) {
                str = this.a.toString();
            }
            this.d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.d;
    }

    public final URL d() {
        if (this.e == null) {
            this.e = new URL(c());
        }
        return this.e;
    }

    public URL e() {
        return d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o70) {
            o70 o70Var = (o70) obj;
            return a().equals(o70Var.a()) && this.b.equals(o70Var.b);
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return a() + '\n' + this.b.toString();
    }
}
