package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class k13 implements Runnable {
    public final /* synthetic */ l13 p;

    public k13(l13 l13Var) {
        this.p = l13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<m13> list;
        obj = this.p.r;
        synchronized (obj) {
            l13 l13Var = this.p;
            z = l13Var.s;
            if (z) {
                z2 = l13Var.t;
                if (z2) {
                    l13Var.s = false;
                    k04.zze("App went background");
                    list = this.p.u;
                    for (m13 m13Var : list) {
                        try {
                            m13Var.zza(false);
                        } catch (Exception e) {
                            k04.zzh("", e);
                        }
                    }
                }
            }
            k04.zze("App is still foreground");
        }
    }
}
