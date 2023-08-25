package com.daaw;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ax1 {
    public String a;
    public String b;
    public List<String> c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public Layout.Alignment p;

    public ax1() {
        m();
    }

    public static int x(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int b() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String c() {
        return this.e;
    }

    public float d() {
        return this.o;
    }

    public int e() {
        return this.n;
    }

    public int f(String str, String str2, String[] strArr, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int x = x(x(x(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (x == -1 || !Arrays.asList(strArr).containsAll(this.c)) {
            return 0;
        }
        return x + (this.c.size() * 4);
    }

    public int g() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public Layout.Alignment h() {
        return this.p;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        return this.j == 1;
    }

    public boolean l() {
        return this.k == 1;
    }

    public void m() {
        this.a = "";
        this.b = "";
        this.c = Collections.emptyList();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = null;
    }

    public ax1 n(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public ax1 o(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public ax1 p(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public ax1 q(String str) {
        this.e = sq1.a0(str);
        return this;
    }

    public ax1 r(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public void s(String[] strArr) {
        this.c = Arrays.asList(strArr);
    }

    public void t(String str) {
        this.a = str;
    }

    public void u(String str) {
        this.b = str;
    }

    public void v(String str) {
        this.d = str;
    }

    public ax1 w(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }
}
