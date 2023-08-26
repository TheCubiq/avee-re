package com.google.android.gms.internal.ads;

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
/* loaded from: classes2.dex */
public class zzbdp<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzdqy;
    private final int zzdyj;
    private List<zzbdw> zzdyk;
    private Map<K, V> zzdyl;
    private volatile zzbdy zzdym;
    private Map<K, V> zzdyn;
    private volatile zzbds zzdyo;

    private zzbdp(int i) {
        this.zzdyj = i;
        this.zzdyk = Collections.emptyList();
        this.zzdyl = Collections.emptyMap();
        this.zzdyn = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbdp(int i, zzbdq zzbdqVar) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzdyk.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzdyk.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.zzdyk.get(i2).getKey());
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzafv() {
        if (this.zzdqy) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzafw() {
        zzafv();
        if (this.zzdyl.isEmpty() && !(this.zzdyl instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzdyl = treeMap;
            this.zzdyn = treeMap.descendingMap();
        }
        return (SortedMap) this.zzdyl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzbbi<FieldDescriptorType>> zzbdp<FieldDescriptorType, Object> zzcx(int i) {
        return new zzbdq(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzcz(int i) {
        zzafv();
        V v = (V) this.zzdyk.remove(i).getValue();
        if (!this.zzdyl.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzafw().entrySet().iterator();
            this.zzdyk.add(new zzbdw(this, it.next()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzafv();
        if (!this.zzdyk.isEmpty()) {
            this.zzdyk.clear();
        }
        if (this.zzdyl.isEmpty()) {
            return;
        }
        this.zzdyl.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzbdp<K, V>) comparable) >= 0 || this.zzdyl.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzdym == null) {
            this.zzdym = new zzbdy(this, null);
        }
        return this.zzdym;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbdp) {
            zzbdp zzbdpVar = (zzbdp) obj;
            int size = size();
            if (size != zzbdpVar.size()) {
                return false;
            }
            int zzafs = zzafs();
            if (zzafs != zzbdpVar.zzafs()) {
                return entrySet().equals(zzbdpVar.entrySet());
            }
            for (int i = 0; i < zzafs; i++) {
                if (!zzcy(i).equals(zzbdpVar.zzcy(i))) {
                    return false;
                }
            }
            if (zzafs != size) {
                return this.zzdyl.equals(zzbdpVar.zzdyl);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzbdp<K, V>) comparable);
        return zza >= 0 ? (V) this.zzdyk.get(zza).getValue() : this.zzdyl.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzafs = zzafs();
        int i = 0;
        for (int i2 = 0; i2 < zzafs; i2++) {
            i += this.zzdyk.get(i2).hashCode();
        }
        return this.zzdyl.size() > 0 ? i + this.zzdyl.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzdqy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzbdp<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzafv();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzbdp<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzcz(zza);
        }
        if (this.zzdyl.isEmpty()) {
            return null;
        }
        return this.zzdyl.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzdyk.size() + this.zzdyl.size();
    }

    public final V zza(K k, V v) {
        zzafv();
        int zza = zza((zzbdp<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzdyk.get(zza).setValue(v);
        }
        zzafv();
        if (this.zzdyk.isEmpty() && !(this.zzdyk instanceof ArrayList)) {
            this.zzdyk = new ArrayList(this.zzdyj);
        }
        int i = -(zza + 1);
        if (i >= this.zzdyj) {
            return zzafw().put(k, v);
        }
        int size = this.zzdyk.size();
        int i2 = this.zzdyj;
        if (size == i2) {
            zzbdw remove = this.zzdyk.remove(i2 - 1);
            zzafw().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzdyk.add(i, new zzbdw(this, k, v));
        return null;
    }

    public void zzaaz() {
        if (this.zzdqy) {
            return;
        }
        this.zzdyl = this.zzdyl.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzdyl);
        this.zzdyn = this.zzdyn.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzdyn);
        this.zzdqy = true;
    }

    public final int zzafs() {
        return this.zzdyk.size();
    }

    public final Iterable<Map.Entry<K, V>> zzaft() {
        return this.zzdyl.isEmpty() ? zzbdt.zzafy() : this.zzdyl.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzafu() {
        if (this.zzdyo == null) {
            this.zzdyo = new zzbds(this, null);
        }
        return this.zzdyo;
    }

    public final Map.Entry<K, V> zzcy(int i) {
        return this.zzdyk.get(i);
    }
}
