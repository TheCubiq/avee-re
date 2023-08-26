package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzwy {
    public final long zzbsl;
    public final List<zzwx> zzbsm;
    public final List<String> zzbsn;
    public final List<String> zzbso;
    public final List<String> zzbsp;
    public final List<String> zzbsq;
    public final List<String> zzbsr;
    public final boolean zzbss;
    public final String zzbst;
    public final long zzbsu;
    public final String zzbsv;
    public final int zzbsw;
    public final int zzbsx;
    public final long zzbsy;
    public final boolean zzbsz;
    public final boolean zzbta;
    public final boolean zzbtb;
    public int zzbtc;
    public int zzbtd;
    public boolean zzbte;

    public zzwy(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public zzwy(List<zzwx> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.zzbsm = list;
        this.zzbsl = j;
        this.zzbsn = list2;
        this.zzbso = list3;
        this.zzbsp = list4;
        this.zzbsq = list5;
        this.zzbsr = list6;
        this.zzbss = z;
        this.zzbst = str;
        this.zzbsu = -1L;
        this.zzbtc = 0;
        this.zzbtd = 1;
        this.zzbsv = null;
        this.zzbsw = 0;
        this.zzbsx = -1;
        this.zzbsy = -1L;
        this.zzbsz = false;
        this.zzbta = false;
        this.zzbtb = false;
        this.zzbte = false;
    }

    public zzwy(JSONObject jSONObject) throws JSONException {
        if (zzakb.isLoggable(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzakb.v(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            zzwx zzwxVar = new zzwx(jSONArray.getJSONObject(i2));
            boolean z = true;
            if (zzwxVar.zzmf()) {
                this.zzbte = true;
            }
            arrayList.add(zzwxVar);
            if (i < 0) {
                Iterator<String> it = zzwxVar.zzbrt.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i = i2;
                }
            }
        }
        this.zzbtc = i;
        this.zzbtd = jSONArray.length();
        this.zzbsm = Collections.unmodifiableList(arrayList);
        this.zzbst = jSONObject.optString("qdata");
        this.zzbsx = jSONObject.optInt("fs_model_type", -1);
        this.zzbsy = jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.zzbsl = -1L;
            this.zzbsn = null;
            this.zzbso = null;
            this.zzbsp = null;
            this.zzbsq = null;
            this.zzbsr = null;
            this.zzbsu = -1L;
            this.zzbsv = null;
            this.zzbsw = 0;
            this.zzbsz = false;
            this.zzbss = false;
            this.zzbta = false;
            this.zzbtb = false;
            return;
        }
        this.zzbsl = optJSONObject.optLong("ad_network_timeout_millis", -1L);
        com.google.android.gms.ads.internal.zzbv.zzfd();
        this.zzbsn = zzxg.zza(optJSONObject, "click_urls");
        com.google.android.gms.ads.internal.zzbv.zzfd();
        this.zzbso = zzxg.zza(optJSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzbv.zzfd();
        this.zzbsp = zzxg.zza(optJSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzbv.zzfd();
        this.zzbsq = zzxg.zza(optJSONObject, "nofill_urls");
        com.google.android.gms.ads.internal.zzbv.zzfd();
        this.zzbsr = zzxg.zza(optJSONObject, "remote_ping_urls");
        this.zzbss = optJSONObject.optBoolean("render_in_browser", false);
        long optLong = optJSONObject.optLong("refresh", -1L);
        this.zzbsu = optLong > 0 ? 1000 * optLong : -1L;
        zzaig zza = zzaig.zza(optJSONObject.optJSONArray("rewards"));
        if (zza == null) {
            this.zzbsv = null;
            this.zzbsw = 0;
        } else {
            this.zzbsv = zza.type;
            this.zzbsw = zza.zzcmk;
        }
        this.zzbsz = optJSONObject.optBoolean("use_displayed_impression", false);
        this.zzbta = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        this.zzbtb = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }
}
