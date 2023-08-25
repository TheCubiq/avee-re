package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ma2 {

    /* renamed from: a */
    public static final Object f18689a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    public static boolean f18690b;

    /* renamed from: c */
    public static String f18691c;

    /* renamed from: d */
    public static int f18692d;

    /* renamed from: a */
    public static int m16143a(Context context) {
        m16142b(context);
        return f18692d;
    }

    /* renamed from: b */
    public static void m16142b(Context context) {
        Bundle bundle;
        synchronized (f18689a) {
            if (f18690b) {
                return;
            }
            f18690b = true;
            try {
                bundle = ez1.m22979a(context).m19344c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f18691c = bundle.getString("com.google.app.id");
            f18692d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
