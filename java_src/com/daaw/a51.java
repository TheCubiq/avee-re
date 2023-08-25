package com.daaw;
/* loaded from: classes.dex */
public class a51 {
    public String a = null;
    public String b = null;
    public long c = -1;

    public long a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public void d(long j) {
        if (j < 0) {
            j = -1;
        }
        this.c = j;
    }

    public void e(String str) {
        this.b = str.trim().replace('\\', '/');
    }

    public void f(String str) {
        this.a = dh1.a(str);
    }
}
