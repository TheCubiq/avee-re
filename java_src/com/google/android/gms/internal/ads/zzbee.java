package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
abstract class zzbee<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzbah zzbahVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzbey zzbeyVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzbdl zzbdlVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzbdl zzbdlVar) throws IOException {
        int tag = zzbdlVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzbee<T, B>) b, i, zzbdlVar.zzabm());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzbdlVar.zzabo());
            return true;
        } else if (i2 == 2) {
            zza((zzbee<T, B>) b, i, zzbdlVar.zzabs());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzbdlVar.zzabp());
                    return true;
                }
                throw zzbbu.zzadq();
            }
            return false;
        } else {
            B zzagb = zzagb();
            int i3 = 4 | (i << 3);
            while (zzbdlVar.zzaci() != Integer.MAX_VALUE && zza((zzbee<T, B>) zzagb, zzbdlVar)) {
            }
            if (i3 == zzbdlVar.getTag()) {
                zza((zzbee<T, B>) b, i, (int) zzv(zzagb));
                return true;
            }
            throw zzbbu.zzadp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzac(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzad(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzae(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzagb();

    abstract void zzb(B b, int i, long j);

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzbey zzbeyVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzg(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj);

    abstract T zzv(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzy(T t);
}
