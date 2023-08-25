package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbj;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class dm5 extends jm5 {

    /* renamed from: h */
    public zzcbj f7482h;

    public dm5(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15210e = context;
        this.f15211f = zzt.zzt().zzb();
        this.f15212g = scheduledExecutorService;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final synchronized void mo2196M(Bundle bundle) {
        if (this.f15208c) {
            return;
        }
        this.f15208c = true;
        try {
            this.f15209d.m10957J().mo1906U1(this.f7482h, new im5(this));
        } catch (RemoteException unused) {
            this.f15206a.m23796c(new pk5(1));
        }
    }

    /* renamed from: c */
    public final synchronized f77 m24215c(zzcbj zzcbjVar, long j) {
        if (this.f15207b) {
            return s67.m10628o(this.f15206a, j, TimeUnit.MILLISECONDS, this.f15212g);
        }
        this.f15207b = true;
        this.f7482h = zzcbjVar;
        m18408a();
        f77 m10628o = s67.m10628o(this.f15206a, j, TimeUnit.MILLISECONDS, this.f15212g);
        m10628o.mo6515f(new Runnable() { // from class: com.daaw.cm5
            @Override // java.lang.Runnable
            public final void run() {
                dm5.this.m18407b();
            }
        }, z04.f34310f);
        return m10628o;
    }
}
