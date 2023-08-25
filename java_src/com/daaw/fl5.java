package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbj;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class fl5 {

    /* renamed from: a */
    public final g77 f9670a;

    /* renamed from: b */
    public final g77 f9671b;

    /* renamed from: c */
    public final dm5 f9672c;

    /* renamed from: d */
    public final qz7 f9673d;

    public fl5(g77 g77Var, g77 g77Var2, dm5 dm5Var, qz7 qz7Var) {
        this.f9670a = g77Var;
        this.f9671b = g77Var2;
        this.f9672c = dm5Var;
        this.f9673d = qz7Var;
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m22504a(zzcbj zzcbjVar) {
        return this.f9672c.m24215c(zzcbjVar, ((Long) zzba.zzc().m23658b(g93.f10906z9)).longValue());
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m22503b(zzcbj zzcbjVar, int i, pk5 pk5Var) {
        return ((mn5) this.f9673d.zzb()).m15891g3(zzcbjVar, i);
    }

    /* renamed from: c */
    public final f77 m22502c(final zzcbj zzcbjVar) {
        String str = zzcbjVar.f36958u;
        zzt.zzp();
        f77 m10635h = zzs.zzy(str) ? s67.m10635h(new pk5(1, "Ads service proxy force local")) : s67.m10636g(s67.m10631l(new v57() { // from class: com.daaw.cl5
            @Override // com.daaw.v57
            public final f77 zza() {
                return fl5.this.m22504a(zzcbjVar);
            }
        }, this.f9670a), ExecutionException.class, new w57() { // from class: com.daaw.dl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable th = executionException;
                if (cause != null) {
                    th = executionException.getCause();
                }
                return s67.m10635h(th);
            }
        }, this.f9671b);
        final int callingUid = Binder.getCallingUid();
        return s67.m10636g(m10635h, pk5.class, new w57() { // from class: com.daaw.el5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fl5.this.m22503b(zzcbjVar, callingUid, (pk5) obj);
            }
        }, this.f9671b);
    }
}
