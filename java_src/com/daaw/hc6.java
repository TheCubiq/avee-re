package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class hc6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ pz5 f12415a;

    /* renamed from: b */
    public final /* synthetic */ to6 f12416b;

    /* renamed from: c */
    public final /* synthetic */ io6 f12417c;

    /* renamed from: d */
    public final /* synthetic */ jc6 f12418d;

    /* renamed from: e */
    public final /* synthetic */ kc6 f12419e;

    public hc6(kc6 kc6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, jc6 jc6Var) {
        this.f12419e = kc6Var;
        this.f12415a = pz5Var;
        this.f12416b = to6Var;
        this.f12417c = io6Var;
        this.f12418d = jc6Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        vo6 vo6Var;
        to6 to6Var;
        dd6 dd6Var;
        zl4 zl4Var = (zl4) obj;
        synchronized (this.f12419e) {
            this.f12419e.f16185j = null;
            if (((Boolean) zzba.zzc().m23658b(g93.f10816r7)).booleanValue()) {
                cv4 m2128e = zl4Var.m2128e();
                dd6Var = this.f12419e.f16179d;
                m2128e.m24968b(dd6Var);
            }
            this.f12415a.mo2496a(zl4Var);
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f12416b) == null) {
                vo6Var = this.f12419e.f16183h;
                io6 io6Var = this.f12417c;
                io6Var.mo17591d(zl4Var.m2126g().f9624b);
                io6Var.mo17583l(zl4Var.m2130c().zzg());
                io6Var.zzf(true);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8897f(zl4Var.m2126g().f9624b);
                to6Var.m8898e(zl4Var.m2130c().zzg());
                io6 io6Var2 = this.f12417c;
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
        dd6 dd6Var;
        qp4 m17794l;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        cf6Var = this.f12419e.f16180e;
        di4 di4Var = (di4) cf6Var.zzd();
        final zze m9073b = di4Var == null ? tj6.m9073b(th, null) : di4Var.zzb().m18391a(th);
        synchronized (this.f12419e) {
            this.f12419e.f16185j = null;
            if (di4Var != null) {
                di4Var.zzc().mo2194b(m9073b);
                if (((Boolean) zzba.zzc().m23658b(g93.f10816r7)).booleanValue()) {
                    executor = this.f12419e.f16177b;
                    executor.execute(new Runnable() { // from class: com.daaw.gc6
                        @Override // java.lang.Runnable
                        public final void run() {
                            dd6 dd6Var2;
                            hc6 hc6Var = hc6.this;
                            zze zzeVar = m9073b;
                            dd6Var2 = hc6Var.f12419e.f16179d;
                            dd6Var2.mo2194b(zzeVar);
                        }
                    });
                }
            } else {
                dd6Var = this.f12419e.f16179d;
                dd6Var.mo2194b(m9073b);
                m17794l = this.f12419e.m17794l(this.f12418d);
                ((di4) m17794l.zzh()).zzb().m18389c().zzd();
            }
            nj6.m15145b(m9073b.zza, th, "AppOpenAdLoader.onFailure");
            this.f12415a.zza();
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f12416b) == null) {
                vo6Var = this.f12419e.f16183h;
                io6 io6Var = this.f12417c;
                io6Var.mo17593b(m9073b);
                io6Var.mo17590e(th);
                io6Var.zzf(false);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8900c(m9073b);
                io6 io6Var2 = this.f12417c;
                io6Var2.mo17590e(th);
                io6Var2.zzf(false);
                to6Var.m8902a(io6Var2);
                to6Var.m8896g();
            }
        }
    }
}
