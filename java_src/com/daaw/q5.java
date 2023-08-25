package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class q5 {
    public static final ConcurrentHashMap<String, hi0> a = new ConcurrentHashMap<>();

    public static hi0 a(Context context) {
        String packageName = context.getPackageName();
        ConcurrentHashMap<String, hi0> concurrentHashMap = a;
        hi0 hi0Var = concurrentHashMap.get(packageName);
        if (hi0Var == null) {
            hi0 b = b(context);
            hi0 putIfAbsent = concurrentHashMap.putIfAbsent(packageName, b);
            return putIfAbsent == null ? b : putIfAbsent;
        }
        return hi0Var;
    }

    public static hi0 b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new bh1(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
