package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class rd5 {
    public final Executor c;
    public final p04 d;
    public final ao6 f;
    public final String a = (String) ua3.b.e();
    public final Map b = new HashMap();
    public final boolean e = ((Boolean) zzba.zzc().b(g93.N1)).booleanValue();
    public final boolean g = ((Boolean) zzba.zzc().b(g93.Q1)).booleanValue();
    public final boolean h = ((Boolean) zzba.zzc().b(g93.w6)).booleanValue();

    public rd5(Executor executor, p04 p04Var, ao6 ao6Var) {
        this.c = executor;
        this.d = p04Var;
        this.f = ao6Var;
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            k04.zze("Empty paramMap.");
            return;
        }
        final String a = this.f.a(map);
        zze.zza(a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.g) {
                if (!parseBoolean || this.h) {
                    this.c.execute(new Runnable() { // from class: com.daaw.qd5
                        @Override // java.lang.Runnable
                        public final void run() {
                            rd5 rd5Var = rd5.this;
                            rd5Var.d.zza(a);
                        }
                    });
                }
            }
        }
    }

    public final String b(Map map) {
        return this.f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.b);
    }

    public final void d(Map map) {
        a(map, true);
    }

    public final void e(Map map) {
        a(map, false);
    }
}
