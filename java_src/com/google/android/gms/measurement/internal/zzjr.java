package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjr implements Runnable {
    private final /* synthetic */ ComponentName zza;
    private final /* synthetic */ zzjp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjr(zzjp zzjpVar, ComponentName componentName) {
        this.zzb = zzjpVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zza(this.zza);
    }
}
