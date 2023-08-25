package com.daaw;

import android.util.Log;
/* loaded from: classes2.dex */
public class ml0 {

    /* renamed from: c */
    public static final ml0 f18951c = new ml0("FirebaseCrashlytics");

    /* renamed from: a */
    public final String f18952a;

    /* renamed from: b */
    public int f18953b = 4;

    public ml0(String str) {
        this.f18952a = str;
    }

    /* renamed from: f */
    public static ml0 m15976f() {
        return f18951c;
    }

    /* renamed from: a */
    public final boolean m15981a(int i) {
        return this.f18953b <= i || Log.isLoggable(this.f18952a, i);
    }

    /* renamed from: b */
    public void m15980b(String str) {
        m15979c(str, null);
    }

    /* renamed from: c */
    public void m15979c(String str, Throwable th) {
        m15981a(3);
    }

    /* renamed from: d */
    public void m15978d(String str) {
        m15977e(str, null);
    }

    /* renamed from: e */
    public void m15977e(String str, Throwable th) {
        m15981a(6);
    }

    /* renamed from: g */
    public void m15975g(String str) {
        m15974h(str, null);
    }

    /* renamed from: h */
    public void m15974h(String str, Throwable th) {
        m15981a(4);
    }

    /* renamed from: i */
    public void m15973i(String str) {
        m15972j(str, null);
    }

    /* renamed from: j */
    public void m15972j(String str, Throwable th) {
        m15981a(2);
    }

    /* renamed from: k */
    public void m15971k(String str) {
        m15970l(str, null);
    }

    /* renamed from: l */
    public void m15970l(String str, Throwable th) {
        m15981a(5);
    }
}
