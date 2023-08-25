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
    public zzcbf h;

    public gm5(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = zzt.zzt().zzb();
        this.g = scheduledExecutorService;
    }

    @Override // com.daaw.jm5, com.daaw.pa.a
    public final void D(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        k04.zze(format);
        this.a.c(new pk5(1, format));
    }

    @Override // com.daaw.pa.a
    public final synchronized void M(Bundle bundle) {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.d.J().F0(this.h, new im5(this));
        } catch (RemoteException unused) {
            this.a.c(new pk5(1));
        }
    }

    public final synchronized f77 c(zzcbf zzcbfVar, long j) {
        if (this.b) {
            return s67.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        }
        this.b = true;
        this.h = zzcbfVar;
        a();
        f77 o = s67.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        o.f(new Runnable() { // from class: com.daaw.fm5
            @Override // java.lang.Runnable
            public final void run() {
                gm5.this.b();
            }
        }, z04.f);
        return o;
    }
}
