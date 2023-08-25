package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class pz3 {
    public final Object a = new Object();
    public volatile int c = 1;
    public volatile long b = 0;

    public /* synthetic */ pz3(oz3 oz3Var) {
    }

    public final void a() {
        long a = zzt.zzB().a();
        synchronized (this.a) {
            if (this.c == 3) {
                if (this.b + ((Long) zzba.zzc().b(g93.s5)).longValue() <= a) {
                    this.c = 1;
                }
            }
        }
        long a2 = zzt.zzB().a();
        synchronized (this.a) {
            if (this.c != 2) {
                return;
            }
            this.c = 3;
            if (this.c == 3) {
                this.b = a2;
            }
        }
    }
}
