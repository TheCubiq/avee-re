package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class xz5 implements qz5 {
    @GuardedBy("this")

    /* renamed from: a */
    public final pi6 f33134a;

    /* renamed from: b */
    public final b94 f33135b;

    /* renamed from: c */
    public final Context f33136c;

    /* renamed from: d */
    public final nz5 f33137d;

    /* renamed from: e */
    public final vo6 f33138e;
    @GuardedBy("this")

    /* renamed from: f */
    public qm4 f33139f;

    public xz5(b94 b94Var, Context context, nz5 nz5Var, pi6 pi6Var) {
        this.f33135b = b94Var;
        this.f33136c = context;
        this.f33137d = nz5Var;
        this.f33134a = pi6Var;
        this.f33138e = b94Var.mo26308D();
        pi6Var.m13368L(nz5Var.m14705d());
    }

    @Override // com.daaw.qz5
    /* renamed from: a */
    public final boolean mo4385a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        to6 to6Var;
        Executor mo26277c;
        Runnable runnable;
        zzt.zzp();
        if (zzs.zzD(this.f33136c) && zzlVar.zzs == null) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            mo26277c = this.f33135b.mo26277c();
            runnable = new Runnable() { // from class: com.daaw.sz5
                @Override // java.lang.Runnable
                public final void run() {
                    xz5.this.m4381e();
                }
            };
        } else if (str != null) {
            nj6.m15146a(this.f33136c, zzlVar.zzf);
            if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && zzlVar.zzf) {
                this.f33135b.mo26253p().m24398m(true);
            }
            int i = ((rz5) oz5Var).f25731a;
            pi6 pi6Var = this.f33134a;
            pi6Var.m13358e(zzlVar);
            pi6Var.m13363Q(i);
            ri6 m13356g = pi6Var.m13356g();
            io6 m20567b = ho6.m20567b(this.f33136c, so6.m10109f(m13356g), 8, zzlVar);
            zzcb zzcbVar = m13356g.f25354n;
            if (zzcbVar != null) {
                this.f33137d.m14705d().m26579W(zzcbVar);
            }
            p15 mo26259m = this.f33135b.mo26259m();
            sp4 sp4Var = new sp4();
            sp4Var.m10066c(this.f33136c);
            sp4Var.m10063f(m13356g);
            mo26259m.mo13761e(sp4Var.m10062g());
            lw4 lw4Var = new lw4();
            lw4Var.m16436n(this.f33137d.m14705d(), this.f33135b.mo26277c());
            mo26259m.mo13760l(lw4Var.m16433q());
            mo26259m.mo13762d(this.f33137d.m14706c());
            mo26259m.mo13763c(new wi4(null));
            q15 zzg = mo26259m.zzg();
            if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
                to6 mo12805e = zzg.mo12805e();
                mo12805e.m8895h(8);
                mo12805e.m8901b(zzlVar.zzp);
                to6Var = mo12805e;
            } else {
                to6Var = null;
            }
            this.f33135b.mo26312B().m13327c(1);
            g77 g77Var = z04.f34305a;
            e08.m23801b(g77Var);
            ScheduledExecutorService mo26275d = this.f33135b.mo26275d();
            jn4 mo12809a = zzg.mo12809a();
            qm4 qm4Var = new qm4(g77Var, mo26275d, mo12809a.m18383i(mo12809a.m18382j()));
            this.f33139f = qm4Var;
            qm4Var.m12330e(new wz5(this, pz5Var, to6Var, m20567b, zzg));
            return true;
        } else {
            k04.zzg("Ad unit ID should not be null for NativeAdLoader.");
            mo26277c = this.f33135b.mo26277c();
            runnable = new Runnable() { // from class: com.daaw.tz5
                @Override // java.lang.Runnable
                public final void run() {
                    xz5.this.m4380f();
                }
            };
        }
        mo26277c.execute(runnable);
        return false;
    }

    /* renamed from: e */
    public final /* synthetic */ void m4381e() {
        this.f33137d.m14708a().mo2194b(tj6.m9071d(4, null, null));
    }

    /* renamed from: f */
    public final /* synthetic */ void m4380f() {
        this.f33137d.m14708a().mo2194b(tj6.m9071d(6, null, null));
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        qm4 qm4Var = this.f33139f;
        return qm4Var != null && qm4Var.m12329f();
    }
}
