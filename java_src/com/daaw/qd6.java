package com.daaw;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class qd6 implements o67 {
    public final /* synthetic */ pz5 a;
    public final /* synthetic */ to6 b;
    public final /* synthetic */ io6 c;
    public final /* synthetic */ zj4 d;
    public final /* synthetic */ rd6 e;

    public qd6(rd6 rd6Var, pz5 pz5Var, to6 to6Var, io6 io6Var, zj4 zj4Var) {
        this.e = rd6Var;
        this.a = pz5Var;
        this.b = to6Var;
        this.c = io6Var;
        this.d = zj4Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
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
        synchronized (this.e) {
            this.e.l = null;
            viewGroup = this.e.f;
            viewGroup.removeAllViews();
            if (zi4Var.i() != null) {
                ViewParent parent = zi4Var.i().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zi4Var.c() != null ? zi4Var.c().zzg() : "";
                    k04.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zi4Var.i());
                }
            }
            y83 y83Var = g93.q7;
            if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
                cv4 e = zi4Var.e();
                az5Var2 = this.e.d;
                e.a(az5Var2);
                ez5Var = this.e.e;
                e.c(ez5Var);
            }
            viewGroup2 = this.e.f;
            viewGroup2.addView(zi4Var.i());
            this.a.a(zi4Var);
            if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
                rd6 rd6Var = this.e;
                executor = rd6Var.b;
                az5Var = rd6Var.d;
                az5Var.getClass();
                executor.execute(new Runnable() { // from class: com.daaw.od6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5.this.zzn();
                    }
                });
            }
            jt4Var = this.e.h;
            jt4Var.C0(zi4Var.h());
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.i;
                io6 io6Var = this.c;
                io6Var.d(zi4Var.g().b);
                io6Var.l(zi4Var.c().zzg());
                io6Var.zzf(true);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.f(zi4Var.g().b);
                to6Var.e(zi4Var.c().zzg());
                io6 io6Var2 = this.c;
                io6Var2.zzf(true);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        jt4 jt4Var;
        wv4 wv4Var;
        vo6 vo6Var;
        to6 to6Var;
        Executor executor;
        final zze a = this.d.d().a(th);
        synchronized (this.e) {
            this.e.l = null;
            this.d.e().b(a);
            if (((Boolean) zzba.zzc().b(g93.q7)).booleanValue()) {
                executor = this.e.b;
                executor.execute(new Runnable() { // from class: com.daaw.pd6
                    @Override // java.lang.Runnable
                    public final void run() {
                        az5 az5Var;
                        qd6 qd6Var = qd6.this;
                        zze zzeVar = a;
                        az5Var = qd6Var.e.d;
                        az5Var.b(zzeVar);
                    }
                });
            }
            rd6 rd6Var = this.e;
            jt4Var = rd6Var.h;
            wv4Var = rd6Var.j;
            jt4Var.C0(wv4Var.a());
            nj6.b(a.zza, th, "BannerAdLoader.onFailure");
            this.a.zza();
            if (!((Boolean) ta3.c.e()).booleanValue() || (to6Var = this.b) == null) {
                vo6Var = this.e.i;
                io6 io6Var = this.c;
                io6Var.b(a);
                io6Var.e(th);
                io6Var.zzf(false);
                vo6Var.b(io6Var.zzl());
            } else {
                to6Var.c(a);
                io6 io6Var2 = this.c;
                io6Var2.e(th);
                io6Var2.zzf(false);
                to6Var.a(io6Var2);
                to6Var.g();
            }
        }
    }
}
