package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzbfw {
    private static String zzedy;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r6.contains("com.google.android.apps.chrome") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzbn(Context context) {
        String str;
        String str2 = zzedy;
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
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            zzedy = null;
        } else {
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else if (TextUtils.isEmpty(str3) || zzd(context, intent) || !arrayList.contains(str3)) {
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
            } else {
                zzedy = str3;
            }
            zzedy = str;
        }
        return zzedy;
    }

    private static boolean zzd(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
