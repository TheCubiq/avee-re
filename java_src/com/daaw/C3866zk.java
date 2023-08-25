package com.daaw;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: com.daaw.zk */
/* loaded from: classes.dex */
public class C3866zk {

    /* renamed from: a */
    public static final Object f35179a = new Object();

    /* renamed from: b */
    public static final Object f35180b = new Object();

    /* renamed from: com.daaw.zk$a */
    /* loaded from: classes.dex */
    public static class C3867a {
        /* renamed from: a */
        public static void m2172a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m2171b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: com.daaw.zk$b */
    /* loaded from: classes.dex */
    public static class C3868b {
        /* renamed from: a */
        public static File[] m2170a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m2169b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m2168c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: com.daaw.zk$c */
    /* loaded from: classes.dex */
    public static class C3869c {
        /* renamed from: a */
        public static File m2167a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m2166b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m2165c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: com.daaw.zk$d */
    /* loaded from: classes.dex */
    public static class C3870d {
        /* renamed from: a */
        public static int m2164a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m2163b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m2162c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: com.daaw.zk$e */
    /* loaded from: classes.dex */
    public static class C3871e {
        /* renamed from: a */
        public static Context m2161a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m2160b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m2159c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: com.daaw.zk$f */
    /* loaded from: classes.dex */
    public static class C3872f {
        /* renamed from: a */
        public static Intent m2158a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) == 0 || str != null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION", handler);
        }

        /* renamed from: b */
        public static ComponentName m2157b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m2182a(Context context, String str) {
        pt0.m13157d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : gt0.m21240b(context).m21241a() ? 0 : -1;
    }

    /* renamed from: b */
    public static Context m2181b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3871e.m2161a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m2180c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? C3870d.m2164a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: d */
    public static ColorStateList m2179d(Context context, int i) {
        return j51.m18897c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m2178e(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? C3869c.m2166b(context, i) : context.getResources().getDrawable(i);
    }

    /* renamed from: f */
    public static File[] m2177f(Context context) {
        return C3868b.m2170a(context);
    }

    /* renamed from: g */
    public static File[] m2176g(Context context, String str) {
        return C3868b.m2169b(context, str);
    }

    /* renamed from: h */
    public static boolean m2175h(Context context, Intent[] intentArr, Bundle bundle) {
        C3867a.m2172a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: i */
    public static void m2174i(Context context, Intent intent, Bundle bundle) {
        C3867a.m2171b(context, intent, bundle);
    }

    /* renamed from: j */
    public static void m2173j(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3872f.m2157b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
