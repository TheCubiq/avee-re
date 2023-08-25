package com.daaw;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class gt0 {

    /* renamed from: c */
    public static final Object f11719c = new Object();

    /* renamed from: d */
    public static Set<String> f11720d = new HashSet();

    /* renamed from: e */
    public static final Object f11721e = new Object();

    /* renamed from: a */
    public final Context f11722a;

    /* renamed from: b */
    public final NotificationManager f11723b;

    public gt0(Context context) {
        this.f11722a = context;
        this.f11723b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static gt0 m21240b(Context context) {
        return new gt0(context);
    }

    /* renamed from: a */
    public boolean m21241a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f11723b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f11722a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f11722a.getApplicationInfo();
        String packageName = this.f11722a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
