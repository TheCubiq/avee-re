package com.daaw.avee.Common;

import android.util.Log;

import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
/* loaded from: classes.dex */
public class tlog {
    static final boolean LOG = false;

    private static String getLogTagWithMethod(String str) {
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        return str + stackTrace[2].getFileName() + "." + stackTrace[2].getMethodName() + ":" + stackTrace[2].getLineNumber();
    }

    public static void w(String str) {
        // FirebaseCrashlytics.getInstance().log(str);
        // 
        // EventsGlobalTextNotifier.onTextMsg.invoke(str);´
        Log.d("cubiq-dbg", str);
    }

    public static void d(String str) {
        FirebaseCrashlytics.getInstance().log(str);
    }

    public static void e(Exception exc, String str) {
        if (exc != null) {
            FirebaseCrashlytics.getInstance().recordException(exc);
        }
    }

    public static void infoLarge(String str, String str2) {
        int i = 0;
        while (i <= str2.length() / 2000) {
            int i2 = i * 2000;
            i++;
            Log.w(str, str2.substring(i2, Math.min(i * 2000, str2.length())));
        }
    }
}
