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
    public zzcbj h;

    public dm5(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = zzt.zzt().zzb();
        this.g = scheduledExecutorService;
    }

    @Override // com.daaw.pa.a
    public final synchronized void M(Bundle bundle) {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.d.J().U1(this.h, new im5(this));
        } catch (RemoteException unused) {
            this.a.c(new pk5(1));
        }
    }

    public final synchronized f77 c(zzcbj zzcbjVar, long j) {
        if (this.b) {
            return s67.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        }
        this.b = true;
        this.h = zzcbjVar;
        a();
        f77 o = s67.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        o.f(new Runnable() { // from class: com.daaw.cm5
            @Override // java.lang.Runnable
            public final void run() {
                dm5.this.b();
            }
        }, z04.f);
        return o;
    }
}
