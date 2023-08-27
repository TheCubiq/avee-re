package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzafs {
    private static final SimpleDateFormat zzcho = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[Catch: JSONException -> 0x0269, TryCatch #0 {JSONException -> 0x0269, blocks: (B:3:0x0007, B:5:0x0029, B:9:0x0032, B:11:0x003a, B:13:0x0042, B:15:0x004a, B:17:0x0052, B:18:0x0056, B:20:0x006a, B:22:0x007b, B:24:0x008a, B:30:0x00a8, B:32:0x00ae, B:34:0x00b4, B:38:0x00e1, B:40:0x00e7, B:45:0x00f5, B:46:0x00fa, B:51:0x0108, B:52:0x010d, B:57:0x011b, B:59:0x0124, B:64:0x0132, B:67:0x013d, B:69:0x0141, B:70:0x0145, B:72:0x014d, B:74:0x0153, B:76:0x0161, B:78:0x016c, B:62:0x012e, B:55:0x0117, B:49:0x0104, B:43:0x00f1, B:26:0x0095, B:28:0x009d), top: B:87:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[Catch: JSONException -> 0x0269, TryCatch #0 {JSONException -> 0x0269, blocks: (B:3:0x0007, B:5:0x0029, B:9:0x0032, B:11:0x003a, B:13:0x0042, B:15:0x004a, B:17:0x0052, B:18:0x0056, B:20:0x006a, B:22:0x007b, B:24:0x008a, B:30:0x00a8, B:32:0x00ae, B:34:0x00b4, B:38:0x00e1, B:40:0x00e7, B:45:0x00f5, B:46:0x00fa, B:51:0x0108, B:52:0x010d, B:57:0x011b, B:59:0x0124, B:64:0x0132, B:67:0x013d, B:69:0x0141, B:70:0x0145, B:72:0x014d, B:74:0x0153, B:76:0x0161, B:78:0x016c, B:62:0x012e, B:55:0x0117, B:49:0x0104, B:43:0x00f1, B:26:0x0095, B:28:0x009d), top: B:87:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161 A[Catch: JSONException -> 0x0269, TryCatch #0 {JSONException -> 0x0269, blocks: (B:3:0x0007, B:5:0x0029, B:9:0x0032, B:11:0x003a, B:13:0x0042, B:15:0x004a, B:17:0x0052, B:18:0x0056, B:20:0x006a, B:22:0x007b, B:24:0x008a, B:30:0x00a8, B:32:0x00ae, B:34:0x00b4, B:38:0x00e1, B:40:0x00e7, B:45:0x00f5, B:46:0x00fa, B:51:0x0108, B:52:0x010d, B:57:0x011b, B:59:0x0124, B:64:0x0132, B:67:0x013d, B:69:0x0141, B:70:0x0145, B:72:0x014d, B:74:0x0153, B:76:0x0161, B:78:0x016c, B:62:0x012e, B:55:0x0117, B:49:0x0104, B:43:0x00f1, B:26:0x0095, B:28:0x009d), top: B:87:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaej zza(Context context, zzaef zzaefVar, String str) {
        int i;
        int zzrl;
        int i2;
        String str2;
        zzaej zzaejVar;
        long j;
        long j2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_slot_size", optString3);
            boolean z = (zzaefVar == null || zzaefVar.zzcdb == 0) ? false : true;
            String optString5 = jSONObject.optString("ad_json", null);
            if (optString5 == null) {
                optString5 = jSONObject.optString("ad_html", null);
            }
            if (optString5 == null) {
                optString5 = jSONObject.optString(TtmlNode.TAG_BODY, null);
            }
            if (optString5 == null && jSONObject.has("ads")) {
                optString5 = jSONObject.toString();
            }
            String optString6 = jSONObject.optString("debug_dialog", null);
            String optString7 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1L;
            String optString8 = jSONObject.optString("orientation", null);
            if ("portrait".equals(optString8)) {
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrm();
            } else if (!"landscape".equals(optString8)) {
                i = -1;
                if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString2)) {
                    i2 = -1;
                    str2 = optString5;
                    zzaejVar = null;
                    j = -1;
                } else {
                    i2 = -1;
                    zzaejVar = zzafn.zza(zzaefVar, context, zzaefVar.zzacr.zzcw, optString2, null, null, null, null, null);
                    optString = zzaejVar.zzbyq;
                    String str3 = zzaejVar.zzceo;
                    j = zzaejVar.zzceu;
                    str2 = str3;
                }
                String str4 = optString;
                if (str2 != null) {
                    return new zzaej(0);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
                List<String> list = zzaejVar == null ? null : zzaejVar.zzbsn;
                if (optJSONArray != null) {
                    list = zza(optJSONArray, list);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
                List<String> list2 = zzaejVar == null ? null : zzaejVar.zzbso;
                if (optJSONArray2 != null) {
                    list2 = zza(optJSONArray2, list2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("downloaded_impression_urls");
                List<String> list3 = zzaejVar == null ? null : zzaejVar.zzbsp;
                List<String> zza = optJSONArray3 != null ? zza(optJSONArray3, list3) : list3;
                JSONArray optJSONArray4 = jSONObject.optJSONArray("manual_impression_urls");
                List<String> list4 = zzaejVar == null ? null : zzaejVar.zzces;
                List<String> zza2 = optJSONArray4 != null ? zza(optJSONArray4, list4) : list4;
                if (zzaejVar != null) {
                    if (zzaejVar.orientation != i2) {
                        i = zzaejVar.orientation;
                    }
                    if (zzaejVar.zzcep > 0) {
                        j2 = zzaejVar.zzcep;
                        String optString9 = jSONObject.optString("active_view");
                        boolean optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                        String optString10 = !optBoolean ? jSONObject.optString("ad_passback_url", null) : null;
                        boolean optBoolean2 = jSONObject.optBoolean("mediation", false);
                        boolean optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                        boolean optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                        boolean optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                        boolean optBoolean6 = jSONObject.optBoolean("prefetch", false);
                        long optLong = jSONObject.optLong("refresh_interval_milliseconds", -1L);
                        long optLong2 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
                        String optString11 = jSONObject.optString("gws_query_id", "");
                        boolean equals = "height".equals(jSONObject.optString("fluid", ""));
                        boolean optBoolean7 = jSONObject.optBoolean("native_express", false);
                        List<String> zza3 = zza(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
                        List<String> zza4 = zza(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
                        return new zzaej(zzaefVar, str4, str2, list, list2, j2, optBoolean2, optLong2, zza2, optLong, i, optString3, j, optString6, optBoolean, optString10, optString9, optBoolean3, z, zzaefVar.zzcdd, optBoolean4, optBoolean6, optString11, equals, optBoolean7, zzaig.zza(jSONObject.optJSONArray("rewards")), zza3, zza4, jSONObject.optBoolean("use_displayed_impression", false), zzael.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaefVar.zzcdr, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", zzaefVar.zzbss), optString4, zzaiq.zzo(jSONObject.optJSONObject("safe_browsing")), optString7, optBoolean5, zzaefVar.zzced, jSONObject.optBoolean("custom_close_blocked"), 0, jSONObject.optBoolean("enable_omid", false), zza, jSONObject.optBoolean("disable_closable_area", false), jSONObject.optString("omid_settings", null));
                    }
                }
                j2 = j3;
                String optString92 = jSONObject.optString("active_view");
                boolean optBoolean8 = jSONObject.optBoolean("ad_is_javascript", false);
                if (!optBoolean8) {
                }
                boolean optBoolean22 = jSONObject.optBoolean("mediation", false);
                boolean optBoolean32 = jSONObject.optBoolean("custom_render_allowed", false);
                boolean optBoolean42 = jSONObject.optBoolean("content_url_opted_out", true);
                boolean optBoolean52 = jSONObject.optBoolean("content_vertical_opted_out", true);
                boolean optBoolean62 = jSONObject.optBoolean("prefetch", false);
                long optLong3 = jSONObject.optLong("refresh_interval_milliseconds", -1L);
                long optLong22 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
                String optString112 = jSONObject.optString("gws_query_id", "");
                boolean equals2 = "height".equals(jSONObject.optString("fluid", ""));
                boolean optBoolean72 = jSONObject.optBoolean("native_express", false);
                List<String> zza32 = zza(jSONObject.optJSONArray("video_start_urls"), (List<String>) null);
                List<String> zza42 = zza(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null);
                return new zzaej(zzaefVar, str4, str2, list, list2, j2, optBoolean22, optLong22, zza2, optLong3, i, optString3, j, optString6, optBoolean8, optString10, optString92, optBoolean32, z, zzaefVar.zzcdd, optBoolean42, optBoolean62, optString112, equals2, optBoolean72, zzaig.zza(jSONObject.optJSONArray("rewards")), zza32, zza42, jSONObject.optBoolean("use_displayed_impression", false), zzael.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaefVar.zzcdr, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", zzaefVar.zzbss), optString4, zzaiq.zzo(jSONObject.optJSONObject("safe_browsing")), optString7, optBoolean52, zzaefVar.zzced, jSONObject.optBoolean("custom_close_blocked"), 0, jSONObject.optBoolean("enable_omid", false), zza, jSONObject.optBoolean("disable_closable_area", false), jSONObject.optString("omid_settings", null));
            } else {
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrl();
            }
            i = zzrl;
            if (TextUtils.isEmpty(optString5)) {
            }
            i2 = -1;
            str2 = optString5;
            zzaejVar = null;
            j = -1;
            String str42 = optString;
            if (str2 != null) {
            }
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzakb.zzdk(valueOf.length() != 0 ? "Could not parse the inline ad response: ".concat(valueOf) : new String("Could not parse the inline ad response: "));
            return new zzaej(0);
        }
    }

    private static List<String> zza(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:312:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0809  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zza(Context context, zzafl zzaflVar) {
        Bundle bundle;
        Integer valueOf;
        String str;
        Object obj;
        String[] split;
        boolean z;
        Bundle bundle2;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        boolean z3;
        int i;
        int i2;
        String str6;
        boolean z4;
        zzaef zzaefVar = zzaflVar.zzcgs;
        Location location = zzaflVar.zzaqe;
        zzaga zzagaVar = zzaflVar.zzcgt;
        Bundle bundle3 = zzaflVar.zzcdc;
        JSONObject jSONObject = zzaflVar.zzcgu;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_caps", zzkb.zzik().zzd(zznk.zzbbk));
            if (zzaflVar.zzcdj.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", zzaflVar.zzcdj));
            }
            if (zzaefVar.zzccu != null) {
                hashMap.put("ad_pos", zzaefVar.zzccu);
            }
            zzjj zzjjVar = zzaefVar.zzccv;
            String zzqn = zzajw.zzqn();
            if (zzqn != null) {
                hashMap.put("abf", zzqn);
            }
            if (zzjjVar.zzapw != -1) {
                hashMap.put("cust_age", zzcho.format(new Date(zzjjVar.zzapw)));
            }
            if (zzjjVar.extras != null) {
                hashMap.put("extras", zzjjVar.extras);
            }
            if (zzjjVar.zzapx != -1) {
                hashMap.put("cust_gender", Integer.valueOf(zzjjVar.zzapx));
            }
            if (zzjjVar.zzapy != null) {
                hashMap.put("kw", zzjjVar.zzapy);
            }
            if (zzjjVar.zzaqa != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzjjVar.zzaqa));
            }
            if (zzjjVar.zzapz) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbfp)).booleanValue()) {
                    str6 = "test_request";
                    z4 = true;
                } else {
                    str6 = "adtest";
                    z4 = "on";
                }
                hashMap.put(str6, z4);
            }
            if (zzjjVar.versionCode >= 2) {
                if (zzjjVar.zzaqb) {
                    hashMap.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(zzjjVar.zzaqc)) {
                    hashMap.put("ppid", zzjjVar.zzaqc);
                }
            }
            if (zzjjVar.versionCode >= 3 && zzjjVar.zzaqf != null) {
                hashMap.put(ImagesContract.URL, zzjjVar.zzaqf);
            }
            if (zzjjVar.versionCode >= 5) {
                if (zzjjVar.zzaqh != null) {
                    hashMap.put("custom_targeting", zzjjVar.zzaqh);
                }
                if (zzjjVar.zzaqi != null) {
                    hashMap.put("category_exclusions", zzjjVar.zzaqi);
                }
                if (zzjjVar.zzaqj != null) {
                    hashMap.put("request_agent", zzjjVar.zzaqj);
                }
            }
            if (zzjjVar.versionCode >= 6 && zzjjVar.zzaqk != null) {
                hashMap.put("request_pkg", zzjjVar.zzaqk);
            }
            if (zzjjVar.versionCode >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(zzjjVar.zzaql));
            }
            if (zzaefVar.zzacv.zzard != null) {
                zzjn[] zzjnVarArr = zzaefVar.zzacv.zzard;
                int length = zzjnVarArr.length;
                int i3 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (i3 < length) {
                    int i4 = length;
                    zzjn zzjnVar = zzjnVarArr[i3];
                    zzjn[] zzjnVarArr2 = zzjnVarArr;
                    if (!zzjnVar.zzarf && !z5) {
                        hashMap.put("format", zzjnVar.zzarb);
                        z5 = true;
                    }
                    if (zzjnVar.zzarf && !z6) {
                        hashMap.put("fluid", "height");
                        z6 = true;
                    }
                    if (z5 && z6) {
                        break;
                    }
                    i3++;
                    length = i4;
                    zzjnVarArr = zzjnVarArr2;
                }
            } else {
                hashMap.put("format", zzaefVar.zzacv.zzarb);
                if (zzaefVar.zzacv.zzarf) {
                    hashMap.put("fluid", "height");
                }
            }
            if (zzaefVar.zzacv.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (zzaefVar.zzacv.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (zzaefVar.zzacv.zzard != null) {
                StringBuilder sb = new StringBuilder();
                zzjn[] zzjnVarArr3 = zzaefVar.zzacv.zzard;
                int length2 = zzjnVarArr3.length;
                boolean z7 = false;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length2;
                    zzjn zzjnVar2 = zzjnVarArr3[i5];
                    zzjn[] zzjnVarArr4 = zzjnVarArr3;
                    if (zzjnVar2.zzarf) {
                        z7 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(zzjnVar2.width == -1 ? (int) (zzjnVar2.widthPixels / zzagaVar.zzagu) : zzjnVar2.width);
                        sb.append("x");
                        sb.append(zzjnVar2.height == -2 ? (int) (zzjnVar2.heightPixels / zzagaVar.zzagu) : zzjnVar2.height);
                    }
                    i5++;
                    length2 = i6;
                    zzjnVarArr3 = zzjnVarArr4;
                }
                if (z7) {
                    if (sb.length() != 0) {
                        i2 = 0;
                        sb.insert(0, "|");
                    } else {
                        i2 = 0;
                    }
                    sb.insert(i2, "320x50");
                }
                hashMap.put("sz", sb);
            }
            if (zzaefVar.zzcdb != 0) {
                hashMap.put("native_version", Integer.valueOf(zzaefVar.zzcdb));
                hashMap.put("native_templates", zzaefVar.zzads);
                zzpl zzplVar = zzaefVar.zzadj;
                String str7 = "any";
                if (zzplVar != null && (i = zzplVar.zzbjo) != 0) {
                    str7 = i != 1 ? i != 2 ? "not_set" : "landscape" : "portrait";
                }
                hashMap.put("native_image_orientation", str7);
                if (!zzaefVar.zzcdk.isEmpty()) {
                    hashMap.put("native_custom_templates", zzaefVar.zzcdk);
                }
                if (zzaefVar.versionCode >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(zzaefVar.zzceg));
                }
                if (!TextUtils.isEmpty(zzaefVar.zzcee)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(zzaefVar.zzcee));
                    } catch (JSONException e) {
                        zzakb.zzc("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (zzaefVar.zzadn != null && zzaefVar.zzadn.size() > 0) {
                for (Integer num : zzaefVar.zzadn) {
                    if (num.intValue() == 2) {
                        str5 = "iba";
                        z3 = true;
                    } else if (num.intValue() == 1) {
                        str5 = "ina";
                        z3 = true;
                    }
                    hashMap.put(str5, z3);
                }
            }
            if (zzaefVar.zzacv.zzarg) {
                hashMap.put("ene", true);
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzaxv)).booleanValue()) {
                hashMap.put("xsrve", true);
            }
            if (zzaefVar.zzadl != null) {
                hashMap.put("is_icon_ad", true);
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzaefVar.zzadl.zzasj));
            }
            hashMap.put("slotname", zzaefVar.zzacp);
            hashMap.put("pn", zzaefVar.applicationInfo.packageName);
            if (zzaefVar.zzccw != null) {
                hashMap.put("vc", Integer.valueOf(zzaefVar.zzccw.versionCode));
            }
            hashMap.put("ms", zzaflVar.zzccx);
            hashMap.put("seq_num", zzaefVar.zzccy);
            hashMap.put("session_id", zzaefVar.zzccz);
            hashMap.put("js", zzaefVar.zzacr.zzcw);
            zzagk zzagkVar = zzaflVar.zzcgo;
            Bundle bundle4 = zzaefVar.zzcdw;
            Bundle bundle5 = zzaflVar.zzcgn;
            hashMap.put("am", Integer.valueOf(zzagaVar.zzcjk));
            hashMap.put("cog", zzv(zzagaVar.zzcjl));
            hashMap.put("coh", zzv(zzagaVar.zzcjm));
            if (!TextUtils.isEmpty(zzagaVar.zzcjn)) {
                hashMap.put("carrier", zzagaVar.zzcjn);
            }
            hashMap.put("gl", zzagaVar.zzcjo);
            if (zzagaVar.zzcjp) {
                hashMap.put("simulator", 1);
            }
            if (zzagaVar.zzcjq) {
                hashMap.put("is_sidewinder", 1);
            }
            hashMap.put("ma", zzv(zzagaVar.zzcjr));
            hashMap.put("sp", zzv(zzagaVar.zzcjs));
            hashMap.put("hl", zzagaVar.zzcjt);
            if (!TextUtils.isEmpty(zzagaVar.zzcju)) {
                hashMap.put("mv", zzagaVar.zzcju);
            }
            hashMap.put("muv", Integer.valueOf(zzagaVar.zzcjw));
            if (zzagaVar.zzcjx != -2) {
                hashMap.put("cnt", Integer.valueOf(zzagaVar.zzcjx));
            }
            hashMap.put("gnt", Integer.valueOf(zzagaVar.zzcjy));
            hashMap.put("pt", Integer.valueOf(zzagaVar.zzcjz));
            hashMap.put("rm", Integer.valueOf(zzagaVar.zzcka));
            hashMap.put("riv", Integer.valueOf(zzagaVar.zzckb));
            Bundle bundle6 = new Bundle();
            bundle6.putString("build_build", zzagaVar.zzckg);
            bundle6.putString("build_device", zzagaVar.zzckh);
            Bundle bundle7 = new Bundle();
            bundle7.putBoolean("is_charging", zzagaVar.zzckd);
            bundle7.putDouble("battery_level", zzagaVar.zzckc);
            bundle6.putBundle("battery", bundle7);
            Bundle bundle8 = new Bundle();
            bundle8.putInt("active_network_state", zzagaVar.zzckf);
            bundle8.putBoolean("active_network_metered", zzagaVar.zzcke);
            if (zzagkVar != null) {
                Bundle bundle9 = new Bundle();
                bundle9.putInt("predicted_latency_micros", zzagkVar.zzckq);
                bundle = bundle3;
                bundle9.putLong("predicted_down_throughput_bps", zzagkVar.zzckr);
                bundle9.putLong("predicted_up_throughput_bps", zzagkVar.zzcks);
                bundle8.putBundle("predictions", bundle9);
            } else {
                bundle = bundle3;
            }
            bundle6.putBundle("network", bundle8);
            Bundle bundle10 = new Bundle();
            bundle10.putBoolean("is_browser_custom_tabs_capable", zzagaVar.zzcki);
            bundle6.putBundle("browser", bundle10);
            if (bundle4 != null) {
                Bundle bundle11 = new Bundle();
                bundle11.putString("runtime_free", Long.toString(bundle4.getLong("runtime_free_memory", -1L)));
                bundle11.putString("runtime_max", Long.toString(bundle4.getLong("runtime_max_memory", -1L)));
                bundle11.putString("runtime_total", Long.toString(bundle4.getLong("runtime_total_memory", -1L)));
                bundle11.putString("web_view_count", Integer.toString(bundle4.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle4.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle11.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle11.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle11.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle11.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle11.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle11.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle11.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle11.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle11.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle6.putBundle("android_mem_info", bundle11);
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBundle("parental_controls", bundle5);
            if (!TextUtils.isEmpty(zzagaVar.zzcjv)) {
                bundle12.putString("package_version", zzagaVar.zzcjv);
            }
            bundle6.putBundle("play_store", bundle12);
            hashMap.put("device", bundle6);
            Bundle bundle13 = new Bundle();
            bundle13.putString("doritos", zzaflVar.zzcgp);
            bundle13.putString("doritos_v2", zzaflVar.zzcgq);
            if (((Boolean) zzkb.zzik().zzd(zznk.zzayj)).booleanValue()) {
                if (zzaflVar.zzcgr != null) {
                    str2 = zzaflVar.zzcgr.getId();
                    z2 = zzaflVar.zzcgr.isLimitAdTrackingEnabled();
                } else {
                    str2 = null;
                    z2 = false;
                }
                if (TextUtils.isEmpty(str2)) {
                    zzkb.zzif();
                    bundle13.putString("pdid", zzamu.zzbd(context));
                    str3 = "pdidtype";
                    str4 = "ssaid";
                } else {
                    bundle13.putString("rdid", str2);
                    bundle13.putBoolean("is_lat", z2);
                    str3 = "idtype";
                    str4 = "adid";
                }
                bundle13.putString(str3, str4);
            }
            hashMap.put("pii", bundle13);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location != null) {
                zza(hashMap, location);
            } else if (zzaefVar.zzccv.versionCode >= 2 && zzaefVar.zzccv.zzaqe != null) {
                zza(hashMap, zzaefVar.zzccv.zzaqe);
            }
            if (zzaefVar.versionCode >= 2) {
                hashMap.put("quality_signals", zzaefVar.zzcda);
            }
            if (zzaefVar.versionCode >= 4 && zzaefVar.zzcdd) {
                hashMap.put("forceHttps", Boolean.valueOf(zzaefVar.zzcdd));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (zzaefVar.versionCode >= 5) {
                hashMap.put("u_sd", Float.valueOf(zzaefVar.zzagu));
                hashMap.put("sh", Integer.valueOf(zzaefVar.zzcdf));
                valueOf = Integer.valueOf(zzaefVar.zzcde);
            } else {
                hashMap.put("u_sd", Float.valueOf(zzagaVar.zzagu));
                hashMap.put("sh", Integer.valueOf(zzagaVar.zzcdf));
                valueOf = Integer.valueOf(zzagaVar.zzcde);
            }
            hashMap.put("sw", valueOf);
            if (zzaefVar.versionCode >= 6) {
                if (!TextUtils.isEmpty(zzaefVar.zzcdg)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(zzaefVar.zzcdg));
                    } catch (JSONException e2) {
                        zzakb.zzc("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(zzaefVar.zzcdh));
            }
            if (zzaefVar.versionCode >= 7) {
                hashMap.put("request_id", zzaefVar.zzcdi);
            }
            if (zzaefVar.versionCode >= 12 && !TextUtils.isEmpty(zzaefVar.zzcdm)) {
                hashMap.put("anchor", zzaefVar.zzcdm);
            }
            if (zzaefVar.versionCode >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(zzaefVar.zzcdn));
            }
            if (zzaefVar.versionCode >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(zzaefVar.zzcdt));
            }
            if (zzaefVar.versionCode >= 14 && zzaefVar.zzcdo > 0) {
                hashMap.put("target_api", Integer.valueOf(zzaefVar.zzcdo));
            }
            if (zzaefVar.versionCode >= 15) {
                hashMap.put("scroll_index", Integer.valueOf(zzaefVar.zzcdp == -1 ? -1 : zzaefVar.zzcdp));
            }
            if (zzaefVar.versionCode >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(zzaefVar.zzcdq));
            }
            if (zzaefVar.versionCode >= 18) {
                if (!TextUtils.isEmpty(zzaefVar.zzcdu)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(zzaefVar.zzcdu));
                    } catch (JSONException e3) {
                        zzakb.zzc("Problem creating json from app settings", e3);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(zzaefVar.zzbss));
            }
            if (zzaefVar.versionCode >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzaefVar.zzcdv));
            }
            zzang zzangVar = zzaefVar.zzacr;
            boolean z8 = zzaefVar.zzceh;
            boolean z9 = zzaflVar.zzcgv;
            boolean z10 = zzaefVar.zzcej;
            Bundle bundle14 = new Bundle();
            Bundle bundle15 = new Bundle();
            bundle15.putString("cl", "193400285");
            bundle15.putString("rapid_rc", "dev");
            bundle15.putString("rapid_rollup", "HEAD");
            bundle14.putBundle("build_meta", bundle15);
            bundle14.putString("mf", Boolean.toString(((Boolean) zzkb.zzik().zzd(zznk.zzbbm)).booleanValue()));
            bundle14.putBoolean("instant_app", z8);
            bundle14.putBoolean("lite", zzangVar.zzcvh);
            bundle14.putBoolean("local_service", z9);
            bundle14.putBoolean("is_privileged_process", z10);
            hashMap.put("sdk_env", bundle14);
            hashMap.put("cache_state", jSONObject);
            if (zzaefVar.versionCode >= 19) {
                hashMap.put("gct", zzaefVar.zzcdx);
            }
            if (zzaefVar.versionCode >= 21 && zzaefVar.zzcdy) {
                hashMap.put("de", "1");
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzayy)).booleanValue()) {
                String str8 = zzaefVar.zzacv.zzarb;
                if (!str8.equals("interstitial_mb") && !str8.equals("reward_mb")) {
                    z = false;
                    bundle2 = zzaefVar.zzcdz;
                    boolean z11 = bundle2 == null;
                    if (z && z11) {
                        Bundle bundle16 = new Bundle();
                        bundle16.putBundle("interstitial_pool", bundle2);
                        hashMap.put("counters", bundle16);
                    }
                }
                z = true;
                bundle2 = zzaefVar.zzcdz;
                if (bundle2 == null) {
                }
                if (z) {
                    Bundle bundle162 = new Bundle();
                    bundle162.putBundle("interstitial_pool", bundle2);
                    hashMap.put("counters", bundle162);
                }
            }
            if (zzaefVar.zzcea != null) {
                hashMap.put("gmp_app_id", zzaefVar.zzcea);
            }
            if (zzaefVar.zzceb == null) {
                str = "fbs_aiid";
                obj = "";
            } else if ("TIME_OUT".equals(zzaefVar.zzceb)) {
                str = "sai_timeout";
                obj = zzkb.zzik().zzd(zznk.zzaxt);
            } else {
                str = "fbs_aiid";
                obj = zzaefVar.zzceb;
            }
            hashMap.put(str, obj);
            if (zzaefVar.zzcec != null) {
                hashMap.put("fbs_aeid", zzaefVar.zzcec);
            }
            if (zzaefVar.versionCode >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(zzaefVar.zzcei));
            }
            String str9 = (String) zzkb.zzik().zzd(zznk.zzavo);
            if (str9 != null && !str9.isEmpty()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzkb.zzik().zzd(zznk.zzavp)).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    for (String str10 : str9.split(",")) {
                        hashMap2.put(str10, zzams.zzdd(str10));
                    }
                    hashMap.put("video_decoders", hashMap2);
                }
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbet)).booleanValue()) {
                hashMap.put("omid_v", com.google.android.gms.ads.internal.zzbv.zzfa().getVersion(context));
            }
            if (zzaefVar.zzcek != null && !zzaefVar.zzcek.isEmpty()) {
                hashMap.put("android_permissions", zzaefVar.zzcek);
            }
            if (zzakb.isLoggable(2)) {
                String valueOf2 = String.valueOf(com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap).toString(2));
                zzakb.v(valueOf2.length() != 0 ? "Ad Request JSON: ".concat(valueOf2) : new String("Ad Request JSON: "));
            }
            return com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap);
        } catch (JSONException e4) {
            String valueOf3 = String.valueOf(e4.getMessage());
            zzakb.zzdk(valueOf3.length() != 0 ? "Problem serializing ad request to JSON: ".concat(valueOf3) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzb(zzaej zzaejVar) throws JSONException {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (zzaejVar.zzbyq != null) {
            jSONObject.put("ad_base_url", zzaejVar.zzbyq);
        }
        if (zzaejVar.zzcet != null) {
            jSONObject.put("ad_size", zzaejVar.zzcet);
        }
        jSONObject.put("native", zzaejVar.zzare);
        if (zzaejVar.zzare) {
            str = zzaejVar.zzceo;
            str2 = "ad_json";
        } else {
            str = zzaejVar.zzceo;
            str2 = "ad_html";
        }
        jSONObject.put(str2, str);
        if (zzaejVar.zzcev != null) {
            jSONObject.put("debug_dialog", zzaejVar.zzcev);
        }
        if (zzaejVar.zzcfl != null) {
            jSONObject.put("debug_signals", zzaejVar.zzcfl);
        }
        if (zzaejVar.zzcep != -1) {
            double d = zzaejVar.zzcep;
            Double.isNaN(d);
            jSONObject.put("interstitial_timeout", d / 1000.0d);
        }
        if (zzaejVar.orientation != com.google.android.gms.ads.internal.zzbv.zzem().zzrm()) {
            str3 = zzaejVar.orientation == com.google.android.gms.ads.internal.zzbv.zzem().zzrl() ? "landscape" : "landscape";
            if (zzaejVar.zzbsn != null) {
                jSONObject.put("click_urls", zzm(zzaejVar.zzbsn));
            }
            if (zzaejVar.zzbso != null) {
                jSONObject.put("impression_urls", zzm(zzaejVar.zzbso));
            }
            if (zzaejVar.zzbsp != null) {
                jSONObject.put("downloaded_impression_urls", zzm(zzaejVar.zzbsp));
            }
            if (zzaejVar.zzces != null) {
                jSONObject.put("manual_impression_urls", zzm(zzaejVar.zzces));
            }
            if (zzaejVar.zzcey != null) {
                jSONObject.put("active_view", zzaejVar.zzcey);
            }
            jSONObject.put("ad_is_javascript", zzaejVar.zzcew);
            if (zzaejVar.zzcex != null) {
                jSONObject.put("ad_passback_url", zzaejVar.zzcex);
            }
            jSONObject.put("mediation", zzaejVar.zzceq);
            jSONObject.put("custom_render_allowed", zzaejVar.zzcez);
            jSONObject.put("content_url_opted_out", zzaejVar.zzcfa);
            jSONObject.put("content_vertical_opted_out", zzaejVar.zzcfm);
            jSONObject.put("prefetch", zzaejVar.zzcfb);
            if (zzaejVar.zzbsu != -1) {
                jSONObject.put("refresh_interval_milliseconds", zzaejVar.zzbsu);
            }
            if (zzaejVar.zzcer != -1) {
                jSONObject.put("mediation_config_cache_time_milliseconds", zzaejVar.zzcer);
            }
            if (!TextUtils.isEmpty(zzaejVar.zzamj)) {
                jSONObject.put("gws_query_id", zzaejVar.zzamj);
            }
            jSONObject.put("fluid", !zzaejVar.zzarf ? "height" : "");
            jSONObject.put("native_express", zzaejVar.zzarg);
            if (zzaejVar.zzcff != null) {
                jSONObject.put("video_start_urls", zzm(zzaejVar.zzcff));
            }
            if (zzaejVar.zzcfg != null) {
                jSONObject.put("video_complete_urls", zzm(zzaejVar.zzcfg));
            }
            if (zzaejVar.zzcfe != null) {
                zzaig zzaigVar = zzaejVar.zzcfe;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rb_type", zzaigVar.type);
                jSONObject2.put("rb_amount", zzaigVar.zzcmk);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("rewards", jSONArray);
            }
            jSONObject.put("use_displayed_impression", zzaejVar.zzcfh);
            jSONObject.put("auto_protection_configuration", zzaejVar.zzcfi);
            jSONObject.put("render_in_browser", zzaejVar.zzbss);
            jSONObject.put("disable_closable_area", zzaejVar.zzzm);
            return jSONObject;
        }
        str3 = "portrait";
        jSONObject.put("orientation", str3);
        if (zzaejVar.zzbsn != null) {
        }
        if (zzaejVar.zzbso != null) {
        }
        if (zzaejVar.zzbsp != null) {
        }
        if (zzaejVar.zzces != null) {
        }
        if (zzaejVar.zzcey != null) {
        }
        jSONObject.put("ad_is_javascript", zzaejVar.zzcew);
        if (zzaejVar.zzcex != null) {
        }
        jSONObject.put("mediation", zzaejVar.zzceq);
        jSONObject.put("custom_render_allowed", zzaejVar.zzcez);
        jSONObject.put("content_url_opted_out", zzaejVar.zzcfa);
        jSONObject.put("content_vertical_opted_out", zzaejVar.zzcfm);
        jSONObject.put("prefetch", zzaejVar.zzcfb);
        if (zzaejVar.zzbsu != -1) {
        }
        if (zzaejVar.zzcer != -1) {
        }
        if (!TextUtils.isEmpty(zzaejVar.zzamj)) {
        }
        jSONObject.put("fluid", !zzaejVar.zzarf ? "height" : "");
        jSONObject.put("native_express", zzaejVar.zzarg);
        if (zzaejVar.zzcff != null) {
        }
        if (zzaejVar.zzcfg != null) {
        }
        if (zzaejVar.zzcfe != null) {
        }
        jSONObject.put("use_displayed_impression", zzaejVar.zzcfh);
        jSONObject.put("auto_protection_configuration", zzaejVar.zzcfi);
        jSONObject.put("render_in_browser", zzaejVar.zzbss);
        jSONObject.put("disable_closable_area", zzaejVar.zzzm);
        return jSONObject;
    }

    private static JSONArray zzm(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    private static Integer zzv(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }
}
