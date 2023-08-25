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

    /* renamed from: b */
    public final Context f15181b;

    /* renamed from: c */
    public final String f15182c;

    /* renamed from: d */
    public final zzchu f15183d;

    /* renamed from: e */
    public final vo6 f15184e;

    /* renamed from: f */
    public final zzbb f15185f;

    /* renamed from: g */
    public final zzbb f15186g;

    /* renamed from: h */
    public il3 f15187h;

    /* renamed from: a */
    public final Object f15180a = new Object();

    /* renamed from: i */
    public int f15188i = 1;

    public jl3(Context context, zzchu zzchuVar, String str, zzbb zzbbVar, zzbb zzbbVar2, vo6 vo6Var) {
        this.f15182c = str;
        this.f15181b = context.getApplicationContext();
        this.f15183d = zzchuVar;
        this.f15184e = vo6Var;
        this.f15185f = zzbbVar;
        this.f15186g = zzbbVar2;
    }

    /* renamed from: b */
    public final al3 m18433b(sl2 sl2Var) {
        synchronized (this.f15180a) {
            synchronized (this.f15180a) {
                il3 il3Var = this.f15187h;
                if (il3Var != null && this.f15188i == 0) {
                    il3Var.m17206e(new i14() { // from class: com.daaw.lk3
                        @Override // com.daaw.i14
                        public final void zza(Object obj) {
                            jl3.this.m18424k((bk3) obj);
                        }
                    }, new g14() { // from class: com.daaw.mk3
                        @Override // com.daaw.g14
                        public final void zza() {
                        }
                    });
                }
            }
            il3 il3Var2 = this.f15187h;
            if (il3Var2 != null && il3Var2.m17210a() != -1) {
                int i = this.f15188i;
                if (i == 0) {
                    return this.f15187h.m19661f();
                } else if (i != 1) {
                    return this.f15187h.m19661f();
                } else {
                    this.f15188i = 2;
                    m18431d(null);
                    return this.f15187h.m19661f();
                }
            }
            this.f15188i = 2;
            il3 m18431d = m18431d(null);
            this.f15187h = m18431d;
            return m18431d.m19661f();
        }
    }

    /* renamed from: d */
    public final il3 m18431d(sl2 sl2Var) {
        io6 m20568a = ho6.m20568a(this.f15181b, 6);
        m20568a.zzh();
        final il3 il3Var = new il3(this.f15186g);
        z04.f34309e.execute(new Runnable(null, il3Var) { // from class: com.daaw.nk3

            /* renamed from: q */
            public final /* synthetic */ il3 f20195q;

            {
                this.f20195q = il3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jl3.this.m18425j(null, this.f20195q);
            }
        });
        il3Var.m17206e(new vk3(this, il3Var, m20568a), new wk3(this, il3Var, m20568a));
        return il3Var;
    }

    /* renamed from: i */
    public final /* synthetic */ void m18426i(il3 il3Var, final bk3 bk3Var) {
        synchronized (this.f15180a) {
            if (il3Var.m17210a() != -1 && il3Var.m17210a() != 1) {
                il3Var.m17208c();
                z04.f34309e.execute(new Runnable() { // from class: com.daaw.qk3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk3.this.zzc();
                    }
                });
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m18425j(sl2 sl2Var, il3 il3Var) {
        try {
            jk3 jk3Var = new jk3(this.f15181b, this.f15183d, null, null);
            jk3Var.mo18447m(new pk3(this, il3Var, jk3Var));
            jk3Var.mo16862B0("/jsLoaded", new rk3(this, il3Var, jk3Var));
            zzca zzcaVar = new zzca();
            sk3 sk3Var = new sk3(this, null, jk3Var, zzcaVar);
            zzcaVar.zzb(sk3Var);
            jk3Var.mo16862B0("/requestReload", sk3Var);
            if (this.f15182c.endsWith(".js")) {
                jk3Var.zzh(this.f15182c);
            } else if (this.f15182c.startsWith("<html>")) {
                jk3Var.mo18448f(this.f15182c);
            } else {
                jk3Var.mo18446s(this.f15182c);
            }
            zzs.zza.postDelayed(new uk3(this, il3Var, jk3Var), 60000L);
        } catch (Throwable th) {
            k04.zzh("Error creating webview.", th);
            zzt.zzo().m11902u(th, "SdkJavascriptFactory.loadJavascriptEngine");
            il3Var.m17208c();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m18424k(bk3 bk3Var) {
        if (bk3Var.zzi()) {
            this.f15188i = 1;
        }
    }
}
