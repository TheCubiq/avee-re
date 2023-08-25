package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.daaw.q5 */
/* loaded from: classes.dex */
public final class C2690q5 {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, hi0> f23676a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static hi0 m12770a(Context context) {
        String packageName = context.getPackageName();
        ConcurrentHashMap<String, hi0> concurrentHashMap = f23676a;
        hi0 hi0Var = concurrentHashMap.get(packageName);
        if (hi0Var == null) {
            hi0 m12769b = m12769b(context);
            hi0 putIfAbsent = concurrentHashMap.putIfAbsent(packageName, m12769b);
            return putIfAbsent == null ? m12769b : putIfAbsent;
        }
        return hi0Var;
    }

    /* renamed from: b */
    public static hi0 m12769b(Context context) {
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
