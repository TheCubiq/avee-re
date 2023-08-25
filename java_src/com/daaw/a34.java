package com.daaw;

import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class a34 implements Runnable {
    public final m24 p;
    public boolean q = false;

    public a34(m24 m24Var) {
        this.p = m24Var;
    }

    public final void a() {
        this.q = true;
        this.p.w();
    }

    public final void b() {
        this.q = false;
        c();
    }

    public final void c() {
        gv6 gv6Var = zzs.zza;
        gv6Var.removeCallbacks(this);
        gv6Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.q) {
            return;
        }
        this.p.w();
        c();
    }
}
