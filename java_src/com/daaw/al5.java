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

    /* renamed from: a */
    public final g77 f3300a;

    /* renamed from: b */
    public final dk5 f3301b;

    /* renamed from: c */
    public final qz7 f3302c;

    /* renamed from: d */
    public final vo6 f3303d;

    /* renamed from: e */
    public final Context f3304e;

    /* renamed from: f */
    public final zzchu f3305f;

    public al5(g77 g77Var, dk5 dk5Var, qz7 qz7Var, vo6 vo6Var, Context context, zzchu zzchuVar) {
        this.f3300a = g77Var;
        this.f3301b = dk5Var;
        this.f3302c = qz7Var;
        this.f3303d = vo6Var;
        this.f3304e = context;
        this.f3305f = zzchuVar;
    }

    /* renamed from: a */
    public final f77 m27355a(final zzccb zzccbVar) {
        w57 w57Var = new w57() { // from class: com.daaw.vk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                zzccb zzccbVar2 = zzccb.this;
                zzccbVar2.f36973y = new String(f47.m22925a((InputStream) obj), cy6.f6275c);
                return s67.m10634i(zzccbVar2);
            }
        };
        final dk5 dk5Var = this.f3301b;
        return m27348h(zzccbVar, new zk5() { // from class: com.daaw.wk5
            @Override // com.daaw.zk5
            /* renamed from: a */
            public final f77 mo2152a(zzccb zzccbVar2) {
                return dk5.this.m24298b(zzccbVar2);
            }
        }, new zk5() { // from class: com.daaw.xk5
            @Override // com.daaw.zk5
            /* renamed from: a */
            public final f77 mo2152a(zzccb zzccbVar2) {
                return al5.this.m27352d(zzccbVar2);
            }
        }, w57Var);
    }

    /* renamed from: b */
    public final f77 m27354b(JSONObject jSONObject) {
        return s67.m10629n(j67.m18784D(s67.m10634i(jSONObject)), zzt.zzf().m14178a(this.f3304e, this.f3305f, this.f3303d).m5010a("AFMA_getAdDictionary", ul3.f29176b, new pl3() { // from class: com.daaw.uk5
            @Override // com.daaw.pl3
            /* renamed from: b */
            public final Object mo8081b(JSONObject jSONObject2) {
                return new pu3(jSONObject2);
            }
        }), this.f3300a);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m27353c(zk5 zk5Var, zzccb zzccbVar, w57 w57Var, pk5 pk5Var) {
        return s67.m10629n(zk5Var.mo2152a(zzccbVar), w57Var, this.f3300a);
    }

    /* renamed from: d */
    public final /* synthetic */ f77 m27352d(zzccb zzccbVar) {
        return ((cn5) this.f3302c.zzb()).m25215g3(zzccbVar, Binder.getCallingUid());
    }

    /* renamed from: e */
    public final /* synthetic */ f77 m27351e(zzccb zzccbVar) {
        return this.f3301b.m24297c(zzccbVar.f36971w);
    }

    /* renamed from: f */
    public final /* synthetic */ f77 m27350f(zzccb zzccbVar) {
        return ((cn5) this.f3302c.zzb()).m25212j3(zzccbVar.f36971w);
    }

    /* renamed from: g */
    public final f77 m27349g(zzccb zzccbVar) {
        return m27348h(zzccbVar, new zk5() { // from class: com.daaw.sk5
            @Override // com.daaw.zk5
            /* renamed from: a */
            public final f77 mo2152a(zzccb zzccbVar2) {
                return al5.this.m27351e(zzccbVar2);
            }
        }, new zk5() { // from class: com.daaw.tk5
            @Override // com.daaw.zk5
            /* renamed from: a */
            public final f77 mo2152a(zzccb zzccbVar2) {
                return al5.this.m27350f(zzccbVar2);
            }
        }, new w57() { // from class: com.daaw.rk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return s67.m10634i(null);
            }
        });
    }

    /* renamed from: h */
    public final f77 m27348h(final zzccb zzccbVar, zk5 zk5Var, final zk5 zk5Var2, final w57 w57Var) {
        String str = zzccbVar.f36967s;
        zzt.zzp();
        return s67.m10636g(s67.m10629n(j67.m18784D(zzs.zzy(str) ? s67.m10635h(new pk5(1)) : s67.m10636g(zk5Var.mo2152a(zzccbVar), ExecutionException.class, new w57() { // from class: com.daaw.qk5
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
        }, this.f3300a)), w57Var, this.f3300a), pk5.class, new w57() { // from class: com.daaw.yk5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return al5.this.m27353c(zk5Var2, zzccbVar, w57Var, (pk5) obj);
            }
        }, this.f3300a);
    }
}
