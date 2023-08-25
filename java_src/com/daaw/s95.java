package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class s95 {
    public static final Object a = new Object();
    public static final p85 b = p85.a;

    @Pure
    public static void a(String str, String str2) {
        synchronized (a) {
        }
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (a) {
        }
    }

    @Pure
    public static void c(String str, String str2, Throwable th) {
        b(str, g(str2, th));
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (a) {
        }
    }

    @Pure
    public static void e(String str, String str2) {
        synchronized (a) {
        }
    }

    @Pure
    public static void f(String str, String str2, Throwable th) {
        e(str, g(str2, th));
    }

    @Pure
    public static String g(String str, Throwable th) {
        String replace;
        synchronized (a) {
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
