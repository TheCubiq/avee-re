package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ma2 {
    public static final Object a = new Object();
    @GuardedBy("sLock")
    public static boolean b;
    public static String c;
    public static int d;

    public static int a(Context context) {
        b(context);
        return d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (b) {
                return;
            }
            b = true;
            try {
                bundle = ez1.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            c = bundle.getString("com.google.app.id");
            d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
