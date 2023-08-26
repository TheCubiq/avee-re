package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
abstract class zzkn<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zza();

    abstract T zza(B b);

    abstract void zza(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzgm zzgmVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzlk zzlkVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzjw zzjwVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzb(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zzlk zzlkVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzc(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zze(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzf(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzjw zzjwVar) throws IOException {
        int zzb = zzjwVar.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 == 0) {
            zza((zzkn<T, B>) b, i, zzjwVar.zzg());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzjwVar.zzi());
            return true;
        } else if (i2 == 2) {
            zza((zzkn<T, B>) b, i, zzjwVar.zzn());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zza((zzkn<T, B>) b, i, zzjwVar.zzj());
                    return true;
                }
                throw zzig.zzf();
            }
            return false;
        } else {
            B zza = zza();
            int i3 = 4 | (i << 3);
            while (zzjwVar.zza() != Integer.MAX_VALUE && zza((zzkn<T, B>) zza, zzjwVar)) {
            }
            if (i3 != zzjwVar.zzb()) {
                throw zzig.zze();
            }
            zza((zzkn<T, B>) b, i, (int) zza((zzkn<T, B>) zza));
            return true;
        }
    }
}
