package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class y16 implements i76 {

    /* renamed from: a */
    public final qz3 f33217a;

    /* renamed from: b */
    public InterfaceC2013l5 f33218b;

    /* renamed from: c */
    public final ScheduledExecutorService f33219c;

    /* renamed from: d */
    public final g77 f33220d;

    /* renamed from: e */
    public final Context f33221e;

    public y16(Context context, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10833t2)).booleanValue()) {
            this.f33218b = C1912k5.m18047a(context);
        }
        this.f33221e = context;
        this.f33217a = qz3Var;
        this.f33219c = scheduledExecutorService;
        this.f33220d = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 11;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10789p2)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10844u2)).booleanValue()) {
                if (((Boolean) zzba.zzc().m23658b(g93.f10800q2)).booleanValue()) {
                    rj1<C2151m5> m6045a = ((Boolean) zzba.zzc().m23658b(g93.f10833t2)).booleanValue() ? wj6.m6045a(this.f33221e) : this.f33218b.mo3453a();
                    if (m6045a == null) {
                        return s67.m10634i(new z16(null, -1));
                    }
                    f77 m10629n = s67.m10629n(ov6.m13909a(m6045a), new w57() { // from class: com.daaw.w16
                        @Override // com.daaw.w57
                        public final f77 zza(Object obj) {
                            C2151m5 c2151m5 = (C2151m5) obj;
                            return c2151m5 == null ? s67.m10634i(new z16(null, -1)) : s67.m10634i(new z16(c2151m5.m16211a(), c2151m5.m16210b()));
                        }
                    }, z04.f34310f);
                    if (((Boolean) zzba.zzc().m23658b(g93.f10811r2)).booleanValue()) {
                        m10629n = s67.m10628o(m10629n, ((Long) zzba.zzc().m23658b(g93.f10822s2)).longValue(), TimeUnit.MILLISECONDS, this.f33219c);
                    }
                    return s67.m10637f(m10629n, Exception.class, new ey6() { // from class: com.daaw.x16
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            y16.this.f33217a.m11902u((Exception) obj, "AppSetIdInfoSignal");
                            return new z16(null, -1);
                        }
                    }, this.f33220d);
                }
                return s67.m10630m(ov6.m13909a(this.f33218b.mo3453a()), new ey6() { // from class: com.daaw.v16
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        C2151m5 c2151m5 = (C2151m5) obj;
                        return new z16(c2151m5.m16211a(), c2151m5.m16210b());
                    }
                }, z04.f34310f);
            }
        }
        return s67.m10634i(new z16(null, -1));
    }
}
