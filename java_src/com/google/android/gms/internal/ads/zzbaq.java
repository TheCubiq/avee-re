package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class zzbaq {
    private static volatile boolean zzdqc = true;
    int zzdpx;
    int zzdpy;
    private int zzdpz;
    zzbat zzdqa;
    private boolean zzdqb;

    private zzbaq() {
        this.zzdpy = 100;
        this.zzdpz = Integer.MAX_VALUE;
        this.zzdqb = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbaq zza(byte[] bArr, int i, int i2, boolean z) {
        zzbas zzbasVar = new zzbas(bArr, i, i2, z);
        try {
            zzbasVar.zzbr(i2);
            return zzbasVar;
        } catch (zzbbu e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzbu(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzl(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract double readDouble() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract String readString() throws IOException;

    public abstract int zzabk() throws IOException;

    public abstract long zzabl() throws IOException;

    public abstract long zzabm() throws IOException;

    public abstract int zzabn() throws IOException;

    public abstract long zzabo() throws IOException;

    public abstract int zzabp() throws IOException;

    public abstract boolean zzabq() throws IOException;

    public abstract String zzabr() throws IOException;

    public abstract zzbah zzabs() throws IOException;

    public abstract int zzabt() throws IOException;

    public abstract int zzabu() throws IOException;

    public abstract int zzabv() throws IOException;

    public abstract long zzabw() throws IOException;

    public abstract int zzabx() throws IOException;

    public abstract long zzaby() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long zzabz() throws IOException;

    public abstract boolean zzaca() throws IOException;

    public abstract int zzacb();

    public abstract void zzbp(int i) throws zzbbu;

    public abstract boolean zzbq(int i) throws IOException;

    public abstract int zzbr(int i) throws zzbbu;

    public abstract void zzbs(int i);

    public abstract void zzbt(int i) throws IOException;
}
