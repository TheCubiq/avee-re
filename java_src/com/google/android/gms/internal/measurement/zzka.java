package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public class zzka<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzkf> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzkh zze;
    private Map<K, V> zzf;
    private volatile zzkb zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzhq<FieldDescriptorType>> zzka<FieldDescriptorType, Object> zza(int i) {
        return new zzjz(i);
    }

    private zzka(int i) {
        this.zza = i;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public void zza() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = unmodifiableMap;
        if (this.zzf.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = unmodifiableMap2;
        this.zzd = true;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Map.Entry<K, V> zzb(int i) {
        return this.zzb.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzd() {
        if (this.zzc.isEmpty()) {
            return zzke.zza();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzka<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzka<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzb.get(zza).getValue();
        }
        return this.zzc.get(comparable);
    }

    public final V zza(K k, V v) {
        zzf();
        int zza = zza((zzka<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzb.get(zza).setValue(v);
        }
        zzf();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(zza + 1);
        if (i >= this.zza) {
            return zzg().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzkf remove = this.zzb.remove(i2 - 1);
            zzg().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzb.add(i, new zzkf(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzf();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzf();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzka<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzc(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i) {
        zzf();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzg().entrySet().iterator();
            this.zzb.add(new zzkf(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzb.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzb.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzkh(this, null);
        }
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zze() {
        if (this.zzg == null) {
            this.zzg = new zzkb(this, null);
        }
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzg() {
        zzf();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzka)) {
            return super.equals(obj);
        }
        zzka zzkaVar = (zzka) obj;
        int size = size();
        if (size != zzkaVar.size()) {
            return false;
        }
        int zzc = zzc();
        if (zzc != zzkaVar.zzc()) {
            return entrySet().equals(zzkaVar.entrySet());
        }
        for (int i = 0; i < zzc; i++) {
            if (!zzb(i).equals(zzkaVar.zzb(i))) {
                return false;
            }
        }
        if (zzc != size) {
            return this.zzc.equals(zzkaVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzc = zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzka<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzka(int i, zzjz zzjzVar) {
        this(i);
    }
}
