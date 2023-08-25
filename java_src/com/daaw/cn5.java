package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzfkz;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cn5 extends wt3 {
    public final Context p;
    public final Executor q;
    public final g77 r;
    public final yn5 s;
    public final hf4 t;
    @GuardedBy("this")
    public final ArrayDeque u;
    public final vo6 v;
    public final yu3 w;
    public final vn5 x;

    public cn5(Context context, Executor executor, g77 g77Var, yu3 yu3Var, hf4 hf4Var, yn5 yn5Var, ArrayDeque arrayDeque, vn5 vn5Var, vo6 vo6Var, byte[] bArr) {
        g93.c(context);
        this.p = context;
        this.q = executor;
        this.r = g77Var;
        this.w = yu3Var;
        this.s = yn5Var;
        this.t = hf4Var;
        this.u = arrayDeque;
        this.x = vn5Var;
        this.v = vo6Var;
    }

    public static f77 m3(f77 f77Var, en6 en6Var, xl3 xl3Var, to6 to6Var, io6 io6Var) {
        nl3 a = xl3Var.a("AFMA_getAdDictionary", ul3.b, new pl3() { // from class: com.daaw.tm5
            @Override // com.daaw.pl3
            public final Object b(JSONObject jSONObject) {
                return new pu3(jSONObject);
            }
        });
        so6.d(f77Var, io6Var);
        gm6 a2 = en6Var.b(ym6.BUILD_URL, f77Var).f(a).a();
        so6.c(a2, to6Var, io6Var);
        return a2;
    }

    public static f77 n3(zzccb zzccbVar, en6 en6Var, final o86 o86Var) {
        w57 w57Var = new w57() { // from class: com.daaw.km5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return o86.this.b().a(zzay.zzb().n((Bundle) obj));
            }
        };
        return en6Var.b(ym6.GMS_SIGNALS, s67.i(zzccbVar.p)).f(w57Var).e(new em6() { // from class: com.daaw.lm5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("Ad request signals:");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    @Override // com.daaw.xt3
    public final void A1(zzccb zzccbVar, hu3 hu3Var) {
        p3(i3(zzccbVar, Binder.getCallingUid()), hu3Var);
    }

    @Override // com.daaw.xt3
    public final void L2(zzccb zzccbVar, hu3 hu3Var) {
        mm5 mm5Var;
        Executor executor;
        f77 h3 = h3(zzccbVar, Binder.getCallingUid());
        p3(h3, hu3Var);
        if (((Boolean) ab3.c.e()).booleanValue()) {
            if (((Boolean) ya3.j.e()).booleanValue()) {
                yn5 yn5Var = this.s;
                yn5Var.getClass();
                mm5Var = new mm5(yn5Var);
                executor = this.r;
            } else {
                yn5 yn5Var2 = this.s;
                yn5Var2.getClass();
                mm5Var = new mm5(yn5Var2);
                executor = this.q;
            }
            h3.f(mm5Var, executor);
        }
    }

    @Override // com.daaw.xt3
    public final void b2(zzccb zzccbVar, hu3 hu3Var) {
        p3(g3(zzccbVar, Binder.getCallingUid()), hu3Var);
    }

    public final f77 g3(final zzccb zzccbVar, int i) {
        if (((Boolean) lb3.a.e()).booleanValue()) {
            zzfkz zzfkzVar = zzccbVar.x;
            if (zzfkzVar == null) {
                return s67.h(new Exception("Pool configuration missing from request."));
            }
            if (zzfkzVar.t == 0 || zzfkzVar.u == 0) {
                return s67.h(new Exception("Caching is disabled."));
            }
            xl3 b = zzt.zzf().b(this.p, zzchu.h(), this.v);
            o86 a = this.t.a(zzccbVar, i);
            en6 c = a.c();
            final f77 n3 = n3(zzccbVar, c, a);
            to6 d = a.d();
            final io6 a2 = ho6.a(this.p, 9);
            final f77 m3 = m3(n3, c, b, d, a2);
            return c.a(ym6.GET_URL_AND_CACHE_KEY, n3, m3).a(new Callable() { // from class: com.daaw.sm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cn5.this.k3(m3, n3, zzccbVar, a2);
                }
            }).a();
        }
        return s67.h(new Exception("Split request is disabled."));
    }

    public final f77 h3(zzccb zzccbVar, int i) {
        String str;
        jm6 a;
        Callable callable;
        xl3 b = zzt.zzf().b(this.p, zzchu.h(), this.v);
        o86 a2 = this.t.a(zzccbVar, i);
        nl3 a3 = b.a("google.afma.response.normalize", bn5.d, ul3.c);
        zm5 zm5Var = null;
        if (((Boolean) lb3.a.e()).booleanValue()) {
            zm5Var = l3(zzccbVar.w);
            if (zm5Var == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                zze.zza(str);
            }
        } else {
            String str2 = zzccbVar.y;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                zze.zza(str);
            }
        }
        zm5 zm5Var2 = zm5Var;
        io6 a4 = zm5Var2 == null ? ho6.a(this.p, 9) : zm5Var2.e;
        to6 d = a2.d();
        d.d(zzccbVar.p.getStringArrayList("ad_types"));
        xn5 xn5Var = new xn5(zzccbVar.v, d, a4);
        un5 un5Var = new un5(this.p, zzccbVar.q.p, this.w, i, null);
        en6 c = a2.c();
        io6 a5 = ho6.a(this.p, 11);
        if (zm5Var2 == null) {
            final f77 n3 = n3(zzccbVar, c, a2);
            final f77 m3 = m3(n3, c, b, d, a4);
            io6 a6 = ho6.a(this.p, 10);
            final gm6 a7 = c.a(ym6.HTTP, m3, n3).a(new Callable() { // from class: com.daaw.qm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new wn5((JSONObject) f77.this.get(), (pu3) m3.get());
                }
            }).e(xn5Var).e(new oo6(a6)).e(un5Var).a();
            so6.a(a7, d, a6);
            so6.d(a7, a5);
            a = c.a(ym6.PRE_PROCESS, n3, m3, a7);
            callable = new Callable() { // from class: com.daaw.rm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new bn5((pn5) f77.this.get(), (JSONObject) n3.get(), (pu3) m3.get());
                }
            };
        } else {
            wn5 wn5Var = new wn5(zm5Var2.b, zm5Var2.a);
            io6 a8 = ho6.a(this.p, 10);
            final gm6 a9 = c.b(ym6.HTTP, s67.i(wn5Var)).e(xn5Var).e(new oo6(a8)).e(un5Var).a();
            so6.a(a9, d, a8);
            final f77 i2 = s67.i(zm5Var2);
            so6.d(a9, a5);
            a = c.a(ym6.PRE_PROCESS, a9, i2);
            callable = new Callable() { // from class: com.daaw.vm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    f77 f77Var = f77.this;
                    f77 f77Var2 = i2;
                    return new bn5((pn5) f77Var.get(), ((zm5) f77Var2.get()).b, ((zm5) f77Var2.get()).a);
                }
            };
        }
        gm6 a10 = a.a(callable).f(a3).a();
        so6.a(a10, d, a5);
        return a10;
    }

    public final f77 i3(zzccb zzccbVar, int i) {
        mm5 mm5Var;
        Executor executor;
        xl3 b = zzt.zzf().b(this.p, zzchu.h(), this.v);
        if (((Boolean) qb3.a.e()).booleanValue()) {
            o86 a = this.t.a(zzccbVar, i);
            final l76 a2 = a.a();
            nl3 a3 = b.a("google.afma.request.getSignals", ul3.b, ul3.c);
            io6 a4 = ho6.a(this.p, 22);
            gm6 a5 = a.c().b(ym6.GET_SIGNALS, s67.i(zzccbVar.p)).e(new oo6(a4)).f(new w57() { // from class: com.daaw.um5
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return l76.this.a(zzay.zzb().n((Bundle) obj));
                }
            }).b(ym6.JS_SIGNALS).f(a3).a();
            to6 d = a.d();
            d.d(zzccbVar.p.getStringArrayList("ad_types"));
            so6.b(a5, d, a4);
            if (((Boolean) ab3.e.e()).booleanValue()) {
                if (((Boolean) ya3.j.e()).booleanValue()) {
                    yn5 yn5Var = this.s;
                    yn5Var.getClass();
                    mm5Var = new mm5(yn5Var);
                    executor = this.r;
                } else {
                    yn5 yn5Var2 = this.s;
                    yn5Var2.getClass();
                    mm5Var = new mm5(yn5Var2);
                    executor = this.q;
                }
                a5.f(mm5Var, executor);
            }
            return a5;
        }
        return s67.h(new Exception("Signal collection disabled."));
    }

    @Override // com.daaw.xt3
    public final void j1(String str, hu3 hu3Var) {
        p3(j3(str), hu3Var);
    }

    public final f77 j3(String str) {
        if (((Boolean) lb3.a.e()).booleanValue()) {
            return l3(str) == null ? s67.h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : s67.i(new xm5(this));
        }
        return s67.h(new Exception("Split request is disabled."));
    }

    public final /* synthetic */ InputStream k3(f77 f77Var, f77 f77Var2, zzccb zzccbVar, io6 io6Var) {
        String c = ((pu3) f77Var.get()).c();
        String str = zzccbVar.w;
        o3(new zm5((pu3) f77Var.get(), (JSONObject) f77Var2.get(), str, c, io6Var));
        return new ByteArrayInputStream(c.getBytes(cy6.c));
    }

    public final synchronized zm5 l3(String str) {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            zm5 zm5Var = (zm5) it.next();
            if (zm5Var.c.equals(str)) {
                it.remove();
                return zm5Var;
            }
        }
        return null;
    }

    public final synchronized void o3(zm5 zm5Var) {
        zzo();
        this.u.addLast(zm5Var);
    }

    public final void p3(f77 f77Var, hu3 hu3Var) {
        s67.r(s67.n(f77Var, new w57() { // from class: com.daaw.wm5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.i(sj6.a((InputStream) obj));
            }
        }, z04.a), new ym5(this, hu3Var), z04.f);
    }

    public final synchronized void zzo() {
        int intValue = ((Long) lb3.d.e()).intValue();
        while (this.u.size() >= intValue) {
            this.u.removeFirst();
        }
    }
}
