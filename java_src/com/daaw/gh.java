package com.daaw;
/* loaded from: classes2.dex */
public class gh {
    public int a;
    public String b;
    public String c;
    public int d;
    public int e;

    public gh(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        return this.b.equals(this.c);
    }

    public String b(String str) {
        String str2;
        String str3;
        if (this.b == null || this.c == null || a()) {
            str2 = this.b;
            str3 = this.c;
        } else {
            f();
            g();
            str2 = c(this.b);
            str3 = c(this.c);
        }
        return q6.m(str, str2, str3);
    }

    public final String c(String str) {
        String str2 = "[" + str.substring(this.d, (str.length() - this.e) + 1) + "]";
        if (this.d > 0) {
            str2 = d() + str2;
        }
        if (this.e > 0) {
            return str2 + e();
        }
        return str2;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d > this.a ? "..." : "");
        sb.append(this.b.substring(Math.max(0, this.d - this.a), this.d));
        return sb.toString();
    }

    public final String e() {
        int min = Math.min((this.b.length() - this.e) + 1 + this.a, this.b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        sb.append(str.substring((str.length() - this.e) + 1, min));
        sb.append((this.b.length() - this.e) + 1 < this.b.length() - this.a ? "..." : "");
        return sb.toString();
    }

    public final void f() {
        this.d = 0;
        int min = Math.min(this.b.length(), this.c.length());
        while (true) {
            int i = this.d;
            if (i >= min || this.b.charAt(i) != this.c.charAt(this.d)) {
                return;
            }
            this.d++;
        }
    }

    public final void g() {
        int length = this.b.length() - 1;
        int length2 = this.c.length() - 1;
        while (true) {
            int i = this.d;
            if (length2 < i || length < i || this.b.charAt(length) != this.c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.e = this.b.length() - length;
    }
}
