package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public abstract class zzdx<T> implements Serializable {
    public static <T> zzdx<T> zzc() {
        return zzdt.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> zzdx<T> zza(T t) {
        return new zzdz(zzdw.zza(t));
    }
}
