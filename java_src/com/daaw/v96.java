package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class v96 implements i76 {

    /* renamed from: a */
    public final Context f30059a;

    /* renamed from: b */
    public final qz3 f30060b;

    /* renamed from: c */
    public final ScheduledExecutorService f30061c;

    /* renamed from: d */
    public final Executor f30062d;

    /* renamed from: e */
    public final String f30063e;

    /* renamed from: f */
    public final hz3 f30064f;

    public v96(hz3 hz3Var, int i, Context context, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f30064f = hz3Var;
        this.f30059a = context;
        this.f30060b = qz3Var;
        this.f30061c = scheduledExecutorService;
        this.f30062d = executor;
        this.f30063e = str;
    }

    /* renamed from: a */
    public final /* synthetic */ w96 m7311a(Exception exc) {
        this.f30060b.m11902u(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 44;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10637f((j67) s67.m10628o(s67.m10630m(j67.m18784D(s67.m10631l(new v57() { // from class: com.daaw.s96
            @Override // com.daaw.v57
            public final f77 zza() {
                return s67.m10634i(null);
            }
        }, this.f30062d)), new ey6() { // from class: com.daaw.t96
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new w96(str);
            }
        }, this.f30062d), ((Long) zzba.zzc().m23658b(g93.f10512P0)).longValue(), TimeUnit.MILLISECONDS, this.f30061c), Exception.class, new ey6() { // from class: com.daaw.u96
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                v96.this.m7311a((Exception) obj);
                return null;
            }
        }, m77.m16187b());
    }
}
