package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class rd5 {

    /* renamed from: c */
    public final Executor f25169c;

    /* renamed from: d */
    public final p04 f25170d;

    /* renamed from: f */
    public final ao6 f25172f;

    /* renamed from: a */
    public final String f25167a = (String) ua3.f28851b.m16137e();

    /* renamed from: b */
    public final Map f25168b = new HashMap();

    /* renamed from: e */
    public final boolean f25171e = ((Boolean) zzba.zzc().m23658b(g93.f10493N1)).booleanValue();

    /* renamed from: g */
    public final boolean f25173g = ((Boolean) zzba.zzc().m23658b(g93.f10523Q1)).booleanValue();

    /* renamed from: h */
    public final boolean f25174h = ((Boolean) zzba.zzc().m23658b(g93.f10870w6)).booleanValue();

    public rd5(Executor executor, p04 p04Var, ao6 ao6Var) {
        this.f25169c = executor;
        this.f25170d = p04Var;
        this.f25172f = ao6Var;
    }

    /* renamed from: a */
    public final void m11394a(Map map, boolean z) {
        if (map.isEmpty()) {
            k04.zze("Empty paramMap.");
            return;
        }
        final String m27313a = this.f25172f.m27313a(map);
        zze.zza(m27313a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f25171e) {
            if (!z || this.f25173g) {
                if (!parseBoolean || this.f25174h) {
                    this.f25169c.execute(new Runnable() { // from class: com.daaw.qd5
                        @Override // java.lang.Runnable
                        public final void run() {
                            rd5 rd5Var = rd5.this;
                            rd5Var.f25170d.zza(m27313a);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final String m11393b(Map map) {
        return this.f25172f.m27313a(map);
    }

    /* renamed from: c */
    public final ConcurrentHashMap m11392c() {
        return new ConcurrentHashMap(this.f25168b);
    }

    /* renamed from: d */
    public final void m11391d(Map map) {
        m11394a(map, true);
    }

    /* renamed from: e */
    public final void m11390e(Map map) {
        m11394a(map, false);
    }
}
