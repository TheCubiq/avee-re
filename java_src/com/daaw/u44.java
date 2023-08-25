package com.daaw;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u44 implements zg3 {

    /* renamed from: a */
    public boolean f28543a;

    /* renamed from: b */
    public static int m8581b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzay.zzb();
                i = d04.m24833D(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                k04.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    /* renamed from: c */
    public static void m8580c(m24 m24Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                m24Var.m16287d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                k04.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            m24Var.m16289b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            m24Var.m16292B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            m24Var.m16291C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            m24Var.m16285f(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e9, code lost:
        if (r3 == (-1)) goto L195;
     */
    @Override // com.daaw.zg3
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        int min;
        int zzi;
        int i;
        String[] split;
        y24 y24Var = (y24) obj;
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer m16276o = (y24Var.mo4238l0() == null || y24Var.mo4238l0().m15569a() == null) ? null : y24Var.mo4238l0().m15569a().m16276o();
        if (valueOf != null && m16276o != null && !valueOf.equals(m16276o)) {
            k04.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, m16276o));
            return;
        }
        String str = (String) map.get("action");
        if (str == null) {
            k04.zzj("Action missing from video GMSG.");
            return;
        }
        if (k04.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            k04.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                k04.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                y24Var.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                k04.zzj("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                k04.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                y24Var.mo4245F(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                k04.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
        } else if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                k04.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                y24Var.mo6434T("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, zzch.zza(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            y24Var.mo6434T("onVideoEvent", hashMap3);
        } else {
            n24 mo4238l0 = y24Var.mo4238l0();
            if (mo4238l0 == null) {
                k04.zzj("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = y24Var.getContext();
                int m8581b = m8581b(context, map, "x", 0);
                int m8581b2 = m8581b(context, map, "y", 0);
                int m8581b3 = m8581b(context, map, "w", -1);
                y83 y83Var = g93.f10790p3;
                if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
                    min = m8581b3 == -1 ? y24Var.zzj() : Math.min(m8581b3, y24Var.zzj());
                } else {
                    if (zze.zzc()) {
                        zze.zza("Calculate width with original width " + m8581b3 + ", videoHost.getVideoBoundingWidth() " + y24Var.zzj() + ", x " + m8581b + ".");
                    }
                    min = Math.min(m8581b3, y24Var.zzj() - m8581b);
                }
                int m8581b4 = m8581b(context, map, "h", -1);
                if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
                    zzi = y24Var.zzi();
                } else {
                    if (zze.zzc()) {
                        zze.zza("Calculate height with original height " + m8581b4 + ", videoHost.getVideoBoundingHeight() " + y24Var.zzi() + ", y " + m8581b2 + ".");
                    }
                    zzi = y24Var.zzi() - m8581b2;
                }
                zzi = Math.min(m8581b4, zzi);
                int i2 = zzi;
                try {
                    i = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || mo4238l0.m15569a() != null) {
                    mo4238l0.m15568b(m8581b, m8581b2, min, i2);
                    return;
                }
                mo4238l0.m15567c(m8581b, m8581b2, min, i2, i, parseBoolean, new x24((String) map.get("flags")), valueOf);
                m24 m15569a = mo4238l0.m15569a();
                if (m15569a != null) {
                    m8580c(m15569a, map);
                    return;
                }
                return;
            }
            z74 zzs = y24Var.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get("currentTime");
                    if (str6 == null) {
                        k04.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.m2689k3(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused4) {
                        k04.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    zzs.m2694b();
                    return;
                }
            }
            m24 m15569a2 = mo4238l0.m15569a();
            if (m15569a2 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                y24Var.mo6434T("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context2 = y24Var.getContext();
                int m8581b5 = m8581b(context2, map, "x", 0);
                int m8581b6 = m8581b(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, m8581b5, m8581b6, 0);
                m15569a2.m16293A(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    k04.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    m15569a2.m16265z((int) (Float.parseFloat(str7) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    k04.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                }
            } else if ("hide".equals(str)) {
                m15569a2.setVisibility(4);
            } else if ("load".equals(str)) {
                m15569a2.m16270u();
            } else if ("loadControl".equals(str)) {
                m8580c(m15569a2, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    m15569a2.m16269v();
                } else {
                    m15569a2.m16280k();
                }
            } else if ("pause".equals(str)) {
                m15569a2.m16267x();
            } else if ("play".equals(str)) {
                m15569a2.m16266y();
            } else if ("show".equals(str)) {
                m15569a2.setVisibility(0);
            } else if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        k04.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str8};
                String str9 = (String) map.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            strArr2[i3] = jSONArray.getString(i3);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        k04.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                        strArr = new String[]{str8};
                    }
                }
                if (num != null) {
                    y24Var.mo4246A(num.intValue());
                }
                m15569a2.m16284g(str8, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = y24Var.getContext();
                m15569a2.m16281j(m8581b(context3, map, "dx", 0), m8581b(context3, map, "dy", 0));
                if (this.f28543a) {
                    return;
                }
                y24Var.mo4239k();
                this.f28543a = true;
            } else if ("volume".equals(str)) {
                String str10 = (String) map.get("volume");
                if (str10 == null) {
                    k04.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    m15569a2.m16282i(Float.parseFloat(str10));
                } catch (NumberFormatException unused8) {
                    k04.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                }
            } else if ("watermark".equals(str)) {
                m15569a2.m16274q();
            } else {
                k04.zzj("Unknown video action: ".concat(str));
            }
        }
    }
}
