package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k54 implements zg3 {
    /* renamed from: b */
    public static final Integer m18044b(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                k04.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        j54 j54Var;
        y44 m2820d;
        y24 y24Var = (y24) obj;
        if (k04.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            k04.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        z44 zzy = zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.m2817h(y24Var)) {
                return;
            }
            k04.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer m18044b = m18044b(map, "periodicReportIntervalMs");
        Integer m18044b2 = m18044b(map, "exoPlayerRenderingIntervalMs");
        Integer m18044b3 = m18044b(map, "exoPlayerIdleIntervalMs");
        x24 x24Var = new x24((String) map.get("flags"));
        boolean z = x24Var.f32035n;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    k04.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        m2820d = null;
                        break;
                    }
                    y44 y44Var = (y44) it.next();
                    if (y44Var.f33350c == y24Var && str.equals(y44Var.m4126c())) {
                        m2820d = y44Var;
                        break;
                    }
                }
            } else {
                m2820d = zzy.m2820d(y24Var);
            }
            if (m2820d != null) {
                k04.zzj("Precache task is already running.");
                return;
            } else if (y24Var.zzm() == null) {
                k04.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer m18044b4 = m18044b(map, "player");
                if (m18044b4 == null) {
                    m18044b4 = 0;
                }
                if (m18044b != null) {
                    y24Var.mo4246A(m18044b.intValue());
                }
                if (m18044b2 != null) {
                    y24Var.mo4243M(m18044b2.intValue());
                }
                if (m18044b3 != null) {
                    y24Var.mo4242W(m18044b3.intValue());
                }
                int intValue = m18044b4.intValue();
                s44 s44Var = y24Var.zzm().zzb;
                if (intValue > 0) {
                    int m13730Z = p24.m13730Z();
                    j54Var = m13730Z < x24Var.f32029h ? new s54(y24Var, x24Var) : m13730Z < x24Var.f32023b ? new p54(y24Var, x24Var) : new n54(y24Var);
                } else {
                    j54Var = new m54(y24Var);
                }
                new y44(y24Var, j54Var, str, strArr).zzb();
            }
        } else {
            y44 m2820d2 = zzy.m2820d(y24Var);
            if (m2820d2 == null) {
                k04.zzj("Precache must specify a source.");
                return;
            }
            j54Var = m2820d2.f33351d;
        }
        Integer m18044b5 = m18044b(map, "minBufferMs");
        if (m18044b5 != null) {
            j54Var.mo10699r(m18044b5.intValue());
        }
        Integer m18044b6 = m18044b(map, "maxBufferMs");
        if (m18044b6 != null) {
            j54Var.mo10700q(m18044b6.intValue());
        }
        Integer m18044b7 = m18044b(map, "bufferForPlaybackMs");
        if (m18044b7 != null) {
            j54Var.mo10702o(m18044b7.intValue());
        }
        Integer m18044b8 = m18044b(map, "bufferForPlaybackAfterRebufferMs");
        if (m18044b8 != null) {
            j54Var.mo10701p(m18044b8.intValue());
        }
    }
}
