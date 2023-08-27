package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
@zzadh
/* loaded from: classes2.dex */
public final class zzapp {
    private long zzcyk;
    private final long zzcyj = TimeUnit.MILLISECONDS.toNanos(((Long) zzkb.zzik().zzd(zznk.zzavh)).longValue());
    private boolean zzcyl = true;

    public final void zza(SurfaceTexture surfaceTexture, zzapf zzapfVar) {
        if (zzapfVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzcyl || Math.abs(timestamp - this.zzcyk) >= this.zzcyj) {
            this.zzcyl = false;
            this.zzcyk = timestamp;
            zzakk.zzcrm.post(new zzapq(this, zzapfVar));
        }
    }

    public final void zzsw() {
        this.zzcyl = true;
    }
}
