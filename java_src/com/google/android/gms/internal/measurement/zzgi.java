package com.google.android.gms.internal.measurement;

import com.mpatric.mp3agic.AbstractID3v2Tag;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzgi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzgl zzglVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzglVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzgl zzglVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzglVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzglVar.zza = i5 | (b2 << AbstractID3v2Tag.PICTURETYPE_DURING_RECORDING);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzglVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzglVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzglVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzgl zzglVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzglVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & ByteCompanionObject.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzglVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzgl zzglVar) throws zzig {
        int zza = zza(bArr, i, zzglVar);
        int i2 = zzglVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzglVar.zzc = "";
                return zza;
            }
            zzglVar.zzc = new String(bArr, zza, i2, zzhx.zza);
            return zza + i2;
        }
        throw zzig.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzgl zzglVar) throws zzig {
        int zza = zza(bArr, i, zzglVar);
        int i2 = zzglVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzglVar.zzc = "";
                return zza;
            }
            zzglVar.zzc = zzkw.zzb(bArr, zza, i2);
            return zza + i2;
        }
        throw zzig.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzgl zzglVar) throws zzig {
        int zza = zza(bArr, i, zzglVar);
        int i2 = zzglVar.zza;
        if (i2 < 0) {
            throw zzig.zzb();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzglVar.zzc = zzgm.zza;
                return zza;
            }
            zzglVar.zzc = zzgm.zza(bArr, zza, i2);
            return zza + i2;
        }
        throw zzig.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzjv zzjvVar, byte[] bArr, int i, int i2, zzgl zzglVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzglVar);
            i4 = zzglVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzig.zza();
        }
        Object zza = zzjvVar.zza();
        int i6 = i4 + i5;
        zzjvVar.zza(zza, bArr, i5, i6, zzglVar);
        zzjvVar.zzc(zza);
        zzglVar.zzc = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzjv zzjvVar, byte[] bArr, int i, int i2, int i3, zzgl zzglVar) throws IOException {
        zzjk zzjkVar = (zzjk) zzjvVar;
        Object zza = zzjkVar.zza();
        int zza2 = zzjkVar.zza((zzjk) zza, bArr, i, i2, i3, zzglVar);
        zzjkVar.zzc((zzjk) zza);
        zzglVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzid<?> zzidVar, zzgl zzglVar) {
        zzhy zzhyVar = (zzhy) zzidVar;
        int zza = zza(bArr, i2, zzglVar);
        zzhyVar.zzd(zzglVar.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzglVar);
            if (i != zzglVar.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzglVar);
            zzhyVar.zzd(zzglVar.zza);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzid<?> zzidVar, zzgl zzglVar) throws IOException {
        zzhy zzhyVar = (zzhy) zzidVar;
        int zza = zza(bArr, i, zzglVar);
        int i2 = zzglVar.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzglVar);
            zzhyVar.zzd(zzglVar.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzig.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzjv<?> zzjvVar, int i, byte[] bArr, int i2, int i3, zzid<?> zzidVar, zzgl zzglVar) throws IOException {
        int zza = zza(zzjvVar, bArr, i2, i3, zzglVar);
        zzidVar.add(zzglVar.zzc);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzglVar);
            if (i != zzglVar.zza) {
                break;
            }
            zza = zza(zzjvVar, bArr, zza2, i3, zzglVar);
            zzidVar.add(zzglVar.zzc);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzkq zzkqVar, zzgl zzglVar) throws zzig {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzglVar);
                zzkqVar.zza(i, Long.valueOf(zzglVar.zzb));
                return zzb;
            } else if (i4 == 1) {
                zzkqVar.zza(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzglVar);
                int i5 = zzglVar.zza;
                if (i5 < 0) {
                    throw zzig.zzb();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzkqVar.zza(i, zzgm.zza);
                    } else {
                        zzkqVar.zza(i, zzgm.zza(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzig.zza();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzkqVar.zza(i, Integer.valueOf(zza(bArr, i2)));
                    return i2 + 4;
                }
                throw zzig.zzd();
            } else {
                zzkq zzb2 = zzkq.zzb();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzglVar);
                    int i8 = zzglVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzb2, zzglVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzig.zzg();
                }
                zzkqVar.zza(i, zzb2);
                return i2;
            }
        }
        throw zzig.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzgl zzglVar) throws zzig {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzig.zzd();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzglVar);
                            i6 = zzglVar.zza;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzglVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzig.zzg();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzglVar) + zzglVar.zza;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzglVar);
        }
        throw zzig.zzd();
    }
}
