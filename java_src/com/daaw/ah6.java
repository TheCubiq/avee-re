package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ah6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ pz5 f3209a;

    /* renamed from: b */
    public final /* synthetic */ to6 f3210b;

    /* renamed from: c */
    public final /* synthetic */ io6 f3211c;

    /* renamed from: d */
    public final /* synthetic */ ch6 f3212d;

    /* renamed from: e */
    public final /* synthetic */ dh6 f3213e;

    public ah6(dh6 dh6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, ch6 ch6Var) {
        this.f3213e = dh6Var;
        this.f3209a = pz5Var;
        this.f3210b = to6Var;
        this.f3211c = io6Var;
        this.f3212d = ch6Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        tg6 tg6Var;
        Executor executor;
        final tg6 tg6Var2;
        tg6 tg6Var3;
        vo6 vo6Var;
        to6 to6Var;
        j95 j95Var = (j95) obj;
        synchronized (this.f3213e) {
            cv4 m2128e = j95Var.m2128e();
            tg6Var = this.f3213e.f7085d;
            m2128e.m24966d(tg6Var);
            this.f3209a.mo2496a(j95Var);
            dh6 dh6Var = this.f3213e;
            executor = dh6Var.f7083b;
            tg6Var2 = dh6Var.f7085d;
            tg6Var2.getClass();
            executor.execute(new Runnable() { // from class: com.daaw.yg6
                @Override // java.lang.Runnable
                public final void run() {
                    tg6.this.zzn();
                }
            });
            tg6Var3 = this.f3213e.f7085d;
            tg6Var3.mo3375k();
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f3210b) == null) {
                vo6Var = this.f3213e.f7088g;
                io6 io6Var = this.f3211c;
                io6Var.mo17591d(j95Var.m2126g().f9624b);
                io6Var.mo17583l(j95Var.m2130c().zzg());
                io6Var.zzf(true);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8897f(j95Var.m2126g().f9624b);
                to6Var.m8898e(j95Var.m2130c().zzg());
                io6 io6Var2 = this.f3211c;
                io6Var2.zzf(true);
                to6Var.m8902a(io6Var2);
                to6Var.m8896g();
            }
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        cf6 cf6Var;
        tg6 tg6Var;
        n95 m24379j;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        cf6Var = this.f3213e.f7086e;
        o95 o95Var = (o95) cf6Var.zzd();
        final zze m9073b = o95Var == null ? tj6.m9073b(th, null) : o95Var.zzb().m18391a(th);
        synchronized (this.f3213e) {
            if (o95Var != null) {
                o95Var.mo14354a().mo2194b(m9073b);
                executor = this.f3213e.f7083b;
                executor.execute(new Runnable() { // from class: com.daaw.zg6
                    @Override // java.lang.Runnable
                    public final void run() {
                        tg6 tg6Var2;
                        ah6 ah6Var = ah6.this;
                        zze zzeVar = m9073b;
                        tg6Var2 = ah6Var.f3213e.f7085d;
                        tg6Var2.mo2194b(zzeVar);
                    }
                });
            } else {
                tg6Var = this.f3213e.f7085d;
                tg6Var.mo2194b(m9073b);
                m24379j = this.f3213e.m24379j(this.f3212d);
                m24379j.zze().zzb().m18389c().zzd();
            }
            nj6.m15145b(m9073b.zza, th, "RewardedAdLoader.onFailure");
            this.f3209a.zza();
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f3210b) == null) {
                vo6Var = this.f3213e.f7088g;
                io6 io6Var = this.f3211c;
                io6Var.mo17593b(m9073b);
                io6Var.mo17590e(th);
                io6Var.zzf(false);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8900c(m9073b);
                io6 io6Var2 = this.f3211c;
                io6Var2.mo17590e(th);
                io6Var2.zzf(false);
                to6Var.m8902a(io6Var2);
                to6Var.m8896g();
            }
        }
    }
}
