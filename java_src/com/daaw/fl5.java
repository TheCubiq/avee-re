package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbj;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class fl5 {
    public final g77 a;
    public final g77 b;
    public final dm5 c;
    public final qz7 d;

    public fl5(g77 g77Var, g77 g77Var2, dm5 dm5Var, qz7 qz7Var) {
        this.a = g77Var;
        this.b = g77Var2;
        this.c = dm5Var;
        this.d = qz7Var;
    }

    public final /* synthetic */ f77 a(zzcbj zzcbjVar) {
        return this.c.c(zzcbjVar, ((Long) zzba.zzc().b(g93.z9)).longValue());
    }

    public final /* synthetic */ f77 b(zzcbj zzcbjVar, int i, pk5 pk5Var) {
        return ((mn5) this.d.zzb()).g3(zzcbjVar, i);
    }

    public final f77 c(final zzcbj zzcbjVar) {
        String str = zzcbjVar.u;
        zzt.zzp();
        f77 h = zzs.zzy(str) ? s67.h(new pk5(1, "Ads service proxy force local")) : s67.g(s67.l(new v57() { // from class: com.daaw.cl5
            @Override // com.daaw.v57
            public final f77 zza() {
                return fl5.this.a(zzcbjVar);
            }
        }, this.a), ExecutionException.class, new w57() { // from class: com.daaw.dl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable th = executionException;
                if (cause != null) {
                    th = executionException.getCause();
                }
                return s67.h(th);
            }
        }, this.b);
        final int callingUid = Binder.getCallingUid();
        return s67.g(h, pk5.class, new w57() { // from class: com.daaw.el5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fl5.this.b(zzcbjVar, callingUid, (pk5) obj);
            }
        }, this.b);
    }
}
