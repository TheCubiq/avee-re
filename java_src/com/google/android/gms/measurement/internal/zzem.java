package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzem<V> {
    private static final Object zzf = new Object();
    private final String zza;
    private final zzek<V> zzb;
    private final V zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzg;
    private volatile V zzh;

    private zzem(String str, V v, V v2, zzek<V> zzekVar) {
        this.zze = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zza = str;
        this.zzc = v;
        this.zzd = v2;
        this.zzb = zzekVar;
    }

    public final String zza() {
        return this.zza;
    }

    public final V zza(V v) {
        synchronized (this.zze) {
        }
        if (v != null) {
            return v;
        }
        if (zzen.zza == null) {
            return this.zzc;
        }
        synchronized (zzf) {
            if (zzx.zza()) {
                return this.zzh == null ? this.zzc : this.zzh;
            }
            try {
                for (zzem zzemVar : zzat.zzcr()) {
                    if (zzx.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        if (zzemVar.zzb != null) {
                            v2 = zzemVar.zzb.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (zzf) {
                        zzemVar.zzh = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzek<V> zzekVar = this.zzb;
            if (zzekVar == null) {
                return this.zzc;
            }
            try {
                return zzekVar.zza();
            } catch (IllegalStateException unused3) {
                return this.zzc;
            } catch (SecurityException unused4) {
                return this.zzc;
            }
        }
    }
}
