package com.google.android.gms.internal.measurement;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzey<E> extends zzew<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzew zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzew zzewVar, int i, int i2) {
        this.zzc = zzewVar;
        this.zza = i;
        this.zzb = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final boolean zzg() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final Object[] zzd() {
        return this.zzc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final int zze() {
        return this.zzc.zze() + this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    final int zzf() {
        return this.zzc.zze() + this.zza + this.zzb;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdw.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzew
    public final zzew<E> zza(int i, int i2) {
        zzdw.zza(i, i2, this.zzb);
        zzew zzewVar = this.zzc;
        int i3 = this.zza;
        return (zzew) zzewVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzew, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
