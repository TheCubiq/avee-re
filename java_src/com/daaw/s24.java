package com.daaw;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class s24 {

    /* renamed from: b */
    public long f25814b;

    /* renamed from: a */
    public final long f25813a = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().m23658b(g93.f10370B)).longValue());

    /* renamed from: c */
    public boolean f25815c = true;

    /* renamed from: a */
    public final void m10750a(SurfaceTexture surfaceTexture, final d24 d24Var) {
        if (d24Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f25815c || Math.abs(timestamp - this.f25814b) >= this.f25813a) {
            this.f25815c = false;
            this.f25814b = timestamp;
            zzs.zza.post(new Runnable() { // from class: com.daaw.r24
                @Override // java.lang.Runnable
                public final void run() {
                    d24.this.zzk();
                }
            });
        }
    }

    /* renamed from: b */
    public final void m10749b() {
        this.f25815c = true;
    }
}
