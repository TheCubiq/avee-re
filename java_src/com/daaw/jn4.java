package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jn4 {
    public final sj5 a;
    public final ri6 b;
    public final en6 c;
    public final if4 d;
    public final av5 e;
    public final fw4 f;
    public fi6 g;
    public final al5 h;
    public final op4 i;
    public final Executor j;
    public final mk5 k;
    public final vq5 l;
    public final ul5 m;
    public final am5 n;

    public jn4(sj5 sj5Var, ri6 ri6Var, en6 en6Var, if4 if4Var, av5 av5Var, fw4 fw4Var, fi6 fi6Var, al5 al5Var, op4 op4Var, Executor executor, mk5 mk5Var, vq5 vq5Var, ul5 ul5Var, am5 am5Var) {
        this.a = sj5Var;
        this.b = ri6Var;
        this.c = en6Var;
        this.d = if4Var;
        this.e = av5Var;
        this.f = fw4Var;
        this.g = fi6Var;
        this.h = al5Var;
        this.i = op4Var;
        this.j = executor;
        this.k = mk5Var;
        this.l = vq5Var;
        this.m = ul5Var;
        this.n = am5Var;
    }

    public final zze a(Throwable th) {
        return tj6.b(th, this.l);
    }

    public final fw4 c() {
        return this.f;
    }

    public final /* synthetic */ fi6 d(fi6 fi6Var) {
        this.d.a(fi6Var);
        return fi6Var;
    }

    public final f77 e(final zzfkz zzfkzVar) {
        gm6 a = this.c.b(ym6.GET_CACHE_KEY, this.i.c()).f(new w57() { // from class: com.daaw.gn4
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jn4.this.f(zzfkzVar, (zzccb) obj);
            }
        }).a();
        s67.r(a, new hn4(this), this.j);
        return a;
    }

    public final /* synthetic */ f77 f(zzfkz zzfkzVar, zzccb zzccbVar) {
        zzccbVar.x = zzfkzVar;
        return this.h.a(zzccbVar);
    }

    public final /* synthetic */ f77 g(f77 f77Var, f77 f77Var2, f77 f77Var3) {
        return this.n.b((zzccb) f77Var.get(), (JSONObject) f77Var2.get(), (pu3) f77Var3.get());
    }

    public final f77 h(zzccb zzccbVar) {
        gm6 a = this.c.b(ym6.NOTIFY_CACHE_HIT, this.h.g(zzccbVar)).a();
        s67.r(a, new in4(this), this.j);
        return a;
    }

    public final f77 i(f77 f77Var) {
        vm6 f = this.c.b(ym6.RENDERER, f77Var).e(new em6() { // from class: com.daaw.fn4
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                fi6 fi6Var = (fi6) obj;
                jn4.this.d(fi6Var);
                return fi6Var;
            }
        }).f(this.e);
        if (!((Boolean) zzba.zzc().b(g93.V4)).booleanValue()) {
            f = f.i(((Integer) zzba.zzc().b(g93.W4)).intValue(), TimeUnit.SECONDS);
        }
        return f.a();
    }

    public final f77 j() {
        zzl zzlVar = this.b.d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return k(this.i.c());
        }
        en6 en6Var = this.c;
        return lm6.c(this.a.a(), ym6.PRELOADED_LOADER, en6Var).a();
    }

    public final f77 k(final f77 f77Var) {
        vm6 f;
        fi6 fi6Var = this.g;
        if (fi6Var != null) {
            f = lm6.c(s67.i(fi6Var), ym6.SERVER_TRANSACTION, this.c);
        } else {
            zzt.zzc().j();
            if (!((Boolean) zzba.zzc().b(g93.x9)).booleanValue() || ((Boolean) kb3.b.e()).booleanValue()) {
                vm6 b = this.c.b(ym6.SERVER_TRANSACTION, f77Var);
                final mk5 mk5Var = this.k;
                f = b.f(new w57() { // from class: com.daaw.en4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return mk5.this.a((zzccb) obj);
                    }
                });
            } else {
                final ul5 ul5Var = this.m;
                final f77 n = s67.n(f77Var, new w57() { // from class: com.daaw.an4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return ul5.this.a((zzccb) obj);
                    }
                }, this.j);
                vm6 b2 = this.c.b(ym6.BUILD_URL, n);
                final al5 al5Var = this.h;
                final gm6 a = b2.f(new w57() { // from class: com.daaw.bn4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return al5.this.b((JSONObject) obj);
                    }
                }).a();
                f = this.c.a(ym6.SERVER_TRANSACTION, f77Var, n, a).a(new Callable() { // from class: com.daaw.cn4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return jn4.this.g(f77Var, n, a);
                    }
                }).f(new w57() { // from class: com.daaw.dn4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return (f77) obj;
                    }
                });
            }
        }
        return f.a();
    }

    public final void l(fi6 fi6Var) {
        this.g = fi6Var;
    }
}
