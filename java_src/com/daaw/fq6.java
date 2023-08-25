package com.daaw;
/* loaded from: classes.dex */
public final class fq6 {
    public final String a;
    public final String b;

    public fq6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static fq6 a(String str, String str2) {
        fr6.a(str, "Name is null or empty");
        fr6.a(str2, "Version is null or empty");
        return new fq6(str, str2);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
