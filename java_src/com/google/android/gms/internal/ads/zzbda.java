package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbda<T> implements zzbdm<T> {
    private final zzbcu zzdwl;
    private final boolean zzdwm;
    private final zzbee<?, ?> zzdwv;
    private final zzbbd<?> zzdww;

    private zzbda(zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcu zzbcuVar) {
        this.zzdwv = zzbeeVar;
        this.zzdwm = zzbbdVar.zzh(zzbcuVar);
        this.zzdww = zzbbdVar;
        this.zzdwl = zzbcuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzbda<T> zza(zzbee<?, ?> zzbeeVar, zzbbd<?> zzbbdVar, zzbcu zzbcuVar) {
        return new zzbda<>(zzbeeVar, zzbbdVar, zzbcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final boolean equals(T t, T t2) {
        if (this.zzdwv.zzac(t).equals(this.zzdwv.zzac(t2))) {
            if (this.zzdwm) {
                return this.zzdww.zzm(t).equals(this.zzdww.zzm(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final int hashCode(T t) {
        int hashCode = this.zzdwv.zzac(t).hashCode();
        return this.zzdwm ? (hashCode * 53) + this.zzdww.zzm(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final T newInstance() {
        return (T) this.zzdwl.zzadf().zzadj();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza(T t, zzbdl zzbdlVar, zzbbb zzbbbVar) throws IOException {
        boolean z;
        zzbee<?, ?> zzbeeVar = this.zzdwv;
        zzbbd<?> zzbbdVar = this.zzdww;
        Object zzad = zzbeeVar.zzad(t);
        zzbbg<?> zzn = zzbbdVar.zzn(t);
        do {
            try {
                if (zzbdlVar.zzaci() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzbdlVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzbah zzbahVar = null;
                    while (zzbdlVar.zzaci() != Integer.MAX_VALUE) {
                        int tag2 = zzbdlVar.getTag();
                        if (tag2 == 16) {
                            i = zzbdlVar.zzabt();
                            obj = zzbbdVar.zza(zzbbbVar, this.zzdwl, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzbbdVar.zza(zzbdlVar, obj, zzbbbVar, zzn);
                            } else {
                                zzbahVar = zzbdlVar.zzabs();
                            }
                        } else if (!zzbdlVar.zzacj()) {
                            break;
                        }
                    }
                    if (zzbdlVar.getTag() != 12) {
                        throw zzbbu.zzadp();
                    } else if (zzbahVar != null) {
                        if (obj != null) {
                            zzbbdVar.zza(zzbahVar, obj, zzbbbVar, zzn);
                        } else {
                            zzbeeVar.zza((zzbee<?, ?>) zzad, i, zzbahVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzbbdVar.zza(zzbbbVar, this.zzdwl, tag >>> 3);
                    if (zza != null) {
                        zzbbdVar.zza(zzbdlVar, zza, zzbbbVar, zzn);
                    } else {
                        z = zzbeeVar.zza((zzbee<?, ?>) zzad, zzbdlVar);
                        continue;
                    }
                } else {
                    z = zzbdlVar.zzacj();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzbeeVar.zzf(t, zzad);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza(T t, zzbey zzbeyVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzdww.zzm(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzbbi zzbbiVar = (zzbbi) next.getKey();
            if (zzbbiVar.zzacz() != zzbex.MESSAGE || zzbbiVar.zzada() || zzbbiVar.zzadb()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzbeyVar.zza(zzbbiVar.zzhq(), next instanceof zzbbz ? ((zzbbz) next).zzadv().zzaav() : next.getValue());
        }
        zzbee<?, ?> zzbeeVar = this.zzdwv;
        zzbeeVar.zzc(zzbeeVar.zzac(t), zzbeyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[EDGE_INSN: B:50:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzbae zzbaeVar) throws IOException {
        zzbbo zzbboVar = (zzbbo) t;
        zzbef zzbefVar = zzbboVar.zzdtt;
        if (zzbefVar == zzbef.zzagc()) {
            zzbefVar = zzbef.zzagd();
            zzbboVar.zzdtt = zzbefVar;
        }
        zzbef zzbefVar2 = zzbefVar;
        while (i < i2) {
            int zza = zzbad.zza(bArr, i, zzbaeVar);
            int i3 = zzbaeVar.zzdpl;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? zzbad.zza(i3, bArr, zza, i2, zzbefVar2, zzbaeVar) : zzbad.zza(i3, bArr, zza, i2, zzbaeVar);
            } else {
                int i4 = 0;
                zzbah zzbahVar = null;
                while (zza < i2) {
                    zza = zzbad.zza(bArr, zza, zzbaeVar);
                    int i5 = zzbaeVar.zzdpl;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            zza = zzbad.zze(bArr, zza, zzbaeVar);
                            zzbahVar = (zzbah) zzbaeVar.zzdpn;
                        }
                        if (i5 != 12) {
                            break;
                        }
                        zza = zzbad.zza(i5, bArr, zza, i2, zzbaeVar);
                    } else if (i7 == 0) {
                        zza = zzbad.zza(bArr, zza, zzbaeVar);
                        i4 = zzbaeVar.zzdpl;
                    } else if (i5 != 12) {
                    }
                }
                if (zzbahVar != null) {
                    zzbefVar2.zzb((i4 << 3) | 2, zzbahVar);
                }
                i = zza;
            }
        }
        if (i != i2) {
            throw zzbbu.zzadr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final boolean zzaa(T t) {
        return this.zzdww.zzm(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc(T t, T t2) {
        zzbdo.zza(this.zzdwv, t, t2);
        if (this.zzdwm) {
            zzbdo.zza(this.zzdww, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzo(T t) {
        this.zzdwv.zzo(t);
        this.zzdww.zzo(t);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final int zzy(T t) {
        zzbee<?, ?> zzbeeVar = this.zzdwv;
        int zzae = zzbeeVar.zzae(zzbeeVar.zzac(t)) + 0;
        return this.zzdwm ? zzae + this.zzdww.zzm(t).zzacx() : zzae;
    }
}
