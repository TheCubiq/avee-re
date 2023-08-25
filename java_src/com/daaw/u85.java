package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u85 {
    public final zza b;
    public final p74 c;
    public final Context d;
    public final kd5 e;
    public final on6 f;
    public final Executor g;
    public final sl2 h;
    public final zzchu i;
    public final cq5 k;
    public final op6 l;
    public f77 m;
    public final m85 a = new m85(null);
    public final nh3 j = new nh3();

    public u85(r85 r85Var) {
        this.d = r85.a(r85Var);
        this.g = r85.j(r85Var);
        this.h = r85.b(r85Var);
        this.i = r85.d(r85Var);
        this.b = r85.c(r85Var);
        this.c = r85.e(r85Var);
        this.k = r85.g(r85Var);
        this.l = r85.i(r85Var);
        this.e = r85.f(r85Var);
        this.f = r85.h(r85Var);
    }

    public final /* synthetic */ a74 a(a74 a74Var) {
        a74Var.y("/result", this.j);
        t84 zzP = a74Var.zzP();
        m85 m85Var = this.a;
        zzP.J(null, m85Var, m85Var, m85Var, m85Var, false, null, new zzb(this.d, null, null), null, null, this.k, this.l, this.e, this.f, null, null, null, null);
        return a74Var;
    }

    public final /* synthetic */ f77 c(String str, JSONObject jSONObject, a74 a74Var) {
        return this.j.b(a74Var, str, jSONObject);
    }

    public final synchronized f77 d(final String str, final JSONObject jSONObject) {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return s67.i(null);
        }
        return s67.n(f77Var, new w57() { // from class: com.daaw.e85
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return u85.this.c(str, jSONObject, (a74) obj);
            }
        }, this.g);
    }

    public final synchronized void e(th6 th6Var, wh6 wh6Var) {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return;
        }
        s67.r(f77Var, new k85(this, th6Var, wh6Var), this.g);
    }

    public final synchronized void f() {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return;
        }
        s67.r(f77Var, new g85(this), this.g);
        this.m = null;
    }

    public final synchronized void g(String str, Map map) {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return;
        }
        s67.r(f77Var, new j85(this, "sendMessageToNativeJs", map), this.g);
    }

    public final synchronized void h() {
        final Context context = this.d;
        final zzchu zzchuVar = this.i;
        final String str = (String) zzba.zzc().b(g93.i3);
        final sl2 sl2Var = this.h;
        final zza zzaVar = this.b;
        f77 m = s67.m(s67.l(new v57() { // from class: com.daaw.j74
            @Override // com.daaw.v57
            public final f77 zza() {
                Context context2 = context;
                sl2 sl2Var2 = sl2Var;
                zzchu zzchuVar2 = zzchuVar;
                zza zzaVar2 = zzaVar;
                String str2 = str;
                zzt.zzz();
                a74 a = p74.a(context2, v84.a(), "", false, false, sl2Var2, null, zzchuVar2, null, null, zzaVar2, x33.a(), null, null);
                final d14 e = d14.e(a);
                a.zzP().E(new o84() { // from class: com.daaw.k74
                    @Override // com.daaw.o84
                    public final void zza(boolean z) {
                        d14.this.g();
                    }
                });
                a.loadUrl(str2);
                return e;
            }
        }, z04.e), new ey6() { // from class: com.daaw.f85
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                a74 a74Var = (a74) obj;
                u85.this.a(a74Var);
                return a74Var;
            }
        }, this.g);
        this.m = m;
        c14.a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, zg3 zg3Var) {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return;
        }
        s67.r(f77Var, new h85(this, str, zg3Var), this.g);
    }

    public final void j(WeakReference weakReference, String str, zg3 zg3Var) {
        i(str, new t85(this, weakReference, str, zg3Var, null));
    }

    public final synchronized void k(String str, zg3 zg3Var) {
        f77 f77Var = this.m;
        if (f77Var == null) {
            return;
        }
        s67.r(f77Var, new i85(this, str, zg3Var), this.g);
    }
}
