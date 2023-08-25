package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class nh4 implements q03 {

    /* renamed from: p */
    public a74 f20122p;

    /* renamed from: q */
    public final Executor f20123q;

    /* renamed from: r */
    public final wg4 f20124r;

    /* renamed from: s */
    public final InterfaceC0623ag f20125s;

    /* renamed from: t */
    public boolean f20126t = false;

    /* renamed from: u */
    public boolean f20127u = false;

    /* renamed from: v */
    public final zg4 f20128v = new zg4();

    public nh4(Executor executor, wg4 wg4Var, InterfaceC0623ag interfaceC0623ag) {
        this.f20123q = executor;
        this.f20124r = wg4Var;
        this.f20125s = interfaceC0623ag;
    }

    /* renamed from: b */
    public final void m15174b() {
        this.f20126t = false;
    }

    /* renamed from: c */
    public final void m15173c() {
        this.f20126t = true;
        m15169l();
    }

    /* renamed from: e */
    public final /* synthetic */ void m15172e(JSONObject jSONObject) {
        this.f20122p.mo6461C0("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        zg4 zg4Var = this.f20128v;
        zg4Var.f35031a = this.f20127u ? false : p03Var.f22185j;
        zg4Var.f35034d = this.f20125s.mo15859b();
        this.f20128v.f35036f = p03Var;
        if (this.f20126t) {
            m15169l();
        }
    }

    /* renamed from: f */
    public final void m15171f(boolean z) {
        this.f20127u = z;
    }

    /* renamed from: k */
    public final void m15170k(a74 a74Var) {
        this.f20122p = a74Var;
    }

    /* renamed from: l */
    public final void m15169l() {
        try {
            final JSONObject mo6074a = this.f20124r.mo6074a(this.f20128v);
            if (this.f20122p != null) {
                this.f20123q.execute(new Runnable() { // from class: com.daaw.mh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        nh4.this.m15172e(mo6074a);
                    }
                });
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }
}
