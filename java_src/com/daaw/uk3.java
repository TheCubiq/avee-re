package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class uk3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ il3 f29145p;

    /* renamed from: q */
    public final /* synthetic */ bk3 f29146q;

    /* renamed from: r */
    public final /* synthetic */ jl3 f29147r;

    public uk3(jl3 jl3Var, il3 il3Var, bk3 bk3Var) {
        this.f29147r = jl3Var;
        this.f29145p = il3Var;
        this.f29146q = bk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f29147r.f15180a;
        synchronized (obj) {
            if (this.f29145p.m17210a() != -1 && this.f29145p.m17210a() != 1) {
                this.f29145p.m17208c();
                g77 g77Var = z04.f34309e;
                final bk3 bk3Var = this.f29146q;
                g77Var.execute(new Runnable() { // from class: com.daaw.tk3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bk3.this.zzc();
                    }
                });
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
