package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class q66 implements i76 {
    public final ky3 a;
    public final g77 b;
    public final Context c;

    public q66(ky3 ky3Var, g77 g77Var, Context context) {
        this.a = ky3Var;
        this.b = g77Var;
        this.c = context;
    }

    public final /* synthetic */ r66 a() {
        if (this.a.z(this.c)) {
            String j = this.a.j(this.c);
            String str = j == null ? "" : j;
            String h = this.a.h(this.c);
            String str2 = h == null ? "" : h;
            String f = this.a.f(this.c);
            String str3 = f == null ? "" : f;
            String g = this.a.g(this.c);
            return new r66(str, str2, str3, g == null ? "" : g, "TIME_OUT".equals(str2) ? (Long) zzba.zzc().b(g93.d0) : null);
        }
        return new r66(null, null, null, null, null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 34;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.b.M(new Callable() { // from class: com.daaw.p66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q66.this.a();
            }
        });
    }
}
