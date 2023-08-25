package com.daaw;

import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
/* loaded from: classes.dex */
public final class fh3 implements zg3 {

    /* renamed from: d */
    public static final Map f9603d = C1701ig.m19845e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    public final zzb f9604a;

    /* renamed from: b */
    public final bq3 f9605b;

    /* renamed from: c */
    public final iq3 f9606c;

    public fh3(zzb zzbVar, bq3 bq3Var, iq3 iq3Var) {
        this.f9604a = zzbVar;
        this.f9605b = bq3Var;
        this.f9606c = iq3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        int intValue = ((Integer) f9603d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f9604a.zzc()) {
                    this.f9604a.zzb(null);
                    return;
                } else if (intValue == 1) {
                    this.f9605b.m25922i(map);
                    return;
                } else if (intValue == 3) {
                    new eq3(a74Var, map).m23279i();
                    return;
                } else if (intValue == 4) {
                    new zp3(a74Var, map).m2008j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f9605b.m25923h(true);
                        return;
                    } else if (intValue != 7) {
                        k04.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f9606c.zzc();
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
        a74Var.mo6451K(i);
    }
}
