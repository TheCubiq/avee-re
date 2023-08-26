package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class zzbav extends zzbag {
    private static final Logger logger = Logger.getLogger(zzbav.class.getName());
    private static final boolean zzdqm = zzbek.zzagf();
    zzbax zzdqn;

    /* loaded from: classes2.dex */
    static class zza extends zzbav {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zza(int i, long j) throws IOException {
            zzl(i, 0);
            zzm(j);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zza(int i, zzbah zzbahVar) throws IOException {
            zzl(i, 2);
            zzan(zzbahVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zza(int i, zzbcu zzbcuVar) throws IOException {
            zzl(1, 3);
            zzn(2, i);
            zzl(3, 2);
            zze(zzbcuVar);
            zzl(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        final void zza(int i, zzbcu zzbcuVar, zzbdm zzbdmVar) throws IOException {
            zzl(i, 2);
            zzazy zzazyVar = (zzazy) zzbcuVar;
            int zzaaw = zzazyVar.zzaaw();
            if (zzaaw == -1) {
                zzaaw = zzbdmVar.zzy(zzazyVar);
                zzazyVar.zzbj(zzaaw);
            }
            zzca(zzaaw);
            zzbdmVar.zza(zzbcuVar, this.zzdqn);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final int zzack() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzan(zzbah zzbahVar) throws IOException {
            zzca(zzbahVar.size());
            zzbahVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzb(int i, zzbah zzbahVar) throws IOException {
            zzl(1, 3);
            zzn(2, i);
            zza(3, zzbahVar);
            zzl(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzbag
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzbz(int i) throws IOException {
            if (i >= 0) {
                zzca(i);
            } else {
                zzm(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzc(int i, long j) throws IOException {
            zzl(i, 1);
            zzo(j);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzca(int i) throws IOException {
            if (zzbav.zzdqm && zzack() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    zzbek.zza(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzbek.zza(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzcc(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zze(zzbcu zzbcuVar) throws IOException {
            zzca(zzbcuVar.zzacw());
            zzbcuVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzca(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzen(String str) throws IOException {
            int i = this.position;
            try {
                int zzcf = zzcf(str.length() * 3);
                int zzcf2 = zzcf(str.length());
                if (zzcf2 != zzcf) {
                    zzca(zzbem.zza(str));
                    this.position = zzbem.zza(str, this.buffer, this.position, zzack());
                    return;
                }
                int i2 = i + zzcf2;
                this.position = i2;
                int zza = zzbem.zza(str, this.buffer, i2, zzack());
                this.position = i;
                zzca((zza - i) - zzcf2);
                this.position = zza;
            } catch (zzbep e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzf(int i, String str) throws IOException {
            zzl(i, 2);
            zzen(str);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzf(int i, boolean z) throws IOException {
            zzl(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzl(int i, int i2) throws IOException {
            zzca((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzm(int i, int i2) throws IOException {
            zzl(i, 0);
            zzbz(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzm(long j) throws IOException {
            if (zzbav.zzdqm && zzack() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzbek.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzbek.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzn(int i, int i2) throws IOException {
            zzl(i, 0);
            zzca(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzo(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbav
        public final void zzp(int i, int i2) throws IOException {
            zzl(i, 5);
            zzcc(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        zzb(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzbav() {
    }

    public static int zza(int i, zzbcb zzbcbVar) {
        int zzcd = zzcd(i);
        int zzacw = zzbcbVar.zzacw();
        return zzcd + zzcf(zzacw) + zzacw;
    }

    public static int zza(zzbcb zzbcbVar) {
        int zzacw = zzbcbVar.zzacw();
        return zzcf(zzacw) + zzacw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzbcu zzbcuVar, zzbdm zzbdmVar) {
        zzazy zzazyVar = (zzazy) zzbcuVar;
        int zzaaw = zzazyVar.zzaaw();
        if (zzaaw == -1) {
            zzaaw = zzbdmVar.zzy(zzazyVar);
            zzazyVar.zzbj(zzaaw);
        }
        return zzcf(zzaaw) + zzaaw;
    }

    public static int zzao(zzbah zzbahVar) {
        int size = zzbahVar.size();
        return zzcf(size) + size;
    }

    public static int zzaq(boolean z) {
        return 1;
    }

    public static int zzb(int i, double d) {
        return zzcd(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzcd(i) + 4;
    }

    public static int zzb(int i, zzbcb zzbcbVar) {
        return (zzcd(1) << 1) + zzr(2, i) + zza(3, zzbcbVar);
    }

    public static int zzb(int i, zzbcu zzbcuVar) {
        return (zzcd(1) << 1) + zzr(2, i) + zzcd(3) + zzf(zzbcuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzbcu zzbcuVar, zzbdm zzbdmVar) {
        return zzcd(i) + zza(zzbcuVar, zzbdmVar);
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzc(float f) {
        return 4;
    }

    public static int zzc(int i, zzbah zzbahVar) {
        int zzcd = zzcd(i);
        int size = zzbahVar.size();
        return zzcd + zzcf(size) + size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzbcu zzbcuVar, zzbdm zzbdmVar) {
        int zzcd = zzcd(i) << 1;
        zzazy zzazyVar = (zzazy) zzbcuVar;
        int zzaaw = zzazyVar.zzaaw();
        if (zzaaw == -1) {
            zzaaw = zzbdmVar.zzy(zzazyVar);
            zzazyVar.zzbj(zzaaw);
        }
        return zzcd + zzaaw;
    }

    public static int zzcd(int i) {
        return zzcf(i << 3);
    }

    public static int zzce(int i) {
        if (i >= 0) {
            return zzcf(i);
        }
        return 10;
    }

    public static int zzcf(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzcg(int i) {
        return zzcf(zzck(i));
    }

    public static int zzch(int i) {
        return 4;
    }

    public static int zzci(int i) {
        return 4;
    }

    public static int zzcj(int i) {
        return zzce(i);
    }

    private static int zzck(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzcl(int i) {
        return zzcf(i);
    }

    public static int zzd(int i, long j) {
        return zzcd(i) + zzq(j);
    }

    public static int zzd(int i, zzbah zzbahVar) {
        return (zzcd(1) << 1) + zzr(2, i) + zzc(3, zzbahVar);
    }

    public static int zze(int i, long j) {
        return zzcd(i) + zzq(j);
    }

    public static int zzeo(String str) {
        int length;
        try {
            length = zzbem.zza(str);
        } catch (zzbep unused) {
            length = str.getBytes(zzbbq.UTF_8).length;
        }
        return zzcf(length) + length;
    }

    public static int zzf(int i, long j) {
        return zzcd(i) + zzq(zzu(j));
    }

    public static int zzf(zzbcu zzbcuVar) {
        int zzacw = zzbcuVar.zzacw();
        return zzcf(zzacw) + zzacw;
    }

    public static int zzg(int i, long j) {
        return zzcd(i) + 8;
    }

    public static int zzg(int i, String str) {
        return zzcd(i) + zzeo(str);
    }

    public static int zzg(int i, boolean z) {
        return zzcd(i) + 1;
    }

    @Deprecated
    public static int zzg(zzbcu zzbcuVar) {
        return zzbcuVar.zzacw();
    }

    public static int zzh(int i, long j) {
        return zzcd(i) + 8;
    }

    public static int zzp(long j) {
        return zzq(j);
    }

    public static int zzq(int i, int i2) {
        return zzcd(i) + zzce(i2);
    }

    public static int zzq(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzbav zzq(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzr(int i, int i2) {
        return zzcd(i) + zzcf(i2);
    }

    public static int zzr(long j) {
        return zzq(zzu(j));
    }

    public static int zzr(byte[] bArr) {
        int length = bArr.length;
        return zzcf(length) + length;
    }

    public static int zzs(int i, int i2) {
        return zzcd(i) + zzcf(zzck(i2));
    }

    public static int zzs(long j) {
        return 8;
    }

    public static int zzt(int i, int i2) {
        return zzcd(i) + 4;
    }

    public static int zzt(long j) {
        return 8;
    }

    public static int zzu(int i, int i2) {
        return zzcd(i) + 4;
    }

    private static long zzu(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzv(int i, int i2) {
        return zzcd(i) + zzce(i2);
    }

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(byte b) throws IOException;

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zza(int i, float f) throws IOException {
        zzp(i, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzbah zzbahVar) throws IOException;

    public abstract void zza(int i, zzbcu zzbcuVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzbcu zzbcuVar, zzbdm zzbdmVar) throws IOException;

    final void zza(String str, zzbep zzbepVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzbepVar);
        byte[] bytes = str.getBytes(zzbbq.UTF_8);
        try {
            zzca(bytes.length);
            zzb(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public abstract int zzack();

    public final void zzacl() {
        if (zzack() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzan(zzbah zzbahVar) throws IOException;

    public final void zzap(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(double d) throws IOException {
        zzo(Double.doubleToRawLongBits(d));
    }

    public final void zzb(float f) throws IOException {
        zzcc(Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzu(j));
    }

    public abstract void zzb(int i, zzbah zzbahVar) throws IOException;

    public abstract void zzbz(int i) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzca(int i) throws IOException;

    public final void zzcb(int i) throws IOException {
        zzca(zzck(i));
    }

    public abstract void zzcc(int i) throws IOException;

    public abstract void zze(zzbcu zzbcuVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzen(String str) throws IOException;

    public abstract void zzf(int i, String str) throws IOException;

    public abstract void zzf(int i, boolean z) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i, int i2) throws IOException;

    public abstract void zzm(long j) throws IOException;

    public abstract void zzn(int i, int i2) throws IOException;

    public final void zzn(long j) throws IOException {
        zzm(zzu(j));
    }

    public final void zzo(int i, int i2) throws IOException {
        zzn(i, zzck(i2));
    }

    public abstract void zzo(long j) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;
}
