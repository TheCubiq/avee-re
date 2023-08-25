package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k75 {
    public final ri6 a;
    public final Executor b;
    public final ia5 c;
    public final a95 d;
    public final Context e;
    public final kd5 f;
    public final on6 g;
    public final op6 h;
    public final cq5 i;

    public k75(ri6 ri6Var, Executor executor, ia5 ia5Var, Context context, kd5 kd5Var, on6 on6Var, op6 op6Var, cq5 cq5Var, a95 a95Var) {
        this.a = ri6Var;
        this.b = executor;
        this.c = ia5Var;
        this.e = context;
        this.f = kd5Var;
        this.g = on6Var;
        this.h = op6Var;
        this.i = cq5Var;
        this.d = a95Var;
    }

    public static final void i(a74 a74Var) {
        a74Var.y("/videoClicked", yg3.h);
        a74Var.zzP().Z(true);
        if (((Boolean) zzba.zzc().b(g93.k3)).booleanValue()) {
            a74Var.y("/getNativeAdViewSignals", yg3.s);
        }
        a74Var.y("/getNativeClickMeta", yg3.t);
    }

    public final f77 a(final JSONObject jSONObject) {
        return s67.n(s67.n(s67.i(null), new w57() { // from class: com.daaw.a75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.e(obj);
            }
        }, this.b), new w57() { // from class: com.daaw.b75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.c(jSONObject, (a74) obj);
            }
        }, this.b);
    }

    public final f77 b(final String str, final String str2, final th6 th6Var, final wh6 wh6Var, final zzq zzqVar) {
        return s67.n(s67.i(null), new w57() { // from class: com.daaw.d75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.d(zzqVar, th6Var, wh6Var, str, str2, obj);
            }
        }, this.b);
    }

    public final /* synthetic */ f77 c(JSONObject jSONObject, final a74 a74Var) {
        final d14 e = d14.e(a74Var);
        a74Var.Q(this.a.b != null ? v84.d() : v84.e());
        a74Var.zzP().E(new o84() { // from class: com.daaw.z65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                k75.this.f(a74Var, e, z);
            }
        });
        a74Var.C0("google.afma.nativeAds.renderVideo", jSONObject);
        return e;
    }

    public final /* synthetic */ f77 d(zzq zzqVar, th6 th6Var, wh6 wh6Var, String str, String str2, Object obj) {
        final a74 a = this.c.a(zzqVar, th6Var, wh6Var);
        final d14 e = d14.e(a);
        if (this.a.b != null) {
            h(a);
            a.Q(v84.d());
        } else {
            x85 b = this.d.b();
            a.zzP().J(b, b, b, b, b, false, null, new zzb(this.e, null, null), null, null, this.i, this.h, this.f, this.g, null, b, null, null);
            i(a);
        }
        a.zzP().E(new o84() { // from class: com.daaw.e75
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                k75.this.g(a, e, z);
            }
        });
        a.b0(str, str2, null);
        return e;
    }

    public final /* synthetic */ f77 e(Object obj) {
        a74 a = this.c.a(zzq.zzc(), null, null);
        final d14 e = d14.e(a);
        h(a);
        a.zzP().y0(new s84() { // from class: com.daaw.c75
            @Override // com.daaw.s84
            public final void zza() {
                d14.this.g();
            }
        });
        a.loadUrl((String) zzba.zzc().b(g93.j3));
        return e;
    }

    public final /* synthetic */ void f(a74 a74Var, d14 d14Var, boolean z) {
        if (this.a.a != null && a74Var.zzs() != null) {
            a74Var.zzs().j3(this.a.a);
        }
        d14Var.g();
    }

    public final /* synthetic */ void g(a74 a74Var, d14 d14Var, boolean z) {
        if (!z) {
            d14Var.c(new yu5(1, "Html video Web View failed to load."));
            return;
        }
        if (this.a.a != null && a74Var.zzs() != null) {
            a74Var.zzs().j3(this.a.a);
        }
        d14Var.g();
    }

    public final void h(a74 a74Var) {
        i(a74Var);
        a74Var.y("/video", yg3.l);
        a74Var.y("/videoMeta", yg3.m);
        a74Var.y("/precache", new k54());
        a74Var.y("/delayPageLoaded", yg3.p);
        a74Var.y("/instrument", yg3.n);
        a74Var.y("/log", yg3.g);
        a74Var.y("/click", yg3.a(null));
        if (this.a.b != null) {
            a74Var.zzP().t0(true);
            a74Var.y("/open", new jh3(null, null, null, null, null));
        } else {
            a74Var.zzP().t0(false);
        }
        if (zzt.zzn().z(a74Var.getContext())) {
            a74Var.y("/logScionEvent", new eh3(a74Var.getContext()));
        }
    }
}
