package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class qf6 implements qz5 {

    /* renamed from: a */
    public final Context f23914a;

    /* renamed from: b */
    public final Executor f23915b;

    /* renamed from: c */
    public final b94 f23916c;

    /* renamed from: d */
    public final az5 f23917d;

    /* renamed from: e */
    public final tg6 f23918e;

    /* renamed from: f */
    public fa3 f23919f;

    /* renamed from: g */
    public final vo6 f23920g;
    @GuardedBy("this")

    /* renamed from: h */
    public final pi6 f23921h;
    @GuardedBy("this")

    /* renamed from: i */
    public f77 f23922i;

    public qf6(Context context, Executor executor, b94 b94Var, az5 az5Var, tg6 tg6Var, pi6 pi6Var) {
        this.f23914a = context;
        this.f23915b = executor;
        this.f23916c = b94Var;
        this.f23917d = az5Var;
        this.f23921h = pi6Var;
        this.f23918e = tg6Var;
        this.f23920g = b94Var.mo26308D();
    }

    @Override // com.daaw.qz5
    /* renamed from: a */
    public final boolean mo4385a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        s05 zzf;
        to6 to6Var;
        if (str == null) {
            k04.zzg("Ad unit ID should not be null for interstitial ad.");
            this.f23915b.execute(new Runnable() { // from class: com.daaw.kf6
                @Override // java.lang.Runnable
                public final void run() {
                    qf6.this.m12557g();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && zzlVar.zzf) {
                this.f23916c.mo26253p().m24398m(true);
            }
            zzq zzqVar = ((jf6) oz5Var).f15075a;
            pi6 pi6Var = this.f23921h;
            pi6Var.m13370J(str);
            pi6Var.m13371I(zzqVar);
            pi6Var.m13358e(zzlVar);
            ri6 m13356g = pi6Var.m13356g();
            io6 m20567b = ho6.m20567b(this.f23914a, so6.m10109f(m13356g), 4, zzlVar);
            if (((Boolean) zzba.zzc().m23658b(g93.f10827s7)).booleanValue()) {
                r05 mo26261l = this.f23916c.mo26261l();
                sp4 sp4Var = new sp4();
                sp4Var.m10066c(this.f23914a);
                sp4Var.m10063f(m13356g);
                mo26261l.mo7275g(sp4Var.m10062g());
                lw4 lw4Var = new lw4();
                lw4Var.m16437m(this.f23917d, this.f23915b);
                lw4Var.m16436n(this.f23917d, this.f23915b);
                mo26261l.mo7272m(lw4Var.m16433q());
                mo26261l.mo7274h(new cx5(this.f23919f));
                zzf = mo26261l.zzf();
            } else {
                lw4 lw4Var2 = new lw4();
                tg6 tg6Var = this.f23918e;
                if (tg6Var != null) {
                    lw4Var2.m16442h(tg6Var, this.f23915b);
                    lw4Var2.m16441i(this.f23918e, this.f23915b);
                    lw4Var2.m16445e(this.f23918e, this.f23915b);
                }
                r05 mo26261l2 = this.f23916c.mo26261l();
                sp4 sp4Var2 = new sp4();
                sp4Var2.m10066c(this.f23914a);
                sp4Var2.m10063f(m13356g);
                mo26261l2.mo7275g(sp4Var2.m10062g());
                lw4Var2.m16437m(this.f23917d, this.f23915b);
                lw4Var2.m16442h(this.f23917d, this.f23915b);
                lw4Var2.m16441i(this.f23917d, this.f23915b);
                lw4Var2.m16445e(this.f23917d, this.f23915b);
                lw4Var2.m16446d(this.f23917d, this.f23915b);
                lw4Var2.m16435o(this.f23917d, this.f23915b);
                lw4Var2.m16436n(this.f23917d, this.f23915b);
                lw4Var2.m16438l(this.f23917d, this.f23915b);
                lw4Var2.m16444f(this.f23917d, this.f23915b);
                mo26261l2.mo7272m(lw4Var2.m16433q());
                mo26261l2.mo7274h(new cx5(this.f23919f));
                zzf = mo26261l2.zzf();
            }
            s05 s05Var = zzf;
            if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
                to6 mo5262d = s05Var.mo5262d();
                mo5262d.m8895h(4);
                mo5262d.m8901b(zzlVar.zzp);
                to6Var = mo5262d;
            } else {
                to6Var = null;
            }
            jn4 mo5265a = s05Var.mo5265a();
            f77 m18383i = mo5265a.m18383i(mo5265a.m18382j());
            this.f23922i = m18383i;
            s67.m10625r(m18383i, new pf6(this, pz5Var, to6Var, m20567b, s05Var), this.f23915b);
            return true;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m12557g() {
        this.f23917d.mo2194b(tj6.m9071d(6, null, null));
    }

    /* renamed from: h */
    public final void m12556h(fa3 fa3Var) {
        this.f23919f = fa3Var;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.f23922i;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
