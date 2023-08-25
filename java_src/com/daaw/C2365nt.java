package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* renamed from: com.daaw.nt */
/* loaded from: classes.dex */
public final class C2365nt {

    /* renamed from: a */
    public static Boolean f20624a;

    /* renamed from: b */
    public static Boolean f20625b;

    /* renamed from: c */
    public static Boolean f20626c;

    /* renamed from: d */
    public static Boolean f20627d;

    /* renamed from: e */
    public static Boolean f20628e;

    /* renamed from: f */
    public static Boolean f20629f;

    /* renamed from: a */
    public static boolean m14840a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20628e == null) {
            boolean z = false;
            if (vw0.m6696i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f20628e = Boolean.valueOf(z);
        }
        return f20628e.booleanValue();
    }

    /* renamed from: b */
    public static boolean m14839b(Context context) {
        if (f20629f == null) {
            boolean z = false;
            if (vw0.m6694k() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f20629f = Boolean.valueOf(z);
        }
        return f20629f.booleanValue();
    }

    /* renamed from: c */
    public static boolean m14838c(Context context) {
        if (f20626c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f20626c = Boolean.valueOf(z);
        }
        return f20626c.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: d */
    public static boolean m14837d(Context context) {
        return m14833h(context);
    }

    /* renamed from: e */
    public static boolean m14836e() {
        int i = c80.f5613a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: f */
    public static boolean m14835f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20624a == null) {
            boolean z = false;
            if (vw0.m6700e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f20624a = Boolean.valueOf(z);
        }
        return f20624a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: g */
    public static boolean m14834g(Context context) {
        if (!m14835f(context) || vw0.m6697h()) {
            if (m14833h(context)) {
                return !vw0.m6696i() || vw0.m6694k();
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: h */
    public static boolean m14833h(Context context) {
        if (f20625b == null) {
            boolean z = false;
            if (vw0.m6699f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f20625b = Boolean.valueOf(z);
        }
        return f20625b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m14832i(Context context) {
        if (f20627d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f20627d = Boolean.valueOf(z);
        }
        return f20627d.booleanValue();
    }
}
