package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class my3 {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String b(Uri uri, Context context) {
        String f;
        if (zzt.zzn().z(context) && (f = zzt.zzn().f(context)) != null) {
            String str = (String) zzba.zzc().b(g93.c0);
            String uri2 = uri.toString();
            if (((Boolean) zzba.zzc().b(g93.b0)).booleanValue() && uri2.contains(str)) {
                zzt.zzn().r(context, f);
                return d(uri2, context).replace(str, f);
            } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                String uri3 = a(d(uri2, context), "fbs_aeid", f).toString();
                zzt.zzn().r(context, f);
                return uri3;
            } else {
                return uri2;
            }
        }
        return uri.toString();
    }

    public static String c(String str, Context context, boolean z) {
        String f;
        if ((!((Boolean) zzba.zzc().b(g93.j0)).booleanValue() || z) && zzt.zzn().z(context) && !TextUtils.isEmpty(str) && (f = zzt.zzn().f(context)) != null) {
            String str2 = (String) zzba.zzc().b(g93.c0);
            if (((Boolean) zzba.zzc().b(g93.b0)).booleanValue() && str.contains(str2)) {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().r(context, f);
                    return d(str, context).replace(str2, f);
                } else if (zzt.zzp().zzh(str)) {
                    zzt.zzn().s(context, f);
                    return d(str, context).replace(str2, f);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().r(context, f);
                    return a(d(str, context), "fbs_aeid", f).toString();
                } else if (zzt.zzp().zzh(str)) {
                    zzt.zzn().s(context, f);
                    return a(d(str, context), "fbs_aeid", f).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    public static String d(String str, Context context) {
        String j = zzt.zzn().j(context);
        String h = zzt.zzn().h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : a(str, "fbs_aiid", h).toString();
    }
}
