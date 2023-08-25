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
    public final vo6 q;
    public String r;
    public String s;
    public ei6 t;
    public zze u;
    public Future v;
    public final List p = new ArrayList();
    public int w = 2;

    public to6(vo6 vo6Var) {
        this.q = vo6Var;
    }

    public final synchronized to6 a(io6 io6Var) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            List list = this.p;
            io6Var.zzi();
            list.add(io6Var);
            Future future = this.v;
            if (future != null) {
                future.cancel(false);
            }
            this.v = z04.d.schedule(this, ((Integer) zzba.zzc().b(g93.R7)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized to6 b(String str) {
        if (((Boolean) ta3.c.e()).booleanValue() && so6.e(str)) {
            this.r = str;
        }
        return this;
    }

    public final synchronized to6 c(zze zzeVar) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            this.u = zzeVar;
        }
        return this;
    }

    public final synchronized to6 d(ArrayList arrayList) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.w = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.w = 6;
                            }
                        }
                        this.w = 5;
                    }
                    this.w = 8;
                }
                this.w = 4;
            }
            this.w = 3;
        }
        return this;
    }

    public final synchronized to6 e(String str) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            this.s = str;
        }
        return this;
    }

    public final synchronized to6 f(ei6 ei6Var) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            this.t = ei6Var;
        }
        return this;
    }

    public final synchronized void g() {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            Future future = this.v;
            if (future != null) {
                future.cancel(false);
            }
            for (io6 io6Var : this.p) {
                int i = this.w;
                if (i != 2) {
                    io6Var.c(i);
                }
                if (!TextUtils.isEmpty(this.r)) {
                    io6Var.a(this.r);
                }
                if (!TextUtils.isEmpty(this.s) && !io6Var.zzk()) {
                    io6Var.l(this.s);
                }
                ei6 ei6Var = this.t;
                if (ei6Var != null) {
                    io6Var.d(ei6Var);
                } else {
                    zze zzeVar = this.u;
                    if (zzeVar != null) {
                        io6Var.b(zzeVar);
                    }
                }
                this.q.b(io6Var.zzl());
            }
            this.p.clear();
        }
    }

    public final synchronized to6 h(int i) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            this.w = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
