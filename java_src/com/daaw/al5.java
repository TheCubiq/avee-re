package com.daaw;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class al5 {
    public final g77 a;
    public final dk5 b;
    public final qz7 c;
    public final vo6 d;
    public final Context e;
    public final zzchu f;

    public al5(g77 g77Var, dk5 dk5Var, qz7 qz7Var, vo6 vo6Var, Context context, zzchu zzchuVar) {
        this.a = g77Var;
        this.b = dk5Var;
        this.c = qz7Var;
        this.d = vo6Var;
        this.e = context;
        this.f = zzchuVar;
    }

    public final f77 a(final zzccb zzccbVar) {
        w57 w57Var = new w57() { // from class: com.daaw.vk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                zzccb zzccbVar2 = zzccb.this;
                zzccbVar2.y = new String(f47.a((InputStream) obj), cy6.c);
                return s67.i(zzccbVar2);
            }
        };
        final dk5 dk5Var = this.b;
        return h(zzccbVar, new zk5() { // from class: com.daaw.wk5
            @Override // com.daaw.zk5
            public final f77 a(zzccb zzccbVar2) {
                return dk5.this.b(zzccbVar2);
            }
        }, new zk5() { // from class: com.daaw.xk5
            @Override // com.daaw.zk5
            public final f77 a(zzccb zzccbVar2) {
                return al5.this.d(zzccbVar2);
            }
        }, w57Var);
    }

    public final f77 b(JSONObject jSONObject) {
        return s67.n(j67.D(s67.i(jSONObject)), zzt.zzf().a(this.e, this.f, this.d).a("AFMA_getAdDictionary", ul3.b, new pl3() { // from class: com.daaw.uk5
            @Override // com.daaw.pl3
            public final Object b(JSONObject jSONObject2) {
                return new pu3(jSONObject2);
            }
        }), this.a);
    }

    public final /* synthetic */ f77 c(zk5 zk5Var, zzccb zzccbVar, w57 w57Var, pk5 pk5Var) {
        return s67.n(zk5Var.a(zzccbVar), w57Var, this.a);
    }

    public final /* synthetic */ f77 d(zzccb zzccbVar) {
        return ((cn5) this.c.zzb()).g3(zzccbVar, Binder.getCallingUid());
    }

    public final /* synthetic */ f77 e(zzccb zzccbVar) {
        return this.b.c(zzccbVar.w);
    }

    public final /* synthetic */ f77 f(zzccb zzccbVar) {
        return ((cn5) this.c.zzb()).j3(zzccbVar.w);
    }

    public final f77 g(zzccb zzccbVar) {
        return h(zzccbVar, new zk5() { // from class: com.daaw.sk5
            @Override // com.daaw.zk5
            public final f77 a(zzccb zzccbVar2) {
                return al5.this.e(zzccbVar2);
            }
        }, new zk5() { // from class: com.daaw.tk5
            @Override // com.daaw.zk5
            public final f77 a(zzccb zzccbVar2) {
                return al5.this.f(zzccbVar2);
            }
        }, new w57() { // from class: com.daaw.rk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return s67.i(null);
            }
        });
    }

    public final f77 h(final zzccb zzccbVar, zk5 zk5Var, final zk5 zk5Var2, final w57 w57Var) {
        String str = zzccbVar.s;
        zzt.zzp();
        return s67.g(s67.n(j67.D(zzs.zzy(str) ? s67.h(new pk5(1)) : s67.g(zk5Var.a(zzccbVar), ExecutionException.class, new w57() { // from class: com.daaw.qk5
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
        }, this.a)), w57Var, this.a), pk5.class, new w57() { // from class: com.daaw.yk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return al5.this.c(zk5Var2, zzccbVar, w57Var, (pk5) obj);
            }
        }, this.a);
    }
}
