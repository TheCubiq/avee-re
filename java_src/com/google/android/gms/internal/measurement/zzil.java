package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public class zzil {
    private static final zzhi zza = zzhi.zza();
    private zzgm zzb;
    private volatile zzjg zzc;
    private volatile zzgm zzd;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzil) {
            zzil zzilVar = (zzil) obj;
            zzjg zzjgVar = this.zzc;
            zzjg zzjgVar2 = zzilVar.zzc;
            if (zzjgVar == null && zzjgVar2 == null) {
                return zzc().equals(zzilVar.zzc());
            }
            if (zzjgVar == null || zzjgVar2 == null) {
                if (zzjgVar != null) {
                    return zzjgVar.equals(zzilVar.zzb(zzjgVar.zzbv()));
                }
                return zzb(zzjgVar2.zzbv()).equals(zzjgVar2);
            }
            return zzjgVar.equals(zzjgVar2);
        }
        return false;
    }

    private final zzjg zzb(zzjg zzjgVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzjgVar;
                        this.zzd = zzgm.zza;
                    } catch (zzig unused) {
                        this.zzc = zzjgVar;
                        this.zzd = zzgm.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final zzjg zza(zzjg zzjgVar) {
        zzjg zzjgVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzjgVar;
        return zzjgVar2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbp();
        }
        return 0;
    }

    public final zzgm zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzgm.zza;
            } else {
                this.zzd = this.zzc.zzbj();
            }
            return this.zzd;
        }
    }
}
