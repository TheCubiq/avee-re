package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzae {
    private final Context mContext;
    private final View mView;
    private final zzci zzbne;

    public zzae(Context context, zzci zzciVar, View view) {
        this.mContext = context;
        this.zzbne = zzciVar;
        this.mView = view;
    }

    private static Intent zza(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private final ResolveInfo zza(Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = this.mContext.getPackageManager();
        } catch (Throwable th) {
            zzbv.zzeo().zza(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    break;
                }
                ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    private final ResolveInfo zzb(Intent intent) {
        return zza(intent, new ArrayList<>());
    }

    private static Intent zze(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent zzi(Map<String, String> map) {
        boolean z;
        Uri.Builder scheme;
        ResolveInfo zza;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzb;
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        String str = map.get("u");
        Uri uri = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(zzad.zza(this.mContext, this.zzbne, str, this.mView, null));
        boolean parseBoolean = Boolean.parseBoolean(map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean(map.get("use_running_process"));
        if (!Boolean.parseBoolean(map.get("use_custom_tabs"))) {
            if (!((Boolean) zzkb.zzik().zzd(zznk.zzbdz)).booleanValue()) {
                z = false;
                if ("http".equalsIgnoreCase(parse.getScheme())) {
                    if ("https".equalsIgnoreCase(parse.getScheme())) {
                        scheme = parse.buildUpon().scheme("http");
                    }
                    ArrayList<ResolveInfo> arrayList = new ArrayList<>();
                    Intent zze = zze(parse);
                    Intent zze2 = zze(uri);
                    if (z) {
                        zzbv.zzek();
                        zzakk.zzb(this.mContext, zze);
                        zzbv.zzek();
                        zzakk.zzb(this.mContext, zze2);
                    }
                    zza = zza(zze, arrayList);
                    if (zza != null) {
                        return zza(zze, zza);
                    }
                    if (zze2 != null && (zzb = zzb(zze2)) != null) {
                        Intent zza2 = zza(zze, zzb);
                        if (zzb(zza2) != null) {
                            return zza2;
                        }
                    }
                    if (arrayList.size() == 0) {
                        return zze;
                    }
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        ArrayList<ResolveInfo> arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            ResolveInfo resolveInfo = arrayList2.get(i);
                            i++;
                            ResolveInfo resolveInfo2 = resolveInfo;
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.processName.equals(resolveInfo2.activityInfo.packageName)) {
                                    return zza(zze, resolveInfo2);
                                }
                            }
                        }
                    }
                    return parseBoolean ? zza(zze, arrayList.get(0)) : zze;
                }
                scheme = parse.buildUpon().scheme("https");
                uri = scheme.build();
                ArrayList<ResolveInfo> arrayList3 = new ArrayList<>();
                Intent zze3 = zze(parse);
                Intent zze22 = zze(uri);
                if (z) {
                }
                zza = zza(zze3, arrayList3);
                if (zza != null) {
                }
            }
        }
        z = true;
        if ("http".equalsIgnoreCase(parse.getScheme())) {
        }
        uri = scheme.build();
        ArrayList<ResolveInfo> arrayList32 = new ArrayList<>();
        Intent zze32 = zze(parse);
        Intent zze222 = zze(uri);
        if (z) {
        }
        zza = zza(zze32, arrayList32);
        if (zza != null) {
        }
    }
}
