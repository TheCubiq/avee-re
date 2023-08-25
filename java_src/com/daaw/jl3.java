package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jl3 {
    public final Context b;
    public final String c;
    public final zzchu d;
    public final vo6 e;
    public final zzbb f;
    public final zzbb g;
    public il3 h;
    public final Object a = new Object();
    public int i = 1;

    public jl3(Context context, zzchu zzchuVar, String str, zzbb zzbbVar, zzbb zzbbVar2, vo6 vo6Var) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = zzchuVar;
        this.e = vo6Var;
        this.f = zzbbVar;
        this.g = zzbbVar2;
    }

    public final al3 b(sl2 sl2Var) {
        synchronized (this.a) {
            synchronized (this.a) {
                il3 il3Var = this.h;
                if (il3Var != null && this.i == 0) {
                    il3Var.e(new i14() { // from class: com.daaw.lk3
                        @Override // com.daaw.i14
                        public final void zza(Object obj) {
                            jl3.this.k((bk3) obj);
                        }
                    }, new g14() { // from class: com.daaw.mk3
                        @Override // com.daaw.g14
                        public final void zza() {
                        }
                    });
                }
            }
            il3 il3Var2 = this.h;
            if (il3Var2 != null && il3Var2.a() != -1) {
                int i = this.i;
                if (i == 0) {
                    return this.h.f();
                } else if (i != 1) {
                    return this.h.f();
                } else {
                    this.i = 2;
                    d(null);
                    return this.h.f();
                }
            }
            this.i = 2;
            il3 d = d(null);
            this.h = d;
            return d.f();
        }
    }

    public final il3 d(sl2 sl2Var) {
        io6 a = ho6.a(this.b, 6);
        a.zzh();
        final il3 il3Var = new il3(this.g);
        z04.e.execute(new Runnable(null, il3Var) { // from class: com.daaw.nk3
            public final /* synthetic */ il3 q;

            {
                this.q = il3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jl3.this.j(null, this.q);
            }
        });
        il3Var.e(new vk3(this, il3Var, a), new wk3(this, il3Var, a));
        return il3Var;
    }

    public final /* synthetic */ void i(il3 il3Var, final bk3 bk3Var) {
        synchronized (this.a) {
            if (il3Var.a() != -1 && il3Var.a() != 1) {
                il3Var.c();
                z04.e.execute(new Runnable() { // from class: com.daaw.qk3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk3.this.zzc();
                    }
                });
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void j(sl2 sl2Var, il3 il3Var) {
        try {
            jk3 jk3Var = new jk3(this.b, this.d, null, null);
            jk3Var.m(new pk3(this, il3Var, jk3Var));
            jk3Var.B0("/jsLoaded", new rk3(this, il3Var, jk3Var));
            zzca zzcaVar = new zzca();
            sk3 sk3Var = new sk3(this, null, jk3Var, zzcaVar);
            zzcaVar.zzb(sk3Var);
            jk3Var.B0("/requestReload", sk3Var);
            if (this.c.endsWith(".js")) {
                jk3Var.zzh(this.c);
            } else if (this.c.startsWith("<html>")) {
                jk3Var.f(this.c);
            } else {
                jk3Var.s(this.c);
            }
            zzs.zza.postDelayed(new uk3(this, il3Var, jk3Var), 60000L);
        } catch (Throwable th) {
            k04.zzh("Error creating webview.", th);
            zzt.zzo().u(th, "SdkJavascriptFactory.loadJavascriptEngine");
            il3Var.c();
        }
    }

    public final /* synthetic */ void k(bk3 bk3Var) {
        if (bk3Var.zzi()) {
            this.i = 1;
        }
    }
}
