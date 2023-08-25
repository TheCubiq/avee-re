package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.g93;
import com.daaw.k04;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class zza {
    /* renamed from: a */
    public static final boolean m1388a(Context context, Uri uri, zzz zzzVar, zzx zzxVar) {
        int i;
        try {
            i = com.google.android.gms.ads.internal.zzt.zzp().zzk(context, uri);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
        } catch (ActivityNotFoundException e) {
            k04.zzj(e.getMessage());
            i = 6;
        }
        if (zzxVar != null) {
            zzxVar.zzb(i);
        }
        return i == 5;
    }

    public static final boolean zza(Context context, Intent intent, zzz zzzVar, zzx zzxVar, boolean z) {
        if (z) {
            return m1388a(context, intent.getData(), zzzVar, zzxVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + uri);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            k04.zzj(e.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzz zzzVar, zzx zzxVar) {
        String concat;
        int i = 0;
        if (zzcVar != null) {
            g93.m21879c(context);
            Intent intent = zzcVar.zzh;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(zzcVar.zzb)) {
                    concat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(zzcVar.zzc)) {
                        intent.setData(Uri.parse(zzcVar.zzb));
                    } else {
                        intent.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(zzcVar.zzd)) {
                        intent.setPackage(zzcVar.zzd);
                    }
                    if (!TextUtils.isEmpty(zzcVar.zze)) {
                        String[] split = zzcVar.zze.split("/", 2);
                        if (split.length < 2) {
                            concat = "Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze));
                        } else {
                            intent.setClassName(split[0], split[1]);
                        }
                    }
                    String str = zzcVar.zzf;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i = Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
                            k04.zzj("Could not parse intent flags.");
                        }
                        intent.addFlags(i);
                    }
                    if (((Boolean) zzba.zzc().m23658b(g93.f10605Y3)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10595X3)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            com.google.android.gms.ads.internal.util.zzs.zzm(context, intent);
                        }
                    }
                }
            }
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        concat = "No intent data for launcher overlay.";
        k04.zzj(concat);
        return false;
    }
}
