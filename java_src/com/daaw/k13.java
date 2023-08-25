package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class k13 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ l13 f15593p;

    public k13(l13 l13Var) {
        this.f15593p = l13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<m13> list;
        obj = this.f15593p.f16950r;
        synchronized (obj) {
            l13 l13Var = this.f15593p;
            z = l13Var.f16951s;
            if (z) {
                z2 = l13Var.f16952t;
                if (z2) {
                    l13Var.f16951s = false;
                    k04.zze("App went background");
                    list = this.f15593p.f16953u;
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
