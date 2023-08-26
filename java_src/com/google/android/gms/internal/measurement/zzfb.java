package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public abstract class zzfb<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzff<Map.Entry<K, V>> zzb;
    private transient zzff<K> zzc;
    private transient zzex<V> zzd;

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    abstract zzff<Map.Entry<K, V>> zza();

    abstract zzff<K> zzb();

    abstract zzex<V> zzc();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzex) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzfq.zza((zzff) entrySet());
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzff<Map.Entry<K, V>> zzffVar = this.zzb;
        if (zzffVar == null) {
            zzff<Map.Entry<K, V>> zza2 = zza();
            this.zzb = zza2;
            return zza2;
        }
        return zzffVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzex<V> zzexVar = this.zzd;
        if (zzexVar == null) {
            zzex<V> zzc = zzc();
            this.zzd = zzc;
            return zzc;
        }
        return zzexVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzff<K> zzffVar = this.zzc;
        if (zzffVar == null) {
            zzff<K> zzb = zzb();
            this.zzc = zzb;
            return zzb;
        }
        return zzffVar;
    }
}
