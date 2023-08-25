package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class pz3 {

    /* renamed from: a */
    public final Object f23555a = new Object();

    /* renamed from: c */
    public volatile int f23557c = 1;

    /* renamed from: b */
    public volatile long f23556b = 0;

    public /* synthetic */ pz3(oz3 oz3Var) {
    }

    /* renamed from: a */
    public final void m12832a() {
        long mo15860a = zzt.zzB().mo15860a();
        synchronized (this.f23555a) {
            if (this.f23557c == 3) {
                if (this.f23556b + ((Long) zzba.zzc().m23658b(g93.f10825s5)).longValue() <= mo15860a) {
                    this.f23557c = 1;
                }
            }
        }
        long mo15860a2 = zzt.zzB().mo15860a();
        synchronized (this.f23555a) {
            if (this.f23557c != 2) {
                return;
            }
            this.f23557c = 3;
            if (this.f23557c == 3) {
                this.f23556b = mo15860a2;
            }
        }
    }
}
