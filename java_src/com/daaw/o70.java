package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public class o70 {

    /* renamed from: a */
    public final URL f21100a;

    /* renamed from: b */
    public final ra0 f21101b;

    /* renamed from: c */
    public final String f21102c;

    /* renamed from: d */
    public String f21103d;

    /* renamed from: e */
    public URL f21104e;

    public o70(String str) {
        this(str, ra0.f24997b);
    }

    public o70(String str, ra0 ra0Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (ra0Var == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f21102c = str;
            this.f21100a = null;
            this.f21101b = ra0Var;
        }
    }

    public o70(URL url) {
        this(url, ra0.f24997b);
    }

    public o70(URL url, ra0 ra0Var) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (ra0Var == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f21100a = url;
        this.f21102c = null;
        this.f21101b = ra0Var;
    }

    /* renamed from: a */
    public String m14493a() {
        String str = this.f21102c;
        return str != null ? str : this.f21100a.toString();
    }

    /* renamed from: b */
    public Map<String, String> m14492b() {
        return this.f21101b.mo2283a();
    }

    /* renamed from: c */
    public final String m14491c() {
        if (TextUtils.isEmpty(this.f21103d)) {
            String str = this.f21102c;
            if (TextUtils.isEmpty(str)) {
                str = this.f21100a.toString();
            }
            this.f21103d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f21103d;
    }

    /* renamed from: d */
    public final URL m14490d() {
        if (this.f21104e == null) {
            this.f21104e = new URL(m14491c());
        }
        return this.f21104e;
    }

    /* renamed from: e */
    public URL m14489e() {
        return m14490d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o70) {
            o70 o70Var = (o70) obj;
            return m14493a().equals(o70Var.m14493a()) && this.f21101b.equals(o70Var.f21101b);
        }
        return false;
    }

    public int hashCode() {
        return (m14493a().hashCode() * 31) + this.f21101b.hashCode();
    }

    public String toString() {
        return m14493a() + '\n' + this.f21101b.toString();
    }
}
