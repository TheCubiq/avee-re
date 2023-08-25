package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class uk3 implements Runnable {
    public final /* synthetic */ il3 p;
    public final /* synthetic */ bk3 q;
    public final /* synthetic */ jl3 r;

    public uk3(jl3 jl3Var, il3 il3Var, bk3 bk3Var) {
        this.r = jl3Var;
        this.p = il3Var;
        this.q = bk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.r.a;
        synchronized (obj) {
            if (this.p.a() != -1 && this.p.a() != 1) {
                this.p.c();
                g77 g77Var = z04.e;
                final bk3 bk3Var = this.q;
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
