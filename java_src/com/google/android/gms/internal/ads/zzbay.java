package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
final class zzbay extends zzbab<Double> implements zzbbt<Double>, RandomAccess {
    private static final zzbay zzdqo;
    private int size;
    private double[] zzdqp;

    static {
        zzbay zzbayVar = new zzbay();
        zzdqo = zzbayVar;
        zzbayVar.zzaaz();
    }

    zzbay() {
        this(new double[10], 0);
    }

    private zzbay(double[] dArr, int i) {
        this.zzdqp = dArr;
        this.size = i;
    }

    private final void zzbk(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzbl(i));
        }
    }

    private final String zzbl(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void zzc(int i, double d) {
        int i2;
        zzaba();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzbl(i));
        }
        double[] dArr = this.zzdqp;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzdqp, i, dArr2, i + 1, this.size - i);
            this.zzdqp = dArr2;
        }
        this.zzdqp[i] = d;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzaba();
        zzbbq.checkNotNull(collection);
        if (collection instanceof zzbay) {
            zzbay zzbayVar = (zzbay) collection;
            int i = zzbayVar.size;
            if (i == 0) {
                return false;
            }
            int i2 = this.size;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.zzdqp;
                if (i3 > dArr.length) {
                    this.zzdqp = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(zzbayVar.zzdqp, 0, this.zzdqp, this.size, zzbayVar.size);
                this.size = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbay) {
            zzbay zzbayVar = (zzbay) obj;
            if (this.size != zzbayVar.size) {
                return false;
            }
            double[] dArr = zzbayVar.zzdqp;
            for (int i = 0; i < this.size; i++) {
                if (this.zzdqp[i] != dArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzbk(i);
        return Double.valueOf(this.zzdqp[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzbbq.zzv(Double.doubleToLongBits(this.zzdqp[i2]));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzaba();
        zzbk(i);
        double[] dArr = this.zzdqp;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzaba();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzdqp[i]))) {
                double[] dArr = this.zzdqp;
                System.arraycopy(dArr, i + 1, dArr, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzaba();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzdqp;
        System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzbab, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzaba();
        zzbk(i);
        double[] dArr = this.zzdqp;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzbbt
    public final /* synthetic */ zzbbt<Double> zzbm(int i) {
        if (i >= this.size) {
            return new zzbay(Arrays.copyOf(this.zzdqp, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzd(double d) {
        zzc(this.size, d);
    }
}
