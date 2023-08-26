package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
final class zzfp<K> extends zzff<K> {
    private final transient zzfb<K, ?> zza;
    private final transient zzew<K> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfb<K, ?> zzfbVar, zzew<K> zzewVar) {
        this.zza = zzfbVar;
        this.zzb = zzewVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final boolean zzg() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    public final zzfs<K> zzb() {
        return (zzfs) zzc().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzex
    public final int zzb(Object[] objArr, int i) {
        return zzc().zzb(objArr, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzff, com.google.android.gms.internal.measurement.zzex
    public final zzew<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzff, com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
