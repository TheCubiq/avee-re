package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
final class zzer<K> extends AbstractSet<K> {
    private final /* synthetic */ zzel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzer(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        Object zzb;
        Object obj2;
        Map zzb2 = this.zza.zzb();
        if (zzb2 != null) {
            return zzb2.keySet().remove(obj);
        }
        zzb = this.zza.zzb(obj);
        obj2 = zzel.zzd;
        return zzb != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return this.zza.zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }
}
