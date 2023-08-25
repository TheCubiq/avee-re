package com.daaw;

import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class a34 implements Runnable {

    /* renamed from: p */
    public final m24 f2753p;

    /* renamed from: q */
    public boolean f2754q = false;

    public a34(m24 m24Var) {
        this.f2753p = m24Var;
    }

    /* renamed from: a */
    public final void m27720a() {
        this.f2754q = true;
        this.f2753p.m16268w();
    }

    /* renamed from: b */
    public final void m27719b() {
        this.f2754q = false;
        m27718c();
    }

    /* renamed from: c */
    public final void m27718c() {
        gv6 gv6Var = zzs.zza;
        gv6Var.removeCallbacks(this);
        gv6Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2754q) {
            return;
        }
        this.f2753p.m16268w();
        m27718c();
    }
}
