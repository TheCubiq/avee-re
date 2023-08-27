package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public abstract class zzff<E> extends zzex<E> implements Set<E> {
    @NullableDecl
    private transient zzew<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            zzdw.zza(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    boolean zza() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzff) && zza() && ((zzff) obj).zza() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfq.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfq.zza(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzex
    public zzew<E> zzc() {
        zzew<E> zzewVar = this.zza;
        if (zzewVar == null) {
            zzew<E> zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzewVar;
    }

    zzew<E> zzh() {
        return zzew.zza(toArray());
    }

    @Override // com.google.android.gms.internal.measurement.zzex, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
