package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class uf4 implements kf4 {
    public final Context a;
    public final zzg b = zzt.zzo().h();

    public uf4(Context context) {
        this.a = context;
    }

    @Override // com.daaw.kf4
    public final void a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (parseBoolean) {
                try {
                    if (((Boolean) zzba.zzc().b(g93.x2)).booleanValue()) {
                        kv6.k(this.a).l();
                    }
                    if (((Boolean) zzba.zzc().b(g93.G2)).booleanValue()) {
                        kv6.k(this.a).m();
                    }
                    if (((Boolean) zzba.zzc().b(g93.y2)).booleanValue()) {
                        lv6.j(this.a).k();
                        if (((Boolean) zzba.zzc().b(g93.C2)).booleanValue()) {
                            lv6.j(this.a).l();
                        }
                        if (((Boolean) zzba.zzc().b(g93.D2)).booleanValue()) {
                            lv6.j(this.a).m();
                        }
                    }
                } catch (IOException e) {
                    zzt.zzo().u(e, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) zzba.zzc().b(g93.r0)).booleanValue()) {
                this.b.zzH(parseBoolean);
                if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue() && parseBoolean) {
                    this.a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) zzba.zzc().b(g93.m0)).booleanValue()) {
            zzt.zzn().w(bundle);
        }
    }
}
