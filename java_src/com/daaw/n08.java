package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class n08 {

    /* renamed from: a */
    public static String f19331a;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
        if (r6.contains("com.google.android.apps.chrome") != false) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m15611a(Context context) {
        String str;
        String str2 = f19331a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str3 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f19331a = null;
        } else {
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                        if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                            for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                                IntentFilter intentFilter = resolveInfo2.filter;
                                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                    break;
                                }
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (arrayList.contains(str3)) {
                        f19331a = str3;
                    }
                }
                str = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str = "com.chrome.beta";
                    if (!arrayList.contains("com.chrome.beta")) {
                        str = "com.chrome.dev";
                        if (!arrayList.contains("com.chrome.dev")) {
                            str = "com.google.android.apps.chrome";
                        }
                    }
                }
            }
            f19331a = str;
        }
        return f19331a;
    }
}
