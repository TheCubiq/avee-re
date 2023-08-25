package com.daaw;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class s24 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().b(g93.B)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, final d24 d24Var) {
        if (d24Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.c || Math.abs(timestamp - this.b) >= this.a) {
            this.c = false;
            this.b = timestamp;
            zzs.zza.post(new Runnable() { // from class: com.daaw.r24
                @Override // java.lang.Runnable
                public final void run() {
                    d24.this.zzk();
                }
            });
        }
    }

    public final void b() {
        this.c = true;
    }
}
