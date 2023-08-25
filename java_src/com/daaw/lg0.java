package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class lg0 {
    public static Context a;
    public static Boolean b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (lg0.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool2 = b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            b = null;
            if (!vw0.i()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                a = applicationContext;
                return b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = bool;
            a = applicationContext;
            return b.booleanValue();
        }
    }
}
