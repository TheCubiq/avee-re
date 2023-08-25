package com.daaw;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class qd6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ pz5 f23875a;

    /* renamed from: b */
    public final /* synthetic */ to6 f23876b;

    /* renamed from: c */
    public final /* synthetic */ io6 f23877c;

    /* renamed from: d */
    public final /* synthetic */ zj4 f23878d;

    /* renamed from: e */
    public final /* synthetic */ rd6 f23879e;

    public qd6(rd6 rd6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, zj4 zj4Var) {
        this.f23879e = rd6Var;
        this.f23875a = pz5Var;
        this.f23876b = to6Var;
        this.f23877c = io6Var;
        this.f23878d = zj4Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        jt4 jt4Var;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        final az5 az5Var;
        az5 az5Var2;
        ez5 ez5Var;
        zi4 zi4Var = (zi4) obj;
        synchronized (this.f23879e) {
            this.f23879e.f25186l = null;
            viewGroup = this.f23879e.f25180f;
            viewGroup.removeAllViews();
            if (zi4Var.mo2274i() != null) {
                ViewParent parent = zi4Var.mo2274i().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zi4Var.m2130c() != null ? zi4Var.m2130c().zzg() : "";
                    k04.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zi4Var.mo2274i());
                }
            }
            y83 y83Var = g93.f10805q7;
            if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
                cv4 m2128e = zi4Var.m2128e();
                az5Var2 = this.f23879e.f25178d;
                m2128e.m24969a(az5Var2);
                ez5Var = this.f23879e.f25179e;
                m2128e.m24967c(ez5Var);
            }
            viewGroup2 = this.f23879e.f25180f;
            viewGroup2.addView(zi4Var.mo2274i());
            this.f23875a.mo2496a(zi4Var);
            if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
                rd6 rd6Var = this.f23879e;
                executor = rd6Var.f25176b;
                az5Var = rd6Var.f25178d;
                az5Var.getClass();
                executor.execute(new Runnable() { // from class: com.daaw.od6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5.this.zzn();
                    }
                });
            }
            jt4Var = this.f23879e.f25182h;
            jt4Var.m18252C0(zi4Var.mo2275h());
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f23876b) == null) {
                vo6Var = this.f23879e.f25183i;
                io6 io6Var = this.f23877c;
                io6Var.mo17591d(zi4Var.m2126g().f9624b);
                io6Var.mo17583l(zi4Var.m2130c().zzg());
                io6Var.zzf(true);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8897f(zi4Var.m2126g().f9624b);
                to6Var.m8898e(zi4Var.m2130c().zzg());
                io6 io6Var2 = this.f23877c;
                io6Var2.zzf(true);
                to6Var.m8902a(io6Var2);
                to6Var.m8896g();
            }
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        jt4 jt4Var;
        wv4 wv4Var;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        final zze m18391a = this.f23878d.mo2199d().m18391a(th);
        synchronized (this.f23879e) {
            this.f23879e.f25186l = null;
            this.f23878d.mo2198e().mo2194b(m18391a);
            if (((Boolean) zzba.zzc().m23658b(g93.f10805q7)).booleanValue()) {
                executor = this.f23879e.f25176b;
                executor.execute(new Runnable() { // from class: com.daaw.pd6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5 az5Var;
                        qd6 qd6Var = qd6.this;
                        zze zzeVar = m18391a;
                        az5Var = qd6Var.f23879e.f25178d;
                        az5Var.mo2194b(zzeVar);
                    }
                });
            }
            rd6 rd6Var = this.f23879e;
            jt4Var = rd6Var.f25182h;
            wv4Var = rd6Var.f25184j;
            jt4Var.m18252C0(wv4Var.m5764a());
            nj6.m15145b(m18391a.zza, th, "BannerAdLoader.onFailure");
            this.f23875a.zza();
            if (!((Boolean) ta3.f27158c.m16137e()).booleanValue() || (to6Var = this.f23876b) == null) {
                vo6Var = this.f23879e.f25183i;
                io6 io6Var = this.f23877c;
                io6Var.mo17593b(m18391a);
                io6Var.mo17590e(th);
                io6Var.zzf(false);
                vo6Var.m6969b(io6Var.zzl());
            } else {
                to6Var.m8900c(m18391a);
                io6 io6Var2 = this.f23877c;
                io6Var2.mo17590e(th);
                io6Var2.zzf(false);
                to6Var.m8902a(io6Var2);
                to6Var.m8896g();
            }
        }
    }
}
