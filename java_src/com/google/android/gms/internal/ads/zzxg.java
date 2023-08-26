package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzxg {
    private static String zza(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> zza(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    public static void zza(Context context, String str, zzajh zzajhVar, String str2, boolean z, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str3 = z ? "1" : "0";
        for (String str4 : list) {
            String zza = zza(zza(zza(zza(zza(zza(zza(str4, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", zzajhVar.zzcod.zzbst), "@gw_sdkver@", str), "@gw_sessid@", zzkb.zzih()), "@gw_seqnum@", zzajhVar.zzccy), "@gw_adnetstatus@", zzajhVar.zzcoe);
            if (zzajhVar.zzbtw != null) {
                zza = zza(zza(zza, "@gw_adnetid@", zzajhVar.zzbtw.zzbrs), "@gw_allocid@", zzajhVar.zzbtw.zzbru);
            }
            String zzb = zzajb.zzb(zza, context);
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzakk.zzd(context, str, zzb);
        }
    }

    public static void zza(Context context, String str, List<String> list, String str2, zzaig zzaigVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!TextUtils.isEmpty(str2) && zzamy.isEnabled()) {
            str2 = "fakeUserForAdDebugLog";
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
        for (String str3 : list) {
            String zza = zza(zza(str3, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis));
            if (zzaigVar != null) {
                zza = zza(zza(zza, "@gw_rwd_itm@", Uri.encode(zzaigVar.type)), "@gw_rwd_amt@", Integer.toString(zzaigVar.zzcmk));
            }
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzakk.zzd(context, str, zza);
        }
    }

    public static boolean zza(String str, int[] iArr) {
        if (!TextUtils.isEmpty(str) && iArr.length == 2) {
            String[] split = str.split("x");
            if (split.length != 2) {
                return false;
            }
            try {
                iArr[0] = Integer.parseInt(split[0]);
                iArr[1] = Integer.parseInt(split[1]);
                return true;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
