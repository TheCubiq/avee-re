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

    /* renamed from: p */
    public final vg4 f3199p;

    /* renamed from: q */
    public final wg4 f3200q;

    /* renamed from: s */
    public final mm3 f3202s;

    /* renamed from: t */
    public final Executor f3203t;

    /* renamed from: u */
    public final InterfaceC0623ag f3204u;

    /* renamed from: r */
    public final Set f3201r = new HashSet();

    /* renamed from: v */
    public final AtomicBoolean f3205v = new AtomicBoolean(false);
    @GuardedBy("this")

    /* renamed from: w */
    public final zg4 f3206w = new zg4();

    /* renamed from: x */
    public boolean f3207x = false;

    /* renamed from: y */
    public WeakReference f3208y = new WeakReference(this);

    public ah4(jm3 jm3Var, wg4 wg4Var, Executor executor, vg4 vg4Var, InterfaceC0623ag interfaceC0623ag) {
        this.f3199p = vg4Var;
        rl3 rl3Var = ul3.f29176b;
        this.f3202s = jm3Var.m18412a("google.afma.activeView.handleUpdate", rl3Var, rl3Var);
        this.f3200q = wg4Var;
        this.f3203t = executor;
        this.f3204u = interfaceC0623ag;
    }

    /* renamed from: b */
    public final synchronized void m27480b() {
        if (this.f3208y.get() == null) {
            m27477k();
        } else if (!this.f3207x && this.f3205v.get()) {
            try {
                this.f3206w.f35034d = this.f3204u.mo15859b();
                final JSONObject mo6074a = this.f3200q.mo6074a(this.f3206w);
                for (final a74 a74Var : this.f3201r) {
                    this.f3203t.execute(new Runnable() { // from class: com.daaw.yg4
                        @Override // java.lang.Runnable
                        public final void run() {
                            a74.this.mo6461C0("AFMA_updateActiveView", mo6074a);
                        }
                    });
                }
                c14.m25684b(this.f3202s.m15933a(mo6074a), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zze.zzb("Failed to call ActiveViewJS", e);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m27479c(a74 a74Var) {
        this.f3201r.add(a74Var);
        this.f3199p.m7185d(a74Var);
    }

    /* renamed from: e */
    public final void m27478e(Object obj) {
        this.f3208y = new WeakReference(obj);
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final synchronized void mo6420e0(p03 p03Var) {
        zg4 zg4Var = this.f3206w;
        zg4Var.f35031a = p03Var.f22185j;
        zg4Var.f35036f = p03Var;
        m27480b();
    }

    @Override // com.daaw.jr4
    /* renamed from: f */
    public final synchronized void mo5173f(Context context) {
        this.f3206w.f35035e = "u";
        m27480b();
        m27476m();
        this.f3207x = true;
    }

    /* renamed from: k */
    public final synchronized void m27477k() {
        m27476m();
        this.f3207x = true;
    }

    @Override // com.daaw.jr4
    /* renamed from: l */
    public final synchronized void mo5171l(Context context) {
        this.f3206w.f35032b = false;
        m27480b();
    }

    /* renamed from: m */
    public final void m27476m() {
        for (a74 a74Var : this.f3201r) {
            this.f3199p.m7183f(a74Var);
        }
        this.f3199p.m7184e();
    }

    @Override // com.daaw.jr4
    /* renamed from: s */
    public final synchronized void mo5169s(Context context) {
        this.f3206w.f35032b = true;
        m27480b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        this.f3206w.f35032b = false;
        m27480b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs() {
        this.f3206w.f35032b = true;
        m27480b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        if (this.f3205v.compareAndSet(false, true)) {
            this.f3199p.m7186c(this);
            m27480b();
        }
    }
}
