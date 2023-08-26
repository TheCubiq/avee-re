package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzhd implements zzjw {
    private final zzgy zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public static zzhd zza(zzgy zzgyVar) {
        if (zzgyVar.zzc != null) {
            return zzgyVar.zzc;
        }
        return new zzhd(zzgyVar);
    }

    private zzhd(zzgy zzgyVar) {
        zzgy zzgyVar2 = (zzgy) zzhx.zza(zzgyVar, "input");
        this.zza = zzgyVar2;
        zzgyVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zza() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zza();
        }
        int i2 = this.zzb;
        if (i2 == 0 || i2 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final boolean zzc() throws IOException {
        int i;
        if (this.zza.zzt() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzb(i);
    }

    private final void zza(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final double zzd() throws IOException {
        zza(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final float zze() throws IOException {
        zza(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final long zzf() throws IOException {
        zza(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final long zzg() throws IOException {
        zza(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzh() throws IOException {
        zza(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final long zzi() throws IOException {
        zza(1);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzj() throws IOException {
        zza(5);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final boolean zzk() throws IOException {
        zza(0);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final String zzl() throws IOException {
        zza(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final String zzm() throws IOException {
        zza(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final <T> T zza(zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        zza(2);
        return (T) zzc(zzjvVar, zzhiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final <T> T zzb(zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        zza(3);
        return (T) zzd(zzjvVar, zzhiVar);
    }

    private final <T> T zzc(zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        int zzm = this.zza.zzm();
        if (this.zza.zza >= this.zza.zzb) {
            throw new zzig("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzc = this.zza.zzc(zzm);
        T zza = zzjvVar.zza();
        this.zza.zza++;
        zzjvVar.zza(zza, this, zzhiVar);
        zzjvVar.zzc(zza);
        this.zza.zza(0);
        zzgy zzgyVar = this.zza;
        zzgyVar.zza--;
        this.zza.zzd(zzc);
        return zza;
    }

    private final <T> T zzd(zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T zza = zzjvVar.zza();
            zzjvVar.zza(zza, this, zzhiVar);
            zzjvVar.zzc(zza);
            if (this.zzb == this.zzc) {
                return zza;
            }
            throw zzig.zzg();
        } finally {
            this.zzc = i;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final zzgm zzn() throws IOException {
        zza(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzo() throws IOException {
        zza(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzp() throws IOException {
        zza(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzq() throws IOException {
        zza(5);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final long zzr() throws IOException {
        zza(1);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final int zzs() throws IOException {
        zza(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final long zzt() throws IOException {
        zza(0);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zza(List<Double> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhg) {
            zzhg zzhgVar = (zzhg) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzhgVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zzhgVar.zza(this.zza.zzb());
                } while (this.zza.zzu() < zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzu() < zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzb(List<Float> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhu) {
            zzhu zzhuVar = (zzhu) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zzhuVar.zza(this.zza.zzc());
                } while (this.zza.zzu() < zzu);
                return;
            } else if (i == 5) {
                do {
                    zzhuVar.zza(this.zza.zzc());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Float.valueOf(this.zza.zzc()));
            } while (this.zza.zzu() < zzu2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzc(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zziuVar.zza(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zziuVar.zza(this.zza.zzd());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zzd()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzd(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zziuVar.zza(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zziuVar.zza(this.zza.zze());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zze()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zze(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzhyVar.zzd(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzhyVar.zzd(this.zza.zzf());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzf(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zziuVar.zza(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zziuVar.zza(this.zza.zzg());
                } while (this.zza.zzu() < zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Long.valueOf(this.zza.zzg()));
            } while (this.zza.zzu() < zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzg(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zzhyVar.zzd(this.zza.zzh());
                } while (this.zza.zzu() < zzu);
                return;
            } else if (i == 5) {
                do {
                    zzhyVar.zzd(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzu() < zzu2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzh(List<Boolean> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzgk) {
            zzgk zzgkVar = (zzgk) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgkVar.zza(this.zza.zzi());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzgkVar.zza(this.zza.zzi());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzi()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Boolean.valueOf(this.zza.zzi()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzi(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzj(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zza;
        int zza2;
        if ((this.zzb & 7) != 2) {
            throw zzig.zzf();
        }
        if ((list instanceof zzin) && !z) {
            zzin zzinVar = (zzin) list;
            do {
                zzinVar.zza(zzn());
                if (this.zza.zzt()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
            return;
        }
        do {
            list.add(z ? zzm() : zzl());
            if (this.zza.zzt()) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjw
    public final <T> void zza(List<T> list, zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzig.zzf();
        }
        do {
            list.add(zzc(zzjvVar, zzhiVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjw
    public final <T> void zzb(List<T> list, zzjv<T> zzjvVar, zzhi zzhiVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzig.zzf();
        }
        do {
            list.add(zzd(zzjvVar, zzhiVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzk(List<zzgm> list) throws IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw zzig.zzf();
        }
        do {
            list.add(zzn());
            if (this.zza.zzt()) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzl(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzhyVar.zzd(this.zza.zzm());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzhyVar.zzd(this.zza.zzm());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzm(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzhyVar.zzd(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzhyVar.zzd(this.zza.zzn());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzn(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzm = this.zza.zzm();
                zzc(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zzhyVar.zzd(this.zza.zzo());
                } while (this.zza.zzu() < zzu);
                return;
            } else if (i == 5) {
                do {
                    zzhyVar.zzd(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzc(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Integer.valueOf(this.zza.zzo()));
            } while (this.zza.zzu() < zzu2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzo(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zziuVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzm = this.zza.zzm();
                zzb(zzm);
                int zzu = this.zza.zzu() + zzm;
                do {
                    zziuVar.zza(this.zza.zzp());
                } while (this.zza.zzu() < zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzm2 = this.zza.zzm();
            zzb(zzm2);
            int zzu2 = this.zza.zzu() + zzm2;
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzu() < zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzp(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzhyVar.zzd(this.zza.zzq());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzhyVar.zzd(this.zza.zzq());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzq()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Integer.valueOf(this.zza.zzq()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjw
    public final void zzq(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zziuVar.zza(this.zza.zzr());
                    if (this.zza.zzt()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zziuVar.zza(this.zza.zzr());
                } while (this.zza.zzu() < zzu);
                zzd(zzu);
                return;
            } else {
                throw zzig.zzf();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzr()));
                if (this.zza.zzt()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(Long.valueOf(this.zza.zzr()));
            } while (this.zza.zzu() < zzu2);
            zzd(zzu2);
        } else {
            throw zzig.zzf();
        }
    }

    private static void zzb(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzig.zzg();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzix<K, V> zzixVar, zzhi zzhiVar) throws IOException {
        zza(2);
        int zzc = this.zza.zzc(this.zza.zzm());
        Object obj = zzixVar.zzb;
        Object obj2 = zzixVar.zzd;
        while (true) {
            try {
                int zza = zza();
                if (zza == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                } else if (zza == 1) {
                    obj = zza(zzixVar.zza, (Class<?>) null, (zzhi) null);
                } else if (zza == 2) {
                    obj2 = zza(zzixVar.zzc, zzixVar.zzd.getClass(), zzhiVar);
                } else {
                    try {
                        if (!zzc()) {
                            throw new zzig("Unable to parse map entry.");
                            break;
                        }
                    } catch (zzif unused) {
                        if (!zzc()) {
                            throw new zzig("Unable to parse map entry.");
                        }
                    }
                }
            } finally {
                this.zza.zzd(zzc);
            }
        }
    }

    private final Object zza(zzle zzleVar, Class<?> cls, zzhi zzhiVar) throws IOException {
        switch (zzhc.zza[zzleVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(zzp());
            case 5:
                return Integer.valueOf(zzj());
            case 6:
                return Long.valueOf(zzi());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(zzh());
            case 9:
                return Long.valueOf(zzg());
            case 10:
                zza(2);
                return zzc(zzjr.zza().zza((Class) cls), zzhiVar);
            case 11:
                return Integer.valueOf(zzq());
            case 12:
                return Long.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Long.valueOf(zzt());
            case 15:
                return zzm();
            case 16:
                return Integer.valueOf(zzo());
            case 17:
                return Long.valueOf(zzf());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzc(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzig.zzg();
        }
    }

    private final void zzd(int i) throws IOException {
        if (this.zza.zzu() != i) {
            throw zzig.zza();
        }
    }
}
