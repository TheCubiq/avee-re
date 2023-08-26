package com.google.android.gms.internal.measurement;

import com.mpatric.mp3agic.AbstractID3v2Tag;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzha extends zzgy {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzha(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzk = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zza() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzv = zzv();
        this.zzj = zzv;
        if ((zzv >>> 3) != 0) {
            return zzv;
        }
        throw zzig.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zza(int i) throws zzig {
        if (this.zzj != i) {
            throw zzig.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzb(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzh;
                    this.zzh = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzig.zzc();
            }
            while (i3 < 10) {
                if (zzaa() < 0) {
                    i3++;
                }
            }
            throw zzig.zzc();
            return true;
        } else if (i2 == 1) {
            zzf(8);
            return true;
        } else if (i2 == 2) {
            zzf(zzv());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzf(4);
                    return true;
                }
                throw zzig.zzf();
            }
            return false;
        } else {
            do {
                zza = zza();
                if (zza == 0) {
                    break;
                }
            } while (zzb(zza));
            zza(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzd() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzg() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzh() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzi() throws IOException {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String zzj() throws IOException {
        int zzv = zzv();
        if (zzv > 0 && zzv <= this.zzf - this.zzh) {
            String str = new String(this.zzd, this.zzh, zzv, zzhx.zza);
            this.zzh += zzv;
            return str;
        } else if (zzv == 0) {
            return "";
        } else {
            if (zzv < 0) {
                throw zzig.zzb();
            }
            throw zzig.zza();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String zzk() throws IOException {
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                String zzb = zzkw.zzb(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zzb;
            }
        }
        if (zzv == 0) {
            return "";
        }
        if (zzv <= 0) {
            throw zzig.zzb();
        }
        throw zzig.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final zzgm zzl() throws IOException {
        byte[] bArr;
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                zzgm zza = zzgm.zza(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zza;
            }
        }
        if (zzv == 0) {
            return zzgm.zza;
        }
        if (zzv > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (zzv <= i3 - i4) {
                int i5 = zzv + i4;
                this.zzh = i5;
                bArr = Arrays.copyOfRange(this.zzd, i4, i5);
                return zzgm.zza(bArr);
            }
        }
        if (zzv <= 0) {
            if (zzv == 0) {
                bArr = zzhx.zzb;
                return zzgm.zza(bArr);
            }
            throw zzig.zzb();
        }
        throw zzig.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzm() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzn() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzo() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzp() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzq() throws IOException {
        return zze(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzr() throws IOException {
        return zza(zzw());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzv() throws IOException {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << AbstractID3v2Tag.PICTURETYPE_DURING_RECORDING);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2[r0] >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzw() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << AbstractID3v2Tag.PICTURETYPE_DURING_RECORDING);
                    if (i8 >= 0) {
                        i5 = i7;
                        j4 = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j5 = i9;
                            int i10 = i5 + 1;
                            long j6 = j5 ^ (bArr[i5] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j7 = j6 ^ (bArr[i10] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j6 = j7 ^ (bArr[i5] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j7 = j6 ^ (bArr[i10] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            j = (j7 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            i5 = j < 0 ? i11 + 1 : i11;
                                            j4 = j;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                j4 = j;
                            }
                            j4 = j3 ^ j6;
                            i5 = i10;
                        }
                    }
                    this.zzh = i5;
                    return j4;
                }
                i = i6 ^ (-128);
                j4 = i;
                this.zzh = i5;
                return j4;
            }
        }
        return zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzaa = zzaa();
            j |= (zzaa & ByteCompanionObject.MAX_VALUE) << i;
            if ((zzaa & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzig.zzc();
    }

    private final int zzx() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzig.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 4;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    private final long zzy() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzig.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzc(int i) throws zzig {
        if (i < 0) {
            throw zzig.zzb();
        }
        int zzu = i + zzu();
        int i2 = this.zzk;
        if (zzu > i2) {
            throw zzig.zza();
        }
        this.zzk = zzu;
        zzz();
        return i2;
    }

    private final void zzz() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzg = i4;
            this.zzf = i - i4;
            return;
        }
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzd(int i) {
        this.zzk = i;
        zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzt() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzu() {
        return this.zzh - this.zzi;
    }

    private final byte zzaa() throws IOException {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzig.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 1;
        return bArr[i];
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzig.zzb();
        }
        throw zzig.zza();
    }
}
