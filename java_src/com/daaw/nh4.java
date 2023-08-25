package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class nh4 implements q03 {
    public a74 p;
    public final Executor q;
    public final wg4 r;
    public final ag s;
    public boolean t = false;
    public boolean u = false;
    public final zg4 v = new zg4();

    public nh4(Executor executor, wg4 wg4Var, ag agVar) {
        this.q = executor;
        this.r = wg4Var;
        this.s = agVar;
    }

    public final void b() {
        this.t = false;
    }

    public final void c() {
        this.t = true;
        l();
    }

    public final /* synthetic */ void e(JSONObject jSONObject) {
        this.p.C0("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        zg4 zg4Var = this.v;
        zg4Var.a = this.u ? false : p03Var.j;
        zg4Var.d = this.s.b();
        this.v.f = p03Var;
        if (this.t) {
            l();
        }
    }

    public final void f(boolean z) {
        this.u = z;
    }

    public final void k(a74 a74Var) {
        this.p = a74Var;
    }

    public final void l() {
        try {
            final JSONObject a = this.r.a(this.v);
            if (this.p != null) {
                this.q.execute(new Runnable() { // from class: com.daaw.mh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        nh4.this.e(a);
                    }
                });
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }
}
