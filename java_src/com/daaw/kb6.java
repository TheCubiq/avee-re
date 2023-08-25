package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class kb6 implements i76 {

    /* renamed from: a */
    public final qz3 f16121a;

    /* renamed from: b */
    public final boolean f16122b;

    /* renamed from: c */
    public final boolean f16123c;

    /* renamed from: d */
    public final ScheduledExecutorService f16124d;

    /* renamed from: e */
    public final g77 f16125e;

    /* renamed from: f */
    public final String f16126f;

    /* renamed from: g */
    public final fz3 f16127g;

    public kb6(qz3 qz3Var, boolean z, boolean z2, fz3 fz3Var, g77 g77Var, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f16121a = qz3Var;
        this.f16122b = z;
        this.f16123c = z2;
        this.f16127g = fz3Var;
        this.f16125e = g77Var;
        this.f16126f = str;
        this.f16124d = scheduledExecutorService;
    }

    /* renamed from: a */
    public final /* synthetic */ lb6 m17836a(Exception exc) {
        this.f16121a.m11902u(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 50;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if ((!((Boolean) zzba.zzc().m23658b(g93.f10398D6)).booleanValue() || !this.f16123c) && this.f16122b) {
            return s67.m10637f(s67.m10628o(s67.m10630m(s67.m10634i(null), new ey6() { // from class: com.daaw.ib6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new lb6(str);
                }
            }, this.f16125e), ((Long) sb3.f26059c.m16137e()).longValue(), TimeUnit.MILLISECONDS, this.f16124d), Exception.class, new ey6() { // from class: com.daaw.jb6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    kb6.this.m17836a((Exception) obj);
                    return null;
                }
            }, this.f16125e);
        }
        return s67.m10634i(null);
    }
}
