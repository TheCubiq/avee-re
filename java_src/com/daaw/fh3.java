package com.daaw;

import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
/* loaded from: classes.dex */
public final class fh3 implements zg3 {
    public static final Map d = ig.e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    public final zzb a;
    public final bq3 b;
    public final iq3 c;

    public fh3(zzb zzbVar, bq3 bq3Var, iq3 iq3Var) {
        this.a = zzbVar;
        this.b = bq3Var;
        this.c = iq3Var;
    }

    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        int intValue = ((Integer) d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.a.zzc()) {
                    this.a.zzb(null);
                    return;
                } else if (intValue == 1) {
                    this.b.i(map);
                    return;
                } else if (intValue == 3) {
                    new eq3(a74Var, map).i();
                    return;
                } else if (intValue == 4) {
                    new zp3(a74Var, map).j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.b.h(true);
                        return;
                    } else if (intValue != 7) {
                        k04.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (a74Var == null) {
            k04.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        a74Var.K(i);
    }
}
