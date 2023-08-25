package com.daaw;
/* loaded from: classes.dex */
public final class fq6 {

    /* renamed from: a */
    public final String f9796a;

    /* renamed from: b */
    public final String f9797b;

    public fq6(String str, String str2) {
        this.f9796a = str;
        this.f9797b = str2;
    }

    /* renamed from: a */
    public static fq6 m22402a(String str, String str2) {
        fr6.m22359a(str, "Name is null or empty");
        fr6.m22359a(str2, "Version is null or empty");
        return new fq6(str, str2);
    }

    /* renamed from: b */
    public final String m22401b() {
        return this.f9796a;
    }

    /* renamed from: c */
    public final String m22400c() {
        return this.f9797b;
    }
}
