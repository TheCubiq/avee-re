package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ah4 implements q03, jr4, zzo, ir4 {
    public final vg4 p;
    public final wg4 q;
    public final mm3 s;
    public final Executor t;
    public final ag u;
    public final Set r = new HashSet();
    public final AtomicBoolean v = new AtomicBoolean(false);
    @GuardedBy("this")
    public final zg4 w = new zg4();
    public boolean x = false;
    public WeakReference y = new WeakReference(this);

    public ah4(jm3 jm3Var, wg4 wg4Var, Executor executor, vg4 vg4Var, ag agVar) {
        this.p = vg4Var;
        rl3 rl3Var = ul3.b;
        this.s = jm3Var.a("google.afma.activeView.handleUpdate", rl3Var, rl3Var);
        this.q = wg4Var;
        this.t = executor;
        this.u = agVar;
    }

    public final synchronized void b() {
        if (this.y.get() == null) {
            k();
        } else if (!this.x && this.v.get()) {
            try {
                this.w.d = this.u.b();
                final JSONObject a = this.q.a(this.w);
                for (final a74 a74Var : this.r) {
                    this.t.execute(new Runnable() { // from class: com.daaw.yg4
                        @Override // java.lang.Runnable
                        public final void run() {
                            a74.this.C0("AFMA_updateActiveView", a);
                        }
                    });
                }
                c14.b(this.s.a(a), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zze.zzb("Failed to call ActiveViewJS", e);
            }
        }
    }

    public final synchronized void c(a74 a74Var) {
        this.r.add(a74Var);
        this.p.d(a74Var);
    }

    public final void e(Object obj) {
        this.y = new WeakReference(obj);
    }

    @Override // com.daaw.q03
    public final synchronized void e0(p03 p03Var) {
        zg4 zg4Var = this.w;
        zg4Var.a = p03Var.j;
        zg4Var.f = p03Var;
        b();
    }

    @Override // com.daaw.jr4
    public final synchronized void f(Context context) {
        this.w.e = "u";
        b();
        m();
        this.x = true;
    }

    public final synchronized void k() {
        m();
        this.x = true;
    }

    @Override // com.daaw.jr4
    public final synchronized void l(Context context) {
        this.w.b = false;
        b();
    }

    public final void m() {
        for (a74 a74Var : this.r) {
            this.p.f(a74Var);
        }
        this.p.e();
    }

    @Override // com.daaw.jr4
    public final synchronized void s(Context context) {
        this.w.b = true;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        this.w.b = false;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs() {
        this.w.b = true;
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        if (this.v.compareAndSet(false, true)) {
            this.p.c(this);
            b();
        }
    }
}
