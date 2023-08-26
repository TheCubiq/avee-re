package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzft<E> extends zzff<E> {
    private final transient E zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(E e) {
        this.zza = (E) zzdw.zza(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final boolean zzg() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    public final zzfs<E> zzb() {
        return new zzfg(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    final zzew<E> zzh() {
        return zzew.zza(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final int zzb(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzff, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int hashCode = this.zza.hashCode();
            this.zzb = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    final boolean zza() {
        return this.zzb != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzff, com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
