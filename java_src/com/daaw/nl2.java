package com.daaw;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class nl2 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile ku6 d = null;
    public static volatile Random e = null;
    public final wm2 a;
    public volatile Boolean b;

    public nl2(wm2 wm2Var) {
        this.a = wm2Var;
        wm2Var.k().execute(new ml2(this));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : e().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    public static Random e() {
        if (e == null) {
            synchronized (nl2.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            oh2 L = xh2.L();
            L.s(this.a.a.getPackageName());
            L.w(j);
            if (str != null) {
                L.t(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                L.x(stringWriter.toString());
                L.v(exc.getClass().getName());
            }
            ju6 a = d.a(((xh2) L.n()).a());
            a.a(i);
            if (i2 != -1) {
                a.b(i2);
            }
            a.c();
        } catch (Exception unused) {
        }
    }
}
