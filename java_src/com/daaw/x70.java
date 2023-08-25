package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class x70 {

    /* renamed from: a */
    public static final int f32161a = c80.f5613a;

    /* renamed from: b */
    public static final x70 f32162b = new x70();

    /* renamed from: f */
    public static x70 m5492f() {
        return f32162b;
    }

    /* renamed from: a */
    public int m5497a(Context context) {
        return c80.m25527a(context);
    }

    /* renamed from: b */
    public Intent mo5496b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return hs8.m20434c("com.google.android.gms");
        } else if (context == null || !C2365nt.m14834g(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f32161a);
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
                    sb.append(ez1.m22979a(context).m19341f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return hs8.m20435b("com.google.android.gms", sb.toString());
        } else {
            return hs8.m20436a();
        }
    }

    /* renamed from: c */
    public PendingIntent mo5495c(Context context, int i, int i2) {
        return m5494d(context, i, i2, null);
    }

    /* renamed from: d */
    public PendingIntent m5494d(Context context, int i, int i2, String str) {
        Intent mo5496b = mo5496b(context, i, str);
        if (mo5496b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, mo5496b, rk4.f25396a | 134217728);
    }

    /* renamed from: e */
    public String mo5493e(int i) {
        return c80.m25526b(i);
    }

    /* renamed from: g */
    public int mo5491g(Context context) {
        return mo5490h(context, f32161a);
    }

    /* renamed from: h */
    public int mo5490h(Context context, int i) {
        int m25522f = c80.m25522f(context, i);
        if (c80.m25521g(context, m25522f)) {
            return 18;
        }
        return m25522f;
    }

    /* renamed from: i */
    public boolean m5489i(Context context, String str) {
        return c80.m25517k(context, str);
    }

    /* renamed from: j */
    public boolean mo5488j(int i) {
        return c80.m25519i(i);
    }
}
