package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class lg0 {

    /* renamed from: a */
    public static Context f17377a;

    /* renamed from: b */
    public static Boolean f17378b;

    /* renamed from: a */
    public static synchronized boolean m16965a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (lg0.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f17377a;
            if (context2 != null && (bool2 = f17378b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f17378b = null;
            if (!vw0.m6696i()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f17378b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f17377a = applicationContext;
                return f17378b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f17378b = bool;
            f17377a = applicationContext;
            return f17378b.booleanValue();
        }
    }
}
