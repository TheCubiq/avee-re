package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public abstract class no2 implements Callable {
    public final String a = getClass().getSimpleName();
    public final wm2 b;
    public final String c;
    public final String d;
    public final hi2 e;
    public Method f;
    public final int g;
    public final int h;

    public no2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        this.b = wm2Var;
        this.c = str;
        this.d = str2;
        this.e = hi2Var;
        this.g = i;
        this.h = i2;
    }

    public abstract void a();

    public Void b() {
        long nanoTime;
        Method j;
        int i;
        try {
            nanoTime = System.nanoTime();
            j = this.b.j(this.c, this.d);
            this.f = j;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (j == null) {
            return null;
        }
        a();
        nl2 d = this.b.d();
        if (d != null && (i = this.g) != Integer.MIN_VALUE) {
            d.c(this.h, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
