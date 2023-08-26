package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqc;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarr;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzue;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes.dex */
public final class zzf {
    private static final zzv<Object> zzbln = new zzl();
    public static final zzv<zzaqw> zzblo = zzg.zzbmg;
    public static final zzv<zzaqw> zzblp = zzh.zzbmg;
    public static final zzv<zzaqw> zzblq = zzi.zzbmg;
    public static final zzv<zzaqw> zzblr = new zzn();
    public static final zzv<zzaqw> zzbls = new zzo();
    public static final zzv<zzaqw> zzblt = zzj.zzbmg;
    public static final zzv<Object> zzblu = new zzp();
    public static final zzv<zzaqw> zzblv = new zzq();
    public static final zzv<zzaqw> zzblw = zzk.zzbmg;
    public static final zzv<zzaqw> zzblx = new zzr();
    public static final zzv<zzaqw> zzbly = new zzs();
    public static final zzv<zzapw> zzblz = new zzaqc();
    public static final zzv<zzapw> zzbma = new zzaqd();
    public static final zzv<zzaqw> zzbmb = new zze();
    public static final zzaf zzbmc = new zzaf();
    public static final zzv<zzaqw> zzbmd = new zzt();
    public static final zzv<zzaqw> zzbme = new zzu();
    public static final zzv<zzaqw> zzbmf = new zzm();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzarr zzarrVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzakb.zzdk("URL missing from httpTrack GMSG.");
        } else {
            new zzami(zzarrVar.getContext(), ((zzasa) zzarrVar).zztq().zzcw, str).zzqo();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzarz zzarzVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzci zzui = zzarzVar.zzui();
            if (zzui != null) {
                zzui.zzaa().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzakb.zzdk("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzue zzueVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzakb.zzdk("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzci zzui = ((zzarz) zzueVar).zzui();
            if (zzui != null && zzui.zzb(parse)) {
                parse = zzui.zza(parse, ((zzarr) zzueVar).getContext(), ((zzasb) zzueVar).getView(), ((zzarr) zzueVar).zzto());
            }
        } catch (zzcj unused) {
            String valueOf = String.valueOf(str);
            zzakb.zzdk(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzarr zzarrVar = (zzarr) zzueVar;
        new zzami(zzarrVar.getContext(), ((zzasa) zzueVar).zztq().zzcw, zzajb.zzb(parse, zzarrVar.getContext()).toString()).zzqo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzb(zzarr zzarrVar, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = zzarrVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(DataSchemeDataSource.SCHEME_DATA)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString(TtmlNode.ATTR_ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString(TtmlNode.TAG_P);
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String valueOf = String.valueOf(optString7);
                                zzakb.zzb(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e2) {
                            jSONException = e2;
                            str = "Error constructing openable urls response.";
                            zzakb.zzb(str, jSONException);
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        str = "Error parsing the intent data.";
                    }
                }
                ((zzue) zzarrVar).zza("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzue) zzarrVar).zza("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzue) zzarrVar).zza("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzc(zzarr zzarrVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzakb.zzdk("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzarrVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzue) zzarrVar).zza("openableURLs", hashMap);
    }
}
