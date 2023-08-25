package com.daaw;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ax1 {

    /* renamed from: a */
    public String f4072a;

    /* renamed from: b */
    public String f4073b;

    /* renamed from: c */
    public List<String> f4074c;

    /* renamed from: d */
    public String f4075d;

    /* renamed from: e */
    public String f4076e;

    /* renamed from: f */
    public int f4077f;

    /* renamed from: g */
    public boolean f4078g;

    /* renamed from: h */
    public int f4079h;

    /* renamed from: i */
    public boolean f4080i;

    /* renamed from: j */
    public int f4081j;

    /* renamed from: k */
    public int f4082k;

    /* renamed from: l */
    public int f4083l;

    /* renamed from: m */
    public int f4084m;

    /* renamed from: n */
    public int f4085n;

    /* renamed from: o */
    public float f4086o;

    /* renamed from: p */
    public Layout.Alignment f4087p;

    public ax1() {
        m26613m();
    }

    /* renamed from: x */
    public static int m26602x(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int m26625a() {
        if (this.f4080i) {
            return this.f4079h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public int m26624b() {
        if (this.f4078g) {
            return this.f4077f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: c */
    public String m26623c() {
        return this.f4076e;
    }

    /* renamed from: d */
    public float m26622d() {
        return this.f4086o;
    }

    /* renamed from: e */
    public int m26621e() {
        return this.f4085n;
    }

    /* renamed from: f */
    public int m26620f(String str, String str2, String[] strArr, String str3) {
        if (this.f4072a.isEmpty() && this.f4073b.isEmpty() && this.f4074c.isEmpty() && this.f4075d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int m26602x = m26602x(m26602x(m26602x(0, this.f4072a, str, 1073741824), this.f4073b, str2, 2), this.f4075d, str3, 4);
        if (m26602x == -1 || !Arrays.asList(strArr).containsAll(this.f4074c)) {
            return 0;
        }
        return m26602x + (this.f4074c.size() * 4);
    }

    /* renamed from: g */
    public int m26619g() {
        int i = this.f4083l;
        if (i == -1 && this.f4084m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f4084m == 1 ? 2 : 0);
    }

    /* renamed from: h */
    public Layout.Alignment m26618h() {
        return this.f4087p;
    }

    /* renamed from: i */
    public boolean m26617i() {
        return this.f4080i;
    }

    /* renamed from: j */
    public boolean m26616j() {
        return this.f4078g;
    }

    /* renamed from: k */
    public boolean m26615k() {
        return this.f4081j == 1;
    }

    /* renamed from: l */
    public boolean m26614l() {
        return this.f4082k == 1;
    }

    /* renamed from: m */
    public void m26613m() {
        this.f4072a = "";
        this.f4073b = "";
        this.f4074c = Collections.emptyList();
        this.f4075d = "";
        this.f4076e = null;
        this.f4078g = false;
        this.f4080i = false;
        this.f4081j = -1;
        this.f4082k = -1;
        this.f4083l = -1;
        this.f4084m = -1;
        this.f4085n = -1;
        this.f4087p = null;
    }

    /* renamed from: n */
    public ax1 m26612n(int i) {
        this.f4079h = i;
        this.f4080i = true;
        return this;
    }

    /* renamed from: o */
    public ax1 m26611o(boolean z) {
        this.f4083l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public ax1 m26610p(int i) {
        this.f4077f = i;
        this.f4078g = true;
        return this;
    }

    /* renamed from: q */
    public ax1 m26609q(String str) {
        this.f4076e = sq1.m10017a0(str);
        return this;
    }

    /* renamed from: r */
    public ax1 m26608r(boolean z) {
        this.f4084m = z ? 1 : 0;
        return this;
    }

    /* renamed from: s */
    public void m26607s(String[] strArr) {
        this.f4074c = Arrays.asList(strArr);
    }

    /* renamed from: t */
    public void m26606t(String str) {
        this.f4072a = str;
    }

    /* renamed from: u */
    public void m26605u(String str) {
        this.f4073b = str;
    }

    /* renamed from: v */
    public void m26604v(String str) {
        this.f4075d = str;
    }

    /* renamed from: w */
    public ax1 m26603w(boolean z) {
        this.f4082k = z ? 1 : 0;
        return this;
    }
}
