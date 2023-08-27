package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjm<T> implements zzjv<T> {
    private final zzjg zza;
    private final zzkn<?, ?> zzb;
    private final boolean zzc;
    private final zzhk<?> zzd;

    private zzjm(zzkn<?, ?> zzknVar, zzhk<?> zzhkVar, zzjg zzjgVar) {
        this.zzb = zzknVar;
        this.zzc = zzhkVar.zza(zzjgVar);
        this.zzd = zzhkVar;
        this.zza = zzjgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzjm<T> zza(zzkn<?, ?> zzknVar, zzhk<?> zzhkVar, zzjg zzjgVar) {
        return new zzjm<>(zzknVar, zzhkVar, zzjgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final T zza() {
        return (T) this.zza.zzbu().zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final boolean zza(T t, T t2) {
        if (this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            if (this.zzc) {
                return this.zzd.zza(t).equals(this.zzd.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final int zza(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zzb(T t, T t2) {
        zzjx.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzjx.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zza(T t, zzlk zzlkVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzhq zzhqVar = (zzhq) next.getKey();
            if (zzhqVar.zzc() != zzlh.MESSAGE || zzhqVar.zzd() || zzhqVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzij) {
                zzlkVar.zza(zzhqVar.zza(), (Object) ((zzij) next).zza().zzc());
            } else {
                zzlkVar.zza(zzhqVar.zza(), next.getValue());
            }
        }
        zzkn<?, ?> zzknVar = this.zzb;
        zzknVar.zzb((zzkn<?, ?>) zzknVar.zzb(t), zzlkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzgl zzglVar) throws IOException {
        zzhv zzhvVar = (zzhv) t;
        zzkq zzkqVar = zzhvVar.zzb;
        if (zzkqVar == zzkq.zza()) {
            zzkqVar = zzkq.zzb();
            zzhvVar.zzb = zzkqVar;
        }
        ((zzhv.zzd) t).zza();
        zzhv.zzf zzfVar = null;
        while (i < i2) {
            int zza = zzgi.zza(bArr, i, zzglVar);
            int i3 = zzglVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzgm zzgmVar = null;
                while (zza < i2) {
                    zza = zzgi.zza(bArr, zza, zzglVar);
                    int i5 = zzglVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzfVar != null) {
                                zzjr.zza();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                zza = zzgi.zze(bArr, zza, zzglVar);
                                zzgmVar = (zzgm) zzglVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        zza = zzgi.zza(i5, bArr, zza, i2, zzglVar);
                    } else if (i7 == 0) {
                        zza = zzgi.zza(bArr, zza, zzglVar);
                        i4 = zzglVar.zza;
                        zzfVar = (zzhv.zzf) this.zzd.zza(zzglVar.zzd, this.zza, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzgmVar != null) {
                    zzkqVar.zza((i4 << 3) | 2, zzgmVar);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zzfVar = (zzhv.zzf) this.zzd.zza(zzglVar.zzd, this.zza, i3 >>> 3);
                if (zzfVar != null) {
                    zzjr.zza();
                    throw new NoSuchMethodError();
                }
                i = zzgi.zza(i3, bArr, zza, i2, zzkqVar, zzglVar);
            } else {
                i = zzgi.zza(i3, bArr, zza, i2, zzglVar);
            }
        }
        if (i != i2) {
            throw zzig.zzg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zza(T t, zzjw zzjwVar, zzhi zzhiVar) throws IOException {
        boolean z;
        zzkn<?, ?> zzknVar = this.zzb;
        zzhk<?> zzhkVar = this.zzd;
        Object zzc = zzknVar.zzc(t);
        zzho<?> zzb = zzhkVar.zzb(t);
        do {
            try {
                if (zzjwVar.zza() == Integer.MAX_VALUE) {
                    return;
                }
                int zzb2 = zzjwVar.zzb();
                if (zzb2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzgm zzgmVar = null;
                    while (zzjwVar.zza() != Integer.MAX_VALUE) {
                        int zzb3 = zzjwVar.zzb();
                        if (zzb3 == 16) {
                            i = zzjwVar.zzo();
                            obj = zzhkVar.zza(zzhiVar, this.zza, i);
                        } else if (zzb3 == 26) {
                            if (obj != null) {
                                zzhkVar.zza(zzjwVar, obj, zzhiVar, zzb);
                            } else {
                                zzgmVar = zzjwVar.zzn();
                            }
                        } else if (!zzjwVar.zzc()) {
                            break;
                        }
                    }
                    if (zzjwVar.zzb() != 12) {
                        throw zzig.zze();
                    } else if (zzgmVar != null) {
                        if (obj != null) {
                            zzhkVar.zza(zzgmVar, obj, zzhiVar, zzb);
                        } else {
                            zzknVar.zza((zzkn<?, ?>) zzc, i, zzgmVar);
                        }
                    }
                } else if ((zzb2 & 7) == 2) {
                    Object zza = zzhkVar.zza(zzhiVar, this.zza, zzb2 >>> 3);
                    if (zza != null) {
                        zzhkVar.zza(zzjwVar, zza, zzhiVar, zzb);
                    } else {
                        z = zzknVar.zza((zzkn<?, ?>) zzc, zzjwVar);
                        continue;
                    }
                } else {
                    z = zzjwVar.zzc();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzknVar.zzb((Object) t, (T) zzc);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final int zzb(T t) {
        zzkn<?, ?> zzknVar = this.zzb;
        int zze = zzknVar.zze(zzknVar.zzb(t)) + 0;
        return this.zzc ? zze + this.zzd.zza(t).zzg() : zze;
    }
}
