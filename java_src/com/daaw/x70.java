package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class x70 {
    public static final int a = c80.a;
    public static final x70 b = new x70();

    public static x70 f() {
        return b;
    }

    public int a(Context context) {
        return c80.a(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return hs8.c("com.google.android.gms");
        } else if (context == null || !nt.g(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(ez1.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return hs8.b("com.google.android.gms", sb.toString());
        } else {
            return hs8.a();
        }
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b2, rk4.a | 134217728);
    }

    public String e(int i) {
        return c80.b(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int f = c80.f(context, i);
        if (c80.g(context, f)) {
            return 18;
        }
        return f;
    }

    public boolean i(Context context, String str) {
        return c80.k(context, str);
    }

    public boolean j(int i) {
        return c80.i(i);
    }
}
