package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzfr<E> extends zzff<E> {
    static final zzfr<Object> zza = new zzfr<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] zzb;
    private final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfr(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zzc = objArr2;
        this.zzd = i2;
        this.zze = i;
        this.zzf = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    final boolean zza() {
        return true;
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

    @Override // com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr == null) {
            return false;
        }
        int zza2 = zzeu.zza(obj);
        while (true) {
            int i = zza2 & this.zzd;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    public final zzfs<E> zzb() {
        return (zzfs) zzc().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final Object[] zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    final int zzf() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final int zzb(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzf);
        return i + this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzff
    final zzew<E> zzh() {
        return zzew.zza(this.zzb, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzff, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzff, com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
