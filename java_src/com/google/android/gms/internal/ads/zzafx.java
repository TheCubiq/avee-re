package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzafx {
    private String zzbhy;
    private final zzaef zzbuc;
    private List<String> zzcab;
    private String zzcae;
    private String zzchw;
    private String zzchx;
    private List<String> zzchy;
    private String zzchz;
    private String zzcia;
    private String zzcib;
    private List<String> zzcic;
    private List<String> zzcid;
    private zzaig zzcip;
    private List<String> zzciq;
    private List<String> zzcir;
    private String zzciu;
    private List<String> zzciv;
    private boolean zzciw;
    private String zzcix;
    private zzaiq zzciy;
    private boolean zzciz;
    private boolean zzcja;
    private boolean zzcjb;
    private boolean zzcjc;
    private zzael zzxe;
    private long zzcie = -1;
    private boolean zzcif = false;
    private final long zzcig = -1;
    private long zzcih = -1;
    private int mOrientation = -1;
    private boolean zzcii = false;
    private boolean zzcij = false;
    private boolean zzcik = false;
    private boolean zzcil = true;
    private boolean zzcim = true;
    private String zzcin = "";
    private boolean zzcio = false;
    private boolean zzbtn = false;
    private boolean zzcis = false;
    private boolean zzcit = false;

    public zzafx(zzaef zzaefVar, String str) {
        this.zzchx = str;
        this.zzbuc = zzaefVar;
    }

    private static String zza(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static long zzb(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        String str2 = list.get(0);
        try {
            return Float.parseFloat(str2) * 1000.0f;
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            zzakb.zzdk(sb.toString());
            return -1L;
        }
    }

    private static List<String> zzc(Map<String, List<String>> map, String str) {
        String str2;
        List<String> list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    private static boolean zzd(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf(list.get(0)).booleanValue();
    }

    public final zzaej zza(long j, boolean z) {
        String str;
        int i;
        zzaef zzaefVar = this.zzbuc;
        String str2 = this.zzchx;
        String str3 = this.zzbhy;
        List<String> list = this.zzchy;
        List<String> list2 = this.zzcic;
        long j2 = this.zzcie;
        boolean z2 = this.zzcif;
        List<String> list3 = this.zzcab;
        long j3 = this.zzcih;
        int i2 = this.mOrientation;
        String str4 = this.zzchw;
        String str5 = this.zzcia;
        String str6 = this.zzcib;
        boolean z3 = this.zzcii;
        boolean z4 = this.zzcij;
        boolean z5 = this.zzcik;
        boolean z6 = this.zzcil;
        String str7 = this.zzcin;
        boolean z7 = this.zzcio;
        boolean z8 = this.zzbtn;
        zzaig zzaigVar = this.zzcip;
        List<String> list4 = this.zzciq;
        List<String> list5 = this.zzcir;
        boolean z9 = this.zzcis;
        zzael zzaelVar = this.zzxe;
        boolean z10 = this.zzcit;
        String str8 = this.zzciu;
        List<String> list6 = this.zzciv;
        boolean z11 = this.zzciw;
        String str9 = this.zzcix;
        zzaiq zzaiqVar = this.zzciy;
        String str10 = this.zzchz;
        boolean z12 = this.zzcim;
        boolean z13 = this.zzciz;
        boolean z14 = this.zzcja;
        if (z) {
            str = str4;
            i = 2;
        } else {
            str = str4;
            i = 1;
        }
        return new zzaej(zzaefVar, str2, str3, list, list2, j2, z2, -1L, list3, j3, i2, str, j, str5, str6, z3, z4, z5, z6, false, str7, z7, z8, zzaigVar, list4, list5, z9, zzaelVar, z10, str8, list6, z11, str9, zzaiqVar, str10, z12, z13, z14, i, this.zzcjb, this.zzcid, this.zzcjc, this.zzcae);
    }

    public final void zza(String str, Map<String, List<String>> map, String str2) {
        this.zzbhy = str2;
        zzl(map);
    }

    public final void zzl(Map<String, List<String>> map) {
        int zzrl;
        this.zzchw = zza(map, "X-Afma-Ad-Size");
        this.zzcix = zza(map, "X-Afma-Ad-Slot-Size");
        List<String> zzc = zzc(map, "X-Afma-Click-Tracking-Urls");
        if (zzc != null) {
            this.zzchy = zzc;
        }
        this.zzchz = zza(map, "X-Afma-Debug-Signals");
        List<String> list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.zzcia = list.get(0);
        }
        List<String> zzc2 = zzc(map, "X-Afma-Tracking-Urls");
        if (zzc2 != null) {
            this.zzcic = zzc2;
        }
        List<String> zzc3 = zzc(map, "X-Afma-Downloaded-Impression-Urls");
        if (zzc3 != null) {
            this.zzcid = zzc3;
        }
        long zzb = zzb(map, "X-Afma-Interstitial-Timeout");
        if (zzb != -1) {
            this.zzcie = zzb;
        }
        this.zzcif |= zzd(map, "X-Afma-Mediation");
        List<String> zzc4 = zzc(map, "X-Afma-Manual-Tracking-Urls");
        if (zzc4 != null) {
            this.zzcab = zzc4;
        }
        long zzb2 = zzb(map, "X-Afma-Refresh-Rate");
        if (zzb2 != -1) {
            this.zzcih = zzb2;
        }
        List<String> list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrm();
            } else if ("landscape".equalsIgnoreCase(str)) {
                zzrl = com.google.android.gms.ads.internal.zzbv.zzem().zzrl();
            }
            this.mOrientation = zzrl;
        }
        this.zzcib = zza(map, "X-Afma-ActiveView");
        List<String> list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.zzcik = Boolean.valueOf(list3.get(0)).booleanValue();
        }
        this.zzcii |= zzd(map, "X-Afma-Custom-Rendering-Allowed");
        this.zzcij = "native".equals(zza(map, "X-Afma-Ad-Format"));
        List<String> list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.zzcil = Boolean.valueOf(list4.get(0)).booleanValue();
        }
        List<String> list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.zzcim = Boolean.valueOf(list5.get(0)).booleanValue();
        }
        List<String> list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.zzcin = list6.get(0);
        }
        String zza = zza(map, "X-Afma-Fluid");
        if (zza != null && zza.equals("height")) {
            this.zzcio = true;
        }
        this.zzbtn = "native_express".equals(zza(map, "X-Afma-Ad-Format"));
        this.zzcip = zzaig.zzce(zza(map, "X-Afma-Rewards"));
        if (this.zzciq == null) {
            this.zzciq = zzc(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.zzcir == null) {
            this.zzcir = zzc(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.zzcis |= zzd(map, "X-Afma-Use-Displayed-Impression");
        this.zzcit |= zzd(map, "X-Afma-Auto-Collect-Location");
        this.zzciu = zza(map, "Set-Cookie");
        String zza2 = zza(map, "X-Afma-Auto-Protection-Configuration");
        if (zza2 == null || TextUtils.isEmpty(zza2)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.zzcia)) {
                buildUpon.appendQueryParameter("debugDialog", this.zzcia);
            }
            boolean booleanValue = ((Boolean) zzkb.zzik().zzd(zznk.zzaum)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.zzxe = new zzael(booleanValue, Arrays.asList(sb.toString()));
        } else {
            try {
                this.zzxe = zzael.zzl(new JSONObject(zza2));
            } catch (JSONException e) {
                zzakb.zzc("Error parsing configuration JSON", e);
                this.zzxe = new zzael();
            }
        }
        List<String> zzc5 = zzc(map, "X-Afma-Remote-Ping-Urls");
        if (zzc5 != null) {
            this.zzciv = zzc5;
        }
        String zza3 = zza(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(zza3)) {
            try {
                this.zzciy = zzaiq.zzo(new JSONObject(zza3));
            } catch (JSONException e2) {
                zzakb.zzc("Error parsing safe browsing header", e2);
            }
        }
        this.zzciw |= zzd(map, "X-Afma-Render-In-Browser");
        String zza4 = zza(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(zza4)) {
            try {
                this.zzciz = new JSONObject(zza4).getBoolean("never_pool");
            } catch (JSONException e3) {
                zzakb.zzc("Error parsing interstitial pool header", e3);
            }
        }
        this.zzcja = zzd(map, "X-Afma-Custom-Close-Blocked");
        this.zzcjb = zzd(map, "X-Afma-Enable-Omid");
        this.zzcjc = zzd(map, "X-Afma-Disable-Closable-Area");
        this.zzcae = zza(map, "X-Afma-Omid-Settings");
    }
}
