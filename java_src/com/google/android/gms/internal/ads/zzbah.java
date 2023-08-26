package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class zzbah implements Serializable, Iterable<Byte> {
    public static final zzbah zzdpq = new zzbao(zzbbq.zzduq);
    private static final zzbal zzdpr;
    private int zzdpa = 0;

    static {
        zzdpr = zzbac.zzabb() ? new zzbap(null) : new zzbaj(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbam zzbo(int i) {
        return new zzbam(i, null);
    }

    public static zzbah zzc(byte[] bArr, int i, int i2) {
        return new zzbao(zzdpr.zzd(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public static zzbah zzem(String str) {
        return new zzbao(str.getBytes(zzbbq.UTF_8));
    }

    public static zzbah zzo(byte[] bArr) {
        return zzc(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbah zzp(byte[] bArr) {
        return new zzbao(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzdpa;
        if (i == 0) {
            int size = size();
            i = zzc(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzdpa = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzbai(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzbbq.zzduq;
        }
        byte[] bArr = new byte[size];
        zza(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzbag zzbagVar) throws IOException;

    protected abstract void zza(byte[] bArr, int i, int i2, int i3);

    public final String zzabd() {
        return size() == 0 ? "" : zza(zzbbq.UTF_8);
    }

    public abstract boolean zzabe();

    public abstract zzbaq zzabf();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzabg() {
        return this.zzdpa;
    }

    public abstract byte zzbn(int i);

    protected abstract int zzc(int i, int i2, int i3);

    public abstract zzbah zzk(int i, int i2);
}
