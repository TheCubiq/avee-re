package com.google.android.gms.internal.measurement;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzeo<T> implements Iterator<T> {
    private int zza;
    private int zzb;
    private int zzc;
    private final /* synthetic */ zzel zzd;

    private zzeo(zzel zzelVar) {
        int i;
        this.zzd = zzelVar;
        i = this.zzd.zzf;
        this.zza = i;
        this.zzb = this.zzd.zzd();
        this.zzc = -1;
    }

    abstract T zza(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.zzb >= 0;
    }

    @Override // java.util.Iterator
    public T next() {
        zza();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzb;
        this.zzc = i;
        T zza = zza(i);
        this.zzb = this.zzd.zza(this.zzb);
        return zza;
    }

    @Override // java.util.Iterator
    public void remove() {
        zza();
        zzdw.zzb(this.zzc >= 0, "no calls to next() since the last call to remove()");
        this.zza += 32;
        zzel zzelVar = this.zzd;
        zzelVar.remove(zzelVar.zzb[this.zzc]);
        this.zzb = zzel.zzb(this.zzb, this.zzc);
        this.zzc = -1;
    }

    private final void zza() {
        int i;
        i = this.zzd.zzf;
        if (i != this.zza) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeo(zzel zzelVar, zzek zzekVar) {
        this(zzelVar);
    }
}
