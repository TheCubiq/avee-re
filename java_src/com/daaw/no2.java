package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public abstract class no2 implements Callable {

    /* renamed from: a */
    public final String f20524a = getClass().getSimpleName();

    /* renamed from: b */
    public final wm2 f20525b;

    /* renamed from: c */
    public final String f20526c;

    /* renamed from: d */
    public final String f20527d;

    /* renamed from: e */
    public final hi2 f20528e;

    /* renamed from: f */
    public Method f20529f;

    /* renamed from: g */
    public final int f20530g;

    /* renamed from: h */
    public final int f20531h;

    public no2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        this.f20525b = wm2Var;
        this.f20526c = str;
        this.f20527d = str2;
        this.f20528e = hi2Var;
        this.f20530g = i;
        this.f20531h = i2;
    }

    /* renamed from: a */
    public abstract void mo2099a();

    /* renamed from: b */
    public Void mo10148b() {
        long nanoTime;
        Method m5996j;
        int i;
        try {
            nanoTime = System.nanoTime();
            m5996j = this.f20525b.m5996j(this.f20526c, this.f20527d);
            this.f20529f = m5996j;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (m5996j == null) {
            return null;
        }
        mo2099a();
        nl2 m6002d = this.f20525b.m6002d();
        if (m6002d != null && (i = this.f20530g) != Integer.MIN_VALUE) {
            m6002d.m15048c(this.f20531h, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo10148b();
        return null;
    }
}
