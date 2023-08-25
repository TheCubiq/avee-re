package com.daaw;
/* loaded from: classes.dex */
public class a51 {

    /* renamed from: a */
    public String f2894a = null;

    /* renamed from: b */
    public String f2895b = null;

    /* renamed from: c */
    public long f2896c = -1;

    /* renamed from: a */
    public long m27609a() {
        return this.f2896c;
    }

    /* renamed from: b */
    public String m27608b() {
        return this.f2895b;
    }

    /* renamed from: c */
    public String m27607c() {
        return this.f2894a;
    }

    /* renamed from: d */
    public void m27606d(long j) {
        if (j < 0) {
            j = -1;
        }
        this.f2896c = j;
    }

    /* renamed from: e */
    public void m27605e(String str) {
        this.f2895b = str.trim().replace('\\', '/');
    }

    /* renamed from: f */
    public void m27604f(String str) {
        this.f2894a = dh1.m24412a(str);
    }
}
