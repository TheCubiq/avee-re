package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
@zzadh
/* loaded from: classes.dex */
public final class zza {
    private static boolean zza(Context context, Intent intent, zzt zztVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzakb.v(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzbv.zzek();
            zzakk.zza(context, intent);
            if (zztVar != null) {
                zztVar.zzbl();
                return true;
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzakb.zzdk(e.getMessage());
            return false;
        }
    }

    public static boolean zza(Context context, zzc zzcVar, zzt zztVar) {
        String str;
        int i = 0;
        if (zzcVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            zznk.initialize(context);
            if (zzcVar.intent != null) {
                return zza(context, zzcVar.intent, zztVar);
            }
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(zzcVar.url)) {
                if (TextUtils.isEmpty(zzcVar.mimeType)) {
                    intent.setData(Uri.parse(zzcVar.url));
                } else {
                    intent.setDataAndType(Uri.parse(zzcVar.url), zzcVar.mimeType);
                }
                intent.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzcVar.packageName)) {
                    intent.setPackage(zzcVar.packageName);
                }
                if (!TextUtils.isEmpty(zzcVar.zzbxj)) {
                    String[] split = zzcVar.zzbxj.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(zzcVar.zzbxj);
                        zzakb.zzdk(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent.setClassName(split[0], split[1]);
                }
                String str2 = zzcVar.zzbxk;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        zzakb.zzdk("Could not parse intent flags.");
                    }
                    intent.addFlags(i);
                }
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbea)).booleanValue()) {
                    intent.addFlags(268435456);
                    intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzbdz)).booleanValue()) {
                        zzbv.zzek();
                        zzakk.zzb(context, intent);
                    }
                }
                return zza(context, intent, zztVar);
            }
            str = "Open GMSG did not contain a URL.";
        }
        zzakb.zzdk(str);
        return false;
    }
}
