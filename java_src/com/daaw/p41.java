package com.daaw;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class p41 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final ar1 a = ar1.c();
    public long b;
    public int c;

    public static boolean c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long a(int i) {
        if (!c(i)) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        double e2 = this.a.e();
        Double.isNaN(e2);
        return (long) Math.min(pow + e2, e);
    }

    public synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            z = this.a.a() > this.b;
        }
        return z;
    }

    public final synchronized void e() {
        this.c = 0;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i);
    }
}
