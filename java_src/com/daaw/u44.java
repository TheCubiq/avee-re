package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
/* loaded from: classes.dex */
public final class u44 implements zg3 {
    public boolean a;

    public static int b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzay.zzb();
                i = d04.D(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                k04.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    public static void c(m24 m24Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                m24Var.d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                k04.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            m24Var.b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            m24Var.B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            m24Var.C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            m24Var.f(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e9, code lost:
        if (r3 == (-1)) goto L195;
     */
    @Override // com.daaw.zg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u44.a(java.lang.Object, java.util.Map):void");
    }
}
