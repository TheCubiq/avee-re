package com.daaw;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
/* renamed from: com.daaw.h5 */
/* loaded from: classes.dex */
public final class C1502h5 {

    /* renamed from: com.daaw.h5$a */
    /* loaded from: classes.dex */
    public static class C1503a {
        /* renamed from: a */
        public static <T> T m21029a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m21028b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        public static int m21027c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        public static String m21026d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: com.daaw.h5$b */
    /* loaded from: classes.dex */
    public static class C1504b {
        /* renamed from: a */
        public static int m21025a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        public static String m21024b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m21023c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m21032a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m21023c = C1504b.m21023c(context);
            int m21025a = C1504b.m21025a(m21023c, str, Binder.getCallingUid(), str2);
            return m21025a != 0 ? m21025a : C1504b.m21025a(m21023c, str, i, C1504b.m21024b(context));
        }
        return m21031b(context, str, str2);
    }

    /* renamed from: b */
    public static int m21031b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1503a.m21027c((AppOpsManager) C1503a.m21029a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m21030c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1503a.m21026d(str);
        }
        return null;
    }
}
