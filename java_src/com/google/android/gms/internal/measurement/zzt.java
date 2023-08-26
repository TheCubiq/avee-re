package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzt extends zzz {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    @Override // com.google.android.gms.internal.measurement.zzw
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            this.zza.set(bundle);
            this.zzb = true;
            this.zza.notify();
        }
    }

    public final String zza(long j) {
        return (String) zza(zzb(j), String.class);
    }

    public final Bundle zzb(long j) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T zza(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }
}
