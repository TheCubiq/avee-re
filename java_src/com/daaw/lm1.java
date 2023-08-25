package com.daaw;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;
@Deprecated
/* loaded from: classes.dex */
public final class lm1 {

    /* renamed from: a */
    public static long f17529a;

    /* renamed from: b */
    public static Method f17530b;

    /* renamed from: c */
    public static Method f17531c;

    /* renamed from: d */
    public static Method f17532d;

    /* renamed from: e */
    public static Method f17533e;

    /* renamed from: com.daaw.lm1$a */
    /* loaded from: classes.dex */
    public static class C2098a {
        /* renamed from: a */
        public static void m16728a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m16727b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f17529a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f17530b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f17531c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f17532d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f17533e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16730a(String str) {
        C2098a.m16728a(str);
    }

    /* renamed from: b */
    public static void m16729b() {
        C2098a.m16727b();
    }
}
