package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class p96 implements i76 {

    /* renamed from: a */
    public final qz3 f22727a;

    /* renamed from: b */
    public final String f22728b;

    /* renamed from: c */
    public final ScheduledExecutorService f22729c;

    /* renamed from: d */
    public final g77 f22730d;

    /* renamed from: e */
    public final y23 f22731e;

    public p96(String str, y23 y23Var, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var, byte[] bArr) {
        this.f22728b = str;
        this.f22731e = y23Var;
        this.f22727a = qz3Var;
        this.f22729c = scheduledExecutorService;
        this.f22730d = g77Var;
    }

    /* renamed from: a */
    public final /* synthetic */ q96 m13567a(Exception exc) {
        this.f22727a.m11902u(exc, "AppSetIdInfoGmscoreSignal");
        return new q96(null, -1);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 43;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10789p2)).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10844u2)).booleanValue()) {
                f77 m10629n = s67.m10629n(ov6.m13909a(dk1.m24304e(null)), new w57() { // from class: com.daaw.n96
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        C2151m5 c2151m5 = (C2151m5) obj;
                        return c2151m5 == null ? s67.m10634i(new q96(null, -1)) : s67.m10634i(new q96(c2151m5.m16211a(), c2151m5.m16210b()));
                    }
                }, this.f22730d);
                if (((Boolean) pa3.f22767a.m16137e()).booleanValue()) {
                    m10629n = s67.m10628o(m10629n, ((Long) pa3.f22768b.m16137e()).longValue(), TimeUnit.MILLISECONDS, this.f22729c);
                }
                return s67.m10637f(m10629n, Exception.class, new ey6() { // from class: com.daaw.o96
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return p96.this.m13567a((Exception) obj);
                    }
                }, this.f22730d);
            }
        }
        return s67.m10634i(new q96(null, -1));
    }
}
