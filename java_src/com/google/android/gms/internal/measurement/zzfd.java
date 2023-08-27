package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public class zzfd<K, V> extends zzej<K, V> implements Serializable {
    private final transient zzfb<K, ? extends zzex<V>> zza;
    private final transient int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfd(zzfb<K, ? extends zzex<V>> zzfbVar, int i) {
        this.zza = zzfbVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zza(@NullableDecl Object obj) {
        return obj != null && super.zza(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    final Map<K, Collection<V>> zzb() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzeg, com.google.android.gms.internal.measurement.zzfj
    public final /* synthetic */ Map zza() {
        return this.zza;
    }
}
