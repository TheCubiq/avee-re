package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
abstract class zzeg<K, V> implements zzfj<K, V> {
    @NullableDecl
    private transient Map<K, Collection<V>> zza;

    abstract Map<K, Collection<V>> zzb();

    public boolean zza(@NullableDecl Object obj) {
        for (Collection<V> collection : zza().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzfj
    public Map<K, Collection<V>> zza() {
        Map<K, Collection<V>> map = this.zza;
        if (map == null) {
            Map<K, Collection<V>> zzb = zzb();
            this.zza = zzb;
            return zzb;
        }
        return map;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfj) {
            return zza().equals(((zzfj) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }
}
