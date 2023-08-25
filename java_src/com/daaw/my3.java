package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class my3 {
    /* renamed from: a */
    public static Uri m15660a(String str, String str2, String str3) {
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

    /* renamed from: b */
    public static String m15659b(Uri uri, Context context) {
        String m17337f;
        if (zzt.zzn().m17317z(context) && (m17337f = zzt.zzn().m17337f(context)) != null) {
            String str = (String) zzba.zzc().m23658b(g93.f10644c0);
            String uri2 = uri.toString();
            if (((Boolean) zzba.zzc().m23658b(g93.f10633b0)).booleanValue() && uri2.contains(str)) {
                zzt.zzn().m17325r(context, m17337f);
                return m15657d(uri2, context).replace(str, m17337f);
            } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                String uri3 = m15660a(m15657d(uri2, context), "fbs_aeid", m17337f).toString();
                zzt.zzn().m17325r(context, m17337f);
                return uri3;
            } else {
                return uri2;
            }
        }
        return uri.toString();
    }

    /* renamed from: c */
    public static String m15658c(String str, Context context, boolean z) {
        String m17337f;
        if ((!((Boolean) zzba.zzc().m23658b(g93.f10721j0)).booleanValue() || z) && zzt.zzn().m17317z(context) && !TextUtils.isEmpty(str) && (m17337f = zzt.zzn().m17337f(context)) != null) {
            String str2 = (String) zzba.zzc().m23658b(g93.f10644c0);
            if (((Boolean) zzba.zzc().m23658b(g93.f10633b0)).booleanValue() && str.contains(str2)) {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().m17325r(context, m17337f);
                    return m15657d(str, context).replace(str2, m17337f);
                } else if (zzt.zzp().zzh(str)) {
                    zzt.zzn().m17324s(context, m17337f);
                    return m15657d(str, context).replace(str2, m17337f);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (zzt.zzp().zzg(str)) {
                    zzt.zzn().m17325r(context, m17337f);
                    return m15660a(m15657d(str, context), "fbs_aeid", m17337f).toString();
                } else if (zzt.zzp().zzh(str)) {
                    zzt.zzn().m17324s(context, m17337f);
                    return m15660a(m15657d(str, context), "fbs_aeid", m17337f).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    /* renamed from: d */
    public static String m15657d(String str, Context context) {
        String m17333j = zzt.zzn().m17333j(context);
        String m17335h = zzt.zzn().m17335h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(m17333j)) {
            str = m15660a(str, "gmp_app_id", m17333j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(m17335h)) ? str : m15660a(str, "fbs_aiid", m17335h).toString();
    }
}
