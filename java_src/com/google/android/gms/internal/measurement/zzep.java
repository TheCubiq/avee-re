package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
final class zzep<K, V> extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.zza.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        int zza;
        Map<K, V> zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zza = this.zza.zza(entry.getKey());
            if (zza != -1 && zzdu.zza(this.zza.zzc[zza], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        int zzi;
        Object obj2;
        Map<K, V> zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.zza.zza()) {
                return false;
            }
            zzi = this.zza.zzi();
            Object key = entry.getKey();
            Object value = entry.getValue();
            obj2 = this.zza.zze;
            int zza = zzes.zza(key, value, zzi, obj2, this.zza.zza, this.zza.zzb, this.zza.zzc);
            if (zza == -1) {
                return false;
            }
            this.zza.zza(zza, zzi);
            zzel.zzd(this.zza);
            this.zza.zzc();
            return true;
        }
        return false;
    }
}
