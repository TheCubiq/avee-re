package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzccy;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class dh6 implements qz5 {

    /* renamed from: a */
    public final Context f7082a;

    /* renamed from: b */
    public final Executor f7083b;

    /* renamed from: c */
    public final b94 f7084c;

    /* renamed from: d */
    public final tg6 f7085d;

    /* renamed from: e */
    public final cf6 f7086e;

    /* renamed from: f */
    public final gi6 f7087f;

    /* renamed from: g */
    public final vo6 f7088g;
    @GuardedBy("this")

    /* renamed from: h */
    public final pi6 f7089h;
    @GuardedBy("this")

    /* renamed from: i */
    public f77 f7090i;

    public dh6(Context context, Executor executor, b94 b94Var, cf6 cf6Var, tg6 tg6Var, pi6 pi6Var, gi6 gi6Var) {
        this.f7082a = context;
        this.f7083b = executor;
        this.f7084c = b94Var;
        this.f7086e = cf6Var;
        this.f7085d = tg6Var;
        this.f7089h = pi6Var;
        this.f7087f = gi6Var;
        this.f7088g = b94Var.mo26308D();
    }

    @Override // com.daaw.qz5
    /* renamed from: a */
    public final boolean mo4385a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        to6 to6Var;
        zzccy zzccyVar = new zzccy(zzlVar, str);
        if (zzccyVar.f36976q == null) {
            k04.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.f7083b.execute(new Runnable() { // from class: com.daaw.wg6
                @Override // java.lang.Runnable
                public final void run() {
                    dh6.this.m24381h();
                }
            });
        } else {
            f77 f77Var = this.f7090i;
            if (f77Var == null || f77Var.isDone()) {
                if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
                    cf6 cf6Var = this.f7086e;
                    if (cf6Var.zzd() != null) {
                        to6 zzh = ((o95) cf6Var.zzd()).zzh();
                        zzh.m8895h(5);
                        zzh.m8901b(zzccyVar.f36975p.zzp);
                        to6Var = zzh;
                        nj6.m15146a(this.f7082a, zzccyVar.f36975p.zzf);
                        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && zzccyVar.f36975p.zzf) {
                            this.f7084c.mo26253p().m24398m(true);
                        }
                        pi6 pi6Var = this.f7089h;
                        pi6Var.m13370J(zzccyVar.f36976q);
                        pi6Var.m13371I(zzq.zzd());
                        pi6Var.m13358e(zzccyVar.f36975p);
                        ri6 m13356g = pi6Var.m13356g();
                        io6 m20567b = ho6.m20567b(this.f7082a, so6.m10109f(m13356g), 5, zzccyVar.f36975p);
                        ch6 ch6Var = new ch6(null);
                        ch6Var.f5820a = m13356g;
                        ch6Var.f5821b = null;
                        f77 mo13423a = this.f7086e.mo13423a(new df6(ch6Var, null), new ye6() { // from class: com.daaw.xg6
                            @Override // com.daaw.ye6
                            /* renamed from: a */
                            public final qp4 mo3795a(xe6 xe6Var) {
                                n95 m24379j;
                                m24379j = dh6.this.m24379j(xe6Var);
                                return m24379j;
                            }
                        }, null);
                        this.f7090i = mo13423a;
                        s67.m10625r(mo13423a, new ah6(this, pz5Var, to6Var, m20567b, ch6Var), this.f7083b);
                        return true;
                    }
                }
                to6Var = null;
                nj6.m15146a(this.f7082a, zzccyVar.f36975p.zzf);
                if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
                    this.f7084c.mo26253p().m24398m(true);
                }
                pi6 pi6Var2 = this.f7089h;
                pi6Var2.m13370J(zzccyVar.f36976q);
                pi6Var2.m13371I(zzq.zzd());
                pi6Var2.m13358e(zzccyVar.f36975p);
                ri6 m13356g2 = pi6Var2.m13356g();
                io6 m20567b2 = ho6.m20567b(this.f7082a, so6.m10109f(m13356g2), 5, zzccyVar.f36975p);
                ch6 ch6Var2 = new ch6(null);
                ch6Var2.f5820a = m13356g2;
                ch6Var2.f5821b = null;
                f77 mo13423a2 = this.f7086e.mo13423a(new df6(ch6Var2, null), new ye6() { // from class: com.daaw.xg6
                    @Override // com.daaw.ye6
                    /* renamed from: a */
                    public final qp4 mo3795a(xe6 xe6Var) {
                        n95 m24379j;
                        m24379j = dh6.this.m24379j(xe6Var);
                        return m24379j;
                    }
                }, null);
                this.f7090i = mo13423a2;
                s67.m10625r(mo13423a2, new ah6(this, pz5Var, to6Var, m20567b2, ch6Var2), this.f7083b);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ void m24381h() {
        this.f7085d.mo2194b(tj6.m9071d(6, null, null));
    }

    /* renamed from: i */
    public final void m24380i(int i) {
        this.f7089h.m13374F().m2296a(i);
    }

    /* renamed from: j */
    public final n95 m24379j(xe6 xe6Var) {
        n95 mo26257n = this.f7084c.mo26257n();
        sp4 sp4Var = new sp4();
        sp4Var.m10066c(this.f7082a);
        sp4Var.m10063f(((ch6) xe6Var).f5820a);
        sp4Var.m10064e(this.f7087f);
        mo26257n.mo15380a(sp4Var.m10062g());
        mo26257n.mo15379b(new lw4().m16433q());
        return mo26257n;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        throw null;
    }
}
