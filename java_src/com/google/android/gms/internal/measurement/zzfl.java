package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfl<E> extends zzew<E> {
    static final zzew<Object> zza = new zzfl(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfl(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final int zze() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final boolean zzg() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final Object[] zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    final int zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzew, com.google.android.gms.internal.measurement.zzex
    final int zzb(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdw.zza(i, this.zzc);
        return (E) this.zzb[i];
    }
}
