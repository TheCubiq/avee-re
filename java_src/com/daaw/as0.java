package com.daaw;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class as0 {

    /* renamed from: com.daaw.as0$a */
    /* loaded from: classes.dex */
    public static class C0669a {
        /* renamed from: a */
        public static Intent m27104a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        public static boolean m27103b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        public static boolean m27102c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m27111a(Activity activity) {
        Intent m27104a = C0669a.m27104a(activity);
        if (m27104a != null) {
            return m27104a;
        }
        String m27109c = m27109c(activity);
        if (m27109c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m27109c);
        try {
            return m27108d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(m27109c);
            sb.append("' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m27110b(Context context, ComponentName componentName) {
        String m27108d = m27108d(context, componentName);
        if (m27108d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m27108d);
        return m27108d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m27109c(Activity activity) {
        try {
            return m27108d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m27108d(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* renamed from: e */
    public static void m27107e(Activity activity) {
        Intent m27111a = m27111a(activity);
        if (m27111a != null) {
            m27106f(activity, m27111a);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    /* renamed from: f */
    public static void m27106f(Activity activity, Intent intent) {
        C0669a.m27103b(activity, intent);
    }

    /* renamed from: g */
    public static boolean m27105g(Activity activity, Intent intent) {
        return C0669a.m27102c(activity, intent);
    }
}
