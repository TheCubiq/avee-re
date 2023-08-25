package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class s95 {

    /* renamed from: a */
    public static final Object f26027a = new Object();

    /* renamed from: b */
    public static final p85 f26028b = p85.f22702a;

    @Pure
    /* renamed from: a */
    public static void m10497a(String str, String str2) {
        synchronized (f26027a) {
        }
    }

    @Pure
    /* renamed from: b */
    public static void m10496b(String str, String str2) {
        synchronized (f26027a) {
        }
    }

    @Pure
    /* renamed from: c */
    public static void m10495c(String str, String str2, Throwable th) {
        m10496b(str, m10491g(str2, th));
    }

    @Pure
    /* renamed from: d */
    public static void m10494d(String str, String str2) {
        synchronized (f26027a) {
        }
    }

    @Pure
    /* renamed from: e */
    public static void m10493e(String str, String str2) {
        synchronized (f26027a) {
        }
    }

    @Pure
    /* renamed from: f */
    public static void m10492f(String str, String str2, Throwable th) {
        m10493e(str, m10491g(str2, th));
    }

    @Pure
    /* renamed from: g */
    public static String m10491g(String str, Throwable th) {
        String replace;
        synchronized (f26027a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        } else if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String replace2 = replace.replace("\n", "\n  ");
        return str + "\n  " + replace2 + "\n";
    }
}
