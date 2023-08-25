package com.daaw;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class nl2 {

    /* renamed from: c */
    public static final ConditionVariable f20232c = new ConditionVariable();

    /* renamed from: d */
    public static volatile ku6 f20233d = null;

    /* renamed from: e */
    public static volatile Random f20234e = null;

    /* renamed from: a */
    public final wm2 f20235a;

    /* renamed from: b */
    public volatile Boolean f20236b;

    public nl2(wm2 wm2Var) {
        this.f20235a = wm2Var;
        wm2Var.m5995k().execute(new ml2(this));
    }

    /* renamed from: d */
    public static final int m15047d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m15046e().nextInt();
        } catch (RuntimeException unused) {
            return m15046e().nextInt();
        }
    }

    /* renamed from: e */
    public static Random m15046e() {
        if (f20234e == null) {
            synchronized (nl2.class) {
                if (f20234e == null) {
                    f20234e = new Random();
                }
            }
        }
        return f20234e;
    }

    /* renamed from: c */
    public final void m15048c(int i, int i2, long j, String str, Exception exc) {
        try {
            f20232c.block();
            if (!this.f20236b.booleanValue() || f20233d == null) {
                return;
            }
            oh2 m5116L = xh2.m5116L();
            m5116L.m14278s(this.f20235a.f31324a.getPackageName());
            m5116L.m14274w(j);
            if (str != null) {
                m5116L.m14277t(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                m5116L.m14273x(stringWriter.toString());
                m5116L.m14275v(exc.getClass().getName());
            }
            ju6 m17429a = f20233d.m17429a(((xh2) m5116L.m22315n()).mo4516a());
            m17429a.m18239a(i);
            if (i2 != -1) {
                m17429a.m18238b(i2);
            }
            m17429a.m18237c();
        } catch (Exception unused) {
        }
    }
}
