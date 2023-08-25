package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class to6 implements Runnable {

    /* renamed from: q */
    public final vo6 f27931q;

    /* renamed from: r */
    public String f27932r;

    /* renamed from: s */
    public String f27933s;

    /* renamed from: t */
    public ei6 f27934t;

    /* renamed from: u */
    public zze f27935u;

    /* renamed from: v */
    public Future f27936v;

    /* renamed from: p */
    public final List f27930p = new ArrayList();

    /* renamed from: w */
    public int f27937w = 2;

    public to6(vo6 vo6Var) {
        this.f27931q = vo6Var;
    }

    /* renamed from: a */
    public final synchronized to6 m8902a(io6 io6Var) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            List list = this.f27930p;
            io6Var.zzi();
            list.add(io6Var);
            Future future = this.f27936v;
            if (future != null) {
                future.cancel(false);
            }
            this.f27936v = z04.f34308d.schedule(this, ((Integer) zzba.zzc().m23658b(g93.f10539R7)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    /* renamed from: b */
    public final synchronized to6 m8901b(String str) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue() && so6.m10110e(str)) {
            this.f27932r = str;
        }
        return this;
    }

    /* renamed from: c */
    public final synchronized to6 m8900c(zze zzeVar) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            this.f27935u = zzeVar;
        }
        return this;
    }

    /* renamed from: d */
    public final synchronized to6 m8899d(ArrayList arrayList) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.f27937w = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.f27937w = 6;
                            }
                        }
                        this.f27937w = 5;
                    }
                    this.f27937w = 8;
                }
                this.f27937w = 4;
            }
            this.f27937w = 3;
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized to6 m8898e(String str) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            this.f27933s = str;
        }
        return this;
    }

    /* renamed from: f */
    public final synchronized to6 m8897f(ei6 ei6Var) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            this.f27934t = ei6Var;
        }
        return this;
    }

    /* renamed from: g */
    public final synchronized void m8896g() {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            Future future = this.f27936v;
            if (future != null) {
                future.cancel(false);
            }
            for (io6 io6Var : this.f27930p) {
                int i = this.f27937w;
                if (i != 2) {
                    io6Var.mo17592c(i);
                }
                if (!TextUtils.isEmpty(this.f27932r)) {
                    io6Var.mo17594a(this.f27932r);
                }
                if (!TextUtils.isEmpty(this.f27933s) && !io6Var.zzk()) {
                    io6Var.mo17583l(this.f27933s);
                }
                ei6 ei6Var = this.f27934t;
                if (ei6Var != null) {
                    io6Var.mo17591d(ei6Var);
                } else {
                    zze zzeVar = this.f27935u;
                    if (zzeVar != null) {
                        io6Var.mo17593b(zzeVar);
                    }
                }
                this.f27931q.m6969b(io6Var.zzl());
            }
            this.f27930p.clear();
        }
    }

    /* renamed from: h */
    public final synchronized to6 m8895h(int i) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            this.f27937w = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        m8896g();
    }
}
