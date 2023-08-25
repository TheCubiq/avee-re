package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k54 implements zg3 {
    public static final Integer b(Map map, String str) {
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
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        j54 j54Var;
        y44 d;
        y24 y24Var = (y24) obj;
        if (k04.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            k04.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        z44 zzy = zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.h(y24Var)) {
                return;
            }
            k04.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b = b(map, "periodicReportIntervalMs");
        Integer b2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b3 = b(map, "exoPlayerIdleIntervalMs");
        x24 x24Var = new x24((String) map.get("flags"));
        boolean z = x24Var.n;
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
                        d = null;
                        break;
                    }
                    y44 y44Var = (y44) it.next();
                    if (y44Var.c == y24Var && str.equals(y44Var.c())) {
                        d = y44Var;
                        break;
                    }
                }
            } else {
                d = zzy.d(y24Var);
            }
            if (d != null) {
                k04.zzj("Precache task is already running.");
                return;
            } else if (y24Var.zzm() == null) {
                k04.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer b4 = b(map, "player");
                if (b4 == null) {
                    b4 = 0;
                }
                if (b != null) {
                    y24Var.A(b.intValue());
                }
                if (b2 != null) {
                    y24Var.M(b2.intValue());
                }
                if (b3 != null) {
                    y24Var.W(b3.intValue());
                }
                int intValue = b4.intValue();
                s44 s44Var = y24Var.zzm().zzb;
                if (intValue > 0) {
                    int Z = p24.Z();
                    j54Var = Z < x24Var.h ? new s54(y24Var, x24Var) : Z < x24Var.b ? new p54(y24Var, x24Var) : new n54(y24Var);
                } else {
                    j54Var = new m54(y24Var);
                }
                new y44(y24Var, j54Var, str, strArr).zzb();
            }
        } else {
            y44 d2 = zzy.d(y24Var);
            if (d2 == null) {
                k04.zzj("Precache must specify a source.");
                return;
            }
            j54Var = d2.d;
        }
        Integer b5 = b(map, "minBufferMs");
        if (b5 != null) {
            j54Var.r(b5.intValue());
        }
        Integer b6 = b(map, "maxBufferMs");
        if (b6 != null) {
            j54Var.q(b6.intValue());
        }
        Integer b7 = b(map, "bufferForPlaybackMs");
        if (b7 != null) {
            j54Var.o(b7.intValue());
        }
        Integer b8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b8 != null) {
            j54Var.p(b8.intValue());
        }
    }
}
