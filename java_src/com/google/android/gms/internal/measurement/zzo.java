package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzo implements zzn {
    @Override // com.google.android.gms.internal.measurement.zzn
    public final Runnable zza(Runnable runnable) {
        return runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    public final <V> Callable<V> zza(Callable<V> callable) {
        return callable;
    }
}
