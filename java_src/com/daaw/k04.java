package com.daaw;

import android.util.Log;
import com.google.ads.AdRequest;
/* loaded from: classes.dex */
public class k04 {
    public static final fz6 a = fz6.b(4000);

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + " @" + lineNumber;
        }
        return str;
    }

    public static void zze(String str) {
        if (!zzm(3) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : a.d(str)) {
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (!zzm(6) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : a.d(str)) {
        }
    }

    public static void zzh(String str, Throwable th) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (!zzm(4) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : a.d(str)) {
        }
    }

    public static void zzj(String str) {
        if (!zzm(5) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : a.d(str)) {
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            String a2 = a(str);
            if (th != null) {
                zzk(a2, th);
            } else {
                zzj(a2);
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
