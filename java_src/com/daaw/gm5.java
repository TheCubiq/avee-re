package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbf;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class gm5 extends jm5 {

    /* renamed from: h */
    public zzcbf f11443h;

    public gm5(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15210e = context;
        this.f15211f = zzt.zzt().zzb();
        this.f15212g = scheduledExecutorService;
    }

    @Override // com.daaw.jm5, com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        k04.zze(format);
        this.f15206a.m23796c(new pk5(1, format));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final synchronized void mo2196M(Bundle bundle) {
        if (this.f15208c) {
            return;
        }
        this.f15208c = true;
        try {
            this.f15209d.m10957J().mo1907F0(this.f11443h, new im5(this));
        } catch (RemoteException unused) {
            this.f15206a.m23796c(new pk5(1));
        }
    }

    /* renamed from: c */
    public final synchronized f77 m21489c(zzcbf zzcbfVar, long j) {
        if (this.f15207b) {
            return s67.m10628o(this.f15206a, j, TimeUnit.MILLISECONDS, this.f15212g);
        }
        this.f15207b = true;
        this.f11443h = zzcbfVar;
        m18408a();
        f77 m10628o = s67.m10628o(this.f15206a, j, TimeUnit.MILLISECONDS, this.f15212g);
        m10628o.mo6515f(new Runnable() { // from class: com.daaw.fm5
            @Override // java.lang.Runnable
            public final void run() {
                gm5.this.m18407b();
            }
        }, z04.f34310f);
        return m10628o;
    }
}
