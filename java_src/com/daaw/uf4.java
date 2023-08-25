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

    /* renamed from: a */
    public final Context f29028a;

    /* renamed from: b */
    public final zzg f29029b = zzt.zzo().m11915h();

    public uf4(Context context) {
        this.f29028a = context;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (parseBoolean) {
                try {
                    if (((Boolean) zzba.zzc().m23658b(g93.f10877x2)).booleanValue()) {
                        kv6.m17404k(this.f29028a).m17403l();
                    }
                    if (((Boolean) zzba.zzc().m23658b(g93.f10424G2)).booleanValue()) {
                        kv6.m17404k(this.f29028a).m17402m();
                    }
                    if (((Boolean) zzba.zzc().m23658b(g93.f10888y2)).booleanValue()) {
                        lv6.m16482j(this.f29028a).m16481k();
                        if (((Boolean) zzba.zzc().m23658b(g93.f10384C2)).booleanValue()) {
                            lv6.m16482j(this.f29028a).m16480l();
                        }
                        if (((Boolean) zzba.zzc().m23658b(g93.f10394D2)).booleanValue()) {
                            lv6.m16482j(this.f29028a).m16479m();
                        }
                    }
                } catch (IOException e) {
                    zzt.zzo().m11902u(e, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10809r0)).booleanValue()) {
                this.f29029b.zzH(parseBoolean);
                if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue() && parseBoolean) {
                    this.f29028a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10754m0)).booleanValue()) {
            zzt.zzn().m17320w(bundle);
        }
    }
}
