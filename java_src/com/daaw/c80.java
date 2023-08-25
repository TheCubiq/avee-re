package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class c80 {
    @Deprecated

    /* renamed from: a */
    public static final int f5613a = 12451000;

    /* renamed from: c */
    public static boolean f5615c;

    /* renamed from: d */
    public static boolean f5616d;

    /* renamed from: b */
    public static final AtomicBoolean f5614b = new AtomicBoolean();

    /* renamed from: e */
    public static final AtomicBoolean f5617e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m25527a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static String m25526b(int i) {
        return ConnectionResult.m1204v(i);
    }

    /* renamed from: c */
    public static Context m25525c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Resources m25524d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m25523e(Context context) {
        if (!f5616d) {
            try {
                PackageInfo m19341f = ez1.m22979a(context).m19341f("com.google.android.gms", 64);
                d80.m24607a(context);
                if (m19341f == null || d80.m24603e(m19341f, false) || !d80.m24603e(m19341f, true)) {
                    f5615c = false;
                } else {
                    f5615c = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                f5616d = true;
                throw th;
            }
            f5616d = true;
        }
        return f5615c || !C2365nt.m14836e();
    }

    @Deprecated
    /* renamed from: f */
    public static int m25522f(Context context, int i) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(g21.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f5617e.get()) {
            int m16143a = ma2.m16143a(context);
            if (m16143a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (m16143a != f5613a) {
                throw new GooglePlayServicesIncorrectManifestValueException(m16143a);
            }
        }
        boolean z = (C2365nt.m14834g(context) || C2365nt.m14832i(context)) ? false : true;
        ry0.m10839a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            d80.m24607a(context);
            if (d80.m24603e(packageInfo2, true)) {
                if (z) {
                    ry0.m10830j(packageInfo);
                    if (!d80.m24603e(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (n32.m15543a(packageInfo2.versionCode) >= n32.m15543a(i)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i2);
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            valueOf.concat(str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m25521g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m25517k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: h */
    public static boolean m25520h(Context context) {
        if (vw0.m6702c()) {
            Object systemService = context.getSystemService("user");
            ry0.m10830j(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m25519i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: j */
    public static boolean m25518j(Context context, int i, String str) {
        return fp1.m22424b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: k */
    public static boolean m25517k(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (vw0.m6699f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m25520h(context);
    }
}
